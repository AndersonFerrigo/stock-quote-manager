package com.anderson.stockquotemanager.controller;

import com.anderson.stockquotemanager.model.Stock;
import com.anderson.stockquotemanager.service.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockServiceImpl stockService;


    @GetMapping()
    public List<Stock> getAllStocks(){
        return stockService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Stock> getStockById(@PathVariable("id") String id){
        return stockService.getById(id);
    }

    @PostMapping("/")
    public Stock createStock(@RequestBody Stock stock){
        return stockService.create(stock);
    }

}
