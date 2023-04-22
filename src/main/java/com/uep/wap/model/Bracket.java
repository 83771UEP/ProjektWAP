package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="brackets")
public class Bracket{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="bracket_id")
    private int bracket_id;
    @Column(name ="tournament_name")
    private String tournament_name;

    @Column(name ="tounament_location")
    private String tounament_location;

    @Column(name ="start_date")
    private String start_date;

    @OneToMany(mappedBy = "bracket", cascade = CascadeType.ALL)
    private List<Match> matches;

    public int getBracket_id() {
        return bracket_id;
    }

    public void setBracket_id(int bracket_id) {
        this.bracket_id = bracket_id;
    }

    public String getTournament_name() {
        return tournament_name;
    }

    public void setTournament_name(String tournament_name) {
        this.tournament_name = tournament_name;
    }

    public String getTounament_location() {
        return tounament_location;
    }

    public void setTounament_location(String tounament_location) {
        this.tounament_location = tounament_location;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public Bracket(){
    }

}