<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglibs.jsp"%>
<script type="text/javascript">
	$(function() {
		oTable = $("#table")
				.DataTable(
						{
							"processing" : true,
							"serverSide" : true,
							"scrollX": true,
							"scrollCollapse": true,
        					"jQueryUI": true,
							"paging" : true,
							"ordering" : false,
							"searching" : true,
							"lengthMenu" : [ 5, 10, 25, 50, 75, 100 ],
							"paginationType" : "full_numbers",
							"ajax" : {
								"url" : "${ctx}/relativemedicinerecord/relativemedicinerecord-list",
								"type" : "POST",
								"beforeSend" : function() {
									var data = this.data;
									this.data = data.substring(0, data
											.indexOf("&columns"))
											+ data.substring(data
													.indexOf("start") - 1, data
													.indexOf("&search")+7)+ data
													.substring(
															data
																	.indexOf("&search%5Bvalue%5D") + 18,
															data
																	.indexOf("&search%5Bregex%5D"));
								}
							},
							"columns" : [
									{
										"data" : "relativeName",
										"render" : function(data, type, full,
												meta) {
											return data != null ? data : "";
										}
									},
									{
										"data" : "des",
										"render" : function(data, type, full,
												meta) {
											return data != null ? data : "";
										}
									},
									{
										"data" : "doctorName",
										"render" : function(data, type, full,
												meta) {
											return data != null ? data : "";
										}
									},
									{
										"data" : "officeName",
										"render" : function(data, type, full,
												meta) {
											return data != null ? data : "";
										}
									},
									{
										"data" : "during",
										"render" : function(data, type, full,
												meta) {
											return data != null ? data : "";
										}
									},
									{
										"data" : "during",
										"render" : function(data, type, full,
												meta) {
											return full.str_start_date != null ?  full.str_start_date : "";
										}
									},
									{
										"data" : "id",
										"render" : function(data, type, full,
												meta) {

													var	deleteStr = "<button class='btn' type='button' title='删除' onclick='cirRemove(\""
													+ data
													+ "\")'><i class='icon-trash'></i></button>";
											return "<button class='btn' type='button' title='查看' onclick='pageGo(\"${ctx}/relativemedicinerecord/relativeMedicineRecord-view?cirid="
													+ data
													+ "\")'><i class='icon-eye-open'></i></button>"+"<button class='btn' type='button' title='编辑' onclick='pageGo(\"${ctx}/relativemedicinerecord/to-relativemedicinerecord-update?cirid="
													+ data
													+ "\")'><i class='icon-pencil'></i></button>"
													+ deleteStr;
									}
									} ],
							"language" : {
								"emptyTable" : "没有数据",
								"info" : "显示 第 _START_ 到 _END_ 条数据  总共 _TOTAL_ 条数据 ",
								"infoEmpty" : "没有数据",
								"infoFiltered" : "(总共  _MAX_ 条数据)",
								"infoPostFix" : "",
								"thousands" : ",",
								"lengthMenu" : "每页显示条数 _MENU_ ",
								"loadingRecords" : "加载中...",
								"processing" : "处理中...",
								"search" : "搜索:",
								"zeroRecords" : "找不到匹配的数据",
								"paginate" : {
									"first" : "首页",
									"last" : "尾页",
									"next" : "下一页",
									"previous" : "上一页"
								}
							}
						});

	});
	
	
	function cirRemove(id){
		$.ajax({
			type : 'POST',
			url : "${ctx}/relativemedicinerecord/relativemedicinerecord-remove?cirid="+id,
			dateType : "JSON",
			success : function(result) {
				var appResult = eval("(" + result + ")");
				var message = appResult.msg;
				var success = appResult.code;
				if (success == 0) {
					$("#regBox").tips({
						side : 2,
						msg : message,
						bg : '#68B500',
						time : 2
					});
				}else{
					//oTable.ajax.url(url).load();
					oTable.draw(false);
				}
			}
		});
	}
	
	function pageGo(href) {
		$("#index_div").load(href);
	}
</script>
<body>
	<ul class="breadcrumb">
		<li><a href="main.jsp">主页</a> <span class="divider">/</span></li>
		<li class="active">用药记录列表</li>
	</ul>
	<div class="btn-toolbar">
		<button class="btn" onclick="pageGo('${ctx}/relativemedicinerecord/to-relativemedicinerecord-add')" type="button">添加记录
		</button>
	</div>
	<div class="container-fluid">
		<table id="table" class="display" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>相关人员</th>
					<th>症状描述</th>
					<th>医生名称</th>
					<th>科室</th>
					<th>用药时长</th>
					<th>服用时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
	
			</tbody>
			
		</table>
	</div>
</body>
