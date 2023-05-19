package NBA;

public class Partidos {
	private int codigo;
	private String local;
	private String visitante;
	private int punos_local;
	private int puntos_vistitante;
	private String temporada;
	
	public Partidos(int codigo, String local, String visitante, int punos_local, int puntos_vistitante,
			String temporada) {
		super();
		this.codigo = codigo;
		this.local = local;
		this.visitante = visitante;
		this.punos_local = punos_local;
		this.puntos_vistitante = puntos_vistitante;
		this.temporada = temporada;
	}

	public Partidos() {
		super();
	}

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
	 * @return the local
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * @param local the local to set
	 */
	public void setLocal(String local) {
		this.local = local;
	}

	/**
	 * @return the visitante
	 */
	public String getVisitante() {
		return visitante;
	}

	/**
	 * @param visitante the visitante to set
	 */
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	/**
	 * @return the punos_local
	 */
	public int getPunos_local() {
		return punos_local;
	}

	/**
	 * @param punos_local the punos_local to set
	 */
	public void setPunos_local(int punos_local) {
		this.punos_local = punos_local;
	}

	/**
	 * @return the puntos_vistitante
	 */
	public int getPuntos_vistitante() {
		return puntos_vistitante;
	}

	/**
	 * @param puntos_vistitante the puntos_vistitante to set
	 */
	public void setPuntos_vistitante(int puntos_vistitante) {
		this.puntos_vistitante = puntos_vistitante;
	}

	/**
	 * @return the temporada
	 */
	public String getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "Partido [codigo=" + codigo + ", local=" + local + ", visitante=" + visitante + ", punos_local="
				+ punos_local + ", puntos_vistitante=" + puntos_vistitante + ", temporada=" + temporada + "]";
	}
}
