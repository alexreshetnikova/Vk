package ru.netology.domain;

public class Post {
    private int postId;
    private int pageId;
    private int authorId;
    private int authorPicUrl;
    private int date;
    private Geo geo;
    private String text;
    private String imageUrl;
    private boolean friendsOnly;
    private boolean isPinned;
    private boolean isPostponed;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int numberOfViews;
    private int numberOfLikes;
    private int numberOfReposts;
    private int numberOfComments;
    private UserInfo userInfo;
    private CommentsInfo commentsInfo;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getAuthorPicUrl() {
        return authorPicUrl;
    }

    public void setAuthorPicUrl(int authorPicUrl) {
        this.authorPicUrl = authorPicUrl;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(boolean isPinned) {
        this.isPinned = isPinned;
    }

    public boolean getIsPostponed() {
        return isPostponed;
    }

    public void setIsPostponed(boolean isPostponed) {
        this.isPostponed = isPostponed;
    }

    public boolean getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfReposts() {
        return numberOfReposts;
    }

    public void setNumberOfReposts(int numberOfReposts) {
        this.numberOfReposts = numberOfReposts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
