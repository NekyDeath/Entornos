package NBA;

public class Jugador {
	private int codigo;
	private String nombre;
	private String procedencia;
	private String altura;
	private int peso;
	private String posicion;
	private String equipo;
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the procedencia
	 */
	public String getProcedencia() {
		return procedencia;
	}
	/**
	 * @param procedencia the procedencia to set
	 */
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	/**
	 * @return the altura
	 */
	public String getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(String altura) {
		this.altura = altura;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	/**
	 * @return the equipo
	 */
	public String getEquipo() {
		return equipo;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public Jugador(int codigo, String nombre, String procedencia, String altura, int peso, String posicion,
			String equipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.equipo = equipo;
	}
	public Jugador() {
		super();
	}
	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", procedencia=" + procedencia + ", altura="
				+ altura + ", peso=" + peso + ", posicion=" + posicion + ", equipo=" + equipo + "]";
	}
}
