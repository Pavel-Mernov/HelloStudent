package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A2Step2Section3V13 extends AppCompatActivity {
    TextView btnExit;
    EditText input_main;
    TextView btnCheck;
    TextView btnRestart;
    ImageView imgCorrect;
    LinearLayout btnNext;
    LinearLayout btnPrevious;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step2_section3_v13);

        btnExit = (TextView) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V13.this, A2Step2.class);
                startActivity(intent);
                finish();
            }
        });

        btnNext = (LinearLayout) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V13.this, A2Step2Section3V14.class);
                startActivity(intent);
                finish();
            }
        });

        btnPrevious = (LinearLayout) findViewById(R.id.btnPrevious);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V13.this, A2Step2Section3V12.class);
                startActivity(intent);
                finish();
            }
        });

        imgCorrect = (ImageView) findViewById(R.id.imgCorrect);

        input_main = (EditText) findViewById(R.id.text_input);

        btnCheck = (TextView) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input_main.getText().toString().trim().equals("sent"))
                {
                    imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                    imgCorrect.setVisibility(View.VISIBLE);
                }
                else if (!(input_main.getText().toString().trim().equals("")))
                {
                    imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                    imgCorrect.setVisibility(View.VISIBLE);
                }
            }
        });

        btnRestart = (TextView) findViewById(R.id.btnRestart);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCorrect.setVisibility(View.INVISIBLE);
                input_main.setText("");
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    protected void onStart() {super.onStart(); }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() { super.onPause(); }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
