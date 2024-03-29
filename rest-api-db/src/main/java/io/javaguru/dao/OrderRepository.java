package io.javaguru.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.javaguru.models.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer>{

}
