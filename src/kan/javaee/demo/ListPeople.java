package kan.javaee.demo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kan.javase.entity.People;
import kan.javase.jdbc.JdbcHelper;

/**
 * Servlet implementation class ListPeople
 */
@WebServlet("/ListPeople")
public class ListPeople extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    List<HashMap> rs = null;
	    try {
            rs=JdbcHelper.query("SELECT * FROM people");
        } catch (SQLException e) {
            e.printStackTrace();
        }
	    System.out.println(rs.size());
	    for (int i = 0; i < rs.size(); i++) {
	        if(rs.get(i)!=null){
	            Iterator iterator = rs.get(i).keySet().iterator();                
	            while (iterator.hasNext()) {    
	             Object key = iterator.next();    
	             System.out.println("map.get(key) is :"+rs.get(i).get(key)); 
	             
	             
	             
	            }           
	                
	            
	            
	            
	        }
	        
            
        }
	    
	    
	    
	    
	}

	

}
