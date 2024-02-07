package com.oracle.tomweb2;

import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/rick")
public class Ricked extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter us = res.getWriter();
        us.println("rick rolled");
//        HttpSession session = req.getSession();
//        int ans = (int)session.getAttribute("k");
        Cookie arr[] =req.getCookies();
        int ans = 0;
        for (Cookie c : arr){
            if(c.getName().equals("k")){
                ans = Integer.parseInt(c.getValue());
            }
        }
        ServletContext ctx = getServletContext();
        String name = ctx.getInitParameter("arma");
        us.println("Hi " + name);
        us.println("The result is : "+ ans);
//        res.sendRedirect("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        us.println("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
