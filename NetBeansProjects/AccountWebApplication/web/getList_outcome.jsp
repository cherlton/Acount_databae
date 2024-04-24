<%-- 
    Document   : getList_outcome
    Created on : 25 Apr 2024, 12:33:00 AM
    Author     : Student
--%>


<%@page import="za.ac.tut.entities.AcountClass"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Get Account</h1>
        <%
            AcountClass ac=(AcountClass)request.getAttribute("ac");
            Long id=(Long)request.getAttribute("id");
        %>
        
        <p>
           below is the account with the id number<%=id%> 
        </p>
        <table border="1">
            
            <thead>
                <tr>
                    <th>Name:</th>
                    <th><%=ac.getName()%></th>
                </tr>
            </thead>
            <tbody>
                 <tr>
                    <th>ID:</th>
                    <th><%=ac.getId()%></th>
                </tr>
                <tr>
                    <td>Street:</td>
                    <td><%=ac.getStreet()%></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><%=ac.getCity()%></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><%=ac.getCode()%></td>
                </tr>
                <tr>
                    <td>Cell number:</td>
                    <td><%=ac.getCellNo()%></td>
                </tr>
                <tr>
                    <td>Email Address</td>
                    <td><%=ac.getEmailAddress()%></td>
                </tr>
                <tr>
                    <td>Balance:</td>
                    <td>R<%=ac.getBalance()%></td>
                </tr>
            </tbody>
            
            
        </table>
                <p>
                Please click <a href="menu.html">here</a> to go to menu or <a href="index.html">here</a> to exit
            </p>
    </body>
</html>
