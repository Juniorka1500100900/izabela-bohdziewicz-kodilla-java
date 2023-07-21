package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private String username;
    private char sex;
    private LocalDate dateOfBirth;
    private int postsNum;

    public ForumUser(final int userID, final String username, final char sex, final LocalDate dateOfBirth, final int postsNum) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsNum = postsNum;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsNum() {
        return postsNum;
    }

    @Override
    public String toString() {
        return "ForumUser {" + "ID: " + userID + ", name: " + username + ", sex: " + sex + ", day of birth: "
                + dateOfBirth + ", with number of posts: "+ postsNum + "}";
    }
}

