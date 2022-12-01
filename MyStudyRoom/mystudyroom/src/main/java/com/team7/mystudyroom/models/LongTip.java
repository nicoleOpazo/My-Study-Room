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
    @JoinColumn(name="tipTipe_id")
    private TipType tipType;

    //Relacion de muchos a uno, Many To One, donde Long tip rebire de Settings
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "settings_id")
    private Settings settings;
}
