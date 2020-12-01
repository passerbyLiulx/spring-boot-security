package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.RolePermission;
import com.example.demo.mapper.RolePermissionMapper;
import com.example.demo.service.RolePermissionService;
import org.springframework.stereotype.Service;

/**
 * 角色权限 服务实现类
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {

}
