package com.flyonsky.model;

import java.io.Serializable;

/**
 * @author luowengang
 * @date 2020/4/5 22:52
 */
public class City implements Serializable {
    private Long id;
    private String name;
    private String state;
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
