package com.uep.wap.dto;

import javax.persistence.Column;
import java.sql.Time;
import java.util.Date;

public class MatchDTO {

    private int match_id;

    private Date start_date;

    private Time start_time;

    private int court_numer;

    private String timezone;

    private String additional_info;

    private String points;

    //methods

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
