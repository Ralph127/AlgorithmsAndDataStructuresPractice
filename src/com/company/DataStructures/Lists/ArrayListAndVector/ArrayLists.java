package com.company.DataStructures.Lists.ArrayListAndVector;

import com.company.DataStructures.Lists.TestData;

import java.util.ArrayList;
import java.util.List;

/**
 *  Default capacity is size 10
 *  Good for iterating over them, because accessing objects in it is done by an index O(1)
 *  Not so good for adding a lot of items. If the list doesn't have enough size(Backing Array) to add the items
 *  then it will have to recreate a new ArrayList with a bigger size. Same thing with deleting Items, We would have to
 *  shift items around after they are deleted.
 *
 *  Constructor (none) (int InitialCapacity) (Collection<extends E> c )
 */
public class ArrayLists {

    public static void main(String args[]){
        // Creating a list object lets you remake the class into other lists. I.E linked list, array list, vector
        List<TestData> employeeList = new ArrayList<>();
        employeeList.add(new TestData("Jane", "Jones", 123));
        employeeList.add(new TestData("Ralph", "Chamberlain", 4567));
        employeeList.add(new TestData("Mary", "Smith", 22));
        employeeList.add(new TestData("Mike", "Wilson", 3245));

        // Using Lambda's with forEach function (loop)
        employeeList.forEach(employee -> System.out.println(employee));

        // simple get
        System.out.println(employeeList.get(1));

        // returns boolean
        System.out.println(employeeList.isEmpty());

        // setting (Index, Object)
        employeeList.set(1, new TestData("John", "Adams",2222));

        // simple size
        System.out.println(employeeList.size());

        // adding by index. this shifts the other objects
        employeeList.add(3,new TestData("Kyle", "p", 333));

        // converting arraylist to array. Have to pass the array type
        Object[] employeeArray = employeeList.toArray(new TestData[employeeList.size()]);

        // returns boolean. remember to implement the equals method in the object
        System.out.println(employeeList.contains(new TestData("Ralph", "Chamberlain", 4567)));

        // index of
        System.out.println(employeeList.indexOf(new TestData("Ralph", "Chamberlain", 4567)));

        // remove can be expensive because having to shift all elements
        employeeList.remove(2);
    }
}
