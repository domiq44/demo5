package com.example.demo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo5.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
