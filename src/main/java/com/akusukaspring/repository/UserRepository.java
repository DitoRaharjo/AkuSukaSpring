package com.akusukaspring.repository;

import com.akusukaspring.model.Kost;
import com.akusukaspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vincentius Dito on 06/06/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByPemilikKost(Kost kost);
}
