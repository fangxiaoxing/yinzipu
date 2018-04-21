<!DOCTYPE html>
<html lang="zh-cn" id="top">
<head>
<#assign basePath=request.contextPath/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<#assign basePath=request.contextPath/>
    <title>稳盈理财 －专业网贷投资理财产品_互联网金融平台</title>
    <meta name="keywords" content="           银子铺,网贷,p2p网贷,p2p理财,投资理财,理财产品,互联网金融">
    <meta name="description" content="银子铺领先的P2P网贷理财,互联网金融平台。为投资理财用户提供安全高收益的P2P理财产品，借款人可通过平台申请贷款,获得融资解决短期资金需求。">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="shortcut icon" href="http://www.yinzipu.com/content/RoyalBlue/images/favicon.ico" type="image/icon">
    <link href="/crowfund_files/__init__.css" rel="stylesheet">
    <script src="/crowfund_files/jquery.min.js"></script>
    <link href="/crowfund_files/investList.css" rel="stylesheet">
</head>
<body>
<div class="topnav">
    <div class="row">
        <div class="topnav-l">
            <i class="icon"></i>
            服务热线
            <span>400-816-8089</span>
        </div>
        <div class="topnav-r">
            <div class="topnav-login">
                <a class="btn topnav-btn_login link" href="/login">登录</a><a class="btn topnav-btn_reg link" href="/regester">注册</a>
            </div>
            <a href="app.html" class="icon-item topnav-l-weixin">
                <i class="icon"> </i>手机版
            </a>
            <a class="topnav-r_help link" href="help.html">帮助中心</a>
        </div>
    </div>
</div>
<div class="row head">
    <div class="logo">
        <h1 class="hide">银子铺</h1>
        <a href="index.html">
            <img src="/crowfund_files/slogo.jpg" alt="银子铺,做最具投资价值的金融理财平台">
        </a>
    </div>
    <div class="nav">
        <a href="index.html" class="nav-item">首页</a>
        <div class="hover-show-box">
            <a href="crowfund.html" class="tt">
                我要理财
                <i class="icon icon-arr"></i>
            </a>
            <div class="hide">
                <a href="crowfund">稳盈理财</a>
                <a href="transfer">债权转让</a>
        </div>
        <a href="security.html" class="nav-item">安全保障</a>
        <a href="member.html" class="nav-item">我的铺子</a>
        <div class="hover-show-box">
            <a href="about.html" class="tt">
                关于银子铺
                <i class="icon icon-arr"></i>
            </a>
            <div class="hide">
                <a href="news.html">最新动态</a>
            </div>
        </div>
    </div>
</div>
<!-- //区分模块 -->
<div class="sub-top-nav">
    <div class="row">
        <ul class="subtitle">
            <li><a href="/crowfund" class="active">稳盈理财</a></li>
            <li><a href="/transfer">债权转让</a></li>
        </ul>
    </div>
</div>

