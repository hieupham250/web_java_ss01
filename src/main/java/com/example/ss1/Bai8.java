package com.example.ss1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bai8", value = "/bai8")
public class Bai8 extends HttpServlet {
    private static final List<Task> taskList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init();
        if (taskList.isEmpty()) {
            taskList.add(new Task("Học Java"));
            taskList.add(new Task("Làm bài tập Servlet"));
            taskList.add(new Task("Đọc tài liệu JSP"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String jobName = req.getParameter("task");
        if (jobName != null && !jobName.trim().isEmpty()) {
            taskList.add(new Task(jobName));
        }
        resp.sendRedirect("bai8");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String taskIndex = req.getParameter("toggle");
        String status = req.getParameter("status");

        if (taskIndex != null && status != null) {
            try {
                int index = Integer.parseInt(taskIndex);
                boolean newStatus = Boolean.parseBoolean(status);
                Task task = taskList.get(index);
                task.setStatus(newStatus);  // Thay đổi trạng thái của công việc
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                // Xử lý lỗi nếu không tìm thấy task
            }
            resp.sendRedirect("bai8");
            return;
        }

        req.setAttribute("tasks", taskList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("bai8.jsp");
        dispatcher.forward(req, resp);
    }

}