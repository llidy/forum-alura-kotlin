package br.com.alura.forumkotlin.service

import br.com.alura.forumkotlin.model.Curso
import br.com.alura.forumkotlin.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id : Long): Curso {
       return repository.getById(id)
    }
}
