<%-- 
    Document   : addrelation
    Created on : Apr 16, 2018, 4:08:28 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"></c:set>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Relations</title>
        </head>
        <body>
            <h1>Add student to course</h1>

            <form action="${pageContext.request.contextPath}/Relation?action=save"
              method="POST" >
            <label>Select student</label>
            <select name="student" >
                <c:forEach items="${studentdata}" var="s" >
                    <option value="${s.id}" > ${s.firstName} ${s.lastName} 
                    </option>
                </c:forEach>
            </select>
            <br>

            <label>Select course</label>
            <select name="course" >
                <c:forEach items="${coursedata}" var="c" >
                    <option value="${c.id}" > ${c.title}
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="Save" >
        </form>

    </body>
</html>
