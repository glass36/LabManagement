package com.szx.po;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Device {
	@Id
	@GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private Long price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}