
package com.egg.eggNews.servicios;

import com.egg.eggNews.entidades.Noticia;
import com.egg.eggNews.repositorios.NoticiaRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class noticiaServicio {
	@Autowired // Es para que se cree una sola instancia de ese repositorio
//	(NoticiaRepositorio). DE esta manera llamaremos siempre a NoticiaRepositorio 
//	y no utilizaremos recursos de gusto.,  
	private NoticiaRepositorio noticiaRepositorio; // Objeto e instancia

	@Transactional // Le avisamos a JPA que el método crearNoticia va a impactar en la BBDD
	public void crearNoticia(String titulo, String cuerpo, String foto) {
		Noticia noticia = new Noticia();
		noticia.setTitulo(titulo);
                noticia.setCuerpo(cuerpo);
                noticia.setFoto(foto);
                noticiaRepositorio.save(noticia);//Con esto mandamos la noticia que creamos a la BBDD
	}
        @Transactional
        public void modificarNoticia (String titulo, String id){
            
          
            
        }
}
