package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A2Step2Section3V5 extends AppCompatActivity {
    TextView btnExit;
    EditText input_main1;
    EditText input_main2;
    TextView btnCheck;
    TextView btnRestart;
    ImageView imgCorrect1;
    ImageView imgCorrect2;
    LinearLayout btnNext;
    LinearLayout btnPrevious;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step2_section3_v5);

        btnExit = (TextView) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V5.this, A2Step2.class);
                startActivity(intent);
                finish();
            }
        });

        btnNext = (LinearLayout) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V5.this, A2Step2Section3V6.class);
                startActivity(intent);
                finish();
            }
        });

        btnPrevious = (LinearLayout) findViewById(R.id.btnPrevious);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V5.this, A2Step2Section3V4.class);
                startActivity(intent);
                finish();
            }
        });

        imgCorrect1 = (ImageView) findViewById(R.id.imgCorrect1);
        imgCorrect2 = (ImageView) findViewById(R.id.imgCorrect2);

        input_main1 = (EditText) findViewById(R.id.text_input1);
        input_main2 = (EditText) findViewById(R.id.text_input2);

        btnCheck = (TextView) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input_main1.getText().toString().trim().equals("hit"))
                {
                    imgCorrect1.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                    imgCorrect1.setVisibility(View.VISIBLE);
                }
                else if (!(input_main1.getText().toString().trim().equals("")))
                {
                    imgCorrect1.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                    imgCorrect1.setVisibility(View.VISIBLE);
                }
                if (input_main2.getText().toString().trim().equals("won"))
                {
                    imgCorrect2.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                    imgCorrect2.setVisibility(View.VISIBLE);
                }
                else if (!(input_main2.getText().toString().trim().equals("")))
                {
                    imgCorrect2.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                    imgCorrect2.setVisibility(View.VISIBLE);
                }
            }
        });

        btnRestart = (TextView) findViewById(R.id.btnRestart);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCorrect1.setVisibility(View.INVISIBLE);
                imgCorrect2.setVisibility(View.INVISIBLE);
                input_main1.setText("");
                input_main2.setText("");
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
