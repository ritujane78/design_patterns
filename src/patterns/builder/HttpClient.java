package patterns.builder;

public class HttpClient {
  private String method;
  private String url;
  private String body;
  private String header;
  private String username;
  private String password;

  public HttpClient(String method, String url, String body, String header, String username, String password) {
    this.method = method;
    this.url = url;
    this.body = body;
    this.header = header;
    this.username = username;
    this.password = password;
  }

  public HttpClient(HttpClientBuilder httpClientBuilder) {
    this.method = httpClientBuilder.method;
    this.url = httpClientBuilder.url;
    this.body = httpClientBuilder.body;
    this.header = httpClientBuilder.header;
    this.username = httpClientBuilder.username;
    this.password = httpClientBuilder.password;
  }

  @Override
  public String toString() {
    return "HttpClient{" +
      "method='" + method + '\'' +
      ", url='" + url + '\'' +
      ", body='" + body + '\'' +
      ", header='" + header + '\'' +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      '}';
  }

  public static class HttpClientBuilder {
    private String method;
    private String url;
    private String body;
    private String header;
    private String username;
    private String password;

    public HttpClientBuilder method(String method) {
      this.method = method;
      return this;
    }
    public HttpClientBuilder url(String url) {
      this.url = url;
      return this;
    }
    public HttpClientBuilder body(String body) {
      this.body = body;
      return this;
    }
    public HttpClientBuilder header(String header) {
      this.header = header;
      return this;
    }
    public HttpClientBuilder secure(String username, String password) {
      this.username = username;
      this.password = password;
      return this;
    }
    public HttpClient build(){
      return new HttpClient(this);
    }
  }
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
