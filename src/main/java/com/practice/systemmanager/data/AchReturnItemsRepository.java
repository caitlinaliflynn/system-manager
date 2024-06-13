package com.practice.systemmanager.data;

import com.practice.systemmanager.models.AchReturnItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchReturnItemsRepository extends CrudRepository<AchReturnItems, Integer> {

}
