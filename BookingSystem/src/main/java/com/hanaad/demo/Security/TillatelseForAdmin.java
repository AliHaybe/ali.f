package com.hanaad.demo.Security;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@PreAuthorize(TillatelseForAdmin.condition)
public @interface TillatelseForAdmin {
    String condition = "hasRole('ROLE_ADMIN')";


}
