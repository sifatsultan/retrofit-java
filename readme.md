#Retrofit Java Playground

A powerful api for consuming REST API in java developed by square.

##Creating the Interface
```java 
@GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
Call<StackOverFlowQuestions> loadQuestions (@Query("tagged") String tags);
```
The interface function has input tags, it will give output Call<Objects>.

##Path Parameters
```java
@GET("group/{id}/users")
Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);
```

Example use of the function

```java
StackOverFlowAPI stackOverFlowAPI = retrofit.create(StackOverFlowAPI.class);

Call<List<User>> call = stackOverFlowAPI.groupList(3,"Android");
```

