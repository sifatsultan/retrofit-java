package com.sifat;

import retrofit.*;

public class Main{

    public Main() {
    }

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.stackexchange.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        StackOverFlowAPI stackOverFlowAPI = retrofit.create(StackOverFlowAPI.class);
        Call<StackOverFlowQuestions> call = stackOverFlowAPI.loadQuestions("android");
        call.enqueue(new Callback<StackOverFlowQuestions>() {
            @Override
            public void onResponse(Response<StackOverFlowQuestions> response, Retrofit retrofit) {
                System.out.println("hello");
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });
    }

}