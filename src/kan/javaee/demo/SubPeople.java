package kan.javaee.demo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kan.javase.jdbc.JdbcHelper;

/**
 * Servlet implementation class SubPeople
 */
@WebServlet("/SubPeople")
public class SubPeople extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name=request.getParameter("name");
	    String age=request.getParameter("age");
	    String sqlString="INSERT INTO people (name, age) VALUES ( '"+name+"',"+ age+")";
	    System.out.println(sqlString);
	    try {
	        Long rs= (Long)JdbcHelper.insertWithReturnPrimeKey(sqlString);
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
	    
	    response.sendRedirect("ListPeople");
	    
	    
	    
	}


}
