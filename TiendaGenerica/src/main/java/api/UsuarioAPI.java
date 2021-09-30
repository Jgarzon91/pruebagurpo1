package api;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;  
import dao.CRUDUsuarios; 
import modelo.Usuario;

public class UsuarioAPI {
	@RestController //esta es una clase REST 
	@RequestMapping("usuarios") 
	public class UsuariosAPI {    
		@Autowired //inyecta la dependencia de todos los métodos del JPA para usuarioDAO  private UsuariosDAO usuariosDAO;   
		@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon  
		public void guardar(@RequestBody Usuario usuarios) {   
			CRUDUsuarios.save(usuarios);  }    @GetMapping("/listar")  
			public List<Usuarios> listar(){   
				return CRUDUsuarios.findAll();  }    
			@DeleteMapping("/eliminar/{id}")  
			public void eliminar(@PathVariable("id") Integer id) {   
				CRUDUsuarios.deleteById(id);  }    
			@PutMapping("/actualizar")  
			public void actualizar(@RequestBody Usuario usuarios) {   
				CRUDUsuarios.save(usuarios);  
				}     
			} 
	}
}
