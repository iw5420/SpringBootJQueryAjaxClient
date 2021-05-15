package com.javasampleapproach.jqueryajax.model;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Ian Wang
 * @date 2021-05-10
 */
public class Customer3 {
    private Query query;
    private Pagination pagination;
    private Sorter sorter;

    public Customer3() {
    }

    @JsonCreator
    public Customer3(Pagination pagination, Query query, Sorter sorter) {
        this.pagination = pagination;
        this.query = query;
        this.sorter = sorter;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Sorter getSorter() {
        return sorter;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }
}
