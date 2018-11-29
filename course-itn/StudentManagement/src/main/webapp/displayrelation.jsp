<%-- 
    Document   : displayrelation
    Created on : Apr 17, 2018, 4:24:41 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"></c:set>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h1>Student Course Information</h1>

            <table>
                <thead>
                    <tr>
                        <th>Student Id</th>
                        <th>Name</th>
                        <th>Course Id</th>
                        <th>Title</th>
                    </tr>
                </thead>

                <tbody>
                <c:forEach var="sc" items="${stcudata}" >
                    <tr>
                        <td>${sc.sid}</td>

                        <td>${sc.name}</td>
                        <td>${sc.cid}</td>
                        <td>${sc.title}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>

</html>
