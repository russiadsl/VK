package ru.netology.domain;

public class Post {

    private int id;
    private int ownerID;
    private int to_id;
    private int from_id;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly; //я бы ставил тип boolean;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int singerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPrinted;
    private boolean isFavourite;
    private Donut donut;
    private int postponedId;

    //getter + setter;

}
