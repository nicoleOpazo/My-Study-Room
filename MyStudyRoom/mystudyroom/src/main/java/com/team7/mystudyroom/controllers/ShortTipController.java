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

import com.team7.mystudyroom.models.ShortTip;
import com.team7.mystudyroom.services.ShortTipService;

@RestController
@CrossOrigin("*")
public class ShortTipController {
    
    private ShortTipService shortTipService;

    public ShortTipController(@Autowired ShortTipService shortTipService){
        this.shortTipService = shortTipService;
    }

    @PostMapping("/ShortTip/save")
    public void guardarShortTip(@RequestBody ShortTip shortTip){
        shortTipService.saveShortTip(shortTip);
    }

    @PutMapping("/ShortTip/update")
    public void actualizarShortTip(@RequestBody ShortTip shortTip){
        shortTipService.updateShortTip(shortTip);
    }

    @GetMapping("/ShortTip/findAll")
    public List <ShortTip> todasLosShortTip(){
        return shortTipService.findAll();
    }

    @DeleteMapping("/ShortTip/eliminarShortTip/{shortTip_id}")
    public void deleteShortTip(@PathVariable Integer shortTip_id){
        shortTipService.eliminarShortTip(shortTip_id);
    }
}

