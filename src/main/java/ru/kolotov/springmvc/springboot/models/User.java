package ru.kolotov.springmvc.springboot.models;

//import jakarta.persistence.*;

import javax.persistence.*;

@Entity
@Table(name="table_boot")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private Integer age;

    public User() {}

    public User(Integer id, String name, String lastName, Integer age) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age == null ? 0 : age;
    }

    public int getId() {
        return id == null ? 0 : id;
    }

    public String getName() {
        return name;
    }
}
