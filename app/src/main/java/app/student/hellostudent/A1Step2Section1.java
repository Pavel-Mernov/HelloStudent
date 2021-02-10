package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A1Step2Section1 extends AppCompatActivity {
    ConstraintLayout btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_step2_section1);
        btn_exit = (ConstraintLayout) findViewById(R.id.btn_exit_a1_step2_section1);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step2Section1.this, A1Step2Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception exit_error) {}
            }
        });
    }
}