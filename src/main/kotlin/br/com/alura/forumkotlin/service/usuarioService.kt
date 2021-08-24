package br.com.alura.forumkotlin.service

import br.com.alura.forumkotlin.model.Usuario
import br.com.alura.forumkotlin.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class usuarioService(private var repository: UsuarioRepository) {


    fun buscarPorId(id: Long): Usuario {
        return repository.getById(id)
    }
}
