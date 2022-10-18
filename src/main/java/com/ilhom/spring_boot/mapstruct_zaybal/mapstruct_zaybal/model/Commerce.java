package com.ilhom.spring_boot.mapstruct_zaybal.mapstruct_zaybal.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Commerce")
public class Commerce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id;

    @Basic
    @Column
    String name;

    @Basic
    @Column
    String surname;
    @Basic
    @Column
    String department;
    @Basic
    @Column
    int salary;

}
