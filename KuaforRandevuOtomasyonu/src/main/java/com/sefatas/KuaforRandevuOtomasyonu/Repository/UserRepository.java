package com.sefatas.KuaforRandevuOtomasyonu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
