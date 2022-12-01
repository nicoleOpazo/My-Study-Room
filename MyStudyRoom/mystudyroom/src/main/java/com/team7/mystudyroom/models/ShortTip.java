package com.team7.mystudyroom.models;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="ShortTip")
public class ShortTip {
    @Id
    @GeneratedValue
    private Integer shortTip_id;

    private String name;
    /*Preguntar si el contenido de los tips, debe ir como String o como algún otro tipo
    Ya que los tips se almacenarán en el foro creado proximamente. 
    */
    private String content;

    //Relación 1 a 1 ShortTip con TipType (recibe)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tipTipe_id")
    private TipType tipType;

    //ShortTip recibe la relacion y la llave foraneo de One to Many de Pomodoro
    //En una relacion de uno es a mucho Lazy recibe
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="pomodoro_id")
    private Pomodoro pomodoro;
}
