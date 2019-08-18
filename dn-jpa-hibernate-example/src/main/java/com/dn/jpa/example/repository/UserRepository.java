package com.dn.jpa.example.repository;

import com.dn.jpa.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Muthukumar Thangavinayagam.
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
