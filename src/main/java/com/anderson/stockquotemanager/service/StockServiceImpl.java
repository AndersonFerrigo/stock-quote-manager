package com.anderson.stockquotemanager.service;

import com.anderson.stockquotemanager.model.Stock;
import com.anderson.stockquotemanager.repository.StockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockRepository repository;

    @Override
    public Stock create(Stock stock) {
        return repository.save(stock);
    }

    @Override
    public Optional<Stock> getById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Stock> getAll() {
        return repository.findAll();
    }
}
