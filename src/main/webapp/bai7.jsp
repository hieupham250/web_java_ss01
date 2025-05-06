<%@ page import="com.example.ss1.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Danh sách vé xe sinh viên</title>
</head>
<body>
<h2>Danh sách sinh viên đã đăng ký vé xe</h2>
<table>
  <tr>
    <th>Họ và Tên</th>
    <th>Lớp</th>
    <th>Loại Xe</th>
    <th>Biển Số Xe</th>
  </tr>
  <%
    List<Student> students = (List<Student>) request.getAttribute("students");
    if (students != null) {
      for (Student student : students) {
  %>
  <tr>
    <td><%= student.getName() %></td>
    <td><%= student.getClassName() %></td>
    <td><%= student.getVehicleType() %></td>
    <td><%= student.getLicensePlate() %></td>
  </tr>
  <%
      }
    }
  %>
</table>
</body>
</html>
