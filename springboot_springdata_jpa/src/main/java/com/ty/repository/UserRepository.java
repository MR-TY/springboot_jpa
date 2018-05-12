package com.ty.repository;

import com.ty.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/5/12.
 * 继承JpaRepository操作实体类
 */
public interface UserRepository extends JpaRepository<User,Integer>{
}
