package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


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


    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        if(tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public TweetList getTweets(){
        Collections.sort(tweets, new Comparator<Tweet>() {
            @Override
            public int compare(Tweet tweet, Tweet t1) {
                return tweet.getDate().compareTo(t1.getDate());
            }
        });

        return this;
    }

    public boolean hasTweets(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public int getCount() {
        return tweets.size();
    }



}
