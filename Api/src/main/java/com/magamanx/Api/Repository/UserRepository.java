package com.magamanx.Api.Repository;

import com.magamanx.Api.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
