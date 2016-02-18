#Retrofit Java Playground

A powerful api for consuming REST API in java developed by square.

##Creating the Interface
```java 
@GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
Call<StackOverFlowQuestions> loadQuestions (@Query("tagged") String tags);
```
The interface function has input tags, it will give output Call<Objects>.


