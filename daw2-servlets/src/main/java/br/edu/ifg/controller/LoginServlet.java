package br.edu.ifg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter("login");
		if(login != null && !login.isEmpty()) {
			req.getSession().setAttribute("usuarioLogado", login);
			resp.sendRedirect(req.getContextPath()+"/random");
		}else {
			req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
		}
	}
	
}
