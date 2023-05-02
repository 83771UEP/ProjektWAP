package com.uep.wap.model;

import org.hibernate.Session;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="players")
public class Player{

    @Id
    @GenericGenerator(name="player_id_generator" , strategy="increment")
    @GeneratedValue(generator="player_id_generator")
    @Column(name ="player_id")
    private int player_id;
    @Column(name ="first_name")
    private String first_name;

    @Column(name ="last_name")
    private String last_name;
    @Column(name ="age")
    private Integer age;

    @Column(name ="nationality")
    private String nationality;

    @Column(name ="height")
    private Integer height;

    @ManyToMany(mappedBy = "players")
    private List<Match> matches;

    public Player(){
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() { return nationality; }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}




