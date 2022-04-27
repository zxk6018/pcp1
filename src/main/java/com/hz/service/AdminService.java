package com.hz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hz.pojo.Admin;
import com.hz.utils.MassageJson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminService extends IService<Admin> {

    /**
     * 管理员登陆
     */

    MassageJson<String> login(
            @Param("uname") String uname,
            @Param("upwd") String upwd
    );

    /**
     * 删除管理员
     * @param id
     * @return
     */
    Integer deleteAdminById(Integer id);
    /**
     * 修改管理员
     * @param admin
     * @return
     */

    Integer updateAdmin(Admin admin);
    /**
     * 新增管理员
     * @param admin
     * @return
     */
    Integer saveAdmin(Admin admin);

    /**
     * 查询管理员
     * @param pyl 偏移量
     * @param pageSize 每页显示数量
     * @return
     */

    List<Admin> findAdminList(@Param("pyl") Integer pyl,
                              @Param("pageSize") Integer pageSize,
                              @Param("admin_name") String admin_name
    );

    /**
     * 总记录数
     * @return
     */
    Integer AdminCount(String admin_name);

    /**
     * 根据ID  获得管理员对象
     * @param id
     * @return
     */
    Admin findAdminById(Integer id);

}
