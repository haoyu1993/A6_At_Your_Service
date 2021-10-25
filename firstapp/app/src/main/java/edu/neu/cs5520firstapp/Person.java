package edu.neu.cs5520firstapp;

public class Person {


    private  String name;
    private  String URL;
    private int head;

    public Person(String name, String URL, int head) {
        this.name = name;
        this.URL = URL;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }

    public int getHead() {
        return head;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setHead(int head) {
        this.head = head;
    }
}
