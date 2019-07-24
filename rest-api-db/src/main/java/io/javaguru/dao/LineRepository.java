package io.javaguru.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.javaguru.models.Lines;

@Repository
public interface LineRepository extends CrudRepository<Lines, Integer>{
	public List<Lines> findByOrderId(Integer orderId);
}
