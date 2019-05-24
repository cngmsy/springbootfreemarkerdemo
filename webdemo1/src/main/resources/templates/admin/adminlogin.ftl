<!DOCTYPE html>
<html lang="en">
<head>
    <title>后台管理</title>
    <link rel="stylesheet" href="/css/login.css" type="text/css"></link>
    <script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="/js/login.js"></script>





    <style type="text/css">
        table{margin: 13% auto;width: 130px;}
        html body{background-image: url("/img/admin/control.jpg") none;}

    </style>
</head>
<body>
<#if errorlogin ??>
    <script>
        alert("111"+"${errorlogin}")
    </script>
</#if>
<div id="container">
    <div id="top"></div>

    <div id="centry">
        <form action="/adminUser/contrologin" method="post">
            <div id="log">
                <h3>360管理登录</h3>
                <div id="div1">
                    <input type="text" name="userName" class="input" placeholder="手机号/用户名/邮箱" />
                </div>
                <div id="userMes"></div>
                <div class="div" id="div2">
                    <input type="password" name="passWord" class="input" placeholder="密码" />
                </div>
                <div id="pswMes"></div>

                <div class="div"><input type="submit" value="登&nbsp;录"  id="input3" /></div>
                <div class="div"><span>管理员登录提示：<br/>1、请不要在公司外登录<br/>2、请不要使用浏览器记录账号密码<br/>3、严禁泄露公司内网相关信息</span></div>
            </div>
        </form>
    </div>

    <#include "../footer.ftl">
</body>
</html>