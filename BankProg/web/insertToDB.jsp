<%-- 
    Document   : insertToDB
    Created on : 16/08/2010, 00:06:59
    Author     : IP
--%>

<%@page import="MyClasses.MyUtils"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8");       //o קידוד לעברית
    String userName = request.getParameter("un");
    String password = request.getParameter("pw");

    Connection con = MyUtils.getSiteDBconnection(application, "db\\siteDB.mdb");
    Statement stmt = con.createStatement();
    String sql = "INSERT INTO users VALUES ('" + userName + "','" + password + "');";
    stmt.execute(sql);
    stmt.close();
    con.close();

    out.print("<h2>Insert OK: " + sql + "</h2>");
    out.print("<a href='index.jsp'>return to index.jsp</a>");
%>
