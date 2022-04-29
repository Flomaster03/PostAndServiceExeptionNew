class WallService {

    private var postsArray = emptyArray<Post>()
    private var commentsArray = emptyArray<Post.Comment>()

    fun add(post: Post): Post {
        val changeId = if (postsArray.size != 0) postsArray.last().id + 1 else 1
        val postNext = post.copy(id = changeId)
        postsArray += postNext

        return postsArray.last()
    }

    fun update(post: Post): Boolean {
        var change = false
        for ((index, value) in postsArray.withIndex()) {
            if (value.id != post.id) {
                change = false
                continue
            } else {
                postsArray[index] = value.copy(
                    ownerId = value.ownerId,
                    date = value.date
                )
                change = true
                break
            }
        }
        return change
    }

    fun createComment(comment: Post.Comment) {



        for (post in postsArray) {
            if (post.id == comment.postId) {
                commentsArray += comment
                print(commentsArray.last().postId)
                return
            }
        }
        throw PostNotFoundExeption("Этот комментарий к несуществующему посту")
    }
}

