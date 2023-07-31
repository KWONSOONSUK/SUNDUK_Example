package com.flns.sunduk.service;

import com.flns.sunduk.mapper.PersonMapper;
import com.flns.sunduk.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonMapper personMapper;

    @Autowired
    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<Person> getAllPeople() {
        return personMapper.getAllPeople();
    }

    public Person getPersonById(String id) {
        return personMapper.getPersonById(id);
    }

    public Person createPerson(Person person) {
        person.setId(UUID.randomUUID().toString());
        personMapper.insertPerson(person);
        return person;
    }

    public Person updatePerson(String id, Person person) {
        person.setId(id);
        personMapper.updatePerson(person);
        return person;
    }

    public void deletePerson(String id) {
        personMapper.deletePerson(id);
    }
}
