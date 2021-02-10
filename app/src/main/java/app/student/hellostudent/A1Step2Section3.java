package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.student.hellostudent.Dialog1;
import app.student.hellostudent.Dialog2;
import app.student.hellostudent.Dialog3;

public class A1Step2Section3 extends AppCompatActivity {

    LinearLayout btnExit;
    LinearLayout btnRestart;
    LinearLayout btnCheck;
    TextView textCheck;



    TextView mad_text;
    ImageView mad_img;

    TextView made_text;
    ImageView made_img;

    TextView maid_text;
    ImageView maid_img;

    TextView eat_text;
    ImageView eat_img;

    TextView slap_text;
    ImageView slap_img;

    TextView called_text;
    ImageView called_img;

    TextView could_text;
    ImageView could_img;

    TextView turn_text;
    ImageView turn_img;

    TextView slept_text;
    ImageView slept_img;

    TextView aim_text;
    ImageView aim_img;

    TextView jump_text;
    ImageView jump_img;

    TextView come_text;
    ImageView come_img;

    TextView swam_text;
    ImageView swam_img;

    TextView wait_text;
    ImageView wait_img;

    TextView sit_text;
    ImageView sit_img;

    TextView play_text;
    ImageView play_img;

    TextView make_text;
    ImageView make_img;

    TextView write_text;
    ImageView write_img;

    TextView drop_text;
    ImageView drop_img;

    TextView drove_text;
    ImageView drove_img;

    TextView had_text;
    ImageView had_img;

    TextView clean_text;
    ImageView clean_img;

    TextView visited_text;
    ImageView visited_img;

    TextView walk_text;
    ImageView walk_img;

    TextView wrote_text;
    ImageView wrote_img;

    TextView went_text;
    ImageView went_img;

    TextView watched_text;
    ImageView watched_img;

    TextView rode_text;
    ImageView rode_img;

    TextView end_text;
    ImageView end_img;

    TextView ate_text;
    ImageView ate_img;

    TextView listen_text;
    ImageView listen_img;

    TextView read_text;
    ImageView read_img;

    TextView tidied_text;
    ImageView tidied_img;

    TextView drink_text;
    ImageView drink_img;

    TextView link_text;
    ImageView link_img;

    TextView phone_text;
    ImageView phone_img;

    TextView ran_text;
    ImageView ran_img;

    TextView help_text;
    ImageView help_img;

    TextView cook_text;
    ImageView cook_img;

    TextView drive_text;
    ImageView drive_img;

    TextView want_text;
    ImageView want_img;

    TextView tried_text;
    ImageView tried_img;

    TextView talk_text;
    ImageView talk_img;

    TextView meet_text;
    ImageView meet_img;

    TextView shop_text;
    ImageView shop_img;

    TextView cry_text;
    ImageView cry_img;

    TextView swim_text;
    ImageView swim_img;

    TextView look_text;
    ImageView look_img;

    TextView took_text;
    ImageView took_img;

    TextView study_text;
    ImageView study_img;

    TextView sleep_text;
    ImageView sleep_img;

    TextView travel_text;
    ImageView travel_img;

    TextView be_text;
    ImageView be_img;

    TextView hate_text;
    ImageView hate_img;

    TextView sat_text;
    ImageView sat_img;

    TextView brush_text;
    ImageView brush_img;

