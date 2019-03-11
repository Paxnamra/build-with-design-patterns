package structural.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class SocialMediaServiceImpl implements SocialMediaService {

    private static final String TWITTER_CONSUMER_KEY = "SOME_VALUES";
    private static final String TWITTER_SECRET_KEY = "SOME_VALUES";
    private static final String TWITTER_ACCESS_TOKEN = "SOME_VALUES";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "SOME_VALUES";

    @Override
    public String getTitleName(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder sb = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult queryResult;

            do {
                queryResult = twitter.search(query);
                List<Status> tweets = queryResult.getTweets();
                for(Status tweet : tweets) {
                    sb.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    sb.append("\n");
            }
        } while ((query = queryResult.nextQuery()) != null);

    }catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return sb.toString();
    }

    @Override
    public void postToTimeline(String screenName, String messsge) {
        //should not be allowed

    }
}
