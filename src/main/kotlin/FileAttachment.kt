class FileAttachment (
    override val type: String = "file",
    val file: File
) : Attachment {

    data class File(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val size: Int,
        val ext: String,
        val url: String,
        val date: Int,
        val type: Int,
        val preview: Preview,
    ) {
        data class Preview(
            val photo: PhotoAttachment.Photo.Sizes,
            val graffiti: GraffitiObject,
            val audioMessage: AudioMessage

        ) {
            data class GraffitiObject(
                val url: String,
                val width: Int,
                val height: Int
            )

            data class AudioMessage(
                val duration: Int,
                val waveform: Array<Int>,
                val linkOgg: String,
                val linkMp3: String
            )
        }
    }
}