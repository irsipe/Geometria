
package com.geometria.business;

public class Cono extends Figura{
	
	//private static final float PI = (float) 3.1416;
	 	
	// http://www.calcularelvolumen.com/cono.htm
	@Override
	public float calculaVolumen(){
			return  (  (float) Math.PI  * (this.getRadio()*this.getRadio()) * this.getAltura())/3  ;
	 
	}
	
	// http://www.calculararea.com/calcular-area-cono.htm
	@Override
	public float calculaArea(){
		float al = 	(float) Math.PI  * this.getRadio() *this.getGeneratriz();
		float at =  (float) Math.PI  * this.getRadio() *(this.getGeneratriz()+this.getRadio());
		return  al+at  ;
	
	}

}
