package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.Pomodoro;
import com.team7.mystudyroom.repositories.PomodoroRepository;

@Service
@Transactional
public class PomodoroService {
    private PomodoroRepository pomodoroRepository;

    public PomodoroService(PomodoroRepository pomodoroRepository){
        this.pomodoroRepository= pomodoroRepository;
    }

    public void savePomodoro(Pomodoro pomodoro){
        pomodoroRepository.save(pomodoro);
    }

    public void updatePomodoro(Pomodoro pomodoro){
        pomodoroRepository.save(pomodoro);
    }

    public List <Pomodoro> findAll(){
        return pomodoroRepository.findAll();
    }

    public void eliminarPomodoro(Integer pomodoro_id){
        pomodoroRepository.deleteById(pomodoro_id);
    }

    



}
