package com.assignment.mentoruser;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.assignment.entity.Mentor;
import com.assignment.entity.UserEntity;

public interface MentorRepository extends Repository<Mentor, Integer>{

    void delete(Mentor mentor);

    List<Mentor> findAll();

    Mentor findOne(int id);

    Mentor save(Mentor mentor);
    @Query("select mentor from Mentor mentor where mentor.userName=? and mentor.password=?")
   Mentor findUser(String userName,String password);

}
