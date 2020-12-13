package com.mukham.activemq.receiver.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    //id will be auto generate in db
    Long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "ADDRESS")
    String address;

    @Column(name = "PHONE")
    String phone;



}
