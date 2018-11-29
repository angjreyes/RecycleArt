package angelapamela.reyes.com.recycleart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class game extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        ImageButton btnh1 = findViewById(R.id.btnh1);


        btnh1.setOnClickListener(this);


        }@Override
        public void onClick(View v) {
        switch (v.getId()) {

        case R.id.btnh1:
        Intent intent1 = new Intent(this, MainMenu.class);
        startActivity(intent1);
        break;
        //home button and back button

        }
        }
        }
