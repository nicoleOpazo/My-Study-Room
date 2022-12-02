package com.team7.mystudyroom.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="TipType")
public class TipType {
    @Id
    @GeneratedValue
    private Integer tipType_id;

    private String tip_type_name;

    //Relacion 1 a 1 con Short Tip(da)
    @OneToOne(mappedBy = "tipType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ShortTip shortTip;

    //Relacion 1 a 1 con Long Tip(da)
    @OneToOne(mappedBy = "tipType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private LongTip longTip;

    public TipType() {
    }

    public TipType(Integer tipType_id, String tip_type_name, ShortTip shortTip, LongTip longTip) {
        this.tipType_id = tipType_id;
        this.tip_type_name = tip_type_name;
        this.shortTip = shortTip;
        this.longTip = longTip;
    }

    public Integer getTipType_id() {
        return tipType_id;
    }

    public void setTipType_id(Integer tipType_id) {
        this.tipType_id = tipType_id;
    }

    public String getTip_type_name() {
        return tip_type_name;
    }

    public void setTip_type_name(String tip_type_name) {
        this.tip_type_name = tip_type_name;
    }

    public ShortTip getShortTip() {
        return shortTip;
    }

    public void setShortTip(ShortTip shortTip) {
        this.shortTip = shortTip;
    }

    public LongTip getLongTip() {
        return longTip;
    }

    public void setLongTip(LongTip longTip) {
        this.longTip = longTip;
    }


    

}
