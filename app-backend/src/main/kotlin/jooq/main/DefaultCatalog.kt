/*
 * This file is generated by jOOQ.
 */
package jooq.main


import kotlin.collections.List

import org.jooq.Constants
import org.jooq.Schema
import org.jooq.impl.CatalogImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DefaultCatalog : CatalogImpl("") {
    companion object {

        /**
         * The reference instance of <code>DEFAULT_CATALOG</code>
         */
        public val DEFAULT_CATALOG: DefaultCatalog = DefaultCatalog()
    }

    /**
     * The schema <code>public</code>.
     */
    val PUBLIC: Public get(): Public = Public.PUBLIC

    override fun getSchemas(): List<Schema> = listOf(
        Public.PUBLIC
    )

    /**
     * A reference to the 3.19 minor release of the code generator. If this
     * doesn't compile, it's because the runtime library uses an older minor
     * release, namely: 3.19. You can turn off the generation of this reference
     * by specifying /configuration/generator/generate/jooqVersionReference
     */
    private val REQUIRE_RUNTIME_JOOQ_VERSION = Constants.VERSION_3_19
}
