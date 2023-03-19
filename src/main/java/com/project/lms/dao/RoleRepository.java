package com.project.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.lms.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRoleName(String roleName);
}
