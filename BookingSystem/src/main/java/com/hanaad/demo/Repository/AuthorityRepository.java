package com.hanaad.demo.Repository;

import com.hanaad.demo.Model.Authority;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    Authority findByRole(String role);
}