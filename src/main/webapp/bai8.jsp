<%@ page import="com.example.ss1.Task" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="bai8" method="post">
    <input type="text" name="task" placeholder="Nhập công việc mới..." required />
    <input type="submit" value="Thêm công việc" />
</form>

<ul>
    <%
        List<Task> tasks = (List<Task>) request.getAttribute("tasks");
        if (tasks != null && !tasks.isEmpty()) {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
    %>
    <li>
        <%= task.isStatus() ? "<s>" + task.getJobName() + "</s>" : task.getJobName() %>
        <form action="bai8" method="get" style="display:inline;">
            <input type="hidden" name="toggle" value="<%= i %>" />
            <input type="hidden" name="status" value="<%= !task.isStatus() %>" />
            <input type="submit" value="<%= task.isStatus() ? "chưa hoàn thành" : "đã hoàn thành" %>" />
        </form>
    </li>
    <%
        }
    } else {
    %>
    <li>Không có công việc nào.</li>
    <%
        }
    %>
</ul>

</body>
</html>
