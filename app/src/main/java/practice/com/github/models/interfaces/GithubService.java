package practice.com.github.models.interfaces;

import java.util.List;

import practice.com.github.models.Api;
import practice.com.github.models.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {
    @GET("/users/{username}/repos")
    Call<List<Repo>> getRepos(@Path("username") String userName);

}
