package com.library.Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(value = "/books", loadOnStartup = 1)
public class BookServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        System.out.println("GET request received");

        res.setContentType("text/plain;charset=UTF-8");

        res.getWriter().println("Welcome to Library Management");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        String title = req.getParameter("title");
        String author = req.getParameter("author");

        res.setContentType("text/plain;charset=UTF-8");

        res.getWriter().println("Book Title: " + title);
        res.getWriter().println("Author: " + author);
    }
}