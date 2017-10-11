package com.geometria.business;

import javax.ejb.Stateless;

@Stateless
public class ServicesGeometria {

	public Geo calcularCubo(float arista,String imagen,String iArea,String iVolumen){
		
		 Cubo elemento= new Cubo();
		 elemento.setArista(arista);
		 float v=elemento.calculaVolumen();
		 float a=elemento.calculaArea();
		 return new Geo(a,v,imagen,iArea,iVolumen);
	}
	
	public Geo calcularEsfera(float radio,String imagen,String iArea,String iVolumen){
		
		 Esfera elemento= new Esfera();
		 elemento.setRadio(radio);
		 float a=elemento.calculaArea();
		 float v=elemento.calculaVolumen(); 
		 return new Geo(a,v,imagen,iArea,iVolumen);
		 
	
	}
	
	public Geo calcularCilindro(float altura,float radio,String imagen,String iArea,String iVolumen){
	     
		Cilindro elemento= new Cilindro() ;
		 elemento.setAltura(altura);
		 elemento.setRadio(radio);
		 float v=elemento.calculaVolumen();
		 float a=elemento.calculaArea();
		 return new Geo(a,v,imagen,iArea,iVolumen);
		
	}
	
	
	public Geo calcularCono(float altura,float radio,float generatriz,String imagen,String iArea,String iVolumen){
		 Cono elemento= new Cono();
		 
		 elemento.setAltura(altura);
		 elemento.setRadio(radio);
		 elemento.setGeneratriz(generatriz);
		 float v=elemento.calculaVolumen();
		 float a=elemento.calculaArea();
		 return new Geo(a,v,imagen,iArea,iVolumen);
	}
	
	
	
	
	public static class Geo{
		public final float area;
		public final float volumen;
		public final String imagen;
		public final String iVolumen;
		public final String iArea;
		
		public Geo(float area, float volumen, String imagen,String iArea,String iVolumen) {
			super();
			this.area = area;
			this.volumen = volumen;
			this.imagen = imagen;
			this.iVolumen = iVolumen;
			this.iArea = iArea;
			
			
		}
		
		 
		
		
		
	}
}
