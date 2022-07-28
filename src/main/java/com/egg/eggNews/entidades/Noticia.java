package com.egg.eggNews.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Noticia {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id; // Se autogenera con el generated value, no es necesario pasarlo por parametro
						// en metdos
	private String titulo;
	private String cuerpo;
	private String foto;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTitulo() {
		return titulo;
	}

	public Noticia() {
	}

	public Noticia(String id, String titulo, String cuerpo, String foto) {
		this.id = id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.foto = foto;
	}
}
