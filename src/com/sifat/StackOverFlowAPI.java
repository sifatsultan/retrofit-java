package com.sifat;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Sifat on 2/10/2016.
 */
public interface StackOverFlowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<StackOverFlowQuestions> loadQuestions(@Query("tagged") String tags);
}
