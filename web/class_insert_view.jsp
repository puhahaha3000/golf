<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KIMHYOJUN
  Date: 2022-12-08
  Time: 오후 4:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>수강신청</title>
    <style type="text/css">
        table {
            font-size: 15px;
            margin-left: 30%;
            border-collapse: collapse;

        }

        th {
            padding-left: 10px;
            padding-right: 10px;
        }

        td {
            padding: 5px;
        }

        a:link {
            color: white;
            text-decoration: none;
        }

        a:visited {
            color: white;
            text-decoration: none;
        }

        html.body {
            margin: 0;
            padding: 0;
        }

        header {
            width: 100%;
            height: 90px;
            background: black;
            text-align: center;
            font-size: 25px;
            color: white;
            padding-top: 50px;
        }

        nav {
            width: 100%;
            height: 30px;
            background: gray;
            color: white;
            font-size: 12px;
            padding-top: 10px;
        }

        section {
            width: 100%;
            height: 350px;
            background: lightgray;
            font-size: 20px;
            padding-top: 20px;
        }

        footer {
            width: 100%;
            height: 30px;
            background: black;
            text-align: center;
            color: white;
            font-size: 12px;
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
    <a href="class_insert_view.do">수강신청</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="class_list.do">회원정보조회</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="teacher_sale_list.do">강사매출현황</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="GolfMain.jsp">홈으로</a>
</nav>
<section>
    <h3 align="center">수강신청</h3>
    <form action="class_insert.do" method="post">
        <table width="40%" border="solid black 1px">
            <tbody>
            <tr>
                <th>
                    수 강 월
                </th>
                <td>
                    <input type="text" size="15" name="REGIST_MONTH" required>
                    2022년 03월 예)202203
                </td>
            </tr>
            <tr>
                <th> 회 원 명</th>
                <td>
                    <select name="M_NAME" size="1" required>
                        <option value="" selected>회원명</option>
                        <c:forEach var="dto" items="${member_list}">
                            <option value="${dto.customerName}">${dto.customerName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>회 원 번 호</th>
                <td>
                    <input type="text" size="15" name="C_NO" required>
                    예)10001
                </td>
            </tr>
            <tr>
                <th>강 의 장 소</th>
                <td>
                    <select name="CLASS_AREA" size="1" required>
                        <option value='' selected>강의장소</option>
                        <c:forEach var="dto" items="${class_list}">
                            <option value='${dto.classArea}'>${dto.classArea}</option>
                        </c:forEach>

                    </select>
                </td>
            </tr>
            <tr>
                <th>강의명</th>
                <td>
                    <select name="CLASS_NAME" size="1" required>
                        <option value='' selected>강의신청</option>
                        <c:forEach var="dto" items="${teacher_list}">
                            <option value='${dto.className}'>${dto.className}</option>
                        </c:forEach>

                    </select>
                </td>
            </tr>
            <tr>
                <th>수강료</th>
                <td>
                    <input name="TUITION" size="15.5" type="text" required>원
                    </input>
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="수강신청">
                    &nbsp;&nbsp;
                    <input type="reset" value="다시쓰기">
                </td>
            </tr>
            </tbody>
        </table>
    </form>
</section>
</body>
</html>
