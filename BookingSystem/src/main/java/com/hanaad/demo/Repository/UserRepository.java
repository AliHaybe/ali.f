package com.hanaad.demo.Repository;

import com.hanaad.demo.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByBrukernavn(String brukernavn);

    User findOne(long id);

    Object findAll();

}
