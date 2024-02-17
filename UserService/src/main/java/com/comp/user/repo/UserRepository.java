package com.comp.user.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comp.user.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

    List<User> findByUserId(String userId);

}
