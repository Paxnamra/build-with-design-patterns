package structural.proxy;


//dev.twitter.com
public class SocialMediaServiceStub implements SocialMediaService {

    @Override
    public String getTitleName(String screenName) {
        return "My timeline";
    }

    @Override
    public void postToTimeline(String screenName, String messsge) {
    }
}
