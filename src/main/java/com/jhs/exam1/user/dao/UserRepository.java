package com.jhs.exam1.user.dao;

import com.jhs.exam1.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
