package com.example.seedcommando_7.parsing;

import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONStringer;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PostExample {

	String jsonData;
public String fetchData() {
//String queryUrl="http://sikam.slingapp.in:8080/sling/device/getpaymenthistory";
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\"userName\":\"div.yansh\"}");
    OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder()
	  .url("http://sikam.slingapp.in:8080/sling/device/getpaymenthistory")
	  .post(body)
	  .addHeader("content-type", "application/json")
	  .addHeader("cache-control", "no-cache")
	  
	  
	  .build();
    Call call = client.newCall(request);
    call.enqueue(new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {
          System.out.println("fail");
        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
           System.out.println(response.body().string());
          
           	
        }
    });

    return jsonData; //Even this is null when I check via Debugger
}
  public static void main(String[] args) throws IOException {
    PostExample example = new PostExample();
    example.fetchData();
  }
}