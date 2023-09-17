package com.kodilla.patterns.social;

public class FacebookPublisher implements SocialPublisher{

    @Override
    public String share() {
        return "Published on Facebook: Hello, have a great day!";
    }
}
