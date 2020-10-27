package com.mytests.micronaut.data;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;
import io.micronaut.data.annotation.Where;

import java.util.Objects;

/**
 * *
 * <p>Created by irina on 27.10.2020.</p>
 * <p>Project: micronaut-jdbc-test1</p>
 * *
 */
@MappedEntity("tab1")
@Where("gender = 'f'")  // https://youtrack.jetbrains.com/issue/IDEA-253928
public class Tab1Females {
    private Integer id;
    private String name;
    private String surname;
    private String gender;
    private int age;

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @MappedProperty("gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tab1Females tab1 = (Tab1Females) o;
        return age == tab1.age && Objects.equals(id, tab1.id) && Objects.equals(name, tab1.name) && Objects.equals(surname, tab1.surname) && Objects.equals(gender, tab1.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, gender, age);
    }
}
