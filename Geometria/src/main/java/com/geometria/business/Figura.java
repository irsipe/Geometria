package com.geometria.business;



public  abstract  class  Figura  {
	
	
	private float altura;
	private float radio;
	private float arista;
	private float generatriz;
	private String tipo;
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getArista() {
		return arista;
	}
	public void setArista(float arista) {
		this.arista = arista;
	}
	public float getGeneratriz() {
		return generatriz;
	}
	public void setGeneratriz(float generatriz) {
		this.generatriz = generatriz;
	}
	public float calculaVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}
	public float calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}