package com.example.lab8;

public class City implements Comparable{

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
    /**
     * Allows string comparison of two city objects
     * @param o the object to be compared.
     * @return
     * Returns an integer representing the length of the string
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Allows boolean comparison of two city objects
     * @param o
     * @return
     * Returns a boolean value that confirms or denies the existence of a city in the list
     */
    @Override
    public boolean equals(Object o){
        City city = (City) o;
        return this.getCityName().equals(city.getCityName()) && this.getProvinceName().equals(city.getProvinceName());
    }

}
