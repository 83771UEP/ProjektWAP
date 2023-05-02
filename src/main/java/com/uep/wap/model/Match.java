package com.uep.wap.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="matches")
public class Match {
    @Id
    @GenericGenerator(name="match_id_generator" , strategy="increment")
    @GeneratedValue(generator="match_id_generator")
    @Column(name ="match_id")
    private int match_id;

    @Column(name ="start_date")
    private Date start_date;

    @Column(name ="start_time")
    private Time start_time;

    @Column(name ="court_numer")
    private int court_numer;

    @Column(name ="timezone")
    private String timezone;

    @Column(name ="additional_info")
    private String additional_info;

    @Column(name ="points")
    private String points;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "players_matches",
            joinColumns = @JoinColumn(name = "Match_match_id"),
            inverseJoinColumns = @JoinColumn(name = "Match_player_id"))
    private List<Player> players;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Supervisor supervisor;

    @ManyToOne
    @JoinColumn(name = "bracket_id")
    private Bracket bracket;

    public Match() {
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public int getCourt_numer() {
        return court_numer;
    }

    public void setCourt_numer(int court_numer) {
        this.court_numer = court_numer;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
