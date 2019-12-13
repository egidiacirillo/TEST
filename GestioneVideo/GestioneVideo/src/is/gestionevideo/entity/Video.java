package is.gestionevideo.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Video {

	protected int id;
	protected String nome;
	protected LocalDate data;
	protected Sport sport;
	public Object set;
	

	public Video(int id, String nome, Date data2, Sport sport) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data2;
		this.sport = sport;
	}
	
	public Video(String nome, LocalDate data, Sport sport) {
		super();
		this.id = -1;
		this.nome = nome;
		this.data = data;
		this.sport = sport;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getData() {
		return data;
	}


	public String Data(Date data2) {
		this.data = data2;
		return nome;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public void setDate(Date data2) {
		// TODO Auto-generated method stub
		
	}
	
}
