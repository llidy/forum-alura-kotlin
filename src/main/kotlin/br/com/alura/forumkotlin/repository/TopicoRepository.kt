package br.com.alura.forumkotlin.repository

import br.com.alura.forumkotlin.dto.TopicoPorCategoriaDto
import br.com.alura.forumkotlin.model.Topico
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TopicoRepository: JpaRepository<Topico, Long> {

    fun findByCursoNome(nomeCuruso: String, paginacao: Pageable): Page<Topico>

    @Query("SELECT new br.com.alura.forumkotlin.dto.TopicoPorCategoriaDto(curso.categoria, count(t)) FROM Topico t JOIN t.curso curso GROUP BY curso.categoria ")
    fun relatorio(): List<TopicoPorCategoriaDto>

}