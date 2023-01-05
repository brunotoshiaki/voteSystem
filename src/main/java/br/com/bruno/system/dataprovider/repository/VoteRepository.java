package br.com.bruno.system.dataprovider.repository;

import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<VoteEntity, Long> {

}
