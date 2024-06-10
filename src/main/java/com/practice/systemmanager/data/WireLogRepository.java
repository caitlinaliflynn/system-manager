package com.practice.systemmanager.data;

import com.practice.systemmanager.models.WireLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WireLogRepository extends CrudRepository<WireLog, Integer> {
}
