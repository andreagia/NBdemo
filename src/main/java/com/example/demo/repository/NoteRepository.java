package com.example.demo.repository;

import com.example.demo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

//    @Query("SELECT con FROM Contact con  WHERE con.phoneType=(:pType) AND con.lastName= (:lName)")
//    List<Contact> findByLastNameAndPhoneType(@Param("pType") PhoneType pType, @Param("lName") String lName);

}