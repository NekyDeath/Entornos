package NBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;

	public BDController() {
		super();
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en constructor BDController " + e);
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en constructor " + e);
		}

	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public ArrayList<Equipo>equipos(){
		ArrayList<Equipo> ret=new ArrayList<Equipo>();
		String sql="Select * FROM equipos";
		Statement mst;
		try {
			mst = conexion.createStatement();
			ResultSet rs=mst.executeQuery(sql);
			while(rs.next()) {
				Equipo eq=new Equipo(rs.getString("Nombre"), rs.getString("Ciudad"), rs.getString("Conferencia"), rs.getString("Division"));
				ret.add(eq);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}
	
	public ArrayList<Partidos>partidos(){
		ArrayList<Partidos> ret=new ArrayList<Partidos>();
		String sql="Select * FROM partidos";
		Statement mst;
		try {
			mst = conexion.createStatement();
			ResultSet rs=mst.executeQuery(sql);
			while(rs.next()) {
				Partidos eq=new Partidos(rs.getInt("codigo"), rs.getString("equipo_local"), rs.getString("equipo_visitante"),
						rs.getInt("puntos_local"), rs.getInt("puntos_visitante"), rs.getString("temporada"));
				ret.add(eq);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}
	
	public ArrayList<Jugador>jugadores(){
		ArrayList<Jugador> ret=new ArrayList<Jugador>();
		String sql="Select * FROM jugadores";
		Statement mst;
		try {
			mst = conexion.createStatement();
			ResultSet rs=mst.executeQuery(sql);
			while(rs.next()) {
				Jugador eq=new Jugador(rs.getInt("codigo"), rs.getString("Nombre"), rs.getString("Procedencia"),
						rs.getString("Altura"), rs.getInt("Peso"), rs.getString("Posicion"), rs.getString("Nombre_equipo"));
				ret.add(eq);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}
	
	public ArrayList<Estadistica>Estadisticas(){
		ArrayList<Estadistica> ret=new ArrayList<Estadistica>();
		String sql="Select * FROM estadisticas";
		Statement mst;
		try {
			mst = conexion.createStatement();
			ResultSet rs=mst.executeQuery(sql);
			while(rs.next()) {
				Estadistica eq=new Estadistica(rs.getString("temporada"), nombreJugador(rs.getInt("jugador")), 
						rs.getInt("Puntos_por_partido"), rs.getInt("Asistencias_por_partido"), 
						rs.getInt("Tapones_por_partido"), rs.getInt("Rebotes_por_partido"));
				ret.add(eq);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}
	
	public String nombreJugador(int cod) {
		String ret="";
		String sql="SELECT jugaodr.nombre FROM jugador WHERE codigo='"+cod+"';";
		try {
			Statement mst=conexion.createStatement();
			//System.out.println(sql);
			ResultSet rs=mst.executeQuery(sql);
			while(rs.next()) {
				ret=rs.getString("Nombre");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}
