<%-- 
    Document   : index
    Created on : 2021/1/2, 下午 09:25:41
    Author     : eason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div style="text-align:center;
             text-valign:center;
             margin:350px;
             box-sizing:border-box;
             background-width:60px;
             background-color:#f5f6f7;
             border-top-left-radius:8px;
             border-top-right-radius:8px;
             border-bottom-right-radius:8px;
             border-bottom-left-radius:8px;
             border-top-color: initial;
             border-top-style: none;
             border-top-width: initial;
             border-right-color: initial;
             border-right-style: none;
             border-right-width: 60px;
             border-bottom-color: initial;
             border-bottom-style: none;
             border-bottom-width: initial;
             border-left-color: initial;
             border-left-style: none;
             border-left-width: 60px;
             border-image-source: initial;
             border-image-slice: initial;
             border-image-width: initial;
             border-image-outset: initial;
             border-image-repeat: initial;
             padding-top: 40px;
             padding-bottom: 40px;">
            <form method="post" action="login">
                <input type="text" name="id" placeholder="ID or name" style="margin-bottom:10px"/><br/>
                <input type="password" name="password" placeholder="Password" style="margin-bottom:10px"/><br/>
                <input type="submit" style="margin-bottom:10px"/><br/>
            </form>
            <a href="add.html"><button type="button" class="btn btn-light" style="margin-bottom:10px">建立新帳號</button></a><br/>
            <a href="change.html"><button type="button" class="btn btn-light" style="margin-bottom:10px">更改密碼</button></a>
        </div>
    </body>
</html>
