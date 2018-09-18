package com.vpquoi.demo.springsecurity.repository;

import com.vpquoi.demo.springsecurity.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User getUserByUsername(String username);
}
