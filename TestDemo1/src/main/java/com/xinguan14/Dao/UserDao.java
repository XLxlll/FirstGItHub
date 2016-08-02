package com.xinguan14.Dao;

import com.xinguan14.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by XL on 2016/7/31.
 */
@Transactional
public interface UserDao extends CrudRepository<User,Integer> {
public User findByEmail(String email);
}
