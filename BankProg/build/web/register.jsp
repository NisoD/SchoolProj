<%-- 
    Document   : register.jsp
    Created on : May 1, 2016, 5:19:51 PM
    Author     : nir
--%>

<%
    String name = request.getParameter("idNum");
    String user = request.getParameter("userName");
    String pwd = request.getParameter("pwd");
    String mail = request.getParameter("email");
    String phone = request.getParameter("kidomet").concat(request.getParameter("phoneNum")) ; 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%= name %></h1>
    </body>
</html>
