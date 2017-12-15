package kan.javaee.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPeople
 */
@WebServlet("/AddPeople")
public class AddPeople extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html lang='en'><head><meta charset='UTF-8'><title>新建页面</title></head>");
        out.println("<body><form action='SubPeople'>name:<input type='text' name='name'> <br>sex:<input type='text' name='sex'><br>age:<input type='text' name='age'><br></body></html>");
        out.println("<input type='submit' ><input type='reset' >");
        out.flush();
	}

}
