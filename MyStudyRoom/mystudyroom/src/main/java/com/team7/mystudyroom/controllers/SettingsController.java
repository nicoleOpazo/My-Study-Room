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

import com.team7.mystudyroom.models.Settings;
import com.team7.mystudyroom.services.SettingsService;

@RestController
@CrossOrigin("*")
public class SettingsController {
    private SettingsService settingsService;

    public SettingsController(@Autowired SettingsService settingsService){
        this.settingsService = settingsService;
    }

    @PostMapping("/Settings/save")
    public void guardarSettings(@RequestBody Settings settings){
        settingsService.saveSettings(settings);
    }

    @PutMapping("/Settings/update")
    public void actualizarSettings(@RequestBody Settings settings){
        settingsService.updateSettings(settings);
    }

    @GetMapping("/Settings/findAll")
    public List <Settings> todasLosSettings(){
        return settingsService.findAll();
    }

    @DeleteMapping("/Settings/eliminarSettings/{settings_id}")
    public void deleteSettings(@PathVariable Integer settings_id){
        settingsService.eliminarSettings(settings_id);
    }
}
