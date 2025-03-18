package hello.core.lifecycle;

public class NetworkClient {

    private String url;

    public NetworkClient(String url) {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
