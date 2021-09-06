package com.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String id = request.getParameter("id");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String team = request.getParameter("team");
		String project = request.getParameter("project");
		
		 Emp e= new Emp();  
		 
         e.setId(id);  
         e.setFname(fname);  
         e.setLname(lname);  
         e.setEmail(email);  
         e.setPhone(phone);  
         e.setAddress(address);
         e.setTeam(team);
         e.setProject(project);

  
          
        int status=EmpDao.save(e);  
        if(status>0){  
            System.out.print("Record saved successfully!");  
            response.sendRedirect("ViewServlet"); 

            out.print("Record saved successfully!"); 
        }else{  
            System.out.println("Sorry! unable to save record");  
//            response.sendRedirect("index.jsp"); 

            out.println("Sorry! unable to save record"); 
        }  
          
        out.close();  
    } 
		
}
