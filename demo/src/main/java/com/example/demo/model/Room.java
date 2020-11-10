package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import  javax.persistence.Id;
import  javax.persistence.Table;

@Entity
@Table(name="meetingroom")

public class Room {

    private long id;
    private String Name;
    private String Date;
    private String StartHour;
    private  String EndHour;

    public Room(){

    }

    public Room(long id, String Name, String Date, String StartHour, String EndHour){
        this.id=id;
        this.Name=Name;
        this.Date=Date;
        this.StartHour=StartHour;
        this.EndHour=EndHour;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name="Name", nullable = false)
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;

    }
    @Column(name="Date", nullable = false)
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Column(name="StartHour", nullable = false)
    public String getStartHour() {
        return StartHour;
    }

    public void setStartHour(String startHour) {
        StartHour = startHour;
    }

    @Column(name="EndHour", nullable = false)
    public String getEndHour() {
        return EndHour;
    }

    public void setEndHour(String endHour) {
        EndHour = endHour;
    }
    @Override
    public String toString(){
        return "Room [id="+id+",name="+ Name+",startHor="+ StartHour+ ",endHour="+ EndHour+" ]";

    }

}

