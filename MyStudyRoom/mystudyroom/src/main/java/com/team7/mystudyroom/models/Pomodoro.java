package com.team7.mystudyroom.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity(name = "Pomodoro")
public class Pomodoro {
    @Id
    @GeneratedValue
    private Integer pomodoro_id;
    private int workingTime;
    private int breakTime;

    //Relacion 1 a 1 con setting, pomodoro recibe
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "settings_id")
    private Settings settings;

    //Relacion 1 a muchos con ShortTip, donde pomodoro entrega la FK
    //One to many EAGER entrega y el que entrega queda con la lista. 
    @OneToMany(mappedBy = "pomodoro", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ShortTip> shortTip;

    public Pomodoro() {
    }

    public Pomodoro(Integer pomodoro_id, int workingTime, int breakTime, Settings settings, List<ShortTip> shortTip) {
        this.pomodoro_id = pomodoro_id;
        this.workingTime = workingTime;
        this.breakTime = breakTime;
        this.settings = settings;
        this.shortTip = shortTip;
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

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<ShortTip> getShortTip() {
        return shortTip;
    }

    public void setShortTip(List<ShortTip> shortTip) {
        this.shortTip = shortTip;
    }
    



    



}
