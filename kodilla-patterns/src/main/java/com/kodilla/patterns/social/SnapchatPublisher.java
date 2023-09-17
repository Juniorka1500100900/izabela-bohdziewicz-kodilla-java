package com.kodilla.patterns.social;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share() {
        return "Published on Snapchat: This is my ugly face, enjoy!";
    }
}
