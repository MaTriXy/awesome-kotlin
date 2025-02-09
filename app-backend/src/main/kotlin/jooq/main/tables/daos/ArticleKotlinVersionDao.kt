/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables.daos


import jooq.main.tables.ArticleKotlinVersion
import jooq.main.tables.records.ArticleKotlinVersionRecord

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ArticleKotlinVersionDao(configuration: Configuration?) : DAOImpl<ArticleKotlinVersionRecord, jooq.main.tables.pojos.ArticleKotlinVersion, Record2<Long?, Long?>>(ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION, jooq.main.tables.pojos.ArticleKotlinVersion::class.java, configuration) {

    /**
     * Create a new ArticleKotlinVersionDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.main.tables.pojos.ArticleKotlinVersion): Record2<Long?, Long?> = compositeKeyRecord(o.articleId, o.kotlinVersionId)

    /**
     * Fetch records that have <code>article_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfArticleId(lowerInclusive: Long?, upperInclusive: Long?): List<jooq.main.tables.pojos.ArticleKotlinVersion> = fetchRange(ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION.ARTICLE_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>article_id IN (values)</code>
     */
    fun fetchByArticleId(vararg values: Long): List<jooq.main.tables.pojos.ArticleKotlinVersion> = fetch(ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION.ARTICLE_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>kotlin_version_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    fun fetchRangeOfKotlinVersionId(lowerInclusive: Long?, upperInclusive: Long?): List<jooq.main.tables.pojos.ArticleKotlinVersion> = fetchRange(ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION.KOTLIN_VERSION_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>kotlin_version_id IN (values)</code>
     */
    fun fetchByKotlinVersionId(vararg values: Long): List<jooq.main.tables.pojos.ArticleKotlinVersion> = fetch(ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION.KOTLIN_VERSION_ID, *values.toTypedArray())
}
