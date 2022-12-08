<%--
  Created by IntelliJ IDEA.
  User: KIMHYOJUN
  Date: 2022-12-08
  Time: 오후 4:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
        a:link{
            color: white;
            text-decoration: none;
        }
        a:visited{
            color: white;
            text-decoration: none;
        }
        html.body{
            margin: 0; padding: 0;
        }
        header{
            width: 100%; height: 90px;
            background: black; text-align: center;
            font-size: 25px; color: white;
            padding-top: 50px;
        }
        nav{
            width: 100%; height: 30px; background: gray;
            color: white;font-size: 12px;padding-top: 10px;
        }
        section{
            width: 100%; height: 350px;
            background: lightgray;text-align: center;
            font-size: 20px; padding-top: 20px;
        }
        footer{
            width: 100%; height: 30px; background: black;
            text-align: center;color: white;font-size: 12px;
            padding-top: 10px;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
</head>
<body>
<header>골프연습장 회원관리 프로그램 ver 1.0</header>
<nav>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="teacher_list.do">강사조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="class_insert.do">수강신청</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="class_list.do">회원정보조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="teacher_sale_list.do">강사매출현황</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="GolfMain.jsp">홈으로</a>
</nav>
<section>골프연습장 회원관리 프로그램</section>
<footer>HRDKOREA Copyright@2015 Allrights reserved.Human Resources Development Service od Korea</footer>
</body>
</html>
</body>
</html>
