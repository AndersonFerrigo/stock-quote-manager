package com.anderson.stockquotemanager.repository;

import com.anderson.stockquotemanager.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock,String> {
}
