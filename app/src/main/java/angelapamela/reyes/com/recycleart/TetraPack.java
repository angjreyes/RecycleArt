package angelapamela.reyes.com.recycleart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Vector;

public class TetraPack extends AppCompatActivity  implements View.OnClickListener {
    RecyclerView recyclerView;
    Vector<YoutubeVideos> youtubeVideos = new Vector<YoutubeVideos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tetra_pack);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/pABXiZO9FAI\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ULTpNYXCPGI\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Q3gMtdferak\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8Hg1tqIwIfI\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wROO-XB5JYw\" frameborder=\"0\" allowfullscreen></iframe>") );





        ImageButton btnb2 = findViewById(R.id.btnb2);
        ImageButton btnh2 = findViewById(R.id.btnh2);

        btnb2.setOnClickListener(this);
        btnh2.setOnClickListener(this);

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);



    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnb2:
                Intent intent1 = new Intent(this, Tutorials.class);
                startActivity(intent1);
                break;

            case R.id.btnh2:
                Intent intent2 = new Intent(this, MainMenu.class);
                startActivity(intent2);
                break;


        }
    }

}