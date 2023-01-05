package br.com.bruno.system.dataprovider.repository;

import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingSessionRepository extends JpaRepository<VotingSessionEntity, Long> {

}
