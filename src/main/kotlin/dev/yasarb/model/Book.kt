package dev.yasarb.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "books")
data class Book(
    @Id
    @GeneratedValue
    val id: Long = 0,
    var title: String = "",
    var pageCount: Int = 0,
    var ISBN: String = "",
) {
    override fun toString(): String {
        return this.title;
    }
}
