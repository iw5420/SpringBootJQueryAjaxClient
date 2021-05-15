package com.javasampleapproach.jqueryajax.model;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Ian Wang
 * @date 2021-05-10
 */
public class Sorter {
    private String field;
    private String order;

    public Sorter() {
    }
    @JsonCreator
    public Sorter(String field, String order) {
        this.field = field;
        this.order = order;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
