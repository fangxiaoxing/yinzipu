<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css">
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script src="js/jquery.js"></script>
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
<script>

	(function($){
		$(window).load(function(){
			
			$("a[rel='load-content']").click(function(e){
				e.preventDefault();
				var url=$(this).attr("href");
				$.get(url,function(data){
					$(".content .mCSB_container").append(data); //load new content inside .mCSB_container
					//scroll-to appended content 
					$(".content").mCustomScrollbar("scrollTo","h2:last");
				});
			});
			
			$(".content").delegate("a[href='top']","click",function(e){
				e.preventDefault();
				$(".content").mCustomScrollbar("scrollTo",$(this).attr("href"));
			});
			
		});
	})(jQuery);
</script>
</head>
<body>
<!--header-->
<header>
 <h1><img src="images/admin_logo.png"/></h1>
 <ul class="rt_nav">
  <li><a href="http://www.mycodes.net" target="_blank" class="website_icon">站点首页</a></li>
  <li><a href="#" class="clear_icon">清除缓存</a></li>
  <li><a href="#" class="admin_icon">DeathGhost</a></li>
  <li><a href="#" class="set_icon">账号设置</a></li>
  <li><a href="login.html" class="quit_icon">安全退出</a></li>
 </ul>
</header>
<!--aside nav-->
<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="index.html">起始页</a></h2>
 <ul>
  <li>
   <dl>
    <dt>产品相关信息</dt>
    <!--当前链接则添加class:active-->
    <dd><a href="productionList.ftl">理财产品列表</a></dd>
    <dd><a href="carList.ftl">车辆信息列表</a></dd>
    <dd><a href="borrList.ftl">贷款人信息</a></dd>
    <dd><a href="dateList.ftl">贷款期限信息</a></dd>
    <dd><a href="riskList.ftl">贷款风控信息</a></dd>
    <dd><a href="interestList.ftl" class="active">贷款利率信息</a></dd>
    <dd><a href="refundList.ftl">贷款还款方式信息</a></dd>
    <dd><a href="prodintrList.ftl">理财产品简介信息</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>订单信息</dt>
    <dd><a href="order_list.html">订单列表示例</a></dd>
    <dd><a href="order_detail.html">订单详情示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>会员管理</dt>
    <dd><a href="user_list.html">会员列表示例</a></dd>
    <dd><a href="user_detail.html">添加会员（详情）示例</a></dd>
    <dd><a href="user_rank.html">会员等级示例</a></dd>
    <dd><a href="adjust_funding.html">会员资金管理示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>基础设置</dt>
    <dd><a href="setting.html">站点基础设置示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>配送与支付设置</dt>
    <dd><a href="express_list.html">配送方式</a></dd>
    <dd><a href="pay_list.html">支付方式</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>在线统计</dt>
    <dd><a href="discharge_statistic.html">流量统计</a></dd>
    <dd><a href="sales_volume.html">销售额统计</a></dd>
   </dl>
  </li>
  <li>
   <p class="btm_infor">© DeathGhost.cn 版权所有</p>
  </li>
 </ul>
</aside>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
    <div class="page_title">
        <h2 class="fl">商品列表示例</h2>
       	<a href="product_detail.html" class="fr top_rt_btn add_icon">添加商品</a>
    </div>
    <section class="mtb">
       	<select class="select">
        	<option>下拉菜单</option>
        	<option>菜单1</option>
       	</select>
       	<input type="text" class="textbox textbox_225" placeholder="输入产品关键词或产品货号..."/>
       	<input type="button" value="查询" class="group_btn"/>
    </section>
    <table class="table">
       	<tr>
        	<th>利率编号</th>
	        <th>对公利率</th>
	        <th>对私利率</th>
	        <th>对应产品</th>
	        <th>对应车辆照片</th>
	        <th>对应借款人</th>
	        <th>执行操作</th>
       	</tr>
       	<c:forEach items="${pageInfo.list}" var="emp">  
            <tr>  
            	<td>${emp.empId}</td>  
                <th>${emp.empName}</th>  
                <th>${emp.gender=="M"?"男":"女" }</th>  
                <th>${emp.email}</th>  
                <th>${emp.department.deptName}</th>  
                <th>  
                    <button class="btn btn-primary">  
                    	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>  编辑  
                    </button> 
                    <button class="btn btn-danger">  
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>  删除  
                    </button>  
				</th>  
            </tr>  
        </c:forEach>
      </table>
      <aside class="paging">
	<span style="white-space:pre;">     
	</span>
	<!--分页-->
		<div class="col-md-12 column">
			<ul class="pagination pull-right">
				<#if currentPage lte 1>
					<li class="disabled">
						<a href="#">上一页</a>
					</li>
					<#else>
						<li>
							<a href="/sell/seller/order/list?page=${currentPage - 1}&size=${size}">上一页</a>
						</li>
				</#if>
				<!--第一页-->
					<#if (productInfoPage.getTotalPages()> 0)>
						<li <#if currentPage==1>class="disabled"</#if>>
					<a href="/sell/seller/order/list?page=1&size=${size}">1</a>
					</li>
					</#if>

					<!--如果不只有一页-->
						<#if (productInfoPage.getTotalPages()> 1)>
							<!--如果当前页往前查3页不是第2页-->
								<#if ((currentPage - 3)> 2)>
									<li><span class="text">…</span></li>
								</#if>

								<!--当前页的前3页和后3页-->
									<#list (currentPage - 3)..(currentPage + 3) as index>
										<#--如果位于第一页和最后一页之间-->
											<#if (index> 1) && (index
												< productInfoPage.getTotalPages())>
													<li <#if currentPage==i ndex>class="disabled"</#if>>
											<a href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a>
											</li>
						</#if>
						</#list>

						<!--如果当前页往后查3页不是倒数第2页-->
							<#if (currentPage + 3) < (productInfoPage.getTotalPages() - 1)>
								<li><span class="text">…</span></li>
							</#if>

							<!--最后页-->
								<li <#if currentPage==p roductInfoPage.getTotalPages()>class="disabled"</#if>>
									<a href="/sell/seller/order/list?page=${productInfoPage.getTotalPages()}&size=${size}">${productInfoPage.getTotalPages()}</a>
								</li>
								</#if>

								<#if currentPage gte productInfoPage.getTotalPages()>
									<li class="disabled">
										<a href="#">下一页</a>
									</li>
									<#else>
										<li>
											<a href="/sell/seller/order/list?page=${currentPage + 1}&size=${size}">下一页</a>
										</li>
								</#if>
			</ul>
		</div>
</aside>
 </div>
</section>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
