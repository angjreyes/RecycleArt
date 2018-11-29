package angelapamela.reyes.com.recycleart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tutorials extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorials);


        Button btncup = findViewById(R.id.btncup);
        Button btntetra = findViewById(R.id.btntetra);
        Button btnpaper = findViewById(R.id.btnpaper);
        Button btnstraw = findViewById(R.id.btnstraw);
        ImageButton btnh5 = findViewById(R.id.btnh5);



        btncup.setOnClickListener(this);
        btntetra.setOnClickListener(this);
        btnpaper.setOnClickListener(this);
        btnstraw.setOnClickListener(this);
        btnh5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btncup:
                Intent intent1 = new Intent(this, BottleCup.class);
                startActivity(intent1);
                break;
            case R.id.btntetra:
                Intent intent2 = new Intent(this, TetraPack.class);
                startActivity(intent2);
                break;
            case R.id.btnpaper:
                Intent intent3 = new Intent(this, OldPaper.class);
                startActivity(intent3);
                break;
            case R.id.btnstraw:
                Intent intent4 = new Intent(this, Straw.class);
                startActivity(intent4);
                break;
            case R.id.btnh5:
                Intent intent5 = new Intent(this, MainMenu.class);
                startActivity(intent5);
                break;
            //home button and back button

        }
    }
}
