<!DOCTYPE html>
<html lang="en">
<header>
    <script type="text/javascript" src="/js/jquery-1.8.3.js"></script>

    <script type="text/javascript" src="/js/header.js"></script>
</header>



<body>


<#--判断是否为空-->
    <#if user ??>
        <script type="text/javascript">
            $(document).ready(function () {
                alert("不为空")

                var error = '${error!""}';
                if (error != '')
                    alert(error);

                var success = '${success!""}';
                if (success != '')
                    alert(success);

                $("#span3").hide()

            });

        </script>

    <#else >
           <script >
               $(document).ready(function () {
                   alert("为空")

                   $("#span4").hide()

               });
           </script>
    </#if>
   <#-- -->

<div style="width: 100%">

    <div id="top">
		<span id="span1" style="margin-left: 450px;">
			<a href="/">360官网</a>|<a href="/">360社区</a>
		</span>
        <span id="span2" style="margin-right: 450px;">
            <#--todo 登陆的时候跳转到登陆页面    注册的时候跳转注册页面  推出的时候退出界面  购物车展示  商品详情
            -->
			<span id="span3"><a href="/index/login">登录</a> | <a href="/index/reg">注册</a></span>
			<span id="span4">欢迎登录！${username!""}|<a href="/user/exit">退出</a></span>
			|   <a href="/cart/list">我的购物车</a>
		</span>
    </div>

    <div id="banner">
        <img style="margin-left: -110px;" src="/img/logo1.png"/>
        <form action="good/fuzzy">
		  <span style="margin-right: 450px;">
		  	<input type="text" name="goods" id="input1" value="360手机"/>
		  	<input type="submit" value="搜索" id="input2"/>
		  </span>
        </form>
    </div>

    <div id="menu">
        <ul>
            <li><a href="/">首页</a></li>
            <li><a href="/">手机</a>
                <div class="div" id="div1">
                    <div>
                        <#--点击商品详情 进入商品详情界面-->
                        <a href="good/det?id=10101"><img src="/img/phone/1.jpg"/></a>
                        <p style="text-align: center;">360手机 vizza</p>
                        <p style="text-align: center;color: red;">799.00</p>
                    </div>
                    <div>
                        <a href="good/det?id=10105"><img src="/img/phone/2.jpg"/></a>
                        <p style="text-align: center;">360手机 N5 全网通</p>
                        <p style="text-align: center;color: red;">1299.00</p>
                    </div>
                    <div>
                        <a href="/"><img src="/img/phone/3.jpg"/></a>
                        <p style="text-align: center;">360手机 N5S 全网通</p>
                        <p style="text-align: center;color: red;">1699.00</p>
                    </div>
                    <div>
                        <a href="/"><img src="/img/phone/4.jpg"/></a>
                        <p style="text-align: center;">360手机 F5 移动高配版</p>
                        <p style="text-align: center;color: red;">499.00</p>
                    </div>
                </div>
            </li>
            <li><a href="/">行车记录仪</a>
                <div class="div" id="div2">
                    <div>
                        <a href="good/det?id=10104"><img src="/img/tachograph/1.jpg"/></a>
                        <p style="text-align: center;">M302 高清夜视 前后双录</p>
                        <p style="text-align: center;color: red;">339.00</p>
                    </div>
                    <div>
                        <a href="good/det?id=10104"><img src="/img/tachograph/2.jpg"/></a>
                        <p style="text-align: center;">二代 美猴王版</p>
                        <p style="text-align: center;color: red;">529.00</p>
                    </div>
                    <div>
                        <a href="good/det?id=10104"><img src="/img/tachograph/3.jpg"/></a>
                        <p style="text-align: center;">二代 美猴王版</p>
                        <p style="text-align: center;color: red;">499.00</p>
                    </div>
                    <div>
                        <a href="good/det?id=10104"><img src="/img/tachograph/4.jpg"/></a>
                        <p style="text-align: center;">360行车记录仪尊享升级版</p>
                        <p style="text-align: center;color: red;">339.00</p>
                    </div>
                </div>
            </li>
            <li><a href="/">其他产品</a>
                <div class="div" id="div3">
                    <div>
                        <a href="/"><img src="/img/other/1.jpg"/></a>
                        <p style="text-align: center;">360 智能摄像机 云台版</p>
                        <p style="text-align: center;color: red;">299.00</p>
                    </div>
                    <div>
                        <a href="/"><img src="/img/other/2.jpg"/></a>
                        <p style="text-align: center;">360安全路由器P3</p>
                        <p style="text-align: center;color: red;">199.00</p>
                    </div>
                    <div>
                        <a href="/"><img src="/img/other/3.jpg"/></a>
                        <p style="text-align: center;">360智能摄像机悬浮</p>
                        <p style="text-align: center;color: red;">259.00</p>
                    </div>
                    <div>
                        <a href="/"><img src="/img/other/4.jpg"/></a>
                        <p style="text-align: center;">360安全路由器P1 天际蓝</p>
                        <p style="text-align: center;color: red;">99.00</p>
                    </div>
                </div>
            </li>
            <li><a href="/">二手手机</a></li>
            <li><a href="/">社区</a></li>
            <li><a href="/">游戏中心</a></li>
        </ul>
    </div>

</div>
</body>
</html>
