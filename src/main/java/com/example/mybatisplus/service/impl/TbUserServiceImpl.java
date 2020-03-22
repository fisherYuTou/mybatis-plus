package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.entity.TbUser;
import com.example.mybatisplus.mapper.TbUserMapper;
import com.example.mybatisplus.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yuyanwu
 * @since 2020-03-17
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
