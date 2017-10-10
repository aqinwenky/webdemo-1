package com.lxy.servlet.form;

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
 * @Date: 2017/10/10 10:57
 */
@WebServlet("/getForm")
public class GetForm extends HttpServlet{

    @Override
    public void init() throws ServletException {
        System.out.println("GetForm servlet初始化……");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html;charset=utf-8");
        // 处理中文
        request.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        String title = "使用 GET 方法读取表单数据";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名</b>："
                + request.getParameter("name") + "\n" +
                "  <li><b>网址</b>："
                + request.getParameter("url") + "\n" +
                "</ul>\n" +
                "</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("GetForm servlet销毁！");
    }
}
