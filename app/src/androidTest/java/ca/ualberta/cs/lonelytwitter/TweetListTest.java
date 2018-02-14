package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;


public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
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


}
