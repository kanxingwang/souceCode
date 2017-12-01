package kan.javaee.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestCookieServlet
 */
@WebServlet("/TestCookieServlet")
public class TestCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cookieStr="";
		Cookie[] cookies = request.getCookies();
        // 获取与该域相关的 Cookie 的数组
        
        for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("kan")) {
				cookieStr=cookies[i].getValue();
				break;
			}
		}
		Cookie cookie = null;
		int num=0;
		if(cookieStr!=""){
			num=Integer.parseInt(cookieStr);
			num++;
		}
		cookie = new Cookie("kan",num+"");
		cookie.setMaxAge(60*60*24); 
		response.addCookie(cookie);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("第"+num+"次");
		
		
		
		
	}

}
