<%-- 
    Document   : message
    Created on : 2021/1/2, 下午 09:25:52
    Author     : eason
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Date date = new Date();
%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
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
            <form method="post" action="social">
                <input type="text" name="id" placeholder="ID or name" style="margin-bottom:10px"/><br/>
                <input type="text" name="message" placeholder="message" style="margin-bottom:10px"/><br/>
                <!--                <script language="JavaScript">
                                    function ShowTime() {
                                        var t = new Date();
                                        var h = t.getHours();
                                        var m = t.getMinutes();
                                        var s = t.getSeconds();
                                        document.getElementById('showbox').innerHTML = t.getFullYear() + '/' + t.getMonth() + 1 + '/' + t.getDate() + ' ' + h + ' h ' + m + ' m ' + s + ' s ';
                                        setTimeout('ShowTime()', 1);
                                    }
                                </script>
                                <body onload="ShowTime()">
                                    <div id="showbox"></div><br/>
                                </body>-->
                <script>
                    % ({
                        type:"post",
                        data:{
                            "date":date
                        }
                    });
                </script>
                <input type="submit" style="margin-bottom:10px"/><br/>
            </form>
        </div>
    </body>
</html>
