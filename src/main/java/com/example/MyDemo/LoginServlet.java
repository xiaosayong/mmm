package com.example.MyDemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + request.getParameter("username") + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //PrintWriter out = response.getWriter();

        //out.println("<html><body>");
        //out.println("<h1>" + request.getParameter("username") + "</h1>");
        //out.println("</body></html>");
        request.setAttribute("username","dddddd");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
