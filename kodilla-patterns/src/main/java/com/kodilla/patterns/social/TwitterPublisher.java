package com.kodilla.patterns.social;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Published on Twitter: I love politics and big boobs.";
    }
}
