<%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>--%>

<%--<!DOCTYPE html>--%>
<%--<!-- saved from url=(0045)https://www.yinzipu.com/Account/RegisterModel -->--%>
<%--<html lang="zh" id="top"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

    <%----%>
    <%--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">--%>
    <%--<title>会员注册</title>--%>
    <%--<link rel="shortcut icon" href="https://www.yinzipu.com/favicon.ico" type="image/icon">--%>
    <%--<link href="./__init__(1).css" rel="stylesheet">--%>
    <%--<style type="text/css">--%>
        <%--body { background-color: #fff; background-color: rgba(255,255,255,0.75); }--%>
    <%--</style>--%>
        <%--<style type="text/css">--%>
            <%--.form-item:after, .input-box:after { content: " "; display: block; clear: both; height: 0; }--%>
            <%--.form-it, .input-box { *zoom: 1; }--%>
            <%--.loginConterBox { padding: 10px 15px; }--%>
            <%--/* ipt */--%>

            <%--.ipt { padding: 5px; height: 28px; border: 1px solid #dee1e3; line-height: 17px; font-size: 14px; color: #777; background: #fff; }--%>
            <%--.ipt:hover { border-color: #c0c1c2; }--%>
            <%--.ipt:focus { border-color: #00c9d0; border-color: rgba(82, 168, 236, .8); outline: 0; outline: thin dotted \9; /* IE6-9 */ -moz-box-shadow: 0 0 8px rgba(82, 168, 236, .6); box-shadow: 0 0 8px rgba(82, 168, 236, .6); }--%>
            <%--.ipt.disabled,--%>
            <%--.ipt[disabled] { background-color: #ebedee; border-color: #ebedee; }--%>

            <%--.input-validation-error { background-color: #fdf7f7; border-color: #eed3d7; margin-top: 5px; }--%>
            <%--.field-validation-error { display: block; font-size: 12px; color: #ed0000; margin-top: 10px; margin-bottom: -10px; }--%>
            <%--.field-validation-error:before { content: '\e60f'; margin-right: 5px; }--%>
            <%--.field-validation-error:before { font-family: "iconfont" !important; font-style: normal; -webkit-font-smoothing: antialiased; -webkit-text-stroke-width: 0.2px; -moz-osx-font-smoothing: grayscale; }--%>

            <%--.btn-sub { background-color: #FF503F; border: 0; color: #fff; cursor: pointer; width: 80%; height: 40px; border-radius: 4px; font-size: 18px; margin-left: 10%; }--%>
            <%--.form-list-reg .form-lab { float: left; text-align: right; width: 85px; margin-right: 13px; line-height: 40px; height: 40px; color: #666; }--%>
            <%--.form-item { padding: 10px 0; position: relative; }--%>
            <%--.form-list-reg .input-box { width: 250px; float: left; }--%>
            <%--.form-list-reg .ipt { width: 215px; }--%>
            <%--.form-list-reg .ipt.small { width: 110px; vertical-align: middle; margin-right: 15px; }--%>

            <%--.form-list-reg .tips { display: none; margin-top: 10px; color: #999; }--%>
            <%--.mt20 { margin-top: 20px; }--%>
            <%--.reg-form-tt { color: #666; border-bottom: 1px dotted #dcdcdc; padding-bottom: 10px; }--%>
            <%--.reg-form-tt .tt { font-size: 26px; }--%>
            <%--.form-list-reg { margin-top: 20px; }--%>

            <%--.f-accord { font-size: 12px; height: 20px; }--%>
            <%--.cut-tips { margin-top: 50px; border-top: 1px solid #eee; padding: 15px 0 0; line-height: 2; overflow: hidden; width: 100%; }--%>
            <%--.send-msg { margin: 30px 0; }--%>
            <%--.msg-form-list .input-box { margin: 0 auto; float: none; }--%>
            <%--.dialog { position: fixed; left: 50%; top: 50%; width: 200px; padding: 15px; background: rgba(0, 0, 0, .7); color: #fff; font-size: 14px; text-align: center; line-height: 1.5; -webkit-border-radius: 8px; border-radius: 8px; -webkit-transform: translate(-50%, -50%); transform: translate(-50%, -50%); }--%>
            <%--.verificationCodeBox { padding: 0; width: 287px; margin: 0 auto 30px auto; }--%>
            <%--.verificationCodeBox .ipt { width: 275px; }--%>
            <%--.verCode { display: inline-block; position: absolute; top: 8px; right: 30px; }--%>
            <%--.codeBtn { border: 0; padding: 3px 5px; color: #666; cursor: pointer; background-color: #FF503F; color: #fff; border-radius: 3px; }--%>
            <%--.codeBtn:hover { color: #fff; }--%>
            <%--.btn-login { display: block; width: 100%; line-height: 20px; color: #FF503F; text-align: center; margin-top: 10px; }--%>
            <%--.goback { display: block; width: 287px; line-height: 40px; text-align: center; color: #4bbdf0; border: 1px solid #4bbdf0; margin-left: 10%; margin-top: 20px; }--%>
            <%--.goback:hover { border-color: #FF503F; color: #FF503F; }--%>
        <%--</style>--%>
<%--</head>--%>
<%--<body>--%>

        <%--<!-- 内容部分 -->--%>
        <%--<div class="loginConterBox">--%>

            <%--<span id="message" class="hide">--%>

            <%--</span>--%>
<%--<form action="silver/register/show" data-ajax="true" data-ajax-method="POST" data-ajax-mode="replace" data-ajax-success="registerSuccess1" data-ajax-update="#message" data-ajax-url="/Account/RegisterFinish" id="form1" method="post" novalidate="novalidate"><input id="Guid" name="Guid" type="hidden" value="b7f6930a-6f88-410b-87ec-a9f001ba2435"><input id="EncryptedPwd" name="EncryptedPwd" type="hidden" value="">                <ul class="form-list form-list-reg">--%>
                    <%--<li class="form-item">--%>
                        <%--<label class="form-lab" for="UserName">手机号码</label>--%>
                        <%--<div class="input-box">--%>
                            <%--<input value="" autocomplete="off" class="ipt" data-val="true" data-val-regex="手机号码必须为中国内地手机号码" data-val-regex-pattern="^1[\d]{10}$" data-val-required="手机号码 字段是必需的。" id="UserName" maxlength="11" name="UserName" placeholder="中国大陆手机号" type="text">--%>
                            <%--<span class="c-key">*</span>--%>
                            <%--<span class="field-validation-valid" data-valmsg-for="UserName" data-valmsg-replace="true"></span>--%>
                            <%--<p class="tips">我们不会在任何地方泄露您的号码</p>--%>
                        <%--</div>--%>
                    <%--</li>--%>
                    <%--<li class="form-item">--%>
                        <%--<label for="password" class="form-lab">验证码</label>--%>
                        <%--<div class="input-box">--%>
                            <%--<input class="ipt small" data-val="true" data-val-regex="验证码不正确" data-val-regex-pattern="^\w{4}$" data-val-remote="验证码不正确" data-val-remote-additionalfields="*.VerifyCode" data-val-remote-type="POST" data-val-remote-url="/Account/CheckVerifyCode" data-val-required="验证码 字段是必需的。" id="VerifyCode" maxlength="4" name="VerifyCode" type="text" value="">--%>
                            <%--<img src="./Reg" onclick="this.src = &#39;/VerifyCode/Reg?&#39; + new Date().getTime()" id="picVerCode" height="40" style="cursor: pointer;" title="点击刷新">--%>
                            <%--<span class="c-key">*</span>--%>
                            <%--<span class="field-validation-valid" data-valmsg-for="VerifyCode" data-valmsg-replace="true"></span>--%>
                        <%--</div>--%>
                    <%--</li>--%>
                    <%--<li class="form-item">--%>
                        <%--<label for="password" class="form-lab">短信验证码</label>--%>
                        <%--<div class="input-box" style="position:relative">--%>
                            <%--<input class="ipt" data-val="true" data-val-required="短信验证码 字段是必需的。" id="MobileVerifyCode" maxlength="4" name="MobileVerifyCode" placeholder="四位数字验证码" type="text" value="">--%>
                            <%--<div class="verCode radius">--%>
                                <%--<input type="button" class="u-btn codeBtn" id="codeBtn" value="发送验证码">--%>
                            <%--</div>--%>
                            <%--<span class="c-key">*</span>--%>
                            <%--<span class="field-validation-valid" data-valmsg-for="MobileVerifyCode" data-valmsg-replace="true"></span>--%>
                        <%--</div>--%>
                    <%--</li>--%>
                    <%--<li class="form-item">--%>
                        <%--<label class="form-lab" for="Password">设置登录密码</label>--%>
                        <%--<div class="input-box">--%>
                            <%--<input class="ipt" data-val="true" data-val-length="设置登录密码 必须至少包含 6 个字符。" data-val-length-max="12" data-val-length-min="6" data-val-required="设置登录密码 字段是必需的。" id="Password" name="Password" placeholder="长度在6~12位之间" type="password">--%>
                            <%--<span class="c-key">*</span>--%>
                            <%--<span class="field-validation-valid" data-valmsg-for="Password" data-valmsg-replace="true"></span>--%>
                        <%--</div>--%>
                    <%--</li>--%>
                        <%--<li class="form-item">--%>
                            <%--<label for="InviterNum" class="form-lab">邀请人手机号</label>--%>
                            <%--<div class="input-box">--%>
                                <%--<input autocomplete="off" class="ipt" data-val="true" data-val-regex="邀请人手机号码必须为中国内地手机号码" data-val-regex-pattern="^1[\d]{10}$" id="InviterNum" maxlength="11" name="InviterNum" placeholder="可以填写推荐人手机" type="text" value="">--%>
                            <%--</div>--%>
                        <%--</li>--%>

                    <%--<li class="form-item f-accord ">--%>
                        <%--<span class="form-lab"></span>--%>
                        <%--<div class="input-box">--%>
                            <%--<input checked="checked" data-val="true" data-val-required="我已阅读并同意 字段是必需的。" id="AgreeTerms" name="AgreeTerms" type="checkbox" value="true">--%>
                            <%--<input name="AgreeTerms" type="hidden" value="false">--%>
                            <%--<label for="AgreeTerms">我已阅读并同意</label>--%>
                            <%--<a href="http://www.yinzipu.com/Article?cid=7" target="registerAgreement">《银子铺用户注册协议》</a>--%>
                        <%--</div>--%>
                    <%--</li>--%>
                    <%--<li class="form-submit">--%>
                        <%--<input type="submit" class="u-btn btn-sub" id="phone-submit" value="注册">--%>
                        <%--<a target="_parent" class="btn btn-login" href="https://www.yinzipu.com/Account/Login">已有账号？立即登录</a>--%>
                    <%--</li>--%>
					<%--<li class="form-submit">--%>
                        <%----%>
                        <%--<a target="_parent" class="btn btn-login" href="https://wap.yinzipu.com/account/borrowerregister">借款人注册</a>--%>
                    <%--</li>--%>
                <%--</ul>--%>
<%--</form>--%>

        <%--</div>--%>
        <%--<script src="register_files/jquery.min.js.下载"></script>--%>
        <%--<script src="register_files/base.js(1).下载"></script>--%>
        <%--<script src="register_files/jquery.validate.min.js.下载" type="text/javascript"></script>--%>
        <%--<script src="register_files/jquery.validate.unobtrusive.min.js.下载" type="text/javascript"></script>--%>
        <%--<script src="register_files/jquery.unobtrusive-ajax.min.js.下载" type="text/javascript"></script>--%>
        <%--<script src="register_files/BigInt.js.下载"></script>--%>
        <%--<script src="register_files/Barrett.js.下载"></script>--%>
        <%--<script src="register_files/RSA.js.下载"></script>--%>
        <%--<script>--%>

            <%--//十六进制公钥--%>
            <%--var rsaKey = "010001,9D2046599AFBF488FB6D2865D5483AA06CD363244259F8DF0972B1F0DDB407E153923511CA957EEAB040C4BA3DBE8747E5128C30C0CFF55EB1BEBDDA6295617C44461332421939020B48DFFAC5031DBFDC48A505B2FE96735C32574416DA0434762F7D602D563588B38EF317CD9CDF0E16FEE742722816E72E3ADEF88209E67D82EE5267F20E7CABBED2E2A3E83E4A021A41C99CF1BB538B57A41D646E066B2C906D41D96944701ACA60D9B363930CB74191D80C32B5745E77500654115FE72D0BC942A01AE2F2962A97899D4B3FFFF2AE49659361DFACEF79D669E1042A6E5BDF80E8855AD4D1259C010D076D28D1C41F7E102165162378100D830273918EB9".split(',');--%>

            <%--function encryptString(key, sValue) {--%>
                <%--return encryptedString(key, sValue, RSAAPP.PKCS1Padding);--%>
            <%--}--%>

            <%--setMaxDigits(262);--%>
            <%--var key = new RSAKeyPair(--%>
                <%--rsaKey[0],--%>
                <%--rsaKey[0],--%>
                <%--rsaKey[1],--%>
                <%--2048--%>
            <%--);--%>

            <%--$(function () {--%>
                <%--var oldSubmitHandler = $("#form1").data("validator").settings.submitHandler;--%>
                <%--$("#form1").data("validator").settings.submitHandler = function(form) {--%>
                    <%--var $password = $('#Password');--%>
                    <%--if ($password.val().length < 1) {--%>
                        <%--return false;--%>
                    <%--}--%>

                    <%--var sEncryptedPwd = encryptString(key, $password.val());--%>
                    <%--$password.val(sEncryptedPwd.substring(0,12));--%>
                    <%--$('#EncryptedPwd').val(sEncryptedPwd);--%>
                    <%--oldSubmitHandler();--%>
                <%--}--%>

                <%--var $mobile = $("#UserName"),--%>
                    <%--$codeBtn = $("#codeBtn"),--%>
                    <%--$msg_form = $(".msg-form"),--%>
                    <%--$reg_form = $(".form-list-reg");--%>


                <%--$codeBtn.on("click", function () {--%>
                    <%--var $this = $(this);--%>
                    <%--var isOK = true;--%>
                    <%--var url = '/ShortMessage/SendRegCode?' + new Date().getTime();--%>
                    <%--var data = {--%>
                        <%--mobileNumber: $mobile.val(),--%>
                        <%--verifyCode: $("#VerifyCode").val()--%>
                    <%--};--%>
                    <%--var type = 'POST';--%>
                    <%--if ($mobile.val() == '' || $("#VerifyCode").val() == '') {--%>
                        <%--isOK = false;--%>
                        <%--YZP.alert('请填写手机号和验证码');--%>
                    <%--}--%>
                    <%--//发送验证码的方法--%>
                    <%--if (isOK) {--%>
                        <%--YZP.countdown.init($this);--%>
                        <%--$.ajax({--%>
                            <%--type: type,--%>
                            <%--url: url,--%>
                            <%--data: data,--%>
                            <%--success: function (json) {--%>
                                <%--//{"Success":true,"Message":"验证码发送成功,请注意查收","MobileNumber":"138****2454"}--%>
                                <%--YZP.alert(json.Message);--%>
                                <%--if (!json.Success) {--%>
                                    <%--YZP.countdown.stop();--%>
                                <%--}--%>
                            <%--},--%>
                            <%--error: function () {--%>
                                <%--YZP.alert("发送失败,请检查网络!");--%>
                                <%--YZP.countdown.stop();--%>
                            <%--}--%>
                        <%--});--%>
                    <%--}--%>
                <%--});--%>
            <%--});--%>


            <%--function registerBegin() {--%>
                <%--//dialog("正在提交...");--%>
            <%--}--%>

            <%--function registerSuccess(result) {--%>
                <%--if (result.Status) {--%>
                    <%--var $mobile = $("#UserName"),--%>
                        <%--$codeBtn = $("#codeBtn"),--%>
                        <%--$msg_form = $(".msg-form"),--%>
                        <%--$reg_form = $(".form-list-reg");--%>

                    <%--$msg_form.show();--%>
                    <%--$reg_form.hide();--%>
                    <%--$('.phoneNum').html(result.Message);--%>
                    <%--$codeBtn.trigger("click");--%>

                <%--} else {--%>
                    <%--YZP.alert(result.Message)--%>
                <%--}--%>
            <%--}--%>


            <%--function registerError(data) {--%>
                <%--YZP.alert("提交失败，请查看网络连接或重试")--%>
            <%--}--%>

            <%--function registerSuccess1(result) {--%>
                <%--if (result.Status) {--%>
                    <%--parent.location.href = "/Account/RegisterOk";--%>
                <%--} else {--%>
                    <%--YZP.alert(result.Message)--%>
                <%--}--%>
            <%--}--%>
        <%--</script>--%>



<%--</body></html>--%>