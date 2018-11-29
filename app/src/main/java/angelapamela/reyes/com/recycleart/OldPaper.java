package angelapamela.reyes.com.recycleart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Vector;

public class OldPaper extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recyclerView;
    Vector<YoutubeVideos> youtubeVideos = new Vector<YoutubeVideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.old_paper);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/oJ-80H-FJR4\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yh27LHYWwtk\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wFVaoWADwdk\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jMG40809rws\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/EXPxjUPVD_E\" frameborder=\"0\" allowfullscreen></iframe>") );





        ImageButton btnb4 = findViewById(R.id.btnb4);
        ImageButton btnh4 = findViewById(R.id.btnh4);

        btnb4.setOnClickListener(this);
        btnh4.setOnClickListener(this);

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);



    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnb4:
                Intent intent1 = new Intent(this, Tutorials.class);
                startActivity(intent1);
                break;

            case R.id.btnh4:
                Intent intent2 = new Intent(this, MainMenu.class);
                startActivity(intent2);
                break;


        }
    }

}