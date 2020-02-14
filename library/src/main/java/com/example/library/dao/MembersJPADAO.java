package com.example.library.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.library.entities.Member;

public interface MembersJPADAO extends CrudRepository<Member, Integer>{

}
