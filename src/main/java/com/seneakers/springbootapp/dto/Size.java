package com.seneakers.springbootapp.dto;

import org.springframework.data.annotation.Id;

public class Size {

	@Id
	private String id;
	private String sneaker;
	private Number talla;
	private Number cantidad;

	public Size() {
	}

	public Size(String id, String sneaker, Number talla, Number cantidad) {
		super();
		this.id = id;
		this.sneaker = sneaker;
		this.talla = talla;
		this.cantidad = cantidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSneaker() {
		return sneaker;
	}

	public void setSneaker(String sneaker) {
		this.sneaker = sneaker;
	}

	public Number getTalla() {
		return talla;
	}

	public void setTalla(Number talla) {
		this.talla = talla;
	}

	public Number getCantidad() {
		return cantidad;
	}

	public void setCantidad(Number cantidad) {
		this.cantidad = cantidad;
	}

}
