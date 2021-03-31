package com.anderson.stockquotemanager.service;

import com.anderson.stockquotemanager.model.Stock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StockService {
    Stock create(Stock stock);
    Optional<Stock> getById(String id);
    List<Stock> getAll();

}
