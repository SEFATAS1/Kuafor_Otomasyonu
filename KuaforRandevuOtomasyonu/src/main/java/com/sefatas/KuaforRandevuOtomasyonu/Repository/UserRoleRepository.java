package com.sefatas.KuaforRandevuOtomasyonu.Repository;

import com.sefatas.KuaforRandevuOtomasyonu.Entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    @Override
    Optional<UserRole> findById(Long aLong);
}
