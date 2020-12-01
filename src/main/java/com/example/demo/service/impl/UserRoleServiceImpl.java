package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserRole;
import com.example.demo.mapper.UserRoleMapper;
import com.example.demo.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色 服务实现类
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
