
package com.geometria.business;

public class Cilindro extends Figura{
	
	//private static final float PI = (float) 3.1416;
	 
	//http://www.calcularelvolumen.com/cilindro.htm
	@Override
	public float calculaVolumen(){
		return (float) Math.PI * (this.getRadio()*this.getRadio())*this.getAltura();
			 
	}
	
	@Override
	// http://www.calculararea.com/cilindro.htm
	public float calculaArea(){
		return 2 * (float) Math.PI * this.getRadio()*(this.getRadio()+this.getAltura());

	}

}
