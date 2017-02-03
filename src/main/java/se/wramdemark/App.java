package se.wramdemark;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

public class App {
  public static void main(String[] args) {
    try {
      HttpResponse response = Request.Get(args[0]).addHeader("Authorization", args[1]).connectTimeout(1000)
          .socketTimeout(1000).execute().returnResponse();
      System.out.println(response.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
