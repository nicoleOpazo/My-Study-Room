package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.LongTip;
import com.team7.mystudyroom.repositories.LongTipRepository;

@Service
@Transactional
public class LongTipService {
    
    private LongTipRepository longTipRepository;

    public LongTipService(LongTipRepository longTipRepository){
        this.longTipRepository = longTipRepository;
    }

    public void saveLongTip(LongTip longTip){
        longTipRepository.save(longTip);
    }

    public void updateLongTip(LongTip longTip){
        longTipRepository.save(longTip);
    }

    public List <LongTip> findAll(){
        return longTipRepository.findAll();
    }

    public void eliminarLongTip(Integer longTip_id){
        longTipRepository.deleteById(longTip_id);
    }
    
}
