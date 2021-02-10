package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A2Step3 extends AppCompatActivity {

    TextView btnSection1;
    TextView btnSection2;
    TextView btnSection3;
    TextView btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step3);

        btnSection1 = (TextView) findViewById(R.id.btnSection1);
        btnSection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step3.this, A2Step3Section1.class);
                startActivity(intent);
                finish();
            }
        });

        btnSection2 = (TextView) findViewById(R.id.btnSection2);
        btnSection2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step3.this, A2Step3Section2V1.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception error_sect2) {};
            }
        });

        btnSection3 = (TextView) findViewById(R.id.btnSection3);
        btnSection3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step3.this, A2Step3Section3V1.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception error_sect3) {};
            }
        });

        btnExit = (TextView) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step3.this, A2Steps.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
