package com.app.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.jpa.entities.UserData;

public interface UserRepository extends CrudRepository<UserData,Integer>{

  public List<UserData> findUserByName(String name);
  public List<UserData> findUserById(int id);
  public List<UserData> findUserByCity(String city);
  public List<UserData> nameStartingWith(String chars);
  public List<UserData> idGreaterThan(int id);
}
