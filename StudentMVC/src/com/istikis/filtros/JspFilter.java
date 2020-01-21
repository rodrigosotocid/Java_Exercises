package com.istikis.filtros;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class JspFilter
 */
@WebFilter(dispatcherTypes = { 
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD 
			}
					, urlPatterns = { "/vistas/*" })
public class JspFilter implements Filter {

	public void destroy() {	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		request.getRequestDispatcher("/WEB-INF/" + ((HttpServletRequest)request).getRequestURI().replace("/StudentMVC/",  "")).forward(request, response);
		// pasar la solicitud de largo de la cadena de filtro
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
