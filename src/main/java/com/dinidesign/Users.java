package com.dinidesign;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by alina on 07.02.15.
 */
@Entity
@XmlRootElement
public class Users {




    private String name;
    private  String address;
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Users(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Users() {
    }

    @Override
    public String toString(){
      String s = "name: "+ name+" address: "+ address+" age: "+ age;
        return s;
    }
}

