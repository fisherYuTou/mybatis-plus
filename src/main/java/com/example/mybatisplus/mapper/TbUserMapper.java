package com.example.mybatisplus.mapper;

import com.example.mybatisplus.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author yuyanwu
 * @since 2020-03-17
 */
public interface TbUserMapper extends BaseMapper<TbUser> {

    List<TbUser> selectListByMy1();

}
