package com.example.payment;

public class User {
    private String name;
    private int id ;

    public User(String name, int id){
     this.name=name;
     this.id=id;

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
