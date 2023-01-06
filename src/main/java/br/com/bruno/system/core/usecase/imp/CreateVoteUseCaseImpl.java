package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.FindByIdAssociete;
import br.com.bruno.system.core.dataprovider.FindByIdSchedule;
import br.com.bruno.system.core.dataprovider.FindByIdSession;
import br.com.bruno.system.core.dataprovider.FindVoteByIdScheduleAndIdAssociete;
import br.com.bruno.system.core.dataprovider.InsertVote;
import br.com.bruno.system.core.domain.Vote;
import br.com.bruno.system.core.usecase.CreateVoteUseCase;
import br.com.bruno.system.dataprovider.exception.AssocieteAlreadyVotedException;
import br.com.bruno.system.dataprovider.exception.SessionAlredyCloseExeption;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.time.Duration;
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
  private final FindVoteByIdScheduleAndIdAssociete findVoteByIdScheduleAndIdAssociete;

  @Override
  public void insert(final Vote vote) {
    this.validateVote(vote);
    final var voteEntity = this.createVoteEntity(vote);
    this.insertVote.execute(voteEntity);
  }

  private VoteEntity createVoteEntity(final Vote vote) {
    final var associete = this.findByIdAssociete.execute(vote.idAssociate());
    final var schedule = this.findByIdSchedule.execute(vote.idSchedule());
    final var session = this.findByIdSession.execute(vote.idSession());
    this.validateSessionTime(session);
    return new VoteEntity(associete, schedule, session, vote.vote().getVote());
  }

  private void validateVote(final Vote vote) {
    if (this.findVoteByIdScheduleAndIdAssociete.execute(vote.idSchedule(), vote.idAssociate()).isPresent()) {
      throw new AssocieteAlreadyVotedException();
    }
  }

  private void validateSessionTime(final SessionEntity sesion) {
    final var timeNow = LocalDateTime.now();
    final var duration = Duration.between(timeNow, sesion.getCreationTime());
    if (Math.abs(duration.toMinutes()) > sesion.getOperatingTime()) {
      throw new SessionAlredyCloseExeption();
    }
  }
}
