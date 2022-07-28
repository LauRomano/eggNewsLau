
package com.egg.eggNews.repositorios;

import com.egg.eggNews.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository <Noticia, String> {
   
	
	// @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo") //Query para buscar noticias por titulo
   // public Noticia buscarPorTitulo(@Param("titulo") String titulo);
}