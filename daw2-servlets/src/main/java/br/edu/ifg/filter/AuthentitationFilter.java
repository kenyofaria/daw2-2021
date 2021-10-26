package br.edu.ifg.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//@WebFilter(urlPatterns = "/random")
public class AuthentitationFilter implements Filter{

	private static Logger logger = LogManager.getLogger(AuthentitationFilter.class);
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		String path = req.getRequestURI();
		if (path.contains("/login")) {
		    chain.doFilter(request, response); // Just continue chain.
		} else {
			HttpSession session = req.getSession();
			String usuarioLogado = (String) session.getAttribute("usuarioLogado");
			if(usuarioLogado != null) {
				chain.doFilter(request, response);
			}else {
				//HttpServletResponse resp = (HttpServletResponse) response;
				//resp.sendRedirect("/login");
				request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
			}
		}

	}
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