    TextView run_text;
    ImageView run_img;
    TextView what_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_step2_section3);



        btnExit = (LinearLayout) findViewById(R.id.btnExit_a1_step2_sect3);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step2Section3.this, A1Step2Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_exit) {}
            }
        });

        mad_text = (TextView) findViewById(R.id.mad_text_a1_step2_sect3);
        mad_img = (ImageView) findViewById(R.id.mad_img_a1_step2_correct);
        mad_text.setTextSize(25);
        mad_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                mad_img.setVisibility(View.INVISIBLE);
                if (mad_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    mad_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    mad_text.setTextSize(30);
                }
                else
                {
                    mad_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    mad_text.setTextSize(25);
                }
            }
        });

        made_text = (TextView) findViewById(R.id.made_text_a1_step2_sect3);
        made_text.setTextSize(25);
        made_img = (ImageView) findViewById(R.id.made_img_a1_step2_correct);
        made_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                made_img.setVisibility(View.INVISIBLE);
                if (made_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    made_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    made_text.setTextSize(30);
                }
                else
                {
                    made_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    made_text.setTextSize(25);
                }
            }
        });

        maid_text = (TextView) findViewById(R.id.maid_text_a1_step2_sect3);
        maid_text.setTextSize(25);
        maid_img = (ImageView) findViewById(R.id.maid_img_a1_step2_correct);
        maid_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                maid_img.setVisibility(View.INVISIBLE);
                if (maid_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    maid_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    maid_text.setTextSize(30);
                }
                else
                {
                    maid_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    maid_text.setTextSize(25);
                }
            }
        });

        eat_text = (TextView) findViewById(R.id.eat_text_a1_step2_sect3);
        eat_text.setTextSize(25);
        eat_img = (ImageView) findViewById(R.id.eat_img_a1_step2_correct);
        eat_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                eat_img.setVisibility(View.INVISIBLE);
                if (eat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    eat_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    eat_text.setTextSize(30);
                }
                else
                {
                    eat_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    eat_text.setTextSize(25);
                }
            }
        });

        slap_text = (TextView) findViewById(R.id.slap_text_a1_step2_sect3);
        slap_text.setTextSize(25);
        slap_img = (ImageView) findViewById(R.id.slap_img_a1_step2_correct);
        slap_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                slap_img.setVisibility(View.INVISIBLE);
                if (slap_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    slap_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    slap_text.setTextSize(30);
                }
                else
                {
                    slap_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    slap_text.setTextSize(25);
                }
            }
        });

        called_text = (TextView) findViewById(R.id.called_text_a1_step2_sect3);
        called_text.setTextSize(25);
        called_img = (ImageView) findViewById(R.id.called_img_a1_step2_correct);
        called_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                called_img.setVisibility(View.INVISIBLE);
                if (called_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    called_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    called_text.setTextSize(30);
                }
                else
                {
                    called_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    called_text.setTextSize(25);
                }
            }
        });

        could_text  = (TextView) findViewById(R.id.could_text_a1_step2_sect3);
        could_text.setTextSize(25);
        could_img = (ImageView) findViewById(R.id.could_img_a1_step2_correct);
        could_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                could_img.setVisibility(View.INVISIBLE);
                if (could_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    could_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    could_text.setTextSize(30);
                }
                else
                {
                    could_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    could_text.setTextSize(25);
                }
            }
        });

        turn_text = (TextView) findViewById(R.id.turn_text_a1_step2_sect3);
        turn_text.setTextSize(25);
        turn_img = (ImageView) findViewById(R.id.turn_img_a1_step2_correct);
        turn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                turn_img.setVisibility(View.INVISIBLE);
                if (turn_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    turn_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    turn_text.setTextSize(30);
                }
                else
                {
                    turn_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    turn_text.setTextSize(25);
                }
            }
        });

        slept_text  = (TextView) findViewById(R.id.slept_text_a1_step2_sect3);
        slept_text.setTextSize(25);
        slept_img = (ImageView) findViewById(R.id.slept_img_a1_step2_correct);
        slept_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                slept_img.setVisibility(View.INVISIBLE);
                if (slept_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    slept_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    slept_text.setTextSize(30);
                }
                else
                {
                    slept_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    slept_text.setTextSize(25);
                }
            }
        });

        aim_text = (TextView) findViewById(R.id.aim_text_a1_step2_sect3);
        aim_text.setTextSize(25);
        aim_img = (ImageView) findViewById(R.id.aim_img_a1_step2_correct);
        aim_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                aim_img.setVisibility(View.INVISIBLE);
                if (aim_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    aim_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    aim_text.setTextSize(30);
                }
                else
                {
                    aim_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    aim_text.setTextSize(25);
                }
            }
        });

        jump_text = (TextView) findViewById(R.id.jump_text_a1_step2_sect3);
        jump_text.setTextSize(25);
        jump_img = (ImageView) findViewById(R.id.jump_img_a1_step2_correct);
        jump_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                jump_img.setVisibility(View.INVISIBLE);
                if (jump_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    jump_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    jump_text.setTextSize(30);
                }
                else
                {
                    jump_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    jump_text.setTextSize(25);
                }
            }
        });

        come_text = (TextView) findViewById(R.id.come_text_a1_step2_sect3);
        come_text.setTextSize(25);
        come_img = (ImageView) findViewById(R.id.come_img_a1_step2_correct);
        come_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                come_img.setVisibility(View.INVISIBLE);
                if (come_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    come_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    come_text.setTextSize(30);
                }
                else
                {
                    come_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    come_text.setTextSize(25);
                }
            }
        });

        swam_text = (TextView) findViewById(R.id.swam_text_a1_step2_sect3);
        swam_text.setTextSize(25);
        swam_img = (ImageView) findViewById(R.id.swam_img_a1_step2_correct);
        swam_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                swam_img.setVisibility(View.INVISIBLE);
                if (swam_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    swam_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    swam_text.setTextSize(30);
                }
                else
                {
                    swam_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    swam_text.setTextSize(25);
                }
            }
        });

        wait_text = (TextView) findViewById(R.id.wait_text_a1_step2_sect3);
        wait_text.setTextSize(25);
        wait_img = (ImageView) findViewById(R.id.wait_img_a1_step2_correct);
        wait_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                wait_img.setVisibility(View.INVISIBLE);
                if (wait_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    wait_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    wait_text.setTextSize(30);
                }
                else
                {
                    wait_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    wait_text.setTextSize(25);
                }
            }
        });

        sit_text  = (TextView) findViewById(R.id.sit_text_a1_step2_sect3);
        sit_text.setTextSize(25);
        sit_img = (ImageView) findViewById(R.id.sit_img_a1_step2_correct);
        sit_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                sit_img.setVisibility(View.INVISIBLE);
                if (sit_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    sit_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    sit_text.setTextSize(30);
                }
                else
                {
                    sit_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    sit_text.setTextSize(25);
                }
            }
        });

        play_text = (TextView) findViewById(R.id.play_text_a1_step2_sect3);
        play_text.setTextSize(25);
        play_img = (ImageView) findViewById(R.id.play_img_a1_step2_correct);
        play_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                play_img.setVisibility(View.INVISIBLE);
                if (play_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    play_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    play_text.setTextSize(30);
                }
                else
                {
                    play_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    play_text.setTextSize(25);
                }
            }
        });

        make_text = (TextView) findViewById(R.id.make_text_a1_step2_sect3);
        make_text.setTextSize(25);
        make_img = (ImageView) findViewById(R.id.make_img_a1_step2_correct);
        make_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                make_img.setVisibility(View.INVISIBLE);
                if (make_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    make_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    make_text.setTextSize(30);
                }
                else
                {
                    make_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    make_text.setTextSize(25);
                }
            }
        });

        write_text  = (TextView) findViewById(R.id.write_text_a1_step2_sect3);
        write_text.setTextSize(25);
        write_img = (ImageView) findViewById(R.id.write_img_a1_step2_correct);
        write_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                write_img.setVisibility(View.INVISIBLE);
                if (write_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    write_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    write_text.setTextSize(30);
                }
                else
                {
                    write_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    write_text.setTextSize(25);
                }
            }
        });

        drop_text  = (TextView) findViewById(R.id.drop_text_a1_step2_sect3);
        drop_text.setTextSize(25);
        drop_img = (ImageView) findViewById(R.id.drop_img_a1_step2_correct);
        drop_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                drop_img.setVisibility(View.INVISIBLE);
                if (drop_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    drop_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    drop_text.setTextSize(30);
                }
                else
                {
                    drop_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    drop_text.setTextSize(25);
                }
            }
        });

        drove_text  = (TextView) findViewById(R.id.drove_text_a1_step2_sect3);
        drove_text.setTextSize(25);
        drove_img = (ImageView) findViewById(R.id.drove_img_a1_step2_correct);
        drove_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                drove_img.setVisibility(View.INVISIBLE);
                if (drove_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    drove_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    drove_text.setTextSize(30);
                }
                else
                {
                    drove_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    drove_text.setTextSize(25);
                }
            }
        });

        had_text = (TextView) findViewById(R.id.had_text_a1_step2_sect3);
        had_text.setTextSize(25);
        had_img = (ImageView) findViewById(R.id.had_img_a1_step2_correct);
        had_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                had_img.setVisibility(View.INVISIBLE);
                if (had_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    had_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    had_text.setTextSize(30);
                }
                else
                {
                    had_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    had_text.setTextSize(25);
                }
            }
        });

        clean_text = (TextView) findViewById(R.id.clean_text_a1_step2_sect3);
        clean_text.setTextSize(25);
        clean_img = (ImageView) findViewById(R.id.clean_img_a1_step2_correct);
        clean_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                clean_img.setVisibility(View.INVISIBLE);
                if (clean_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    clean_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    clean_text.setTextSize(30);
                }
                else
                {
                    clean_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    clean_text.setTextSize(25);
                }
            }
        });

        walk_text = (TextView) findViewById(R.id.walk_text_a1_step2_sect3);
        walk_text.setTextSize(25);
        walk_img = (ImageView) findViewById(R.id.walk_img_a1_step2_correct);
        walk_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                walk_img.setVisibility(View.INVISIBLE);
                if (walk_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    walk_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    walk_text.setTextSize(30);
                }
                else
                {
                    walk_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    walk_text.setTextSize(25);
                }
            }
        });

        wrote_text = (TextView) findViewById(R.id.wrote_text_a1_step2_sect3);
        wrote_text.setTextSize(25);
        wrote_img = (ImageView) findViewById(R.id.wrote_img_a1_step2_correct);
        wrote_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                wrote_img.setVisibility(View.INVISIBLE);
                if (wrote_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    wrote_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    wrote_text.setTextSize(30);
                }
                else
                {
                    wrote_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    wrote_text.setTextSize(25);
                }
            }
        });

        visited_text = (TextView) findViewById(R.id.visited_text_a1_step2_sect3);
        visited_text.setTextSize(25);
        visited_img = (ImageView) findViewById(R.id.visited_img_a1_step2_correct);
        visited_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                visited_img.setVisibility(View.INVISIBLE);
                if (visited_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    visited_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    visited_text.setTextSize(30);
                }
                else
                {
                    visited_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    visited_text.setTextSize(25);
                }
            }
        });

        went_text = (TextView) findViewById(R.id.went_text_a1_step2_sect3);
        went_text.setTextSize(25);
        went_img = (ImageView) findViewById(R.id.went_img_a1_step2_correct);
        went_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                went_img.setVisibility(View.INVISIBLE);
                if (went_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    went_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    went_text.setTextSize(30);
                }
                else
                {
                    went_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    went_text.setTextSize(25);
                }
            }
        });

        watched_text = (TextView) findViewById(R.id.watched_text_a1_step2_sect3);
        watched_text.setTextSize(25);
        watched_img = (ImageView) findViewById(R.id.watched_img_a1_step2_correct);
        watched_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                watched_img.setVisibility(View.INVISIBLE);
                if (watched_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    watched_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    watched_text.setTextSize(30);
                }
                else
                {
                    watched_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    watched_text.setTextSize(25);
                }
            }
        });

        rode_text = (TextView) findViewById(R.id.rode_text_a1_step2_sect3);
        rode_text.setTextSize(25);
        rode_img = (ImageView) findViewById(R.id.rode_img_a1_step2_correct);
        rode_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                rode_img.setVisibility(View.INVISIBLE);
                if (rode_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    rode_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    rode_text.setTextSize(30);
                }
                else
                {
                    rode_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    rode_text.setTextSize(25);
                }
            }
        });

        end_text = (TextView) findViewById(R.id.end_text_a1_step2_sect3);
        end_text.setTextSize(25);
        end_img = (ImageView) findViewById(R.id.end_img_a1_step2_correct);
        end_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                end_img.setVisibility(View.INVISIBLE);
                if (end_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    end_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    end_text.setTextSize(30);
                }
                else
                {
                    end_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    end_text.setTextSize(25);
                }
            }
        });

        ate_text  = (TextView) findViewById(R.id.ate_text_a1_step2_sect3);
        ate_text.setTextSize(25);
        ate_img = (ImageView) findViewById(R.id.ate_img_a1_step2_correct);
        ate_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                ate_img.setVisibility(View.INVISIBLE);
                if (ate_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    ate_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    ate_text.setTextSize(30);
                }
                else
                {
                    ate_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    ate_text.setTextSize(25);
                }
            }
        });

        listen_text  = (TextView) findViewById(R.id.listen_text_a1_step2_sect3);
        listen_text.setTextSize(25);
        listen_img = (ImageView) findViewById(R.id.listen_img_a1_step2_correct);
        listen_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                listen_img.setVisibility(View.INVISIBLE);
                if (listen_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    listen_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    listen_text.setTextSize(30);
                }
                else
                {
                    listen_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    listen_text.setTextSize(25);
                }
            }
        });

        read_text = (TextView) findViewById(R.id.read_text_a1_step2_sect3);
        read_text.setTextSize(25);
        read_img = (ImageView) findViewById(R.id.read_img_a1_step2_correct);
        read_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                read_img.setVisibility(View.INVISIBLE);
                if (read_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    read_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    read_text.setTextSize(30);
                }
                else
                {
                    read_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    read_text.setTextSize(25);
                }
            }
        });

        tidied_text  = (TextView) findViewById(R.id.tidied_text_a1_step2_sect3);
        tidied_text.setTextSize(25);
        tidied_img = (ImageView) findViewById(R.id.tidied_img_a1_step2_correct);
        tidied_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                tidied_img.setVisibility(View.INVISIBLE);
                if (tidied_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    tidied_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    tidied_text.setTextSize(30);
                }
                else
                {
                    tidied_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    tidied_text.setTextSize(25);
                }
            }
        });

        drink_text = (TextView) findViewById(R.id.drink_text_a1_step2_sect3);
        drink_text.setTextSize(25);
        drink_img = (ImageView) findViewById(R.id.drink_img_a1_step2_correct);
        drink_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                drink_img.setVisibility(View.INVISIBLE);
                if (drink_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    drink_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    drink_text.setTextSize(30);
                }
                else
                {
                    drink_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    drink_text.setTextSize(25);
                }
            }
        });
        link_text = (TextView) findViewById(R.id.link_text_a1_step2_sect3);
        link_text.setTextSize(25);
        link_img = (ImageView) findViewById(R.id.link_img_a1_step2_correct);
        link_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                link_img.setVisibility(View.INVISIBLE);
                if (link_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    link_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    link_text.setTextSize(30);
                }
                else
                {
                    link_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    link_text.setTextSize(25);
                }
            }
        });

        phone_text = (TextView) findViewById(R.id.phone_text_a1_step2_sect3);
        phone_text.setTextSize(25);
        phone_img = (ImageView) findViewById(R.id.phone_img_a1_step2_correct);
        phone_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                phone_img.setVisibility(View.INVISIBLE);
                if (phone_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    phone_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    phone_text.setTextSize(30);
                }
                else
                {
                    phone_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    phone_text.setTextSize(25);
                }
            }
        });

        ran_text = (TextView) findViewById(R.id.ran_text_a1_step2_sect3);
        ran_text.setTextSize(25);
        ran_img = (ImageView) findViewById(R.id.ran_img_a1_step2_correct);
        ran_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                ran_img.setVisibility(View.INVISIBLE);
                if (ran_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    ran_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    ran_text.setTextSize(30);
                }
                else
                {
                    ran_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    ran_text.setTextSize(25);
                }
            }
        });

        help_text = (TextView) findViewById(R.id.help_text_a1_step2_sect3);
        help_text.setTextSize(25);
        help_img = (ImageView) findViewById(R.id.help_img_a1_step2_correct);
        help_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                help_img.setVisibility(View.INVISIBLE);
                if (help_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    help_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    help_text.setTextSize(30);
                }
                else
                {
                    help_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    help_text.setTextSize(25);
                }
            }
        });

        cook_text = (TextView) findViewById(R.id.cook_text_a1_step2_sect3);
        cook_text.setTextSize(25);
        cook_img = (ImageView) findViewById(R.id.cook_img_a1_step2_correct);
        cook_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                cook_img.setVisibility(View.INVISIBLE);
                if (cook_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    cook_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    cook_text.setTextSize(30);
                }
                else
                {
                    cook_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    cook_text.setTextSize(25);
                }
            }
        });

        drive_text = (TextView) findViewById(R.id.drive_text_a1_step2_sect3);
        drive_text.setTextSize(25);
        drive_img = (ImageView) findViewById(R.id.drive_img_a1_step2_correct);
        drive_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                drive_img.setVisibility(View.INVISIBLE);
                if (drive_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    drive_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    drive_text.setTextSize(30);
                }
                else
                {
                    drive_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    drive_text.setTextSize(25);
                }
            }
        });

        want_text = (TextView) findViewById(R.id.want_text_a1_step2_sect3);
        want_text.setTextSize(25);
        want_img = (ImageView) findViewById(R.id.want_img_a1_step2_correct);
        want_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                want_img.setVisibility(View.INVISIBLE);
                if (want_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    want_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    want_text.setTextSize(30);
                }
                else
                {
                    want_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    want_text.setTextSize(25);
                }
            }
        });

        tried_text = (TextView) findViewById(R.id.tried_text_a1_step2_sect3);
        tried_text.setTextSize(25);
        tried_img = (ImageView) findViewById(R.id.tried_img_a1_step2_correct);
        tried_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                tried_img.setVisibility(View.INVISIBLE);
                if (tried_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    tried_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    tried_text.setTextSize(30);
                }
                else
                {
                    tried_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    tried_text.setTextSize(25);
                }
            }
        });

        talk_text = (TextView) findViewById(R.id.talk_text_a1_step2_sect3);
        talk_text.setTextSize(25);
        talk_img = (ImageView) findViewById(R.id.talk_img_a1_step2_correct);
        talk_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                talk_img.setVisibility(View.INVISIBLE);
                if (talk_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    talk_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    talk_text.setTextSize(30);
                }
                else
                {
                    talk_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    talk_text.setTextSize(25);
                }
            }
        });

        meet_text = (TextView) findViewById(R.id.meet_text_a1_step2_sect3);
        meet_text.setTextSize(25);
        meet_img = (ImageView) findViewById(R.id.meet_img_a1_step2_correct);
        meet_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                meet_img.setVisibility(View.INVISIBLE);
                if (meet_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    meet_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    meet_text.setTextSize(30);
                }
                else
                {
                    meet_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    meet_text.setTextSize(25);
                }
            }
        });

        shop_text = (TextView) findViewById(R.id.shop_text_a1_step2_sect3);
        shop_text.setTextSize(25);
        shop_img = (ImageView) findViewById(R.id.shop_img_a1_step2_correct);
        shop_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                shop_img.setVisibility(View.INVISIBLE);
                if (shop_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    shop_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    shop_text.setTextSize(30);
                }
                else
                {
                    shop_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    shop_text.setTextSize(25);
                }
            }
        });

        swim_text = (TextView) findViewById(R.id.swim_text_a1_step2_sect3);
        swim_text.setTextSize(25);
        swim_img = (ImageView) findViewById(R.id.swim_img_a1_step2_correct);
        swim_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                swim_img.setVisibility(View.INVISIBLE);
                if (swim_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    swim_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    swim_text.setTextSize(30);
                }
                else
                {
                    swim_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    swim_text.setTextSize(25);
                }
            }
        });

        cry_text  = (TextView) findViewById(R.id.cry_text_a1_step2_sect3);
        cry_text.setTextSize(25);
        cry_img = (ImageView) findViewById(R.id.cry_img_a1_step2_correct);
        cry_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                cry_img.setVisibility(View.INVISIBLE);
                if (cry_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    cry_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    cry_text.setTextSize(30);
                }
                else
                {
                    cry_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    cry_text.setTextSize(25);
                }
            }
        });

        look_text = (TextView) findViewById(R.id.look_text_a1_step2_sect3);
        look_text.setTextSize(25);
        look_img = (ImageView) findViewById(R.id.look_img_a1_step2_correct);
        look_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                look_img.setVisibility(View.INVISIBLE);
                if (look_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    look_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    look_text.setTextSize(30);
                }
                else
                {
                    look_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    look_text.setTextSize(25);
                }
            }
        });

        took_text = (TextView) findViewById(R.id.took_text_a1_step2_sect3);
        took_text.setTextSize(25);
        took_img = (ImageView) findViewById(R.id.took_img_a1_step2_correct);
        took_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                took_img.setVisibility(View.INVISIBLE);
                if (took_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    took_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    took_text.setTextSize(30);
                }
                else
                {
                    took_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    took_text.setTextSize(25);
                }
            }
        });

        study_text = (TextView) findViewById(R.id.study_text_a1_step2_sect3);
        study_text.setTextSize(25);
        study_img = (ImageView) findViewById(R.id.study_img_a1_step2_correct);
        study_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                study_img.setVisibility(View.INVISIBLE);
                if (study_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    study_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    study_text.setTextSize(30);
                }
                else
                {
                    study_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    study_text.setTextSize(25);
                }
            }
        });

        sleep_text = (TextView) findViewById(R.id.sleep_text_a1_step2_sect3);
        sleep_text.setTextSize(25);
        sleep_img = (ImageView) findViewById(R.id.sleep_img_a1_step2_correct);
        sleep_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                sleep_img.setVisibility(View.INVISIBLE);
                if (sleep_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    sleep_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    sleep_text.setTextSize(30);
                }
                else
                {
                    sleep_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    sleep_text.setTextSize(25);
                }
            }
        });

        travel_text  = (TextView) findViewById(R.id.travel_text_a1_step2_sect3);
        travel_text.setTextSize(25);
        travel_img = (ImageView) findViewById(R.id.travel_img_a1_step2_correct);
        travel_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                travel_img.setVisibility(View.INVISIBLE);
                if (travel_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    travel_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    travel_text.setTextSize(30);
                }
                else
                {
                    travel_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    travel_text.setTextSize(25);
                }
            }
        });

        be_text  = (TextView) findViewById(R.id.be_text_a1_step2_sect3);
        be_text.setTextSize(25);
        be_img = (ImageView) findViewById(R.id.be_img_a1_step2_correct);
        be_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                be_img.setVisibility(View.INVISIBLE);
                if (be_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    be_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    be_text.setTextSize(30);
                }
                else
                {
                    be_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    be_text.setTextSize(25);
                }
            }
        });

        hate_text = (TextView) findViewById(R.id.hate_text_a1_step2_sect3);
        hate_text.setTextSize(25);
        hate_img = (ImageView) findViewById(R.id.hate_img_a1_step2_correct);
        hate_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                hate_img.setVisibility(View.INVISIBLE);
                if (hate_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    hate_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    hate_text.setTextSize(30);
                }
                else
                {
                    hate_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    hate_text.setTextSize(25);
                }
            }
        });

        sat_text  = (TextView) findViewById(R.id.sat_text_a1_step2_sect3);
        sat_text.setTextSize(25);
        sat_img = (ImageView) findViewById(R.id.sat_img_a1_step2_correct);
        sat_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                sat_img.setVisibility(View.INVISIBLE);
                if (sat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    sat_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    sat_text.setTextSize(30);
                }
                else
                {
                    sat_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    sat_text.setTextSize(25);
                }
            }
        });

        brush_text = (TextView) findViewById(R.id.brush_text_a1_step2_sect3);
        brush_text.setTextSize(25);
        brush_img = (ImageView) findViewById(R.id.brush_img_a1_step2_correct);
        brush_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                brush_img.setVisibility(View.INVISIBLE);
                if (brush_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    brush_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    brush_text.setTextSize(30);
                }
                else
                {
                    brush_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    brush_text.setTextSize(25);
                }
            }
        });

        run_text = (TextView) findViewById(R.id.run_text_a1_step2_sect3);
        run_text.setTextSize(25);
        run_img = (ImageView) findViewById(R.id.run_img_a1_step2_correct);
        run_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                run_img.setVisibility(View.INVISIBLE);
                if (run_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    run_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    run_text.setTextSize(30);
                }
                else
                {
                    run_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    run_text.setTextSize(25);
                }
            }
        });

        btnRestart = (LinearLayout) findViewById(R.id.btnRestart);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }
        });


        btnCheck = (LinearLayout) findViewById(R.id.btnCheck);
        textCheck = (TextView) findViewById(R.id.textViewCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (mad_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            made_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            maid_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            eat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            slap_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            called_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            could_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            turn_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            slept_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            aim_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            come_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            swam_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            sit_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            play_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            make_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            write_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            drop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            drove_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            had_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            clean_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            walk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            wrote_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            visited_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            went_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            watched_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            rode_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            end_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            ate_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            listen_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            read_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            tidied_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            drink_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            link_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            phone_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            ran_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            cook_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            drive_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            talk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            meet_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            shop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            cry_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            swim_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            took_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            sleep_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            travel_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            be_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            hate_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            sat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            brush_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                            run_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                    ) {
                        restart();
                    } else {
                        if (mad_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                made_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                maid_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                eat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                slap_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                called_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                could_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                turn_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                slept_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                aim_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                come_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                swam_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                wait_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                sit_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                play_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                make_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                write_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                drop_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                drove_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                had_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                clean_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                walk_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                wrote_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                visited_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                went_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                watched_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                rode_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                end_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                ate_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                listen_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                read_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                tidied_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                drink_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                link_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                phone_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                ran_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                help_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                cook_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                drive_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                want_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                talk_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                meet_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                shop_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                cry_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                swim_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                look_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                took_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                study_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                sleep_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                travel_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                be_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                hate_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                sat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                brush_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                run_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                        ) {
                            btnCheck.setBackground(getResources().getDrawable(R.drawable.button_green));
                            textCheck.setText("Correct");
                            textCheck.setTextColor(getResources().getColor(R.color.colorButton));
                            btnCheck.setEnabled(false);
                        } else {
                            btnCheck.setBackground(getResources().getDrawable(R.drawable.button_red));
                            textCheck.setText("Wrong");
                            textCheck.setTextColor(getResources().getColor(R.color.colorButton));
                            btnCheck.setEnabled(false);
                            what_text.setVisibility(View.VISIBLE);
                            what_text.setEnabled(true);
                        }

                        if (mad_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            mad_img.setVisibility(View.VISIBLE);
                            mad_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            mad_img.setVisibility(View.INVISIBLE);
                        }

                        if (made_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            made_img.setVisibility(View.VISIBLE);
                            made_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            made_img.setVisibility(View.INVISIBLE);
                        }

                        if (maid_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            maid_img.setVisibility(View.VISIBLE);
                            maid_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            maid_img.setVisibility(View.INVISIBLE);
                        }

                        if (eat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            eat_img.setVisibility(View.VISIBLE);
                            eat_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            eat_img.setVisibility(View.INVISIBLE);
                        }

                        if (slap_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            slap_img.setVisibility(View.VISIBLE);
                            slap_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            slap_img.setVisibility(View.INVISIBLE);
                        }

                        if (called_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            called_img.setVisibility(View.VISIBLE);
                            called_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            called_img.setVisibility(View.INVISIBLE);
                        }

                        if (could_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            could_img.setVisibility(View.VISIBLE);
                            could_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            could_img.setVisibility(View.INVISIBLE);
                        }

                        if (turn_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            turn_img.setVisibility(View.VISIBLE);
                            turn_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            turn_img.setVisibility(View.INVISIBLE);
                        }

                        if (slept_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            slept_img.setVisibility(View.VISIBLE);
                            slept_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            slept_img.setVisibility(View.INVISIBLE);
                        }

                        if (aim_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            aim_img.setVisibility(View.VISIBLE);
                            aim_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            aim_img.setVisibility(View.INVISIBLE);
                        }

                        if (jump_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            jump_img.setVisibility(View.VISIBLE);
                            jump_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            jump_img.setVisibility(View.INVISIBLE);
                        }

                        if (come_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            come_img.setVisibility(View.VISIBLE);
                            come_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            come_img.setVisibility(View.INVISIBLE);
                        }

                        if (swam_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            swam_img.setVisibility(View.VISIBLE);
                            swam_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            swam_img.setVisibility(View.INVISIBLE);
                        }

                        if (wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            wait_img.setVisibility(View.VISIBLE);
                            wait_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            wait_img.setVisibility(View.INVISIBLE);
                        }

                        if (sit_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            sit_img.setVisibility(View.VISIBLE);
                            sit_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            sit_img.setVisibility(View.INVISIBLE);
                        }

                        if (play_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            play_img.setVisibility(View.VISIBLE);
                            play_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            play_img.setVisibility(View.INVISIBLE);
                        }

                        if (make_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            make_img.setVisibility(View.VISIBLE);
                            make_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            make_img.setVisibility(View.INVISIBLE);
                        }

                        if (write_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            write_img.setVisibility(View.VISIBLE);
                            write_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            write_img.setVisibility(View.INVISIBLE);
                        }

                        if (drop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            drop_img.setVisibility(View.VISIBLE);
                            drop_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            drop_img.setVisibility(View.INVISIBLE);
                        }

                        if (drove_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            drove_img.setVisibility(View.VISIBLE);
                            drove_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            drove_img.setVisibility(View.INVISIBLE);
                        }

                        if (had_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            had_img.setVisibility(View.VISIBLE);
                            had_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            had_img.setVisibility(View.INVISIBLE);
                        }

                        if (clean_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            clean_img.setVisibility(View.VISIBLE);
                            clean_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            clean_img.setVisibility(View.INVISIBLE);
                        }

                        if (walk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            walk_img.setVisibility(View.VISIBLE);
                            walk_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            walk_img.setVisibility(View.INVISIBLE);
                        }

                        if (wrote_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            wrote_img.setVisibility(View.VISIBLE);
                            wrote_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            wrote_img.setVisibility(View.INVISIBLE);
                        }

                        if (visited_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            visited_img.setVisibility(View.VISIBLE);
                            visited_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            visited_img.setVisibility(View.INVISIBLE);
                        }

                        if (went_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            went_img.setVisibility(View.VISIBLE);
                            went_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            went_img.setVisibility(View.INVISIBLE);
                        }

                        if (watched_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            watched_img.setVisibility(View.VISIBLE);
                            watched_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            watched_img.setVisibility(View.INVISIBLE);
                        }

                        if (rode_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            rode_img.setVisibility(View.VISIBLE);
                            rode_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            rode_img.setVisibility(View.INVISIBLE);
                        }

                        if (end_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            end_img.setVisibility(View.VISIBLE);
                            end_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            end_img.setVisibility(View.INVISIBLE);
                        }

                        if (ate_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            ate_img.setVisibility(View.VISIBLE);
                            ate_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            ate_img.setVisibility(View.INVISIBLE);
                        }

                        if (listen_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            listen_img.setVisibility(View.VISIBLE);
                            listen_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            listen_img.setVisibility(View.INVISIBLE);
                        }

                        if (read_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            read_img.setVisibility(View.VISIBLE);
                            read_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            read_img.setVisibility(View.INVISIBLE);
                        }

                        if (tidied_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            tidied_img.setVisibility(View.VISIBLE);
                            tidied_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            tidied_img.setVisibility(View.INVISIBLE);
                        }

                        if (drink_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            drink_img.setVisibility(View.VISIBLE);
                            drink_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            drink_img.setVisibility(View.INVISIBLE);
                        }

                        if (link_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            link_img.setVisibility(View.VISIBLE);
                            link_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            link_img.setVisibility(View.INVISIBLE);
                        }

                        if (phone_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            phone_img.setVisibility(View.VISIBLE);
                            phone_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            phone_img.setVisibility(View.INVISIBLE);
                        }

                        if (ran_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            ran_img.setVisibility(View.VISIBLE);
                            ran_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            ran_img.setVisibility(View.INVISIBLE);
                        }

                        if (help_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            help_img.setVisibility(View.VISIBLE);
                            help_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            help_img.setVisibility(View.INVISIBLE);
                        }

                        if (cook_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            cook_img.setVisibility(View.VISIBLE);
                            cook_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            mad_img.setVisibility(View.INVISIBLE);
                        }

                        if (drive_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            drive_img.setVisibility(View.VISIBLE);
                            drive_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            drive_img.setVisibility(View.INVISIBLE);
                        }

                        if (want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            want_img.setVisibility(View.VISIBLE);
                            want_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            want_img.setVisibility(View.INVISIBLE);
                        }

                        if (tried_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            tried_img.setVisibility(View.VISIBLE);
                            tried_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            tried_img.setVisibility(View.INVISIBLE);
                        }

                        if (talk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            talk_img.setVisibility(View.VISIBLE);
                            talk_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            talk_img.setVisibility(View.INVISIBLE);
                        }

                        if (meet_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            meet_img.setVisibility(View.VISIBLE);
                            meet_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            meet_img.setVisibility(View.INVISIBLE);
                        }

                        if (shop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            shop_img.setVisibility(View.VISIBLE);
                            shop_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            shop_img.setVisibility(View.INVISIBLE);
                        }

                        if (cry_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            cry_img.setVisibility(View.VISIBLE);
                            cry_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            cry_img.setVisibility(View.INVISIBLE);
                        }

                        if (swim_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            swim_img.setVisibility(View.VISIBLE);
                            swim_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            swim_img.setVisibility(View.INVISIBLE);
                        }

                        if (look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            look_img.setVisibility(View.VISIBLE);
                            look_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            look_img.setVisibility(View.INVISIBLE);
                        }

                        if (took_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            took_img.setVisibility(View.VISIBLE);
                            took_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            took_img.setVisibility(View.INVISIBLE);
                        }

                        if (study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            study_img.setVisibility(View.VISIBLE);
                            study_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            study_img.setVisibility(View.INVISIBLE);
                        }

                        if (sleep_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            sleep_img.setVisibility(View.VISIBLE);
                            sleep_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            sleep_img.setVisibility(View.INVISIBLE);
                        }

                        if (travel_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            travel_img.setVisibility(View.VISIBLE);
                            travel_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            travel_img.setVisibility(View.INVISIBLE);
                        }

                        if (be_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            be_img.setVisibility(View.VISIBLE);
                            be_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            be_img.setVisibility(View.INVISIBLE);
                        }

                        if (hate_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            hate_img.setVisibility(View.VISIBLE);
                            hate_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            hate_img.setVisibility(View.INVISIBLE);
                        }

                        if (sat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            sat_img.setVisibility(View.VISIBLE);
                            sat_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            sat_img.setVisibility(View.INVISIBLE);
                        }

                        if (brush_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            brush_img.setVisibility(View.VISIBLE);
                            brush_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            brush_img.setVisibility(View.INVISIBLE);
                        }

                        if (run_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            run_img.setVisibility(View.VISIBLE);
                            run_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            run_img.setVisibility(View.INVISIBLE);
                        }
                    }
                }
        });

        what_text = (TextView) findViewById(R.id.textViewWhat);
        what_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (
                        (
                                mad_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        made_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        eat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        could_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        slept_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        come_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        swam_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        sit_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        make_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        write_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        drove_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        had_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        wrote_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        went_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        rode_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        ate_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        read_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        drink_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        ran_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        drive_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        meet_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        swim_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        took_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        sleep_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        be_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        sat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        run_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                        ) && (
                                mad_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        maid_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        slap_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        called_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        turn_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        aim_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        play_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        drop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        clean_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        walk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        visited_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        watched_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        end_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        listen_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        tidied_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        link_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        phone_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        help_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        cook_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        talk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        shop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        cry_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        travel_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        hate_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        brush_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                        )
                ) {
                    Dialog1 dialog1 = new Dialog1();
                    dialog1.show(getSupportFragmentManager(), "");
                }
                else if (
                        mad_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                made_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                eat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                could_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                slept_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                come_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                swam_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                sit_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                make_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                write_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                drove_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                had_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                wrote_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                went_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                rode_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                ate_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                read_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                drink_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                ran_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                drive_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                meet_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                swim_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                took_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                sleep_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                be_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                sat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                run_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                ) {
                    Dialog2 dialog2 = new Dialog2();
                    dialog2.show(getSupportFragmentManager(), "");
                }
                else if (
                        mad_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                maid_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                slap_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                called_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                turn_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                aim_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                play_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                drop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                clean_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                walk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                visited_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                watched_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                end_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                listen_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                tidied_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                link_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                phone_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                help_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                cook_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                talk_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                shop_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                cry_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                travel_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                hate_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                brush_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                ) {
                    Dialog3 dialog3 = new Dialog3();
                    dialog3.show(getSupportFragmentManager(), "");
                }
            }
        });
    }


    private  void restart()
    {

        check_enabled();

        mad_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        mad_text.setTextSize(25);
        mad_img.setVisibility(View.INVISIBLE);

        made_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        made_text.setTextSize(25);
        made_img.setVisibility(View.INVISIBLE);

        maid_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        maid_text.setTextSize(25);
        maid_img.setVisibility(View.INVISIBLE);

        eat_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        eat_text.setTextSize(25);
        eat_img.setVisibility(View.INVISIBLE);

        slap_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        slap_text.setTextSize(25);
        slap_img.setVisibility(View.INVISIBLE);

        called_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        called_text.setTextSize(25);
        called_img.setVisibility(View.INVISIBLE);

        could_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        could_text.setTextSize(25);
        could_img.setVisibility(View.INVISIBLE);

        turn_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        turn_text.setTextSize(25);
        turn_img.setVisibility(View.INVISIBLE);

        slept_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        slept_text.setTextSize(25);
        slept_img.setVisibility(View.INVISIBLE);

        aim_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        aim_text.setTextSize(25);
        aim_img.setVisibility(View.INVISIBLE);

        jump_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        jump_text.setTextSize(25);
        jump_img.setVisibility(View.INVISIBLE);

        come_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        come_text.setTextSize(25);
        come_img.setVisibility(View.INVISIBLE);

        swam_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        swam_text.setTextSize(25);
        swam_img.setVisibility(View.INVISIBLE);

        wait_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        wait_text.setTextSize(25);
        wait_img.setVisibility(View.INVISIBLE);

        sit_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        sit_text.setTextSize(25);
        sit_img.setVisibility(View.INVISIBLE);

        play_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        play_text.setTextSize(25);
        play_img.setVisibility(View.INVISIBLE);

        make_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        make_text.setTextSize(25);
        make_img.setVisibility(View.INVISIBLE);

        write_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        write_text.setTextSize(25);
        write_img.setVisibility(View.INVISIBLE);

        drop_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        drop_text.setTextSize(25);
        drop_img.setVisibility(View.INVISIBLE);

        drove_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        drove_text.setTextSize(25);
        drove_img.setVisibility(View.INVISIBLE);

        had_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        had_text.setTextSize(25);
        had_img.setVisibility(View.INVISIBLE);

        clean_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        clean_text.setTextSize(25);
        clean_img.setVisibility(View.INVISIBLE);

        walk_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        walk_text.setTextSize(25);
        walk_img.setVisibility(View.INVISIBLE);

        wrote_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        wrote_text.setTextSize(25);
        wrote_img.setVisibility(View.INVISIBLE);

        visited_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        visited_text.setTextSize(25);
        visited_img.setVisibility(View.INVISIBLE);

        went_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        went_text.setTextSize(25);
        went_img.setVisibility(View.INVISIBLE);

        watched_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        watched_text.setTextSize(25);
        watched_img.setVisibility(View.INVISIBLE);

        rode_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rode_text.setTextSize(25);
        rode_img.setVisibility(View.INVISIBLE);

        end_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        end_text.setTextSize(25);
        end_img.setVisibility(View.INVISIBLE);

        ate_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        ate_text.setTextSize(25);
        ate_img.setVisibility(View.INVISIBLE);

        listen_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        listen_text.setTextSize(25);
        listen_img.setVisibility(View.INVISIBLE);

        read_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        read_text.setTextSize(25);
        read_img.setVisibility(View.INVISIBLE);

        tidied_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        tidied_text.setTextSize(25);
        tidied_img.setVisibility(View.INVISIBLE);

        drink_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        drink_text.setTextSize(25);
        drink_img.setVisibility(View.INVISIBLE);

        link_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        link_text.setTextSize(25);
        link_img.setVisibility(View.INVISIBLE);

        phone_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        phone_text.setTextSize(25);
        phone_img.setVisibility(View.INVISIBLE);

        ran_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        ran_text.setTextSize(25);
        ran_img.setVisibility(View.INVISIBLE);

        help_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        help_text.setTextSize(25);
        help_img.setVisibility(View.INVISIBLE);

        cook_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        cook_text.setTextSize(25);
        cook_img.setVisibility(View.INVISIBLE);

        drive_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        drive_text.setTextSize(25);
        drive_img.setVisibility(View.INVISIBLE);

        want_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        want_text.setTextSize(25);
        want_img.setVisibility(View.INVISIBLE);

        tried_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        tried_text.setTextSize(25);
        tried_img.setVisibility(View.INVISIBLE);

        talk_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        talk_text.setTextSize(25);
        talk_img.setVisibility(View.INVISIBLE);

        meet_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        meet_text.setTextSize(25);
        meet_img.setVisibility(View.INVISIBLE);

        shop_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        shop_text.setTextSize(25);
        shop_img.setVisibility(View.INVISIBLE);

        cry_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        cry_text.setTextSize(25);
        cry_img.setVisibility(View.INVISIBLE);

        swim_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        swim_text.setTextSize(25);
        swim_img.setVisibility(View.INVISIBLE);

        look_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        look_text.setTextSize(25);
        look_img.setVisibility(View.INVISIBLE);

        took_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        took_text.setTextSize(25);
        took_img.setVisibility(View.INVISIBLE);

        study_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        study_text.setTextSize(25);
        study_img.setVisibility(View.INVISIBLE);

        sleep_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        sleep_text.setTextSize(25);
        sleep_img.setVisibility(View.INVISIBLE);

        travel_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        travel_text.setTextSize(25);
        travel_img.setVisibility(View.INVISIBLE);

        be_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        be_text.setTextSize(25);
        be_img.setVisibility(View.INVISIBLE);

        hate_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        hate_text.setTextSize(25);
        hate_img.setVisibility(View.INVISIBLE);

        sat_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        sat_text.setTextSize(25);
        sat_img.setVisibility(View.INVISIBLE);

        brush_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        brush_text.setTextSize(25);
        brush_img.setVisibility(View.INVISIBLE);

        run_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        run_text.setTextSize(25);
        run_img.setVisibility(View.INVISIBLE);
    }

    private  void check_enabled()
    {
        btnCheck.setBackground(getResources().getDrawable(R.drawable.button_blue));
        textCheck.setTextColor(getResources().getColor(R.color.colorButton));
        textCheck.setText("Check");
        btnCheck.setEnabled(true);
        what_text.setVisibility(View.INVISIBLE);
        what_text.setEnabled(false);
    }


}
