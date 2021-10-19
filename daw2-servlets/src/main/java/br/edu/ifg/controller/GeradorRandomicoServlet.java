package br.edu.ifg.controller;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//@WebServlet(urlPatterns = "/random")
public class GeradorRandomicoServlet extends HttpServlet{


	
	private static Logger logger = LogManager.getLogger(GeradorRandomicoServlet.class);
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String div = req.getParameter("div");
		//System.out.println("chegando requisicao da div ".concat(div));
		int numero = ThreadLocalRandom.current().nextInt(100, 999);
		div += "  " + numero;
		logger.debug("gerando para ".concat(div).concat(": ".concat(String.valueOf(numero))));
		resp.getWriter().write(div);
	}
}
