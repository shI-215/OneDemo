package com.example.onedemo.mapper;

import com.example.onedemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);
}
