package com.hw6;
 
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class FirstServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
 
        PrintWriter pw = resp.getWriter();
        pw.println("<h1>Hello, world!</h1>");
    }
}