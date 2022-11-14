package com.example.listviewpersonalization;

public class Article {
    protected String code, name;
    protected int stock;

    public Article(String code, String name, int stock) {
        this.code = code;
        this.name = name;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Article{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", stock=" + stock + '}';
    }
}
