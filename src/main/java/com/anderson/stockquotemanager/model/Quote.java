package com.anderson.stockquotemanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quotes")
public class Quote {
    @Id
    @Column(name = "data")
    private Date data;

    @Column(name = "valor")
    private double value;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Stock stock;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
