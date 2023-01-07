package br.com.bruno.system.core.usecase.validation;

import br.com.bruno.system.core.dataprovider.VoteChain;
import br.com.bruno.system.core.domain.ValidVote;
import br.com.bruno.system.dataprovider.exception.SessionAlredyCloseExeption;
import java.time.Duration;
import org.springframework.stereotype.Service;

@Service
public class SessionOpenValidation implements VoteChain {

  @Override
  public void check(final ValidVote vote) {
    final var duration = Duration.between(vote.timeNow(), vote.creationTime());
    if (Math.abs(duration.toMinutes()) > vote.operatingTime()) {
      throw new SessionAlredyCloseExeption();
    }
  }
}
