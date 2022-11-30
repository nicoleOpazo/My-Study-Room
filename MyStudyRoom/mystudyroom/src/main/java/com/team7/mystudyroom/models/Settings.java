package com.team7.mystudyroom.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "Settings")
public class Settings {
    @Id
    @GeneratedValue
    private Integer settings_id;

    @OneToOne(mappedBy = "Settings", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pomodoro pomodoro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    public Settings() {
    }

    public Settings(Integer settings_id) {
        this.settings_id = settings_id;
    }

    public Integer getSettings_id() {
        return settings_id;
    }

    public void setSettings_id(Integer settings_id) {
        this.settings_id = settings_id;
    }


    
}
