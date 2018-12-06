package com.book.dao;

import com.book.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author${罗显}
 * @date 2018/12/6
 * @time 18:02
 */
public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
