package com.company.DataStructures.Lists.LinkedLists;

import com.company.DataStructures.Lists.TestData;

/**
 * Each item in the list is called a node
 * the first item in the list is the head of the list
 */
public class SinglyLinkedLists {
    private TestDataNode head;

    public static void main(String args[]){

        TestData Jane = new TestData("Jane", "Jones", 123);
        TestData Ralph = new TestData("Ralph", "Chamberlain", 4567);
        TestData Mary = new TestData("Mary", "Smith", 22);
        TestData Mike = new TestData("Mike", "Wilson", 3245);

    }

    public void addToFront(TestData employee){
        TestDataNode node = new TestDataNode(employee);
    }
}


