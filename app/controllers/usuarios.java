package controllers;

import java.util.List;

import models.usuario;
import play.mvc.Controller;

public class usuarios extends Controller{
	public static void form(){
		render();
	}
	//SALVA NO BANCO//
	public static void salvar(usuario user){
		user.save();
		flash.success("Usuário salvo com sucesso");
		form();
	}
	//import java.util.List; ESSA PARTE SERVE PARA LISTAR O QUE FOI COLOCADO NO BANCO//
	public static void listar(){
		List <usuario> lista = usuario.findAll();
		render(lista);
	}
	public static void deletar(Long id){
		usuario user = usuario.findById(id);
		user.delete();
		flash.success("Usuário deletado com sucesso");
		listar();
	}
	public static void editar(Long id){
		usuario user = usuario.findById(id);
		renderTemplate("usuarios/form.html", user);
		
	}
	
	
}
