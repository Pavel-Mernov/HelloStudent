package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A2Steps extends AppCompatActivity {
    TextView btn_step1;
    TextView btn_step2;
    TextView btn_step3;
    TextView btn_change_level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_steps);

        btn_step1 = (TextView) findViewById(R.id.btnStep1);
        btn_step1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Steps.this, A2Step1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_step1) {}
            }
        });

        btn_step2 = (TextView) findViewById(R.id.btnStep2);
        btn_step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Steps.this, A2Step2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_step1) {}
            }
        });

        btn_step3 = (TextView) findViewById(R.id.btnStep3);
        btn_step3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Steps.this, A2Step3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_step1) {}
            }
        });

        btn_change_level = (TextView) findViewById(R.id.btnChangeLevel);
        btn_change_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Steps.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_change_level) {}
            }
        });
    }
}
