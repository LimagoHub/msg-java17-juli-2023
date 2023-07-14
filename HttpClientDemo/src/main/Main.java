package main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
public class Main {



    public static void main(String[] args) throws Exception{

        var request = HttpRequest
                .newBuilder()
                .uri(URI.create("http://localhost:8080/demo/add/3/4"))
                .GET()
                .build();

        var client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        var response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.statusCode());
        int result = response.body().transform(s->Integer.valueOf(s));


        System.out.println(result);
        System.out.println("Fertig!");
    }
}



