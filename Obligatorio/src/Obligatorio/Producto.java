package Obligatorio;

import uy.edu.um.prog2.adt.Lista.LinkedList;
import uy.edu.um.prog2.adt.Lista.List;

public class Producto {

	private String nombre;
	private String estado;
	private Clase clase;
	private Pais pais;
	private int nroHabilitacion;
	private Marca marca;
	private Empresa empresa;
	private List<Rubro> rubro;
	private String idProd;

	public Producto(String nombre, String estado, Clase clase, Pais pais, Marca marca, Empresa empresa,
			LinkedList<Rubro> rubro, String idProd) {
		
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.clase = clase;
		this.pais = pais;
		this.marca = marca;
		this.empresa = empresa;
		this.rubro = rubro;
		this.idProd=idProd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Rubro> getRubro() {
		return rubro;
	}

	public void setRubro(LinkedList<Rubro> rubro) {
		this.rubro = rubro;
	}
}
