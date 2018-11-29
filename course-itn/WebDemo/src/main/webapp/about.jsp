<%-- 
    Document   : about
    Created on : Mar 29, 2018, 4:42:32 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"> </c:set>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>About us</title>
        </head>
        <body>
            <h1>Welcome to our ${company_name} page.</h1>

        <aside>
            <ul>
                <li>
                    <a href="${cp}/home">Home</a>
                </li>
                <li>
                    <a href="${cp}/about" >About Us</a>
                </li>
                <li>
                    <a href="${cp}/contact"> Contact Us</a>

                </li>
            </ul>
        </aside>
        <p> We offer courses on </p>

        <table> 
            <thead>
                <tr>
                    <th>S. no </th>
                    <th> Title</th>
                    <th> Price </th>
                    <th> Duration</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${course_list}" var="course" >
                    <tr>
                        <td>${course.id}</td>
                        <td>${course.title}</td>
                        <td>${course.price}</td>
                        <td>${course.duration}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p> Link to these course: 
        <ul>
            
            <c:forEach items="${course_list}" var="course" >
                <li>${course.id} <a href="">${course.title} </a></li>
            </c:forEach>
        </ul>
        </p>
    </body>
</html>