<!-- 主体部分 -->
<div class="list-page mb " id="list-page">
    <div class="row">
        <div class="sort clearfix">
            <div class="fr">

                <a href="javascript:" class="select-box" id="all-dis" onclick="showBorrow()" data-checked="">
                    <i class="icon"></i>
                    只显示可投项目
                </a>
            </div>
        </div>
        <div class="product-mod clearfix" id="financing-mod">

            <#list more15List as more15>
            <#--<#if   more15.prodtype.interest.inteUser gte 15 && more15.prodFroozenNum != 0>-->
            <div class="product-item ">
                <div class="mod">
                    <a href="/production/productionInfo?prodName=${more15.prodName}&prodId=${}&investorId=${}" class="product-link">
                                <span class="i-mark">
                                    <i class="i-mark-bg" style="border-color:#FF4F37 #FF4F37 transparent transparent;"></i>
                                    <em class="i-mark-text" style="color: #ffffff">新手</em>
                                </span>
                        <h3 class="product-item-tt">${more15.prodName}</h3>
                        <div class="stable-mod-tag">
                            <span class="tag-item u_ec01"></span>
                        </div>
                        <h4 class="product-item-big-tt s-fc">
                            ${more15.prodtype.interest.inteUser}.00%
                        </h4>
                        <span class="product-item-aux">预期年化收益率</span>
                        <ul class="product-block">
                            <li class="product-block-item">
                                <span class="tt">理财期限</span>
                                ${more15.prodtype.date.dateLength}
                                <span class="aux">月</span>
                            </li>
                            <li class="product-block-item">
                                    <span class="progress">
                                        <em class="bar s-c" style="width: ${more15.varge}%"></em>
                                    </span>
                            </li>
                            <li class="product-block-item f14">
                                <span class="tt">可投金额：${more15.prodFroozenNum} 元</span>
                                    <span class="aux">${more15.varge}%</span>

                            </li>
                        </ul>
                        <div class="btn-center">
                            <span class="inherit-color btn-invest s-c">立即投资</span>
                        </div>
                    </a>
                </div>
            </div>
            </#list>


        <#--<#if info.prodFroozenNum != 0 && info.prodtype.interest.inteUser lt 15>-->
        <#--<div class="product-item ">-->
        <#--<div class="mod">-->
        <#--<a href="product.html" class="product-link">-->
        <#--<h3 class="product-item-tt">${info.prodName}</h3>-->
        <#--<div class="stable-mod-tag">-->
        <#--<span class="tag-item u_ec01"></span>-->
        <#--</div>-->
        <#--<h4 class="product-item-big-tt s-fc">-->
        <#--${info.prodtype.interest.inteUser}.00%-->
        <#--</h4>-->
        <#--<span class="product-item-aux">预期年化收益率</span>-->
        <#--<ul class="product-block">-->
        <#--<li class="product-block-item">-->
        <#--<span class="tt">理财期限</span>-->
        <#--<span class="aux">-->
        <#--${info.prodtype.date.dateLength}月</span>-->
        <#--</li>-->
        <#--<li class="product-block-item">-->
        <#--<span class="progress">-->
        <#--<em class="bar s-c" style="width: ${info.varge}%"></em>-->
        <#--</span>-->
        <#--</li>-->
        <#--<li class="product-block-item f14">-->
        <#--<span class="tt">可投金额：${info.prodFroozenNum} 元</span>-->
        <#--<span class="aux">${info.varge}%</span>-->
        <#--</li>-->
        <#--</ul>-->
        <#--<div class="btn-center">-->
        <#--<span class="inherit-color btn-invest s-c">立即投资</span>-->
        <#--</div>-->
        <#--</a>-->
        <#--</div>-->
        <#--</div>-->
        <#--</#if>-->
        <#--<#if info.prodFroozenNum ==0>-->
        <#--<div class="product-item fn-is-over">-->
        <#--<div class="mod">-->
        <#--<a href="product.html" class="product-link">-->
        <#--<span class="i-mark">-->
        <#--<i class="i-mark-bg"-->
        <#--style="border-color:#e5e5e5 #e5e5e5 transparent transparent;"></i>-->
        <#--<em class="i-mark-text" style="color: #ffffff">满标</em>-->
        <#--</span>-->
        <#--<h3 class="product-item-tt">${info.prodName}</h3>-->
        <#--<div class="stable-mod-tag">-->
        <#--<span class="tag-item u_ec01"></span>-->
        <#--</div>-->
        <#--<h4 class="product-item-big-tt s-fc">-->
        <#--${info.prodtype.interest.inteUser}.00%-->
        <#--</h4>-->
        <#--<span class="product-item-aux">预期年化收益率</span>-->
        <#--<ul class="product-block">-->
        <#--<li class="product-block-item">-->
        <#--<span class="tt">理财期限</span>-->
        <#--<span class="aux">${info.prodtype.date.dateLength}月</span>-->
        <#--</li>-->
        <#--<li class="product-block-item">-->
        <#--<span class="progress">-->
        <#--<em class="bar s-c" style="width: 100%"></em>-->
        <#--</span>-->
        <#--</li>-->
        <#--<li class="product-block-item f14"">-->
        <#--<span class="tt">可投金额：0 元</span>-->
        <#--<span class="aux">100%</span>-->
        <#--</li>-->
        <#--</ul>-->
        <#--<div class="btn-center">-->
        <#--<span class="inherit-color btn-invest s-c">${info.prodCondition}</span>-->
        <#--</div>-->
        <#--</a>-->
        <#--</div>-->
        <#--</div>-->
        <#--</#if>-->

            <#list notFullList as notFull>
            <#--<#list pageInfo.list as notFull>-->
            <#--<#if notFull.prodFroozenNum != 0 && notFull.prodtype.interest.inteUser lt 15>-->
            <div class="product-item ">
                <div class="mod">
                    <a href="/production/productionInfo?prodName=${notFull.prodName}"" class="product-link">
                        <h3 class="product-item-tt">${notFull.prodName}</h3>
                        <div class="stable-mod-tag">
                            <span class="tag-item u_ec01"></span>
                        </div>
                        <h4 class="product-item-big-tt s-fc">
                        ${notFull.prodtype.interest.inteUser}.00%
                        </h4>
                        <span class="product-item-aux">预期年化收益率</span>
                        <ul class="product-block">
                            <li class="product-block-item">
                                <span class="tt">理财期限</span>
                                <span class="aux">
                                ${notFull.prodtype.date.dateLength}月</span>
                            </li>
                            <li class="product-block-item">
                                    <span class="progress">
                                        <em class="bar s-c" style="width: ${notFull.varge}%"></em>
                                    </span>
                            </li>
                            <li class="product-block-item f14">
                                <span class="tt">可投金额：${notFull.prodFroozenNum} 元</span>
                                <span class="aux">${notFull.varge}%</span>
                            </li>
                        </ul>
                        <div class="btn-center">
                            <span class="inherit-color btn-invest s-c">立即投资</span>
                        </div>
                    </a>
                </div>
            </div>
            <#--</#if>-->
            </#list>
            <#list isFullList as isFull>
            <#--<#list pageInfo.list as isFull>-->
            <#--<#if isFull.prodFroozenNum ==0>-->
            <div class="product-item fn-is-over">
                <div class="mod">
                    <a href="/production/productionInfo?prodName=${isFull.prodName}" " class="product-link">
                                <span class="i-mark">
                                    <i class="i-mark-bg"
                                       style="border-color:#e5e5e5 #e5e5e5 transparent transparent;"></i>
                                    <em class="i-mark-text" style="color: #ffffff">满标</em>
                                </span>
                        <h3 class="product-item-tt">${isFull.prodName}</h3>
                        <div class="stable-mod-tag">
                            <span class="tag-item u_ec01"></span>
                        </div>
                        <h4 class="product-item-big-tt s-fc">
                            ${isFull.prodtype.interest.inteUser}.00%
                        </h4>
                        <span class="product-item-aux">预期年化收益率</span>
                        <ul class="product-block">
                            <li class="product-block-item">
                    <span class="tt">理财期限</span>
                                <span class="aux">${isFull.prodtype.date.dateLength}月</span>
                            </li>
                            <li class="product-block-item">
                                    <span class="progress">
                                        <em class="bar s-c" style="width: 100%"></em>
                                    </span>
                            </li>
                            <li class="product-block-item f14"">
                                <span class="tt">可投金额：0 元</span>
                                <span class="aux">100%</span>
                            </li>
                        </ul>
                        <div class="btn-center">
                            <span class="inherit-color btn-invest s-c">${isFull.prodCondition}</span>
                        </div>
                    </a>
                </div>
            </div>
            <#--</#if>-->
            </#list>
        </div>
        <div style="margin: 0px auto;width:250px;" >
            <div class="col-md-12 column" style="magin:0px auto;">
                <ul class="pagination pull-right">
                <#if pageInfo.pageNum lte 1>
                    <li class="disabled">
                    <#--<c:when test="${pageInfo.pageNum ==1}">-->
                        <a href="#">上一页</a>
                    </li>
                <#else>
                    <li>
                        <a href="/production/crowfundList/?pg=${pageInfo.pageNum-1}">上一页</a>
                    </li>
                </#if>

                <#list 1..pageInfo.pages as index>
                    <#if pageInfo.pageNum == index>
                        <li class="disabled"><a href="#">${index}</a></li>
                    <#else>
                        <li><a href="/production/crowfundList/?pg=${index}">${index}</a></li>
                    </#if>
                </#list>

                <#if pageInfo.pageNum gte pageInfo.pages>
                    <li class="disabled">
                    <#--<c:when test="${pageInfo.pageNum ==1}">-->
                        <a href="#">下一页</a>
                    </li>
                <#else>
                    <li>
                        <a href="/production/crowfundList/?pg=${pageInfo.pageNum+1}">下一页</a>
                    </li>
                </#if>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="row">
        <ul class="foot-list">
            <li class="foot-item foot-item_first">
                <h2 class="foot-item_title">关于我们</h2>
                <a href="about.html">公司简介</a><a href="#">发展历程</a><a href="#">加入我们</a>
            </li>
            <li class="foot-item">
                <h2 class="foot-item_title">帮助中心</h2>
                <a href="#">新手指导</a><a href="#">常见问题</a><a href="#">注册协议</a>
            </li>
            <li class="foot-item">
                <h2 class="foot-item_title">安全保障</h2>
                <a href="security.html">安全保障</a><a href="#">资质证明</a><a href="#">法律法规</a>
            </li>
            <li class="foot-item foot-center">

                <img src="./crowfund_files/weixin-sm.jpg" alt="" class="wxbox-img">
                <p>微信公众号</p>
            </li>
            <li class="foot-item foot-center">
                <img src="./crowfund_files/qrCode_new.png" alt="" class="wxbox-img">
                <p>下载app</p>

            </li>
            <li class="foot-item foot-service" style="padding-top: 0">
                <h2 class="foot-item_title" style="font-size:16px;text-align: left">客服热线</h2>
                <h2 class="foot-item_title" style="font-size:16px;text-align: left">
                    400-816-8089
                    <br>0571-86956072</h2>
                周一至周五 9:00-18:00
            </li>
            <li class="foot-item-about foot-item_end">
                <p class="foot-item-about_txt">
                    银子铺为万盈网络科技旗下金融网站
                    <br> 版权所有 © 万盈网络科技有限公司
                    <br> Copyright Reserved 2014-2017
                    <br>浙ICP备15000584号-1
                    <br>浙B2-20170370
                    <br><img src="/crowfund_files/gabeian.png"><a href="#" target="_blank"><span style="color:#888">浙公网安备 33010302001560号</span></a>
                </p>
            </li>
        </ul>
        <div class="row">
            <div class="foot-link foot-certification">
                权威机构安全认证:
                <a class="foot-link-faith" href="#" target="_blank">
                </a>
                <a class="foot-link-s360" href="#" target="_blank">
                </a>
                <a class="foot-link-norton" href="crowfund.html" target="_blank">
                </a>
            </div>
        </div>
    </div>
