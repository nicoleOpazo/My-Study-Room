package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.Settings;
import com.team7.mystudyroom.repositories.SettingsRepository;

@Service
@Transactional
public class SettingsService {
    private SettingsRepository settingsRepository;
    
    public SettingsService(SettingsRepository settingsRepository){
        this.settingsRepository = settingsRepository;
    }
        public void saveSettings(Settings settings){
            settingsRepository.save(settings);
        }
    
        public void updateSettings(Settings settings){
            settingsRepository.save(settings);
        }
    
        public List <Settings> findAll(){
            return settingsRepository.findAll();
        }

        public void eliminarSettings(Integer settings_id){
            settingsRepository.deleteById(settings_id);
        }
    }
    
