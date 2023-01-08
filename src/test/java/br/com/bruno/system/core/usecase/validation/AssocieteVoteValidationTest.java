package br.com.bruno.system.core.usecase.validation;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

import br.com.bruno.system.core.dataprovider.DoesScheduleHasVote;
import br.com.bruno.system.core.domain.ValidVote;
import br.com.bruno.system.dataprovider.exception.AssocieteAlreadyVotedException;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class AssocieteVoteValidationTest {

  @Mock
  private DoesScheduleHasVote doesScheduleHasVote;
  @InjectMocks
  private AssocieteVoteValidation associeteVoteValidation;

  private AutoCloseable closeable;


  @BeforeEach
  public void setup() {
    this.closeable = openMocks(this);
  }

  @Test
  void doesThowAssocieteAlreadyVotedException() {
    when(this.doesScheduleHasVote.execute(any(), any())).thenReturn(Boolean.TRUE);

    assertThrows(AssocieteAlreadyVotedException.class, () -> this.associeteVoteValidation.check(this.createVote()));
  }

  @AfterEach
  public void releaseMocks() throws Exception {
    this.closeable.close();
  }

  private ValidVote createVote() {
    return new ValidVote(1L, 1L, LocalDateTime.now(), LocalDateTime.now(), 10);
  }


}