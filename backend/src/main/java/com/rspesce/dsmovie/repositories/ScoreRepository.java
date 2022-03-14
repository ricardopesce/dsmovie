package com.rspesce.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rspesce.dsmovie.entities.Score;
import com.rspesce.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
