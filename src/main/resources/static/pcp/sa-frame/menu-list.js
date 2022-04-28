// 一个菜单可以包括的所有属性 
// {
// 	id: '12345',		// 菜单id, 必须唯一
// 	name: '用户中心',		// 菜单名称, 同时也是tab选项卡上显示的名称
// 	icon: 'el-icon-user',	// 菜单图标, 参考地址:  https://element.eleme.cn/#/zh-CN/component/icon
//	info: '管理所有用户',	// 菜单介绍, 在菜单预览和分配权限时会有显示 
// 	url: 'sa-view/user/user-list.html',	// 菜单指向地址
// 	parentId: 1,			// 所属父菜单id, 如果指定了一个值, sa-admin在初始化时会将此菜单转移到指定菜单上 
// 	isShow: true,			// 是否显示, 默认true
// 	isBlank: false,		// 是否属于外部链接, 如果为true, 则点击菜单时从新窗口打开 
// 	childList: [			// 指定这个菜单所有的子菜单, 子菜单可以继续指定子菜单, 至多支持四级菜单
// 		// .... 
// 	],
//	click: function(){}		// 点击菜单执行一个函数 
// }

// 定义菜单列表 
var menuList =	[
	// {
	// 	id: '2',
	// 	name: '各种示例',
	// 	icon: 'el-icon-document-remove',
	// 	info: '增删改查各种常用组件示例',
	// 	childList: [
	// 		{id: '2-1', name: '商城商品参数', url: 'sa-view/case/query-p-case.html'},
			
	// 		{id: '2-3', name: '表单提交示例', url: 'sa-view/case/submit-form.html'},
	// 		// {id: '2-11', name: '在线表单构建', url: 'https://mrhj.gitee.io/form-generator/#/'},
	// 	]
	// },
	{
		id: '3',
		name: '首页设置',
		icon: 'el-icon-search',
		info: '首页的一些设置',
		childList: [
			{id: '2-1', name: '商城商品参数', url: 'sa-view/case/query-p-case.html'},
			{id: '3-1-1', name: '分类列表', icon: 'el-icon-eleme', url: 'sa-view/sys-type/sys-type-list.html'},
			{id: '3-1-2', name: '分类添加', icon: 'el-icon-plus', url: 'sa-view/sys-type/sys-type-add.html'},
			// {id: '3-2-1', name: '轮播图列表', icon: 'el-icon-collection-tag', url: 'sa-view/home/swiper-list.html'},
			// {id: '3-2-2', name: '轮播图添加', icon: 'el-icon-plus', url: 'sa-view/home/swiper-add.html'},
			{id: '3-3-1', name: '商品规格示例', icon: 'el-icon-plus', url: 'sa-view/ser-goods/ser-goods-add.html'},
		]
	},
	{
		id: '4',
		name: '权限控制',
		icon: 'el-icon-unlock',
		info: '对系统角色权限的分配等设计，敏感度较高，请谨慎授权',
		childList: [
			{id: '4-1', name: '角色列表', icon: 'el-icon-key', url: 'sa-view/role/role-list.html'},
			{id: '4-2', name: '菜单列表', icon: 'el-icon-magic-stick', url: 'sa-view/role/menu-list.html'}
		]
	},
	{
		id: '5',
		name: '用户管理',
		icon: 'el-icon-user',
		info: '对用户列表、添加、统计等等...',
		childList: [
			{id: '5-1', name: '用户列表', icon: 'el-icon-document-remove', url: 'sa-view/user/user-list.html'},
			{id: '5-2', name: '用户添加', icon: 'el-icon-plus', url: 'sa-view/user/user-add.html'},
			// {
			// 	id: '5-3',
			// 	name: '用户统计',
			// 	icon: 'el-icon-data-line',
			// 	childList: [
			// 		{id: '1-3-1', name: '注册量统计', icon: 'el-icon-pie-chart', url: 'sa-view/user/user-chart.html'},
			// 	]
			// },
		]
	},
	{
		id: '6',
		name: '文章管理',
		icon: 'el-icon-document-copy',
		info: '对文章的增删改查、维护',
		childList: [
			{id: '6-1', name: '文章列表', url: 'sa-view/article/art-list.html'},
			{id: '6-2', name: '文章发布', url: 'sa-view/article/art-add.html'},
		]
	},
	{
		id: '7',
		name: '系统设置',
		icon: 'el-icon-setting',
		info: '有关系统的一些设置',
		childList: [
			{id: '7-1', name: '登录页', url: 'login.html'},
			{id: '7-8', name: '403无权限', url: 'sa-view/error-page/403.html'},
			{id: '7-9', name: '404未找到', url: 'sa-view/error-page/404.html'},
			{id: '7-10', name: '500有错误', url: 'sa-view/error-page/500.html'},
			{id: '7-11', name: '服务器设置', url: 'sa-view/cfg/system-cfg.html', info: '对服务器参数的设置'},
			// {id: '7-12', name: '函数菜单', click: function(){sa.alert('点击菜单执行一个函数，你可以自定义任意代码')}},
			// {id: '6-3', name: 'vue组件', url: 'sa-view/cfg/xxx.vue'}
		]
	}
]