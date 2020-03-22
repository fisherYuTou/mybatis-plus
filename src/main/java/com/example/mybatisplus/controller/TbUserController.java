package com.example.mybatisplus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.TbUser;
import com.example.mybatisplus.service.ITbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author yuyanwu
 * @since 2020-03-17
 */
@RestController
@RequestMapping("/tb-user")
public class TbUserController {

    @Autowired
    private ITbUserService tbUserService;

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        tbUserService.removeById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody TbUser user){
        tbUserService.save(user);
    }

    @GetMapping("/list")
    public IPage<TbUser> list(){
        IPage page = new Page();
        page.setCurrent(1);
        page.setSize(10);
        return tbUserService.page(page);
    }

}
