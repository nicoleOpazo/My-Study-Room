package com.team7.mystudyroom.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "Settings")
public class Settings {
    @Id
    @GeneratedValue
    private Integer settings_id;

    //Settings está entregando su llave a pomodoro
    @OneToOne(mappedBy = "settings", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pomodoro pomodoro;

    //Recibe llave foranea de User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    //Relacion de uno es a muchos OneToMany con Long tip
    @OneToMany(mappedBy = "settings", cascade = CascadeType.ALL)
    private List<LongTip> longTip;

    public Settings() {
    }

    public Settings(Integer settings_id, Pomodoro pomodoro, User user, List<LongTip> longTip) {
        this.settings_id = settings_id;
        this.pomodoro = pomodoro;
        this.user = user;
        this.longTip = longTip;
    }

    public Integer getSettings_id() {
        return settings_id;
    }

    public void setSettings_id(Integer settings_id) {
        this.settings_id = settings_id;
    }

    public Pomodoro getPomodoro() {
        return pomodoro;
    }

    public void setPomodoro(Pomodoro pomodoro) {
        this.pomodoro = pomodoro;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<LongTip> getLongTip() {
        return longTip;
    }

    public void setLongTip(List<LongTip> longTip) {
        this.longTip = longTip;
    }




    
}
