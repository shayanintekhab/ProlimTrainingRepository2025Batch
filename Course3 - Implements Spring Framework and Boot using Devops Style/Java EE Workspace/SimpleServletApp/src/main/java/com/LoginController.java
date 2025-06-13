package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter pw = response.getWriter();
			String emailid = request.getParameter("emailid");
			String password = request.getParameter("password");
			// we can check from database using jdbc code. 
			if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
				pw.println("successfully login with get");
			}else {
				pw.println("failure with get");
			}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		// we can check from database using jdbc code. 
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			pw.println("successfully login with post");
		}else {
			pw.println("failure with pos");
		}
	}

}
