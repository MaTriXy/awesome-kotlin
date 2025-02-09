/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables


import java.time.OffsetDateTime

import jooq.main.Public
import jooq.main.keys.VIDEO_LIBRARY__VIDEO_LIBRARY_VIDEO_ID_FKEY
import jooq.main.keys.VIDEO_PKEY
import jooq.main.keys.VIDEO_SPEAKER__VIDEO_SPEAKER_VIDEO_ID_FKEY
import jooq.main.tables.Kotliner.KotlinerPath
import jooq.main.tables.Library.LibraryPath
import jooq.main.tables.VideoLibrary.VideoLibraryPath
import jooq.main.tables.VideoSpeaker.VideoSpeakerPath
import jooq.main.tables.records.VideoRecord

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Video(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, VideoRecord>?,
    parentPath: InverseForeignKey<out Record, VideoRecord>?,
    aliased: Table<VideoRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<VideoRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.video</code>
         */
        val VIDEO: Video = Video()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<VideoRecord> = VideoRecord::class.java

    /**
     * The column <code>public.video.id</code>.
     */
    val ID: TableField<VideoRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.video.title</code>.
     */
    val TITLE: TableField<VideoRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.video.description</code>.
     */
    val DESCRIPTION: TableField<VideoRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>public.video.language</code>.
     */
    val LANGUAGE: TableField<VideoRecord, String?> = createField(DSL.name("language"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.video.url</code>.
     */
    val URL: TableField<VideoRecord, String?> = createField(DSL.name("url"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.video.duration</code>.
     */
    val DURATION: TableField<VideoRecord, Int?> = createField(DSL.name("duration"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.video.thumbnail</code>.
     */
    val THUMBNAIL: TableField<VideoRecord, String?> = createField(DSL.name("thumbnail"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.video.published</code>.
     */
    val PUBLISHED: TableField<VideoRecord, OffsetDateTime?> = createField(DSL.name("published"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.video.created</code>.
     */
    val CREATED: TableField<VideoRecord, OffsetDateTime?> = createField(DSL.name("created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.video.updated</code>.
     */
    val UPDATED: TableField<VideoRecord, OffsetDateTime?> = createField(DSL.name("updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<VideoRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<VideoRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<VideoRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.video</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.video</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.video</code> table reference
     */
    constructor(): this(DSL.name("video"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, VideoRecord>?, parentPath: InverseForeignKey<out Record, VideoRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, VIDEO, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class VideoPath : Video, Path<VideoRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, VideoRecord>?, parentPath: InverseForeignKey<out Record, VideoRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<VideoRecord>): super(alias, aliased)
        override fun `as`(alias: String): VideoPath = VideoPath(DSL.name(alias), this)
        override fun `as`(alias: Name): VideoPath = VideoPath(alias, this)
        override fun `as`(alias: Table<*>): VideoPath = VideoPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<VideoRecord, Long?> = super.getIdentity() as Identity<VideoRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<VideoRecord> = VIDEO_PKEY

    private lateinit var _videoLibrary: VideoLibraryPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.video_library</code> table
     */
    fun videoLibrary(): VideoLibraryPath {
        if (!this::_videoLibrary.isInitialized)
            _videoLibrary = VideoLibraryPath(this, null, VIDEO_LIBRARY__VIDEO_LIBRARY_VIDEO_ID_FKEY.inverseKey)

        return _videoLibrary;
    }

    val videoLibrary: VideoLibraryPath
        get(): VideoLibraryPath = videoLibrary()

    private lateinit var _videoSpeaker: VideoSpeakerPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.video_speaker</code> table
     */
    fun videoSpeaker(): VideoSpeakerPath {
        if (!this::_videoSpeaker.isInitialized)
            _videoSpeaker = VideoSpeakerPath(this, null, VIDEO_SPEAKER__VIDEO_SPEAKER_VIDEO_ID_FKEY.inverseKey)

        return _videoSpeaker;
    }

    val videoSpeaker: VideoSpeakerPath
        get(): VideoSpeakerPath = videoSpeaker()

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.library</code> table
     */
    val library: LibraryPath
        get(): LibraryPath = videoLibrary().library()

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.kotliner</code> table
     */
    val kotliner: KotlinerPath
        get(): KotlinerPath = videoSpeaker().kotliner()
    override fun `as`(alias: String): Video = Video(DSL.name(alias), this)
    override fun `as`(alias: Name): Video = Video(alias, this)
    override fun `as`(alias: Table<*>): Video = Video(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Video = Video(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Video = Video(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Video = Video(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Video = Video(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Video = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Video = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Video = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Video = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Video = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Video = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Video = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Video = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Video = where(DSL.notExists(select))
}
