package br.com.bruno.system.core.usecase;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

import br.com.bruno.system.core.dataprovider.FindByIdAssociete;
import br.com.bruno.system.core.dataprovider.FindByIdSchedule;
import br.com.bruno.system.core.dataprovider.FindByIdSession;
import br.com.bruno.system.core.dataprovider.InsertVote;
import br.com.bruno.system.core.domain.ValidVote;
import br.com.bruno.system.core.domain.Vote;
import br.com.bruno.system.core.domain.VoteAnswerEnum;
import br.com.bruno.system.core.usecase.validation.AssocieteVoteValidation;
import br.com.bruno.system.core.usecase.validation.SessionOpenValidation;
import br.com.bruno.system.dataprovider.exception.AssocieteAlreadyVotedException;
import br.com.bruno.system.dataprovider.exception.SessionAlredyCloseExeption;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


class CreateVoteUseCaseImplTest {

  @Mock
  private SessionOpenValidation sessionOpenValidation;
  private AutoCloseable closeable;
  @Mock
  private FindByIdSchedule findByIdSchedule;
  @Mock
  private FindByIdSession findByIdSession;
  @Mock
  private FindByIdAssociete findByIdAssociete;
  @Mock
  private AssocieteVoteValidation associeteVoteUseCase;
  @Mock
  private InsertVote insertVote;

  @InjectMocks
  private CreateVoteUseCaseImpl createVoteUseCase;

  @BeforeEach
  public void setup() {
    this.closeable = openMocks(this);
  }

  @Test
  void doesInsertVote() {
    this.initMocks();
    assertDoesNotThrow(() -> this.createVoteUseCase.insert(this.createVote()));
  }

  @Test
  void doesThowAssocieteAlreadyVotedException() {
    this.initMocks();
    doThrow(new AssocieteAlreadyVotedException()).when(this.associeteVoteUseCase).check(any());
    assertThrows(AssocieteAlreadyVotedException.class, () -> this.associeteVoteUseCase.check(this.createValidVote()));
  }

  @Test
  void doesThowSessionAlredyCloseExeption() {
    this.initMocks();
    doThrow(new SessionAlredyCloseExeption()).when(this.sessionOpenValidation).check(any());
    assertThrows(SessionAlredyCloseExeption.class, () -> this.sessionOpenValidation.check(this.createValidVote()));
  }

  private void initMocks() {
    when(this.findByIdAssociete.execute(any())).thenReturn(this.createAssociate());
    when(this.findByIdSchedule.execute(any())).thenReturn(this.createSchedule());
    when(this.findByIdSession.execute(any())).thenReturn(this.createSession());
    doNothing().when(this.associeteVoteUseCase).setNextChain(any());
    doNothing().when(this.insertVote).execute(any());
  }


  @AfterEach
  public void releaseMocks() throws Exception {
    this.closeable.close();
  }

  private Vote createVote() {
    return new Vote(1L, 1L, 1L, VoteAnswerEnum.SIM);
  }

  private AssociateEntity createAssociate() {
    return new AssociateEntity(1L, "Carlos");
  }

  private SessionEntity createSession() {
    return new SessionEntity(300, LocalDateTime.now());
  }

  private ScheduleEntity createSchedule() {
    return new ScheduleEntity(1L, "Bolsa");
  }

  private ValidVote createValidVote() {
    return new ValidVote(1L, 1L, LocalDateTime.now(), LocalDateTime.now(), 10);
  }

}