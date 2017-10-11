
package com.geometria.business;

public class Cubo extends Figura{
	
	//private static final float PI = (float) 3.1416;
 
   // http://www.calcularelvolumen.com/cubo.htm
	@Override
   public float calculaVolumen(){
		return  this.getArista()*this.getArista() * this.getArista()  ;
  		 
	}
   
   // http://www.calculararea.com/calcular-area-cubo.htm
	@Override
	public float calculaArea(){
		return    6 *(this.getArista()*this.getArista());
  	}
	
	
}
