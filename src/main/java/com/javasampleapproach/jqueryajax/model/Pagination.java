package com.javasampleapproach.jqueryajax.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Date;

/**
 * @author Ian Wang
 * @date 2021-05-10
 */
public class Pagination {
    private Date startDate;
    private Date endDate;
    private String keywords;

    public Pagination() {
    }

    @JsonCreator
    public Pagination(Date startDate, Date endDate, String keywords) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.keywords = keywords;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
