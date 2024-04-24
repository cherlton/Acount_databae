<%-- 
    Document   : getList_outcome
    Created on : 25 Apr 2024, 12:33:00 AM
    Author     : Student
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.AcountClass"%>
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
            List<AcountClass> acList=(List<AcountClass>)request.getAttribute("listAc");
            Long id=(Long)request.getAttribute("id");
        %>
        
        <p>
           below is the account with the id number<%=id%> 
        </p>
        <table border="1">
            <%
            for(int x=0;x<acList.size();x++){
                
                String name=acList.get(x).getName();
                String street=acList.get(x).getStreet();
                String city=acList.get(x).getCity();
                String code =acList.get(x).getCode();
                String cellNumber=acList.get(x).getCellNo();
                String emailAddress=acList.get(x).getEmailAddress();
                double balance=acList.get(x).getBalance();
            
            %>
            <thead>
                <tr>
                    <th>Name:</th>
                    <th><%=name%></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Street:</td>
                    <td><%=street%></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><%=city%></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><%=code%></td>
                </tr>
                <tr>
                    <td>Cell number:</td>
                    <td><%=cellNumber%></td>
                </tr>
                <tr>
                    <td>Email Address</td>
                    <td><%=emailAddress%></td>
                </tr>
                <tr>
                    <td>Balance:</td>
                    <td>R<%=balance%></td>
                </tr>
            </tbody>
            <%
                }%>
        </table>
                <p>
                Please click <a href="menu.html">here</a> to go to menu or <a href="index.html">here</a> to exit
            </p>
    </body>
</html>
