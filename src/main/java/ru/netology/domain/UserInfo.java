package ru.netology.domain;

public class UserInfo {
    private int userId;
    private String userName;
    private String userPicUrl;
    private boolean registeredUser;
    private boolean canHidePost;
    private boolean canHideAllAuthorPosts;
    private boolean canRepost;
    private boolean canLikePost;
    private boolean canAddToFavorites;
    private boolean canComment;
    private boolean canLikeComment;
    private boolean canAddImageToComment;
    private boolean canAddAudioToComment;
    private boolean canAddVideoToComment;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canPin;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPicUrl() {
        return userPicUrl;
    }

    public void setUserPicUrl(String userPicUrl) {
        this.userPicUrl = userPicUrl;
    }

    public boolean getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser= registeredUser;
    }

    public boolean getCanHidePost() {
        return canHidePost;
    }

    public void setCanHidePost(boolean canHidePost) {
        this.canHidePost= canHidePost;
    }

    public boolean getCanHideAllAuthorPosts() {
        return canHideAllAuthorPosts;
    }

    public void setCanHideAllAuthorPosts(boolean canHideAllAuthorPosts) {
        this.canHideAllAuthorPosts= canHideAllAuthorPosts;
    }

    public boolean getCanRepost() {
        return canRepost;
}

    public void setCanReposts(boolean canRepost) {
        this.canRepost= canRepost;
    }

    public boolean getCanLikePost() {
        return canLikePost;
    }

    public void setCanLikePost(boolean canLikePost) {
        this.canLikePost= canLikePost;
    }

    public boolean getCanLikeComment() {
        return canLikeComment;
    }

    public void setCanLikeComment(boolean canLikeComment) {
        this.canLikeComment= canLikeComment;
    }

    public boolean getCanAddToFavorites() {
        return canAddToFavorites;
    }

    public void setCanAddToFavorites(boolean canAddToFavorites) {
        this.canAddToFavorites = canAddToFavorites;
    }

    public boolean getCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean getCanAddImageToComment() {
        return canAddImageToComment;
    }

    public void setCanAddImageToComment(boolean canAddImageToComment) {
        this.canAddImageToComment = canAddImageToComment;
    }

    public boolean getCanAddAudioToComment() {
        return canAddAudioToComment;
    }

    public void setCanAddAudioToComment(boolean canAddAudioToComment) {
        this.canAddAudioToComment = canAddAudioToComment;
    }

    public boolean getCanAddVideoToComment() {
        return canAddVideoToComment;
    }

    public void setCanAddVideoToComment(boolean canAddVideoToComment) {
        this.canAddVideoToComment = canAddVideoToComment;
    }

    public boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean getCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }
}
