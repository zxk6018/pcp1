// 模拟数据
var mockData = {
	code: 200,
	msg: 'ok',
	data: [{
		"admin_id": 1,//管理员ID
		"admin_name": "普通用户",//管理员账号
		"admin_password": "123456",//管理员密码
		"admin_phone": 12345674567,//管理员电话
		"admin_role_autho_id": 001,//创建人ID
		"admin_role_time": "2018-08-17T02:33:14.000+0000",//创建时间
		"admin_autho_id": 001,//权限ID
		"admin_autho_name": "总权限",//权限名
		"admin_userTime": "2018-08-17T02:33:14.000+0000",//日志操作时间（开始）
		"admin_endTime": "2018-08-17T02:33:14.000+0000"//日志操作时间（结束）
	},
	{
		"admin_id": 11,
		"role_name": "顶级管理员",
		"role_info": "最高权限",
		"is_lock": 1,
		"create_time": "2018-08-17T02:33:14.000+0000"
	}, {
		"id": 101,
		"role_name": "超级管理员",
		"role_info": "最高权限",
		"is_lock": 2,
		"create_time": "2018-08-17T03:24:01.000+0000"
	}]
}