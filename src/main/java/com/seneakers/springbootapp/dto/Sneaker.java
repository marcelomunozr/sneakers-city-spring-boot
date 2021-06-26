package com.seneakers.springbootapp.dto;

import org.springframework.data.annotation.Id;

public class Sneaker {

	@Id
    private String id;
    private String marca;
    private String modelo;
    private int precio;
    private String img;
    private String fechaLanzamiento;
    private String descripcion;
    
	public Sneaker() {
	}

	public Sneaker(String id, String marca, String modelo, int precio, String img, String fechaLanzamiento,
			String descripcion) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.img = img;
		this.fechaLanzamiento = fechaLanzamiento;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
    
}
