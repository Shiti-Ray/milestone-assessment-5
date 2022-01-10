package com.milestoneassessment5.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milestoneassessment5.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {}