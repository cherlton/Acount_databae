<%-- 
    Document   : create_outcome
    Created on : 25 Apr 2024, 12:17:04 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Account Outcome</h1>
        <%
        String name=(String)request.getAttribute("name");
        %>
        <p>
            Account user <b><%=name%></b> has been persisted to he database
        </p>
         <p>
                Please click <a href="menu.html">here</a> to go to menu or <a href="index.html">here</a> to exit
            </p>
    </body>
</html>
