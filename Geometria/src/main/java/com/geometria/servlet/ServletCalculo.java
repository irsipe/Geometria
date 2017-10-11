package com.geometria.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geometria.business.Cilindro;
import com.geometria.business.Cono;
import com.geometria.business.Cubo;
import com.geometria.business.Esfera;
import com.geometria.business.ServicesGeometria;
import com.geometria.business.ServicesGeometria.Geo;

/**
 * Servlet implementation class ServletCalculo
 */
@WebServlet(description = "Donde enseña y calcula", urlPatterns = { "/ServletCalculo" })
public class ServletCalculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@EJB
	private ServicesGeometria services;
	
    public ServletCalculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String figura =request.getParameter("figura");
		figura =figura!=null?figura:"";
		figura=figura.toLowerCase();
		
	 
		String valor= "";
		String raiz=request.getContextPath();
		// comprobacion de valores 
		String[] parametros ={"altura","radio","arista","generatriz"};
		float[] valores= {0,0,0,0};
		for(int i=0;i<valores.length;i++){
			valor= request.getParameter(parametros[i]);
			valores[i]=valor!=null?Float.valueOf(valor):valores[i];
		}
		
		 
		   
		
		Geo data=null;
		
		 if (figura.equals("cilindro")){
			 
			 data=services.calcularCilindro(valores[0],valores[1], "figCilindro.png","areaCilindro.png","volumenCilindro.png");
			  
		 }
		 
		 if (figura.equals("esfera")){
			 
			 data=services.calcularEsfera(valores[1], "figEsfera.png","areaEsfera.png","volumenEsfera.png");
	
		}
		 
		 if (figura.equals("cono")){
			 
			 data=services.calcularCono(valores[0],valores[1],valores[3], "figCono.png","areaCono.png","volumenCono.png");

			
		 }
		 if (figura.equals("cubo")){
			 
			 data=services.calcularEsfera(valores[2], "figCubo.png","areaCubo.png","volumenCubo.png");

			  
		 }
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Calculo Area y Volumen </title>");
			out.println("<link rel='stylesheet' type='text/css' href='"+raiz+"/css/figura.css'>");
			out.println("</head>");
			out.println("<body>");
			out.println("<br>");
			out.println("<h1>Despues de infinitos y complicados calculos, hemos obtenido </h1>" );
			out.println("<h2>para la figura "+figura +"</h2>");
			//  Geometria/servlet
			out.println("<br>");
			out.println("<img src='"+raiz+"/img/"+ data.imagen +"' alt="+data.imagen+">");
			out.println("<br>");
			out.println("<img src='"+raiz+"/img/"+ data.iArea   +"' alt="+data.iArea +">");
			out.println("<h3>Area   :"+ data.area +"</h3>");
			out.println("<img src='"+raiz+"/img/"+ data.iVolumen +"' alt="+data.iVolumen+">");
			out.println("<h3>Volumen:"+ data.volumen +"</h3>");
			
			out.println("<a href='../index.html'>Volver a los calculos:</a>");
			out.println("</body>");
			out.println("</html>");
			 
			
		
	}

}
