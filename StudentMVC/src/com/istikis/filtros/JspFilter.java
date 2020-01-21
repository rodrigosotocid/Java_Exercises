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
 * YA QUE NO SE PUEDE ACCEDER A WEB-INF 
 * SE CREA PARA HACER UN PUENTE
 * LO PONGO Y PUEDO VISUALIZAR SIN UNA SERVLET
 * TRUCO REDIRECCION A LAS JSP's
 * VALE PARA CUALQUIER RUTA QUE ESTÉ EN "/VISTAS/"
 * PREVISUALIZA UNA JSP A TRAVES DE SU URL
 * ASÍ VEO SI LAS PANTALLAS O VISTAS QUE ESTY HACIENDO VAN BIEN (BIEN PARA DESARROLLO Y MAL PARA PRODUCCIÓN)
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
