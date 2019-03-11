package structural.proxy;

public class Main {
    public static void main(String[] args) {
        SocialMediaService service = (SocialMediaService) SecurityProxy.newInstance(new SocialMediaServiceImpl());

        System.out.println(service.getTitleName("hgfd"));
    }
}
