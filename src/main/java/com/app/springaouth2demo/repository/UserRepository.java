package com.app.springaouth2demo.repository;

import com.app.springaouth2demo.entities.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll(Sort sort);

    User findByUsername(String username);

    @Query(value = "select * from user u where u.dep_id=?1", nativeQuery = true)
    List<User> findUsersByDepartment(Integer dep_id);

    User findOne(Long userId);
}
