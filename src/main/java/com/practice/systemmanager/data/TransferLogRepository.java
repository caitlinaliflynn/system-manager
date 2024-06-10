package com.practice.systemmanager.data;

import com.practice.systemmanager.models.TransferLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferLogRepository extends CrudRepository<TransferLog, Integer> {
}
