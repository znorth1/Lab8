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
     * create a mock list for my city list with one city by default
     * @return the list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        list.addCity(mockCity());
        return list;
    }

    /** Baseline city for tests.
     *
     * @return city
     */
    private City mockCity() {
        return new City("Edmonton", "Alberta");
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
        assertTrue(list.hasCity(mockCity()));
        City city = new City("Charlottetown", "Prince Edward Island");
        assertFalse(list.hasCity(city));
    }
}
