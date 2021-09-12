package com.shackluryz.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shackluryz.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
