package com.sparta.kch;

public interface SQLQueries {

    String customerSelect = "SELECT * FROM northwind.customers";
    String customerWithName = "SELECT* FROM northwind.customers WHERE ContactName LIKE ?";



}
