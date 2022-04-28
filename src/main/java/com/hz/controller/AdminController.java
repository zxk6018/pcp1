package com.hz.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hz.pojo.Admin;
import com.hz.service.AdminService;
import com.hz.utils.MassageJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    /**
     * 管理员登陆
     * @param uname
     * @param upwd
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    public MassageJson<String> login(String key,String password){
        return adminService.login(key, password);
    }


    @ResponseBody
    @RequestMapping("/selectAdminList")
    public List<Admin> selectAdminList(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("admin_name","z");
        queryWrapper.orderByDesc("admin_id");
       return adminService.list(queryWrapper);
    }


    /**
     * 修改管理员
     * @param admin
     * @return
     */
    @RequestMapping(value = "/updateAdmin",method = RequestMethod.POST)
    @ResponseBody
    public MassageJson updateAdmin(Admin admin){
        Integer i = adminService.updateAdmin(admin);
        return new MassageJson(i);
    }

    /**
     * 新增供应商
     * @param admin
     * @return
     */
    @RequestMapping(value = "/saveAdmin",method = RequestMethod.POST)
    @ResponseBody
    public MassageJson saveProvider(Admin admin){
        Integer i = adminService.saveAdmin(admin);
        return new MassageJson(i);
    }

    /**
     * 分页查询
     * @param page  当前页
     * @param limit 每页显示条数
     * @return
     */
    @RequestMapping(value = "/findAdminList",method = RequestMethod.GET)
    @ResponseBody
    public MassageJson<List<Admin>> findProvideList(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                                    @RequestParam(value = "limit",defaultValue ="10") Integer limit,
                                                    String admin_name){

        List<Admin> list = adminService.findAdminList(page, limit, admin_name);
        Integer count = adminService.AdminCount(admin_name);
        MassageJson<List<Admin>> massageJson = new MassageJson<List<Admin>>();
        massageJson.setCode(0);
        massageJson.setMsg("请求成功");
        massageJson.setData(list);
        massageJson.setCount(count);
        return massageJson;

    }

    @RequestMapping("/findAdminById/{id}")
    public String findAdminById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("pro",adminService.findAdminById(id));
        return  "provider_edit";
    }
}
