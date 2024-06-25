package com.example.dao;


import com.example.entity.Individuo;
import org.springframework.data.repository.CrudRepository;

public interface IndividuoDao extends CrudRepository<Individuo, Long>{
    
}
