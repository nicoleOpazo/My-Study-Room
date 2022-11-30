package com.team7.mystudyroom.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.team7.mystudyroom.models.Pomodoro;

public interface PomodoroRepository extends JpaRepository<Pomodoro, Integer>{

    @Query(value ="select * from pomodoro where workingTime = ?1", nativeQuery = true)
    List <Pomodoro> findAllPomodoros(int workingTime);
}
    

