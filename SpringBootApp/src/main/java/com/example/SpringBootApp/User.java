package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;

    String log,time,date,i;

    User() {}

    User(String log,String time,String date,String i)

    {

    
    	   this.log = log;
    	this.time=time;
    	this.date=date;

        this.i = i;


    }
}