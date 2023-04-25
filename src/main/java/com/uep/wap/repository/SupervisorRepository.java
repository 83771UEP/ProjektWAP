package com.uep.wap.repository;

import com.uep.wap.model.Player;
import com.uep.wap.model.Supervisor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorRepository extends CrudRepository<Supervisor, Integer> {
}

