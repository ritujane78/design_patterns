package patterns.builder;

public class Test {
  static void main(String[] args) {
    HttpClient httpClient = new HttpClient("GET","testurl","{}", null, null, null );
    System.out.println(httpClient);

    HttpClient httpClient2 = new HttpClient.HttpClientBuilder()
      .method("GET")
      .url("testUrl")
      .body("{}")
      .secure("root", "root")
      .build();
    System.out.println(httpClient2);
  }
}
