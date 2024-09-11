package com.example.RestAPI.Controller;

import com.example.RestAPI.Entity.Person;
import com.example.RestAPI.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping()
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public Person getAll(){
        return personService.getAll();
    }
}








//    @Autowired
//    private PersonService personService;
//
//    @GetMapping("/get")
//    public List<Person> getAll(){
//        return personService.getAllPerson();
//    }
//
//    @GetMapping("/getById/{id}")
//    public Optional<Person> getById(@PathVariable int id){
//        return personService.getById(id);
//    }
//
//    @PostMapping("/post")
//    public Person createPerson(@RequestBody Person person){
//        return personService.createPerson(person);
//    }
//
//    @PutMapping("/put")
//    public String updatePerson(@RequestBody Person person){
//        personService.updatePerson(person);
//        return "Success";
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deletePerson(@PathVariable int id){
//        personService.deletePerson(id);
//        return "Deleted";
//    }