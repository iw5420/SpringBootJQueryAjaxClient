package com.javasampleapproach.jqueryajax.model;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Ian Wang
 * @date 2021-05-11
 */
public class Smartphone {
    private final String brand;
    private final Model model;


    public Smartphone(String brand, Model model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    static class Model {
        private final String name;
        private final String version;

        public Model(String name, String version) {
            this.name = name;
            this.version = version;
        }

        public String getName() {
            return name;
        }

        public String getVersion() {
            return version;
        }
    }
}
