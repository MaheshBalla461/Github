package practice.com.github.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import practice.com.github.R;
import practice.com.github.models.Repo;
import practice.com.github.models.interfaces.GithubService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofit.create(GithubService.class).getRepos("MaheshBalla461").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(@NonNull Call<List<Repo>> call, @NonNull Response<List<Repo>> response) {

            }

            @Override
            public void onFailure(@NonNull Call<List<Repo>> call, @NonNull Throwable t) {

            }
        });
    }
}
