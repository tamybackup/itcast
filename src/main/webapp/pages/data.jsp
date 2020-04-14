<%--
  Created by IntelliJ IDEA.
  User: Tamy
  Date: 2020/4/14
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="tab-content">
    <!--树表格-->
    <div>
        <table border="1">
            <caption>基于maven的webapp工程</caption>
            <tr>
                <td>疫情地区</td>
                <td>新增</td>
                <td>现有</td>
                <td>累计</td>
                <td>治愈</td>
                <td>死亡</td>
            </tr>

            <%--   el表达式  --%>
            <%--   for循环   --%>
            <c:forEach items="${epidemicList}" var="epidemic">
                <tr>
                    <td>${epidemic.area}</td>
                    <td>${epidemic.newPeople}</td>
                    <td>${epidemic.existing}</td>
                    <td>${epidemic.accumulative}</td>
                    <td>${epidemic.cure}</td>
                    <td>${epidemic.death}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <!--树表格/-->
</div>
</body>
</html>
