package tarea1git;

import java.util.ArrayList;

public class Receta {

	private String nombre;
	private ArrayList<String> preparacion;
	private ArrayList<Ingredientes> ingredientes;
	private int personas=4;
	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	private String autor;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}

	public Receta(String nombre){
		this.nombre=nombre;
	}


	public Receta(String nombre, ArrayList<Ingredientes> ingredientes, ArrayList<String> preparacion){
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		this.preparacion=preparacion;
	}
	
	public void addIngrediente(Ingredientes ingrediente){
		float cantidad = ingrediente.getCantidad();
		String unidad = ingrediente.getUnidad();
	}
	
	public void addPreparacion(String preparacion){
		String preparacion1 = new String();
		preparacion1 = preparacion;
	}
	
	public String toString(){
		return "Receta: " + nombre + "\n" + 
		       "Ingredientes: " + "\n" + 
		       cantidad + unidad + " de " + nombre + "\n" +
		       "Preparacion: " + "\n" + 
		       "Paso 1: " + preparacion;
	}
	
	public Receta recetaPara(int personas){
		Receta r;
		r = new Receta(autor, ingredientes, preparacion);
		return(r);
	}

}
