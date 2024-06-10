package com.practice.systemmanager.data;

import com.practice.systemmanager.models.ReturnMailLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnMailLogRepository extends CrudRepository<ReturnMailLog, Integer> {
}
