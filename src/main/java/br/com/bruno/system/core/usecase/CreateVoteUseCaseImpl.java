package br.com.bruno.system.core.usecase;

import br.com.bruno.system.core.dataprovider.FindByIdAssociete;
import br.com.bruno.system.core.dataprovider.FindByIdSchedule;
import br.com.bruno.system.core.dataprovider.FindByIdSession;
import br.com.bruno.system.core.dataprovider.InsertVote;
import br.com.bruno.system.core.domain.ValidVote;
import br.com.bruno.system.core.domain.Vote;
import br.com.bruno.system.core.usecase.validation.AssocieteVoteValidation;
import br.com.bruno.system.core.usecase.validation.SessionOpenValidation;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateVoteUseCaseImpl implements CreateVoteUseCase {

  private final InsertVote insertVote;
  private final FindByIdSchedule findByIdSchedule;
  private final FindByIdSession findByIdSession;
  private final FindByIdAssociete findByIdAssociete;

  private final AssocieteVoteValidation associeteVoteUseCase;

  private final SessionOpenValidation sessionOpenValidation;


  @Override
  public void insert(final Vote vote) {
    final var voteEntity = this.createVoteEntity(vote);
    this.insertVote.execute(voteEntity);
  }

  private VoteEntity createVoteEntity(final Vote vote) {
    final var associete = this.findByIdAssociete.execute(vote.idAssociate());
    final var schedule = this.findByIdSchedule.execute(vote.idSchedule());
    final var session = this.findByIdSession.execute(vote.idSession());

    this.validatorChain(associete, schedule, session);

    return new VoteEntity(associete, schedule, session, vote.vote().getVote());
  }

  private void validatorChain(final AssociateEntity associete, final ScheduleEntity schedule, final SessionEntity session) {
    final var validVote = this.createValidVolte(associete, schedule, session);
    this.associeteVoteUseCase.setNextChain(this.sessionOpenValidation);
    this.associeteVoteUseCase.check(validVote);
  }

  private ValidVote createValidVolte(final AssociateEntity associete, final ScheduleEntity schedulen, final SessionEntity session) {
    return new ValidVote(associete.getId(), schedulen.getId(), LocalDateTime.now(), session.getCreationTime(), session.getOperatingTime());
  }


}
