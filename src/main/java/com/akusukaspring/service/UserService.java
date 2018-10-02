package com.akusukaspring.service;

import com.akusukaspring.model.Kost;
import com.akusukaspring.model.User;
import com.akusukaspring.repository.KostRepository;
import com.akusukaspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vincentius Dito on 06/06/2017.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private KostRepository kostRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getPemilikKost(Long idKost) {
        Kost kost = kostRepository.findOne(idKost);
        return userRepository.findByPemilikKost(kost);
    }

    public User createUser()
}
