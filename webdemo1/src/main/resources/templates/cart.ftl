<!DOCTYPE html>
<!--[if IE 7]>    <html class="no-js ie7 ie" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8 ie" lang="en"> <![endif]-->
<!--[if IE 9]>    <html class="no-js ie9 ie" lang="en"> <![endif]-->
<!--[if gt IE 9]><!-->  <html class="no-js" lang="en">  <!--<![endif]-->
<head>


    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!--IE10-->
    <meta http-equiv="X-UA-Compatible" content="IE=7,IE=8,IE=9,IE=10"/>
    <meta name=”renderer” content=”webkit|ie-comp|ie-stand”/>



    <script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="/js/1.js"></script>
    <link rel="stylesheet" href="/css/1.css" type="text/css"></link>
    <title>我的购物车</title>
    <style type="text/css">
        h1 {
            clear: both;
            margin-left: 460px;
        }

        table {
            margin: 0px auto;
            width: 1024px;
        }

        table img {
            width: 100px;
            height: 100px;
            vertical-align: middle;
        }

        td {
            text-align: center;
        }

        th {
            line-height: 50px;
            background-color: #A52A2A;
            color: white;
        }

        #empty {
            margin: 0px 0px 0px 20%;
        }

        #submit {
            width: 100px;
            height: 40px;
            background-color: #A52A2A;
            border: 0px;
            color: white;
        }
    </style>
    <script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(document).ready(function(e) {
            $(".del").click(function() {
                return confirm("确定要删除吗？");
            });

        });
    </script>

</head>
<body>

<#include "header.ftl">
<h1>我的购物车</h1>
<hr>
<form action="" method="post">

    <#if list2 ??>
        <table>
            <tr>
                <th>商品编号</th>
                <th colspan="2">商品名称</th>
                <th>商品类型</th>
                <th>商品单价</th>
                <th>购买数量</th>
                <th>小计</th>
                <th>操作</th>
            </tr>

            <#list list2 as cart>
                <tr class="td">
                    <td>${cart.getGid()}</td>
                    <td><img src="/img/detail/${cart.getImg()}" /></td>
                    <td>${cart.getName()}</td>
                    <td>${cart.getType()}</td>
                    <td>${cart.getPrice()}</td>
                    <td>${cart.getNum()}</td>
                    <td>${cart.getPrice()*cart.getNum()}</td>
                    <td><a
                            href="/cart/del?gid=${cart.getGid()}&type=${cart.getType()}"
                            class="del">删除</a></td>
                </tr>
            </#list>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>总计：</td>
                <td style="font-size: 24px; font-weight: bold; color: #D2691E;">${total}</td>
                <td colspan="2"><input type="submit" value="结算" id="submit"></td>
            </tr>
        </table>
    <#else >
    <div id="empty">
        <a href="/" ><img src="/img/che.jpg"></a>
    </div>
    </#if>

</form>

<div style="height: 190px">
        <#include "footer.ftl">
</div>

</body>
</html>