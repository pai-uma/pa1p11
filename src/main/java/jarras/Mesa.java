
package jarras;

public class Mesa {
	public enum Posicion{Izquierda, Derecha};
	private Jarra jarraIz,jarraDr;
	public Mesa(int cIz, int cDr) {
		jarraIz = new Jarra(cIz);
		jarraDr = new Jarra(cDr);
	}

	public Mesa(Jarra jIz, Jarra jDr) {
		if (jIz == jDr) {
			throw new RuntimeException("Argumentos erroneos");
		}
		jarraIz = jIz;
		jarraDr = jDr;
	}
	public int capacidad(Posicion id) {
		return switch (id) {
			case Izquierda -> jarraIz.capacidad();
			case Derecha -> jarraDr.capacidad();
		};
	}
	public int contenido(Posicion id) {
		return switch (id) {
		case Izquierda -> jarraIz.contenido();
		case Derecha-> jarraDr.contenido();
		};
	}
	public void llena(Posicion id) {
		switch (id) {
		case Izquierda: jarraIz.llena(); break;
		case Derecha: jarraDr.llena();
		}
	}
	public void vacia(Posicion id) {
		switch (id) {
		case Izquierda: jarraIz.vacia(); break;
		case Derecha: jarraDr.vacia();
		}
	}
	public void llenaDesde(Posicion id) {
		switch (id) {
		case Izquierda: jarraDr.llenaDesde(jarraIz); break;
		case Derecha: jarraIz.llenaDesde(jarraDr);
		}
	}
	@Override
	public String toString() {
		return "M(" + jarraIz + ", " + jarraDr + ")";
	}
}
