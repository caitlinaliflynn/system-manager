package com.practice.systemmanager.data;

import com.practice.systemmanager.models.MobileDepositPermIncrease;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileDepositPermIncreaseRepository extends CrudRepository<MobileDepositPermIncrease, Integer> {
}
