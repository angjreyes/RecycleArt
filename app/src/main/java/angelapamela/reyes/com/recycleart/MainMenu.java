package angelapamela.reyes.com.recycleart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenu extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button btntutorials = findViewById(R.id.btntutorials);
        Button btnfacts = findViewById(R.id.btnfacts);
        Button btngame = findViewById(R.id.btngame);

        btntutorials.setOnClickListener(this);
        btnfacts.setOnClickListener(this);
        btngame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btntutorials:
                Intent intent3 = new Intent(this, Tutorials.class);
                startActivity(intent3);
                break;
            case R.id.btnfacts:
                Intent intent1 = new Intent(this, facts.class);//wala pang class and xml for facts
                startActivity(intent1);
                break;
            case R.id.btngame:
                Intent intent2 = new Intent(this, game.class);//wala pang class and xml for game
                startActivity(intent2);
                break;
        }
    }
}

