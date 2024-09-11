package com.example.RestAPI.Service;

import com.example.RestAPI.Entity.Person;
import com.example.RestAPI.Repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private RestTemplate restTemplate;

    public Person getAll(){
        return restTemplate.getForObject("http://localhost:8082/Person",Person.class);
    }
}





//@Autowired
//    private PersonRepository personRepository;
//
//    public List<Person> getAllPerson(){
//        return personRepository.findAll();
//    }
//
//    public Optional<Person> getById(int id){
//       return personRepository.findById(id);
//    }
//
//    public Person createPerson(Person person){
//        return personRepository.save(person);
//    }
//
//    public void updatePerson(Person person){
//       personRepository.save(person);
//    }
//
//    public void deletePerson(int id){
//        personRepository.deleteById(id);
//    }