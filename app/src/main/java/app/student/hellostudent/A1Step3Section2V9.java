package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A1Step3Section2V9 extends AppCompatActivity {

    ImageView img_wrong1;
    ImageView img_wrong2;
    ImageView img_wrong3;
    ImageView img_correct;

    LinearLayout btn_next;
    LinearLayout btn_previous;

    TextView text_wrong1;
    TextView text_wrong2;
    TextView text_wrong3;
    TextView text_correct;

    TextView btn_exit;

    private void restart()
    {
        try {
            text_wrong1.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            text_wrong2.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            text_wrong3.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            text_correct.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            text_wrong1.setTextSize(32);
            text_wrong2.setTextSize(32);
            text_wrong3.setTextSize(32);
            text_correct.setTextSize(32);

            img_wrong1.setVisibility(View.INVISIBLE);
            img_wrong2.setVisibility(View.INVISIBLE);
            img_wrong3.setVisibility(View.INVISIBLE);
            img_correct.setVisibility(View.INVISIBLE);
        }
        catch (Exception e) {}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_step3_section2_v9);

        text_wrong1 = (TextView) findViewById(R.id.textWrong1);
        img_wrong1 = (ImageView) findViewById(R.id.imgWrong1);
        text_wrong2 = (TextView) findViewById(R.id.textWrong2);
        img_wrong2 = (ImageView) findViewById(R.id.imgWrong2);
        text_wrong3 = (TextView) findViewById(R.id.textWrong3);
        img_wrong3 = (ImageView) findViewById(R.id.imgWrong3);
        text_correct = (TextView) findViewById(R.id.textCorrect);
        img_correct = (ImageView) findViewById(R.id.imgCorrect);

        try {
            text_wrong1.setTextSize(32);
            text_wrong2.setTextSize(32);
            text_wrong3.setTextSize(32);
            text_correct.setTextSize(32);
        } catch (Exception e) {}


        text_wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    text_wrong1.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    text_wrong1.setTextSize(33);
                    img_wrong1.setVisibility(View.VISIBLE);
                }  catch (Exception error_wrong1) {}

            }
        });


        text_wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    text_wrong2.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    text_wrong2.setTextSize(33);
                    img_wrong2.setVisibility(View.VISIBLE);
                } catch (Exception error_wrong2) {}
            }
        });


        text_wrong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    text_wrong3.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    text_wrong3.setTextSize(33);
                    img_wrong3.setVisibility(View.VISIBLE);
                } catch (Exception error_wrong3) {}
            }
        });


        text_correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    text_correct.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                    text_correct.setTextSize(36);
                    img_correct.setVisibility(View.VISIBLE);
                } catch (Exception error_correct) {}
            }
        });

        btn_next = (LinearLayout) findViewById(R.id.btnNext);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Section2V9.this, A1Step3Section2V10.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_next_a1_step2_sect2) {}
            }
        });

        btn_previous = (LinearLayout) findViewById(R.id.btnPrevious);
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Section2V9.this, A1Step3Section2V8.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_next_a1_step2_sect2) {}
            }
        });

        btn_exit = (TextView) findViewById(R.id.btnExit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Section2V9.this, A1Step3Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_exit_a1_step2_sect2) {}
            }
        });
    }
}
