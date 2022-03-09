package com.rbaltrusch.finapp.repo;

import com.rbaltrusch.finapp.domain.Status;
import com.rbaltrusch.finapp.domain.Transaction;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer> {
    Page<Transaction> findByStatus(@Param("status") Status status, Pageable pageable);

    @Override
    @RestResource(exported = false)
    void delete(Transaction entity);

    @Override
    @RestResource(exported = false)
    void deleteById(Integer id);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Integer> ids);
}
