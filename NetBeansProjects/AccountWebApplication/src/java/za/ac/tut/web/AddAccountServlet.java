/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.AcountClass;

import za.ac.tut.entities.bl.AcountFacadeLocal;

/**
 *
 * @author Student
 */
public class AddAccountServlet extends HttpServlet {
@EJB 
private AcountFacadeLocal afl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String name=(String)request.getParameter("name");
       String street=(String)request.getParameter("street");
       String city=(String)request.getParameter("city");
       String cellNo=(String)request.getParameter("cell_Number");
       String emailAddress=request.getParameter("emailAddress");
       String code=(String)request.getParameter("code");
       double balance=Double.parseDouble(request.getParameter("balance"));
             AcountClass ac=createAccount(name,street,city,code,cellNo,emailAddress,balance);
             afl.create(ac);
             request.setAttribute("name",name);
            RequestDispatcher disp=request.getRequestDispatcher("create_outcome.jsp");
            disp.forward(request, response);
    }
    private AcountClass createAccount(String name,String street,String city,String code,String cellNo,String emailAddress ,double balance){
    AcountClass ac=new AcountClass();
    ac.setBalance(balance);
    ac.setCellNo(cellNo);
    ac.setCity(city);
    ac.setCode(code);
    ac.setEmailAddress(emailAddress);
    ac.setName(name);
    ac.setStreet(street);
    return ac;
    
    }

 
}
