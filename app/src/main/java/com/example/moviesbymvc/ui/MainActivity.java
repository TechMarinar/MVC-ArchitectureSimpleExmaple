package com.example.moviesbymvc.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviesbymvc.R;
import com.example.moviesbymvc.pojo.MoviesModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.textView)
    TextView textV;
    @BindView(R.id.button)
    Button movieBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        movieBtn.setOnClickListener(this);
    }

    private MoviesModel getMovieFromDB() {

        return new MoviesModel(1, "Divergent", "Awesome Series movie ," +
                " also it contains Insurgent , and Iligent");
    }

    public void getMovie(View view) {

        String movieDetails = "movie Name : " + getMovieFromDB().getTitle() +
                "\n" + "Descriptions : " + "\n" +
                getMovieFromDB().getDescriptions();
//display it
        textV.setText(movieDetails);
    }

    @Override
    public void onClick(View v) {
        getMovie(v);
    }
}