package com.example.demo5.service;

import java.util.List;

import com.example.demo5.entity.Country;

public interface CountryService {

	Country getByCode(String code);

	List<Country> saveFromCsv(String file);

}
