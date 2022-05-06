<%--
  Created by IntelliJ IDEA.
  User: MinhNN
  Date: 4/16/2022
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Quản lý thư viện</title>
    <link rel="stylesheet" href="./css/header.css">
    <link rel="stylesheet" href="./css/ql_sach.css">
    <link rel="stylesheet" href="./css/chinhsua_sach.css">
</head>
<body>
<div class="head">
    <a href="home.jsp">Home</a>
    <a href="${pageContext.request.contextPath}/qlsach">Quản lý sách</a>
    <div class="dropdown">
        <button class="nut_dropdown">Thêm thông tin sách</button>
        <div class="noidung_dropdown">
            <a href="${pageContext.request.contextPath}/themsach">Thêm sách</a>
            <a href="#">Thêm thể loại</a>
            <a href="#">Thêm tác giả</a>
            <a href="#">Thêm vị trí</a>
        </div>
    </div>
    <div class="dropdown">
        <button class="nut_dropdown">Quản lý mượn sách</button>
        <div>
            <div class="noidung_dropdown">
                <a href="${pageContext.request.contextPath}/qlmuon">Danh sách sinh viên mượn</a>
                <a href="${pageContext.request.contextPath}/qltra">Danh sách sinh viên đã trả</a>
            </div>
        </div>
    </div>

    <a href="${pageContext.request.contextPath}/themsv">Thêm người đọc</a>
    <div class="dropdown">
        <button class="nut_dropdown">Tài khoản</button>
        <div>
            <div class="noidung_dropdown">
                <a href="#">Đổi mật khẩu</a>
                <a href="login.jsp">Đăng xuất</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
