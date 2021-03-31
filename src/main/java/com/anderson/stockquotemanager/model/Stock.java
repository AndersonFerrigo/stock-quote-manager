package com.anderson.stockquotemanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "stock")
public class Stock {
    @Id
    private String id;

    @OneToMany(mappedBy = "stock")
    private List<Quote> quotes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
