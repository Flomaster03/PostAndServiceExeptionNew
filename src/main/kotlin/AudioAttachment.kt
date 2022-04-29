class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment {

    data class Audio(
        val id: Int,
        val ownerId: Int,
        val artist: String,
        val duration: String,
        val url: String,
        val lyricsId: Int,
        val albumId: Int,
        val genreId: Int,
        val date: Int,
        val noSearch: Boolean,
        val isHQ: Boolean
    )
}