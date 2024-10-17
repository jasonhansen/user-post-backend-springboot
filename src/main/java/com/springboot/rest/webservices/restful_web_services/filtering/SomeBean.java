package com.springboot.rest.webservices.restful_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties("fields1,fields2")
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private String fields1;

    //    @JsonIgnore
    private String fields2;
    private String fields3;

    public SomeBean(String fields1, String fields2, String fields3) {
        super();
        this.fields1 = fields1;
        this.fields2 = fields2;
        this.fields3 = fields3;
    }

    public String getFields1() {
        return fields1;
    }

    public String getFields2() {
        return fields2;
    }

    public String getFields3() {
        return fields3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "fields1='" + fields1 + '\'' +
                ", fields2='" + fields2 + '\'' +
                ", fields3='" + fields3 + '\'' +
                '}';
    }
}
