<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: GauravSinghContracto
  Date: 07-02-2024
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>oracle</title>
</head>
<body >
    <%
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        PrintWriter us = response.getWriter();
//        ServletContext ctx = request.getServletContext();
//        String name = ctx.getInitParameter("arma");
//        us.println("Hello "+ name + "<br>");
        int ans = i + j;
        us.println("The result : " + ans);
    %>
</body>
</html>
