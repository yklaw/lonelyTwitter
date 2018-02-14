package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {

        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {

        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {

        return tweets.get(index);
    }

    public void delete(Tweet tweet) {

        tweets.remove(tweet);
    }


    public void addTweet(Tweet tweet) {

    }

    public Tweet getTweets(){

    }

    public boolean hasTweets() {

    }

    public void getCount() {

    }



}
