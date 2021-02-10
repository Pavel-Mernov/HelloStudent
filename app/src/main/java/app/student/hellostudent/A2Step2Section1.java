package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A2Step2Section1 extends AppCompatActivity {
    TextView btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step1_section2);

        btnExit = (TextView) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step2Section1.this, A2Step2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_exit) {}
            }
        });
    }
}
