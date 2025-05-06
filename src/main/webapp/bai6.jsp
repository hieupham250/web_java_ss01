<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Đăng ký vé xe</title>
</head>
<body>
<form action="bai6" method="post">
  <label>Họ và tên:</label>
  <input type="text" name="fullName" required><br><br>

  <label>Lớp:</label>
  <input type="text" name="className" required><br><br>

  <label>Loại xe:</label>
  <input type="text" name="vehicleType" required><br><br>

  <label>Biển số xe:</label>
  <input type="text" name="plateNumber" required><br><br>

  <input type="submit" value="Đăng ký">
</form>
</body>
</html>
