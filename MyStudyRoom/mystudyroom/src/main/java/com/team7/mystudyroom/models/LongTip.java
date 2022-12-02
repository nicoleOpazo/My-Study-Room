package com.team7.mystudyroom.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="LongTip")
public class LongTip {
    @Id
    @GeneratedValue
    private Integer longTip_id;
// Preguntar si el content va dentro de este codigo o se almacena de manera distinta al venir del foro
    private String content;
    private String name;

    //Relacion 1 a 1 LongTip con TipType(recibir)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tipType_id")
    private TipType tipType;

    //Relacion de muchos a uno, Many To One, donde Long tip rebire de Settings
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "settings_id")
    private Settings settings;

    public LongTip() {
    }

    public LongTip(Integer longTip_id, String content, String name, TipType tipType, Settings settings) {
        this.longTip_id = longTip_id;
        this.content = content;
        this.name = name;
        this.tipType = tipType;
        this.settings = settings;
    }

    public Integer getLongTip_id() {
        return longTip_id;
    }

    public void setLongTip_id(Integer longTip_id) {
        this.longTip_id = longTip_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipType getTipType() {
        return tipType;
    }

    public void setTipType(TipType tipType) {
        this.tipType = tipType;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    
}
