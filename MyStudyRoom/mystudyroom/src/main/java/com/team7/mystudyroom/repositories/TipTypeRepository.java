package com.team7.mystudyroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team7.mystudyroom.models.TipType;

public interface TipTypeRepository extends JpaRepository<TipType, Integer> {
    
}
