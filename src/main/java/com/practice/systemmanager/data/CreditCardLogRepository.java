package com.practice.systemmanager.data;

import com.practice.systemmanager.models.CreditCardLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardLogRepository extends CrudRepository<CreditCardLog, Integer> {
}
