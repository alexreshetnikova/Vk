package domain;

public class Post {
    private boolean registeredUser;
    private String groupId;
    private String groupPicUrl;
    private int date;
    private String text;
    private String imageUrl;
    private boolean canHidePost;
    private boolean canHideGroup;
    private boolean canComment;
    private boolean canRepost;
    private boolean canLike;
    private boolean canAddToFavorites;
    private int numberOfViews;
    private CommentsInfo commentsInfo;
}
