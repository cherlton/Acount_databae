/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.AcountClass;
import za.ac.tut.entities.bl.AcountFacadeLocal;

/**
 *
 * @author Student
 */
public class SearchAccountServlet1 extends HttpServlet {

   @EJB
   private AcountFacadeLocal afl;
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     Long id=Long.parseLong(request.getParameter("id"));
    AcountClass ac=afl.find(id);
   request.setAttribute("ac", ac);
        RequestDispatcher disp=request.getRequestDispatcher("getList_outcome.jsp");
        disp.forward(request, response);
    }

   

    
}
