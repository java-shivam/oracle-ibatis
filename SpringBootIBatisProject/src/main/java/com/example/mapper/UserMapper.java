package com.example.mapper;

import com.example.model.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> fetchAllUsers();
    int insertUser(User user);
    Map<String, Object> callStoredProcedure(Map<String, Object> params);
}