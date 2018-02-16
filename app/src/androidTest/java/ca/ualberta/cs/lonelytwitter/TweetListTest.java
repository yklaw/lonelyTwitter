package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import java.io.IOException;


public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        try {
            tweets.add(tweet);
        } catch (IllegalArgumentException e) {
            assertTrue(Boolean.FALSE);
        }
    }

    public void testHasTweet() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        assertTrue(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }


    public void testDeleteTweet() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet t1 = new NormalTweet("1");
        Tweet t2 = new NormalTweet("2");
        Tweet t3 = new NormalTweet("3");
        tweets.add(t1);
        tweets.add(t2);
        tweets.add(t3);
        assertEquals(tweets, tweets.getTweets());
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        tweets.add(tweet);
        assertEquals(1, tweets.getCount());
    }
}
