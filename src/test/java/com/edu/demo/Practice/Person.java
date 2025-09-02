package com.edu.demo.Practice;

public abstract class Person {

    String address = "";
    String name = "";
    String PhNo = "";

    Person(String address, String name, String phNo) {
        this.address = address;
        this.PhNo = phNo;
        this.name = name;
    }

    abstract void doEat();
    abstract void doSleep();
    abstract void doWork();

}
