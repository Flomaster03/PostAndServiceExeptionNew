class GraffitiAttachment(
    override val type: String = "graffiti",
    val graffiti: Graffiti
) : Attachment {

    class Graffiti(
        val id: Int,
        val albumId: Int,
        val url: String,
        val width: Int,
        val height: Int
    )
}