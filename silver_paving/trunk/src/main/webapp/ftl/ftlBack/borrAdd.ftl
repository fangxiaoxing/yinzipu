<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<title>后台管理系统</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<style type="text/css">
		.more {
			display: none;
		}
		
		.add_info {
			color: red;
		}
	</style>
	<script src="/js/jquery.js"></script>
	<script src="/js/jquery.mCustomScrollbar.concat.min.js" type="text/javascript"></script>
</head>
<body>
	<!--aside nav-->
	<!--aside nav-->
	<section class="rt_wrap content mCustomScrollbar">

		<div class="rt_content">
			<div class="page_title_iframe">
				<h2 class="fl">新增借款人</h2>
			</div>
			<form action="product/insertProduct.do" method="post" enctype="multipart/form-data">
				<ul class="ulColumn2">
					<li><span class="item_name" style="width: 120px;">借款人姓名<span class="add_info">*</span></span> 
						<input type="text" name="borrName" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">身份证号<span class="add_info">*</span></span>
						<input type="text" name="borrIdCard" onblur="change()" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">借款（人）公司<span class="add_info">*</span></span>
						<input type="text" name="borrCompany" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">公司编码<span class="add_info">*</span></span>
						<input type="text" name="borrCompCode" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">车辆编码<span class="add_info">*</span></span> 
						<input type="text" name="carId" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">借款期限编码<span class="add_info">*</span></span>
						<input type="text" name="dateId" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">起始时间<span class="add_info">*</span></span>
						<input type="text" name="borrBegin" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">结束时间<span class="add_info">*</span></span>
						<input type="text" name="borrEnd" class="textbox textbox_295" /></li>
					<li><span class="item_name" style="width: 120px;">车辆照片<span class="add_info">*</span></span>
						<input type="file" name="borrImg1" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg1" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">身份证图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg2" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg2" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">征信报告图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg3" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg3" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">行驶证图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg4" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg4" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">车辆登记证图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg5" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg5" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">车辆登记发票图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg6" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg6" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">车辆交强险图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg7" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg7" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">车辆商业保险图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg8" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg8" onchange="previewImage(this)" />
					</li>
					<li><span class="item_name" style="width: 120px;">车辆评估认证图片<span class="add_info">*</span></span>
						<input type="file" name="borrImg9" onchange="previewImage(this)" /><input type="checkbox" onclick="showNext(this)" value="0" />添加
						<input class="more" type="file" name="borrImg9" onchange="previewImage(this)" />
					</li>	
					<li><span class="item_name" style="width: 120px;"></span> <input type="button" onclick="addProduct()" value="新增借款人" class="link_btn" /></li>
				</ul>
			</form>

			<script type="text/javascript">
				function showNext(item) {
					var value = $(item).val();
					if(value == 0) {
						$(item).next().show();
						$(item).val(1);
					} else if(value == 1) {
						$(item).next().hide();
						$(item).next().val("");
						$(item).val(0);
					}
				}

				function addProduct() {
					var array = $(".textbox");
					console.log($(array[0]).prev());
					$("form").submit();
				}
					}
				}
			</script>
            <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
            <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
            <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
            <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
