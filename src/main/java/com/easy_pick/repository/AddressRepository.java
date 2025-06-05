package com.easy_pick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy_pick.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
