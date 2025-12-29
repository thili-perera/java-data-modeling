package com.datamodeling.modeling.service;

import com.datamodeling.modeling.model.User;

import java.util.List;

public interface IUser {
    User create(User user);
    User getById(Long id);
    List<User> getAll();
    User update(Long id, User user);
    boolean delete(Long id);
}
