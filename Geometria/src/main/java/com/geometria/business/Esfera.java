
package com.geometria.business;

public class Esfera extends Figura{
	
	// private static final float PI = (float) 3.1416;
	
	//http://www.calcularelvolumen.com/esfera.htm
	@Override
	public float calculaVolumen( ){
		return (4* (float) Math.PI  * (this.getRadio()*this.getRadio()*this.getRadio()))/3 ;
		}
	
	
	// http://www.calculararea.com/esfera.htm
	@Override
   public float calculaArea( ){
		return 4* (float) Math.PI  * (this.getRadio()*this.getRadio())  ;
	
	}

}
