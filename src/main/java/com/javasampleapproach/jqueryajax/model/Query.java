package com.javasampleapproach.jqueryajax.model;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Ian Wang
 * @date 2021-05-10
 */
public class Query {
   private Integer current;
    private Integer pageSize;

    public Query() {
    }

    @JsonCreator
    public Query(Integer current, Integer pageSize) {
        this.current = current;
        this.pageSize = pageSize;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
