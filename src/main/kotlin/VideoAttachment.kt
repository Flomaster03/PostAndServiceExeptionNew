class VideoAttachment (
    override val type: String = "video",
    val video: Video
) : Attachment {

    class Video(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val description: String,
        val duration: Int,
        val imageCover: Array<ImageCover>,
        val firstFrame: Array<FirstFrame>,
        val date: Int,
        val addingDate: Int,
        val views: Int,
        val localViews: Int,
        val comments: Int,
        val player: String,
        val platform: String,
        val canAdd: Boolean,
        val isPrivate: Boolean,
        val accessKey: String,
        val processing: Boolean,
        val isFavorite: Boolean,
        val canComment: Boolean,
        val canEdit: Boolean,
        val canLike: Boolean,
        val canRepost: Boolean,
        val canSubscribe: Boolean,
        val canAddToFaves: Boolean,
        val canAttachLink: Boolean,
        val width: Int,
        val height: Int,
        val userId: Int,
        val converting: Boolean,
        val added: Boolean,
        val isSubscribe: Boolean,
        val repeat: Boolean,
        val type: String,
        val balance: Int,
        val liveStatus: String,
        val live: Boolean,
        val upcoming: Boolean,
        val spectators: Int,
        val likes: Likes,
        val reposts: Reposts
    ) {
        data class ImageCover(
            val url: String,
            val width: Int,
            val height: Int,
            val withPadding: Boolean
        )

        data class FirstFrame(
            val url: String,
            val width: Int,
            val height: Int
        )

        data class Likes(
            val count: Int,
            val userLikes: Boolean
        )

        data class Reposts(
            val count: Int,
            val wallCount: Int,
            val mailCount: Int,
            val userReposted: Boolean
        )
    }
}