<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<base href="<%=request.getContextPath()%>/"/>
<!DOCTYPE html>
<!-- saved from url=(0170)https://www.yinzipu.com/Account/LoginModel?returnUrl=%2FMemberSystem%2FFund%2FGotoPay%3FcrowdfundingNO%3D201804160951220627%26investNewerBid%3DTrue%26investAmount%3D20000 -->
<html lang="zh" id="top" class="no-js"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>登陆模块 －专业网贷投资理财产品_操盘借款_互联网金融平台</title>
    <meta name="keywords" content="互联网金融,互联网理财,投资理财平台,P2P理财平台,p2p官网,p2p投资理财平台">
    <meta name="description" content="银子铺是一家安全靠谱的P2P理财平台，门槛低、收益高、操作方便。提供互联网理财知识和互联网金融资讯。银子铺将打造一个安全、透明、规范、高效的p2p投资理财平台。银子铺p2p官网将有理财、贷款需求的客户快速匹配，降低投资者的风险，提高投资者的收益。">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="shortcut icon" href="https://www.yinzipu.com/content/RoyalBlue/images/favicon.ico" type="image/icon">
    <link href="/frontlogin/__init__(1).css" rel="stylesheet">
    <%--<script src="/frontlogin/jquery.min.js.下载"></script>--%>
    <%--<script src="/frontlogin/base.js(1).下载"></script>--%>
    <link href="/frontlogin/mumber.css" rel="stylesheet">
    <%--<script src="/frontlogin/jquery.validate.min.js.下载" type="text/javascript"></script>--%>
    <%--<script src="/frontlogin/jquery.validate.unobtrusive.min.js.下载" type="text/javascript"></script>--%>
    <%--<script src="/frontlogin/jquery.unobtrusive-ajax.min.js.下载" type="text/javascript"></script>--%>
    <%--<script src="/frontlogin/BigInt.js.下载"></script>--%>
    <%--<script src="/frontlogin/Barrett.js.下载"></script>--%>
    <%--<script src="RSA.js.下载"></script>--%>
    <script>

        //十六进制公钥
//        var rsaKey = "010001,E543A8D0B178B135CC8B49721CF7EACEAD70916C9F28003F03B16A5EFCFC492E6580318F9F68557AD1046A0F1C763275DD986B86AC0CDB2FF9E5369F9FA8F8BAA367CE755F2EC78F892A46E186BD58F4AECB9B5550247ADC08A82C6DB54004B4D8D396435070E4DD88AF3F96C2F658BAA4D89FBF1875CBD4A34CF802C15DFFAC333E31E0C67E0DA86565337D86BF0BFA849C436300345595C1CAD8F386EB0A81BCAF0E032EB0310346965533154EF00F59F53D4A90E5E4B276698EED6F1049CD76E6452E1C0303136082D31FA3B9CC2FCA9FA6E09FCE6CCE93B2FCCE7539493026D4304A48F31EC8824E90ABD4CA578CCB86821E70BABE0F3D47078F136D4C61".split(',');
//
//        function encryptString(key, sValue) {
//            return encryptedString(key, sValue, RSAAPP.PKCS1Padding);
//        }
//
//        setMaxDigits(262);
//        var key = new RSAKeyPair(
//            rsaKey[0],
//            rsaKey[0],
//            rsaKey[1],
//            2048
//        );
//
//        $(function () {
//            var oldSubmitHandler = $("#form1").data("validator").settings.submitHandler;
//            $("#form1").data("validator").settings.submitHandler = function(form) {
//                var $password = $('#Password');
//                if ($password.val().length < 1) {
//                    return false;
//                }
//
//                var sEncryptedPwd = encryptString(key, $password.val());
//                $password.val(sEncryptedPwd);
//                $('#EncryptedPwd').val(sEncryptedPwd);
//                $(form).find('button').attr('disabled',true);
//                //$(this).ajaxSubmit();
//
//                //使用异常退出提交事件使用Ajax提交
//                oldSubmitHandler();
//            }
//        });
    </script>
    <style>
        .dialog { position: fixed; left: 50%; top: 50%; width: 200px; padding: 15px; background: rgba(0, 0, 0, .7); color: #fff; font-size: 14px; text-align: center; line-height: 1.5; -webkit-border-radius: 8px; border-radius: 8px; -webkit-transform: translate(-50%, -50%); transform: translate(-50%, -50%); }
    </style>
</head>
<body class="">
    <div class="login-form-tt"><span class="tt">用户登录</span>
    </div>
<form action="/register/login" id="form1" method="post">
        <ul class="form-list-login clearfix">
            <li class="form-it">
                <label  class="form-lab">手 机</label>
                <div class="input-box">
                    <input autocomplete="off" class="ipt input-validation-error" data-val="true" data-val-required="请输入注册手机号！" id="UserName" name="tel" tabindex="1" type="text" value="">
                    <span class="field-validation-valid" data-valmsg-for="UserName" data-valmsg-replace="true"></span>
                </div>
            </li>
            <li class="form-it">
                <label for="password" class="form-lab">密 码</label>
                <div class="input-box">
                    <input autocomplete="off" class="ipt" data-val="true" data-val-required="请输入密码！" id="Password" name="password" tabindex="2" type="password">
                    <span class="field-validation-valid" data-valmsg-for="Password" data-valmsg-replace="true"></span>
                </div>
                <div class="sub-msg tar"></div>
            </li>
            <li class="form-submit">
                <button class="u-btn btn-sub btn-s" type="submit">登 录</button>
                <div class="sub-msg" style="margin-top:15px">
                    没有账号？
                    <a href="https://www.yinzipu.com/Account/Register" target="_parent">免费注册</a>
                    <a href="https://www.yinzipu.com/Account/ResetPassword1" target="_parent" class="fr">忘记密码</a>
                </div>
            </li>
        </ul>
</form>
<script>
    /**
    * 简易弹出框
    * @param  {Objec} o {txt: "验证码错误/正在加载", autoClose: 0/1}
    * @return {$dialog}   弹出框对象
    */
//    function dialog(o) {
//        var $dialog = $("#dialog");
//        if ($dialog[0]) $dialog.remove();
//        if (typeof o !== "object") {
//            o = {
//                txt: o
//            };
//        }
//        $("body").append($dialog = $('<div id="dialog" class="dialog">' + o.txt + '</div>'));
//        if (o.autoClose) {
//            $dialog.addClass("error");
//            setTimeout(function () {
//                if ($dialog[0]) $dialog.remove();
//            }, 2000);
//        }
//    }
//    function LoginSuccess(result) {
//        if (result.Status) {
//            var returnUrl = $("#returnUrl").val();
//            window.parent.location.href = returnUrl;
//        } else {
//            $('#form1 :button').attr('disabled', false);
//            $("#Password").val("");
//            dialog({
//                txt: result.Message,
//                autoClose: 1
//            });
//        }
//    }
//
//    function LoginFail(data) {
//        dialog({
//            txt: "提交失败，请查看网络连接或重试",
//            autoClose: 1
//        });
//    }
</script>
</body>
</html>