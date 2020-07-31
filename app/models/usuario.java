package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity //pra colocar o ID//
public class usuario extends Model{
	public String nome;
	public String email;
	public String tipo;
	

}
