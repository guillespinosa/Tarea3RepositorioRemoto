package tarea1git;

public class Ingredientes {

	private Float cantidad;
	private String unidad;
	
	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	private String nombre;
	
	public Ingredientes(Float cantidad, String nombre){
		this.cantidad=cantidad;
		this.nombre=nombre;
	}

	public Float getCantidad() {
		return cantidad;
	}

	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
