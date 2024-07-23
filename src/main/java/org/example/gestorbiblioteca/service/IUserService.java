package org.example.gestorbiblioteca.service;

import org.example.gestorbiblioteca.entity.User;

import java.util.List;

public interface IUserService {

    User getUser(long id);
    List<User> getAllUsers();
    User saveUser(User user);
    User updateUser(User user);
    void deleteUserById(Long id);
    void deleteUser(User user);

    String msj();
}
