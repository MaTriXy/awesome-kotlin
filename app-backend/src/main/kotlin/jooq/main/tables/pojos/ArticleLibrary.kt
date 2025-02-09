/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class ArticleLibrary(
    var articleId: Long? = null,
    var libraryId: Long? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: ArticleLibrary = other as ArticleLibrary
        if (this.articleId == null) {
            if (o.articleId != null)
                return false
        }
        else if (this.articleId != o.articleId)
            return false
        if (this.libraryId == null) {
            if (o.libraryId != null)
                return false
        }
        else if (this.libraryId != o.libraryId)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.articleId == null) 0 else this.articleId.hashCode())
        result = prime * result + (if (this.libraryId == null) 0 else this.libraryId.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("ArticleLibrary (")

        sb.append(articleId)
        sb.append(", ").append(libraryId)

        sb.append(")")
        return sb.toString()
    }
}
