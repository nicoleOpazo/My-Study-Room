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

import com.team7.mystudyroom.models.Pomodoro;
import com.team7.mystudyroom.services.PomodoroService;

@RestController
@CrossOrigin("*")
public class PomodoroController {
    private PomodoroService pomodoroService;

    public PomodoroController(@Autowired PomodoroService pomodoroService){
        this.pomodoroService = pomodoroService;
    }

    @PostMapping("/Pomodoro/save")
    public void guardarPomodoro(@RequestBody Pomodoro pomodoro){
        pomodoroService.savePomodoro(pomodoro);
    }

    @PutMapping("/Pomodoro/update")
    public void actualizarPomodoro(@RequestBody Pomodoro pomodoro){
        pomodoroService.updatePomodoro(pomodoro);
    }

    @GetMapping("/Pomodoro/findAll")
    public List <Pomodoro> todosLosPomodoro(){
        return pomodoroService.findAll();
    }

    @DeleteMapping("/Pomodoro/eliminarPomodoro/{pomodoro_id}")
    public void deletePomodoro(@PathVariable Integer pomodoro_id){
        pomodoroService.eliminarPomodoro(pomodoro_id);
    }
}
