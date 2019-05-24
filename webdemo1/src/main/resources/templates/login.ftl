<!DOCTYPE html>
<html lang="en">
<head>


    <title>登录</title>
    <link rel="stylesheet" href="/css/login.css" type="text/css"></link>
    <script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="/js/login.js"></script>
</head>
<body>
<div id="container">


    <div id="centry">
        <form action="/user/login" method="post">
            <div id="log">
                <h3>帐号登录</h3>
            <#--用户名-->
                <div id="div1">
                    <input type="text" name="userName" class="input" placeholder="手机号/用户名/邮箱"/>
                </div>
                <div id="userMes"></div>
            <#--密码-->

                <div class="div" id="div2">
                    <input type="password" name="passWord" class="input" placeholder="密码"/>
                </div>
            <#--比方说我们的用户名或者密码输入不正确 就使用这个标签提示一下-->
                <div id="pswMes"></div>


                <div class="div">
                    <#--<span><a href="/index/login">找回密码？</a></span>-->
                    <span id="span1"><a href="/index/reg">注册账号</a></span>
                </div>

                <div class="div"><input type="submit" value="登&nbsp;录" id="input3"/></div>


                <div class="div">
                    <span>后台登录：
                        <img src="/img/qq.gif"/>&nbsp;
                        <img src="/img/wb.gif"/>&nbsp;
                        <a href="/index/adminlogin"><img src="/img/admin.png"/></a>
                    </span>
                </div>
            </div>
        </form>
    </div>

<#include "footer.ftl">
</div>
</body>
</html>