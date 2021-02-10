package app.student.hellostudent;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class A1Step2Section4Question1 extends AppCompatActivity {
    LinearLayout btn_finish;
    EditText input_main;
    ImageView img_check;
    TextView text_check;
    LinearLayout btn_check;
    LinearLayout btn_next;
    TextView btn_restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_step2_section4_question1);

        btn_finish = (LinearLayout) findViewById(R.id.btnFinish);
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent = new Intent(A1Step2Section4Question1.this, A1Step2Sections.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {}
            }
        });



        input_main = (EditText) findViewById(R.id.text_input);
        input_main.setText("");
        input_main.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                restart();
            }
        });

        btn_next = (LinearLayout) findViewById(R.id.btnNext);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step2Section4Question1.this, A1Step2Section4Question2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_next) {}
            }
        });

        btn_check = (LinearLayout) findViewById(R.id.btnCheck);
        text_check = (TextView) findViewById(R.id.textCheck);
        img_check = (ImageView) findViewById(R.id.imgCheck);
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input_main.getText().toString().trim().equals(""))
                {
                    text_check.setVisibility(View.INVISIBLE);
                    img_check.setVisibility(View.VISIBLE);
                    text_check.setText("");
                    btn_check.setEnabled(false);
                    closeKeyboard();
                    if (input_main.getText().toString().trim().equals("ran"))
                    {
                        img_check.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                        btn_check.setBackground(getResources().getDrawable(R.drawable.button_green));
                    }
                    else
                    {
                        img_check.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                        btn_check.setBackground(getResources().getDrawable(R.drawable.button_red));
                    }
                }
                else
                {
                    restart();
                }
            }
        });

        btn_restart = (TextView) findViewById(R.id.btnRestart);
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
                input_main.setText("");
                closeKeyboard();
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

    private void closeKeyboard()
    {
        View v = this.getCurrentFocus();
        if (v != null)
        {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

        }
    }

    private void restart()
    {
        text_check.setVisibility(View.VISIBLE);
        img_check.setVisibility(View.INVISIBLE);
        text_check.setText("Check");
        btn_check.setBackground(getResources().getDrawable(R.drawable.button_blue));
        btn_check.setEnabled(true);
    }
}




