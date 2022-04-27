package com.hz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hz.dao.AdminDao;
import com.hz.pojo.Admin;
import com.hz.service.AdminService;
import com.hz.utils.MassageJson;
import com.hz.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AdminServiceImpl extends ServiceImpl<BaseMapper<Admin>,Admin> implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Autowired
    private RedisUtil redisUtil;

    /**
     * 管理员登陆
     * @param uname
     * @param upwd
     * @return
     */
    @Override
    public MassageJson<String> login(String uname, String upwd) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("admin_id",uname);
        queryWrapper.eq("admin_password",upwd);
        Admin admin = adminDao.selectOne(queryWrapper);
        if (admin!=null){
            String token = UUID.randomUUID().toString().replace("-","");
            redisUtil.setStrJson("login:"+token,admin,null);
            return new MassageJson<String>(200,"登陆成功",token);
        }else {
            return new MassageJson<String>(250,"登陆失败",null);
        }

    }

    @Override
    public Integer deleteAdminById(Integer id) {
        return adminDao.deleteAdminById(id);
    }

    @Override
    public Integer updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    @Override
    public Integer saveAdmin(Admin admin) {
        return adminDao.saveAdmin(admin);
    }

    @Override
    public List<Admin> findAdminList(Integer pageNo, Integer pageSize, String admin_name) {
        Integer pyl = (pageNo-1)*pageSize;
        return adminDao.findAdminList(pyl,pageSize,admin_name);
    }

    @Override
    public Integer AdminCount(String admin_name) {
        return adminDao.AdminCount(admin_name);
    }

    @Override
    public Admin findAdminById(Integer id) {
        return adminDao.findAdminById(id);
    }


}
