package com.example.ss1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet(name = "bai3", value = "/bai3")
public class Bai3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "Phạm Trung Hiếu";
        int age = 21;
        request.setAttribute("userName", name);
        request.setAttribute("userAge", age);

        RequestDispatcher dispatcher = request.getRequestDispatcher("bai3.jsp");
        dispatcher.forward(request, response);
    }
}