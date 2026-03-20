package com.example.mindPet.Repository;

import com.example.mindPet.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {  // ✅ BIEN

    Usuario findByCorreo(String correo);

}