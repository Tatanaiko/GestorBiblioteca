package org.example.gestorbiblioteca.service.impl;

import org.example.gestorbiblioteca.entity.User;
import org.example.gestorbiblioteca.repository.IUserRepository;
import org.example.gestorbiblioteca.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;


    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public void deleteUser(User user) {

    }

    public String msj(){
        return "Usuario dice: Jaja, salu2";
    }
}
