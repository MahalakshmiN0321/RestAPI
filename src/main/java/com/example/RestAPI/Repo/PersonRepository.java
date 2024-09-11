package com.example.RestAPI.Repo;

import com.example.RestAPI.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person,Integer> {
}
