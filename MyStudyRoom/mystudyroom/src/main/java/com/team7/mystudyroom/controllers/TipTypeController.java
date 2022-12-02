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

import com.team7.mystudyroom.models.TipType;
import com.team7.mystudyroom.services.TipTypeService;

@RestController
@CrossOrigin("*")
public class TipTypeController {
    private TipTypeService tipTypeService;

    public TipTypeController(@Autowired TipTypeService tipTypeService){
        this.tipTypeService = tipTypeService;
    }
    
    @PostMapping("/TipType/save")
    public void guardarUserType(@RequestBody TipType tipType){
        tipTypeService.saveTipType(tipType);
    }

    @PutMapping("/TipType/update")
    public void actualizarTipType(@RequestBody TipType tipType){
        tipTypeService.updateTipType(tipType);
    }

    @GetMapping("/TipType/findAll")
    public List <TipType> todasLosTipType(){
        return tipTypeService.findAll();
    }

    @DeleteMapping("/UserType/eliminarTipType/{tipType_id}")
    public void deleteTipType(@PathVariable Integer tipType_id){
        tipTypeService.eliminarTipType(tipType_id);
    }
}
