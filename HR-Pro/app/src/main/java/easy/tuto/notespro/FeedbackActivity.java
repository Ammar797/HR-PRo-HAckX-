package easy.tuto.notespro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;





public class FeedbackActivity extends AppCompatActivity {


    ImageButton imgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_feedback);

        imgBtn = findViewById(R.id.save_note_btn);

        imgBtn.setOnClickListener( (v) -> end());

    }

    void end(){
        Toast.makeText(this, "Your Feedback is sent Successfully", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();
    }
}