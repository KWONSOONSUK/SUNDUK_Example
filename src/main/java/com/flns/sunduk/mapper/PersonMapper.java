package com.flns.sunduk.mapper;

import com.flns.sunduk.vo.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM person")
    List<Person> getAllPeople();

    @Select("SELECT * FROM person WHERE id = #{id}")
    Person getPersonById(@Param("id") String id);

    @Insert("INSERT INTO person (id, name, age) VALUES (#{id}, #{name}, #{age})")
    void insertPerson(Person person);

    @Update("UPDATE person SET name = #{name}, age = #{age} WHERE id = #{id}")
    void updatePerson(Person person);

    @Delete("DELETE FROM person WHERE id = #{id}")
    void deletePerson(@Param("id") String id);
}


