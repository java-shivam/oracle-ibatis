package com.example.service;

import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private SqlMapClientTemplate sqlMapClientTemplate;

    public User getUserById(int id) {
        return (User) sqlMapClientTemplate.queryForObject("UserMapper.getUserById", id);
    }

    public void insertUser(User user) {
        sqlMapClientTemplate.insert("UserMapper.insertUser", user);
    }

    public List<User> getAllUsers() {
        return sqlMapClientTemplate.queryForList("UserMapper.getAllUsers");
    }
}