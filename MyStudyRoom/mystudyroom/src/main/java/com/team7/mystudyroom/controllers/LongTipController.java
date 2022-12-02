package com.team7.mystudyroom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.team7.mystudyroom.models.LongTip;
import com.team7.mystudyroom.services.LongTipService;

@RestController
@CrossOrigin
public class LongTipController {
    private LongTipService longTipService;

    public LongTipController(@Autowired LongTipService longTipService){
        this.longTipService = longTipService;
    }

    @PostMapping("/LongTip/save")
    public void guardarLongTip(@RequestBody LongTip longTip){
        longTipService.saveLongTip(longTip);
    }

    @PutMapping("/LongTip/update")
    public void actualizarLongTip(@RequestBody LongTip longTip){
        longTipService.updateLongTip(longTip);
    }

    @GetMapping("/LongTip/findAll")
    public List <LongTip> todasLosLongTip(){
        return longTipService.findAll();
    }

    @DeleteMapping("/LongTip/eliminarLongTip/{longTip_id}")
    public void deleteLongTip(@PathVariable Integer longTip_id){
        longTipService.eliminarLongTip(longTip_id);
    }
}
