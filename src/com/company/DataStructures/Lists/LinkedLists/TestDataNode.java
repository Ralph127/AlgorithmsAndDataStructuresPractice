package com.company.DataStructures.Lists.LinkedLists;

import com.company.DataStructures.Lists.TestData;

public class TestDataNode {

    private TestData employee;
    private TestDataNode next;

    public TestDataNode(TestData employee){
        this.employee = employee;
    }

    public TestDataNode getNext() {
        return next;
    }

    public void setNext(TestDataNode next) {
        this.next = next;
    }

    public TestData getEmployee() {
        return employee;
    }

    public void setEmployee(TestData employee) {
        this.employee = employee;
    }
}
