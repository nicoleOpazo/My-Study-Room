package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.TipType;
import com.team7.mystudyroom.repositories.TipTypeRepository;

@Service
@Transactional
public class TipTypeService {
    private TipTypeRepository tipTypeRepository;

    public TipTypeService( TipTypeRepository tipTypeRepository){
        this.tipTypeRepository = tipTypeRepository;
    }

    public void saveTipType(TipType tipType){
        tipTypeRepository.save(tipType);
    }

    public void updateTipType(TipType tipType){
        tipTypeRepository.save(tipType);
    }

    public List <TipType> findAll(){
        return tipTypeRepository.findAll();
    }

    public void eliminarTipType(Integer tipType_id){
        tipTypeRepository.deleteById(tipType_id);
    }
    
}
