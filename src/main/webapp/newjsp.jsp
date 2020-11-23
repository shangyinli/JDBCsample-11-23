<%-- 
    Document   : newjsp
    Created on : 2020/11/23, 下午 02:32:51
    Author     : eason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Class.forName("org.apache.derby.jdbc.ClientDriver");//載入驅動程式方法
        %>
    </body>
</html>
