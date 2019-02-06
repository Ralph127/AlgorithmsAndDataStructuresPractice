package com.company.DataStructures.Lists.ArrayListAndVector;


import com.company.DataStructures.Lists.TestData;

import java.util.List;
import java.util.Vector;

/**
 * vectors are synchronized, it is thread safe
 * recommended to use arraylist if you dont need synchronization
 * Has the same methods that are used in arraylists
 */
public class Vectors {

    public static void main(String[] args){
        List<TestData> employeeList = new Vector<>();
        employeeList.add(new TestData("Jane", "Jones", 123));
        employeeList.add(new TestData("Ralph", "Chamberlain", 4567));
        employeeList.add(new TestData("Mary", "Smith", 22));
        employeeList.add(new TestData("Mike", "Wilson", 3245));

    }
}
