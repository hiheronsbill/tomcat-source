package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BbsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.printf("-------------- GET: bbs servlet  ---------------");
        resp.getWriter().append("-------------- GET: bbs servlet  ---------------").append(req.getContextPath());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.printf("-------------- POST: bbs servlet  ---------------");
        resp.getWriter().append("-------------- POST: bbs servlet  ---------------").append(req.getContextPath());
    }
}
