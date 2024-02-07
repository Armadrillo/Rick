package com.oracle.tomweb2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/rickRoll")
public class Rick_Roll extends HttpServlet {
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int ans = i + j;
//        HttpSession session = req.getSession();
//        session.setAttribute("k" , ans);
        Cookie cookie = new Cookie("k" , ans+"");
        res.addCookie(cookie);
        res.sendRedirect("rick");
    }
}
