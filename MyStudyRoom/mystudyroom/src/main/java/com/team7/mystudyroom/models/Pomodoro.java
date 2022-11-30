package com.team7.mystudyroom.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "Pomodoro")
public class Pomodoro {
    @Id
    @GeneratedValue
    private Integer pomodoro_id;
    private int workingTime;
    private int breakTime;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "settings_id")
    private Settings settings;

    public Pomodoro() {
    }

    public Pomodoro(Integer pomodoro_id, int workingTime, int breakTime) {
        this.pomodoro_id = pomodoro_id;
        this.workingTime = workingTime;
        this.breakTime = breakTime;
    }

    public Integer getPomodoro_id() {
        return pomodoro_id;
    }


    public void setPomodoro_id(Integer pomodoro_id) {
        this.pomodoro_id = pomodoro_id;
    }


    public int getWorkingTime() {
        return workingTime;
    }


    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }


    public int getBreakTime() {
        return breakTime;
    }


    public void setBreakTime(int breakTime) {
        this.breakTime = breakTime;
    }

    

    



}
