package com.lxy.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description:
 * @Author: liuxinyun
 * @Date: 2017/10/10 10:25
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        System.out.println("servlet初始化……");
        message = "Hello World , Nice To Meet You: " + System.currentTimeMillis();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应内容类型
        response.setContentType("text/html");

        //设置逻辑实现
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("servlet销毁！");
    }

}
