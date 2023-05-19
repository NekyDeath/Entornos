package NBA;

public class Estadistica {
	private String temporada;
	private String jugador;
	private float puntos_por_partido;
	private float assist_por_partido;
	private float tapones_por_partido;
	private float rebotes_por_partido;
	
	public Estadistica(String temporada, String jugador, float puntos_por_partido, float assist_por_partido,
			float tapones_por_partido, float rebotes_por_partido) {
		super();
		this.temporada = temporada;
		this.jugador = jugador;
		this.puntos_por_partido = puntos_por_partido;
		this.assist_por_partido = assist_por_partido;
		this.tapones_por_partido = tapones_por_partido;
		this.rebotes_por_partido = rebotes_por_partido;
	}

	public Estadistica() {
		super();
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

	/**
	 * @return the jugador
	 */
	public String getJugador() {
		return jugador;
	}

	/**
	 * @param jugador the jugador to set
	 */
	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	/**
	 * @return the puntos_por_partido
	 */
	public float getPuntos_por_partido() {
		return puntos_por_partido;
	}

	/**
	 * @param puntos_por_partido the puntos_por_partido to set
	 */
	public void setPuntos_por_partido(float puntos_por_partido) {
		this.puntos_por_partido = puntos_por_partido;
	}

	/**
	 * @return the assist_por_partido
	 */
	public float getAssist_por_partido() {
		return assist_por_partido;
	}

	/**
	 * @param assist_por_partido the assist_por_partido to set
	 */
	public void setAssist_por_partido(float assist_por_partido) {
		this.assist_por_partido = assist_por_partido;
	}

	/**
	 * @return the tapones_por_partido
	 */
	public float getTapones_por_partido() {
		return tapones_por_partido;
	}

	/**
	 * @param tapones_por_partido the tapones_por_partido to set
	 */
	public void setTapones_por_partido(float tapones_por_partido) {
		this.tapones_por_partido = tapones_por_partido;
	}

	/**
	 * @return the rebotes_por_partido
	 */
	public float getRebotes_por_partido() {
		return rebotes_por_partido;
	}

	/**
	 * @param rebotes_por_partido the rebotes_por_partido to set
	 */
	public void setRebotes_por_partido(float rebotes_por_partido) {
		this.rebotes_por_partido = rebotes_por_partido;
	}

	@Override
	public String toString() {
		return "Estadisticas [temporada=" + temporada + ", jugador=" + jugador + ", puntos_por_partido="
				+ puntos_por_partido + ", assist_por_partido=" + assist_por_partido + ", tapones_por_partido="
				+ tapones_por_partido + ", rebotes_por_partido=" + rebotes_por_partido + "]";
	}
	
}
