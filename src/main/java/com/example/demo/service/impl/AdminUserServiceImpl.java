package com.example.demo.service.impl;

import com.example.demo.entity.AdminUser;
import com.example.demo.mapper.AdminUserMapper;
import com.example.demo.service.IAdminUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author dxl
 * @since 2020-01-15
 */
@Service
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUser> implements IAdminUserService {

}
