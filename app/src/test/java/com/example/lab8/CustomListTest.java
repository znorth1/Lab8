package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mock list for my city list
     * @return the list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    void hasCityTest(){
        list = MockCityList();
        City city1 = new City("Edmonton","Alberta");
        list.addCity(city1);
        assertTrue(list.hasCity(city1));
        City city2 = new City("Charlottetown", "Prince Edward Island");
        assertFalse(list.hasCity(city2));
    }
    @Test
    void deleteCityTest() throws Exception{
        list = MockCityList();
        City city1 = new City("Edmonton", "Alberta");
        City city2 = new City("Charlottetown", "Prince Edward Island");
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(0, city2.compareTo(list.getCities().get(0)));
        assertEquals(0, city1.compareTo(list.getCities().get(1)));
        list.deleteCity(city2);
        assertEquals(0, city1.compareTo(list.getCities().get(0)));
    }
}
