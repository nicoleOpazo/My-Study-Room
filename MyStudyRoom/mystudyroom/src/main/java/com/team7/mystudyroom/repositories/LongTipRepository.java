package com.team7.mystudyroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team7.mystudyroom.models.LongTip;

public interface LongTipRepository extends JpaRepository<LongTip, Integer> {
    
}
