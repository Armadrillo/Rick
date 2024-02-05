package com.oracle.tomweb2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Rick_Roll" , value = "/rickRoll")
public class Rick_Roll extends HttpServlet {
    public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int ans = i + j;
        PrintWriter us = res.getWriter();
//        us.println("Get ready to be rick rolled");
//        res.getWriter().println("The result is : " + ans);
//        res.sendRedirect("https://r.mtdv.me/videos/CrawuudcK3");
        res.sendRedirect("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }
}
