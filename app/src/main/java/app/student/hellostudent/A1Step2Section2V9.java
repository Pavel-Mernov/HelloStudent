package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A1Step2Section2V9 extends AppCompatActivity {

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
        setContentView(R.layout.activity_a1_step2_section2_v9);

        text_wrong1 = (TextView) findViewById(R.id.wrong1_text_a1_step2_sect2);
        img_wrong1 = (ImageView) findViewById(R.id.wrong1_img_a1_step2_sect2);
        text_wrong2 = (TextView) findViewById(R.id.wrong2_text_a1_step2_sect2);
        img_wrong2 = (ImageView) findViewById(R.id.wrong2_img_a1_step2_sect2);
        text_wrong3 = (TextView) findViewById(R.id.wrong3_text_a1_step2_sect2);
        img_wrong3 = (ImageView) findViewById(R.id.wrong3_img_a1_step2_sect2);
        text_correct = (TextView) findViewById(R.id.correct_text_a1_step2_sect2);
        img_correct = (ImageView) findViewById(R.id.correct_img_a1_step2_sect2);

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

        btn_next = (LinearLayout) findViewById(R.id.btn_next_a1_step2_section2);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step2Section2V9.this, A1Step2Section2V10.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_next_a1_step2_sect2) {}
            }
        });

        btn_previous = (LinearLayout) findViewById(R.id.btn_previous_a1_step2_section2);
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step2Section2V9.this, A1Step2Section2V8.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_next_a1_step2_sect2) {}
            }
        });

        btn_exit = (TextView) findViewById(R.id.btn_exit_a1_step2_section2);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step2Section2V9.this, A1Step2Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_exit_a1_step2_sect2) {}
            }
        });
    }
}
