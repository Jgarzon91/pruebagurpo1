package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import modelo.Usuario;

public interface CRUDUsuarios extends JpaRepository<Usuario, Integer>{
	
} 


