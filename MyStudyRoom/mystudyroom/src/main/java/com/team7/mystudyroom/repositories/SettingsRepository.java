package com.team7.mystudyroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team7.mystudyroom.models.Settings;

public interface SettingsRepository extends JpaRepository<Settings, Integer> {
    
}
