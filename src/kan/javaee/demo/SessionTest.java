package kan.javaee.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(1);
		int num=0;
		System.out.println(session.isNew());
		if (!session.isNew()) {
			System.out.println(session.getAttribute("kanSession"));
			num=(Integer)session.getAttribute("kanSession")+1;
		}
		session.setAttribute("kanSession", num);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("次数："+num);
		
	}

}
