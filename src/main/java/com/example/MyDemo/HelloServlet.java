package com.example.MyDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import com.example.JavaBeanDemo.*;
import sun.jvm.hotspot.oops.Array;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "asb!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        JavaBeanDemo javaBeanDemo=new JavaBeanDemo();
        javaBeanDemo.setSex("男");
        javaBeanDemo.setName("xx");
        List<JavaBeanDemo> javaBeanDemoList=new ArrayList<JavaBeanDemo>();
        javaBeanDemoList.add(javaBeanDemo);
        request.setAttribute("javaBeanDemo",javaBeanDemoList);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
        //response.setHeader();
        //response.sendRedirect("/index.jsp");
    }

    public void destroy() {
    }
}