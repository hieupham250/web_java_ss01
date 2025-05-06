package com.example.ss1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bai7", value = "/bai7")
public class Bai7 extends HttpServlet {
    private static List<Student> studentList = new ArrayList<>();
    @Override
    public void init() throws ServletException {
        super.init();
        studentList.add(new Student("Nguyễn Văn A", "12A1", "Xe máy", "47X1-123.45"));
        studentList.add(new Student("Trần Thị B", "11B2", "Xe đạp", "59B2-11B.45"));
        studentList.add(new Student("Lê Văn C", "10C3", "Xe máy", "62Y2-678.90"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("students", studentList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("bai7.jsp");
        dispatcher.forward(req, resp);
    }

}