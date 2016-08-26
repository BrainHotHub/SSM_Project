<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<%@include file="/WEB-INF/views/include/easyui_core.jsp"%>
<script type="text/javascript">
	//请求地址
	var url;
	//提示信息
	var mesTitle;

	//添加用户信息
	function addUser() {
		$('#dlg').dialog('open').dialog('setTitle', '新增用户');
		$('#fm').form('clear');
		url = path + "/user/addUser";
		 mesTitle = '新增用户成功'; 
	}
	
	//编辑用户信息
	function editUser(){
		var row=$('#datagrid').datagrid('getSelected');
		if(row){
			var id=row.id;
			$('#dlg').dialog('open').dialog('setTitle','编辑用户');
			$('#fm').form('load',row);//这句话有问题，第一次加载时正确的，第二次就出错了，还保持第一次的数据
			url=path+"/user/editUser?id"+id;
		    mesTitle="编辑用户成功";
		}else{
			$.messager.alert('提示','请选择要编辑的记录', 'error');
		}
	}
	//删除用户信息
	function deleteUser(){
		var row=$('datagrid').datagrid('getSelected');
		if(row){
			var id=row.id;
			$('#dlg_delete').dialog('open').dialog('setTitle','删除用户');
		 	$('#fm').form('load',row);//这句话有问题，第一次加载时正确的，第二次就出错了，还保持第一次的数据
			url=path+'/user/deleteUser?id'+id;
		 	mesTitle='删除用户成功';
		}else{
			$.messager.alert('提示', '请选择要删除的记录', 'error');
		}
	}
	//保存添加、修改内容
	function saveUser(){
		var formData = $('#fm').serialize(); //取表单值 并进行序列化；此时formData已经是乱码了
		alert(formData[regtime]);
	 	$('#fm').form('submit',{
		 	url: url,
		 	data:formData,
		 	onSubmit: function(){
		 		//return $(this).form('validate');
		 	},
			success: function(result){
				/* console.info(result); */
				var result = eval('('+result+')');
				if (result.success){
				 	$('#dlg').dialog('close'); 
				 	$('#datagrid').datagrid('reload'); 
				} else {
					 mesTitle = '新增用户失败';
				}
				$.messager.show({ 
					 title: mesTitle,
					 msg: result.msg
				});
			}
	 	});
	}
	Date.prototype.format = function (format) {  
	    var o = {  
	        "M+": this.getMonth() + 1, // month  
	        "d+": this.getDate(), // day  
	        "h+": this.getHours(), // hour  
	        "m+": this.getMinutes(), // minute  
	        "s+": this.getSeconds(), // second  
	        "q+": Math.floor((this.getMonth() + 3) / 3), // quarter  
	        "S": this.getMilliseconds()  
	        // millisecond  
	    }  
	    if (/(y+)/.test(format))  
	        format = format.replace(RegExp.$1, (this.getFullYear() + "")  
	            .substr(4 - RegExp.$1.length));  
	    for (var k in o)  
	        if (new RegExp("(" + k + ")").test(format))  
	            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));  
	    return format;  
	}  
	function formatDatebox(value) {  
	    if (value == null || value == '') {  
	        return '';  
	    }  
	    var dt;  
	    if (value instanceof Date) {  
	        dt = value;  
	    } else {  
	        dt = new Date(value);  
	    }  
	  
	    return dt.format("yyyy-MM-dd"); //扩展的Date的format方法(上述插件实现)  
	}  
</script>
</head>
<body class="easyui-layout" fit="true">
	<div region="center" border="false" style="overflow: hidden;">
		<!-- 用户信息列表 title="用户管理" -->
		<table id="datagrid" class="easyui-datagrid" fit="true"
			url="${path}/user/datagrid" toolbar="#toolbar" pagination="true"
			fitColumns="true" singleSelect="true" rownumbers="true"
			striped="true" border="false" nowrap="false">
			<thead>
				<tr>
					<th field="username" width="100">用户名</th>
					<th field="password" width="100">密码</th>
					<th field="gender" width="100">性别</th>
					<th field="idcard" width="100">身份证号码</th>
					<th field="email" width="100">邮箱</th>
					<th field="qq" width="100">QQ</th>
					<th field="weixin" width="100">微信</th>
					<th field="regtime" width="100" formatter="formatDatebox">入职时间</th>
				</tr>
			</thead>
		</table>
		<!--按钮 -->
		<div id="toolbar">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-reload" plain="true" onclick="reload()">刷新</a> <a
				href="javascript:void(0)" class="easyui-linkbuton"
				iocnCls="icon-add" plain="true" onclick="addUser()">新增</a> <a
				href="javascript:void(0);" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="editUser();">编辑</a> <a
				href="javascript:void(0);" class="easyui-linkbutton"
				iconCls="icon-remove" plain="true" onclick="deleteUser();">删除</a> <span>用户名：</span><input
				name="search_username" id="search_username" value="" size=10 /> <a
				href="javascript:FindData()" class="easyui-linkbutton"
				data-options="iconCls:'icon-search'">查询</a> <a
				href="javascript:void(0);" class="easyui-linkbutton"
				iconCls="icon-jright" plain="true" onclick="searchUser();">更多查询</a>
		</div>

		<!-- 添加/修改对话框 -->
		<div id="dlg" class="easyui-dialog"
			style="width: 400px; height: 400px; padding: 30px 20px" closed="true"
			buttons="#dlg-buttons">
			<form id="fm" method="post" novalidate >
			  <div class="fitem">
			  	<label>用户名：</<label><input name="username" class="easyui-textbox" required="true"/>
			  </div>
			   <div class="fitem">
			  	<label>密码：</<label><input name="password" class="easyui-textbox" required="true"/>
			  </div>
			   <div class="fitem">
			  	<label>身份证：</<label><input name="idcard" class="easyui-textbox" required="true"/>
			  </div>
			  <div class="fitem">
			     <label>性别：</label>
			     <input type="radio" name="gender" value="男" style="width:50px">男</input>
			     <input type="radio" name="gender" value="女" style="width:50px">女</input>
			  </div>
			  
				<div class="fitem">
					<label>入职时间:</label> <input name="regtime" type="text" class="easyui-datebox" required="required"/>
				</div>
				<div class="fitem">
					<label>Email:</label> <input name="email" class="easyui-textbox" validType="email">
				</div>
				<div class="fitem">
					<label>QQ:</label> <input name="qq" class="easyui-textbox" >
				</div>
				<div class="fitem">
					<label>微信:</label> <input name="weixin" class="easyui-textbox" >
				</div>
			</form>
		</div>
	</div>
	
		<!-- 添加/修改对话框按钮 -->
		<div id="dlg-buttons">
			<a href="javascript:void(0)" class="easyui-linkbutton c6"
				iconCls="icon-ok" onclick="saveUser()" style="width:90px">保存</a> 
				<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')"
				style="width:90px">取消</a>
		</div>

</body>
</html>