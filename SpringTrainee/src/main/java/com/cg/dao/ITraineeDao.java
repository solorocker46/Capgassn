package com.cg.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Trainee;

@Repository
public interface ITraineeDao extends JpaRepository<Trainee, Integer>{
	Trainee findByTraineeName(String traineeName);
	
}
