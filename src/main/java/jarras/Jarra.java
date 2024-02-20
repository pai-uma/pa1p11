
package jarras;

public class Jarra {
	private final int capacidad;
	private int contenido;
	public Jarra(int c) {
		if (c <= 0) {
			throw new RuntimeException("Capacidad erronea");
		}
		capacidad = c;
		contenido = 0 ;
	}
	public int capacidad() {
		return capacidad;
	}
	public int contenido() {
		return contenido;
	}
	public void llena() {
		contenido = capacidad();
	}
	public void vacia() {
		contenido = 0;
	}
	public void llenaDesde(Jarra otra) {
		if (this == otra) {
			throw new RuntimeException("Argumento erroneo");
		}
		int espacioLibre = this.capacidad() - this.contenido();
		int c = Math.min(otra.contenido(), espacioLibre);
		otra.contenido -= c;
		this.contenido += c;
	}
	@Override
	public String toString() {
		return "J(" + capacidad() + ", " + contenido() + ")";
	}
}
