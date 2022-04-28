var getMockData = function(name) {
	name = name || "";
	var dataList = [
		{
			"id": 101,
			"name": "虚拟物品",
			"icon": "http://oss.dev33.cn/sa-admin/pic_yhk1.png",
			"sort": 3,
			"create_time": "2020-08-04 00:19:35"
		}
	];
	var mockData = {
		"code": 200,
		"msg": "ok",
		"data": [],
		"dataCount": 100
	}
	// 根据名称筛选 
	for (var i = 0; i < dataList.length; i++) {
		if(dataList[i].name.indexOf(name) > -1) {
			mockData.data.push(dataList[i]);
		}
	}
	// 返回 
	return mockData;
}
