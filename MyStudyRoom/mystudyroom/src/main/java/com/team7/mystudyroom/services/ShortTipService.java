package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.ShortTip;
import com.team7.mystudyroom.repositories.ShortTipRepository;

@Service
@Transactional
public class ShortTipService {
    private ShortTipRepository shortTipRepository;

    public ShortTipService(ShortTipRepository shortTipRepository){
        this.shortTipRepository = shortTipRepository;
    }

    public void saveShortTip(ShortTip shortTip){
        shortTipRepository.save(shortTip);
    }

    public void updateShortTip(ShortTip shortTip){
        shortTipRepository.save(shortTip);
    }

    public List <ShortTip> findAll(){
        return shortTipRepository.findAll();
    }

    public void eliminarShortTip(Integer shortTip_id){
        shortTipRepository.deleteById(shortTip_id);
    }
    
}
