package dev.yasarb.repository

import dev.yasarb.model.Book
import io.micronaut.context.annotation.Executable
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import javax.persistence.EntityManager

@Repository
interface BookRepository : CrudRepository<Book, Long> {

    @Executable
    fun findByTitleOrderByTitle(title: String): List<Book>

    @Executable
    fun findPageCountInRangeOrderByTitle(minPageCount: Int, maxPageCount: Int)
}