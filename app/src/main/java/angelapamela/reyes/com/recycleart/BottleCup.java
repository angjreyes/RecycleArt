package angelapamela.reyes.com.recycleart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Vector;


public class BottleCup extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recyclerView;
    Vector<YoutubeVideos> youtubeVideos = new Vector<YoutubeVideos>();


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.bottle_cups);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8DJSpKPYZQQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zFwiqaHrLZo\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/X_koYlXa8nA\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XLgjPkoKa-A\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wiaYtBIkswM\" frameborder=\"0\" allowfullscreen></iframe>") );




        ImageButton btnb1 = findViewById(R.id.btnb1);
            ImageButton btnh1 = findViewById(R.id.btnh1);

            btnb1.setOnClickListener(this);
            btnh1.setOnClickListener(this);


        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);



    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnb1:
                Intent intent1 = new Intent(this, Tutorials.class);
                startActivity(intent1);
                break;

            case R.id.btnh1:
                Intent intent2 = new Intent(this, MainMenu.class);
                startActivity(intent2);
                break;


        }
    }

    }
