<%--
  Created by IntelliJ IDEA.
  User: huycao
  Date: 10/05/2022
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@include file="header.jsp" %>
</head>
<body>
<div class="formedit">
  <div class="title">
    <h3>Thêm loại sách</h3>
  </div>
  <div class="khung">
    <form action="themloaisach" method="post">
      <label>Loại sách</label><br>
      <input class="input" type="text" name="loaisach" placeholder="Nhập loại sách" required><br>
      <button type="submit" name="themloaisach" class="submit">Thêm loại sách</button>
    </form>
  </div>

</div>

</body>
</html>