</div>
<!-- fixed -->
<div class="index-fixed">
    <a href="javascript:" class="index-fixed-item fixed-item-weixin">
        <span class="index-fixed-item_icon">
            <i class="icon"></i>
            微信
        </span>
        <div class="txt">
            <img src="/crowfund_files/weixin.jpg" alt="" width="120" height="120">
            <span class="">关注银子铺</span>
        </div>
    </a>
    <a href="app.html" class="index-fixed-item fixed-item-weixin fixed-item-phone  ">
        <span class="index-fixed-item_icon">
            <i class="icon"></i>
            APP
        </span>
        <div class="txt">
            <img src="/crowfund_files/qrCode_new.png" alt="" width="120" height="120">
            <span class="">扫一扫下载APP</span>
        </div>
    </a>
    <a target="_blank" href="#" class="index-fixed-item fixed-item-qq">
        <span class="index-fixed-item_icon">
            <i class="icon"></i>
            客服
        </span>
        <div class="txt">
            <span class="index-fixed-tt">QQ在线咨询</span>
            <span class="index-fixed-bb">9:00~21:00</span>
        </div>
    </a>
    <a target="_blank" href="calculator.html" class="index-fixed-item fixed-item-qq">
        <span class="index-fixed-item_icon">
            <i class="icon"></i>
            计算
        </span>
    </a>
    <a href="crowfund.html" id="gotop" title="返回顶部" class="index-fixed-item fixed-item-gotop">
        <i class="icon"></i>
    </a>
</div>


<script src="/crowfund_files/list.js"></script>
<script>
    function showBorrow() {
        var value = $("#all-dis").attr('data-checked');
        if (value == "1") { //取消选择状态
            window.location.href = '/crowdfunding';
        } else {
            window.location.href = '/crowdfunding?borrowStatusVale=1';
        }
    }
</script>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>