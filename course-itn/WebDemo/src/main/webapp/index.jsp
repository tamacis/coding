<%-- 
    Document   : index
    Created on : Mar 26, 2018, 4:53:11 PM
    Author     : cswl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css" >
            #addrs_tbl {
                border:  1px solid black;

            }
            #addrs_tbl >  tr, td, th {

                border:  2px solid black;
            }

            image {
                align : center;
            }
        </style>
    </head>
    <body>
        <header>

            <h1>JSP :|</h1>
        </header>
        <aside>
            <ul>
                <li>
                    <a href="${pageContext.request.contextPath}/home">Home</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/about" >About Us</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/contact"> Contact Us</a>

                </li>
            </ul>
        </aside>
        <section>
            Sample web apps: <br>
            <p>
                <%
                    int a = 100;
                    int b = 200;
                %>
                The sum is: <%= (a + b)%>
            </p>
            <a href="DemoServlet?a=100&b=200" > Call server fro resources </a>

            <br>
            <form action="DemoServlet" method="POST" >
                Username: <input type="text" name="uname" placehoder="username" >
                <br>
                <input type="submit" value="Login!!">
                <br>
            </form>
            <img src="sample.png" height="320" width="140" />
        </section>
        <section>
            <div>
                <table id="addrs_tbl">
                    <thead>
                        <tr>
                            <th>S no.</th>
                            <th> Name
                            </th>
                            <th>Addrress</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td> Prask</td>
                            <td> Iillam</td>
                        </tr>

                        <tr>
                            <td>2</td>
                            <td> Ashi</td>
                            <td> Jnakk</td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </section>
        <footer>
            page footer here
        </footer>
    </body>
</html>
