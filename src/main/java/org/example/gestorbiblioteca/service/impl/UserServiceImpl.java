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
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public String msj(){
        return "Usuario dice: Jaja, salu2";
    }
}
