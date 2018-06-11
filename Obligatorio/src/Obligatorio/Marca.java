package Obligatorio;

import uy.edu.um.prog2.adt.Hash.ElementoYaExistenteException;
import uy.edu.um.prog2.adt.Hash.HashCerrado;
import uy.edu.um.prog2.adt.Hash.HashTable;
import uy.edu.um.prog2.adt.Lista.LinkedList;
import uy.edu.um.prog2.adt.Lista.List;

public class Marca {

	private String nombre;
	private List<Producto> pHabilitados;
	List<Pais> paisesMarca;
	
	
	
	public void addPais(Pais pais) {
			paisesMarca.add(pais);
	}
	
	public void addProducto(Producto nombre) {
		pHabilitados.add(nombre);
	}
	
	public List<Producto> getpHabilitados() {
		return pHabilitados;
	}
	
	public void setpHabilitados(List<Producto> pHabilitados) {
		this.pHabilitados = pHabilitados;
	}
	
	public Marca(String nombre) {
		this.nombre = nombre;
		pHabilitados = new LinkedList();
		paisesMarca = new LinkedList();
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean equals(Marca e) {
		boolean equal=false;
		if(this.nombre.equals(e.getNombre())==true) {
			equal=true;
		}
		return equal;
	}

	public List<Pais> getPaisesMarca() {
		return paisesMarca;
	}

	public void setPaisesMarca(List<Pais> paisesMarca) {
		this.paisesMarca = paisesMarca;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}
