package app.student.hellostudent;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.student.hellostudent.Dialog1;
import app.student.hellostudent.Dialog2;
import app.student.hellostudent.Dialog3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class A1Step3Section3 extends AppCompatActivity {
    TextView text_sea;
    ImageView image_sea;

    TextView text_say;
    ImageView image_say;

    TextView text_slow;
    ImageView image_slow;

    TextView text_see;
    ImageView image_see;

    TextView text_slim;
    ImageView image_slim;

    TextView text_swim;
    ImageView image_swim;

    TextView text_stay;
    ImageView image_stay;

    TextView text_said;
    ImageView image_said;

    TextView text_talk;
    ImageView image_talk;

    TextView text_tell;
    ImageView image_tell;

    TextView text_travel;
    ImageView image_travel;

    TextView text_thought;
    ImageView image_thought;

    TextView text_tidy;
    ImageView image_tidy;

    TextView text_clear;
    ImageView image_clear;

    TextView text_draw;
    ImageView image_draw;

    TextView text_love;
    ImageView image_love;

    TextView text_live;
    ImageView image_live;

    TextView text_leave;
    ImageView image_leave;

    TextView text_right;
    ImageView image_right;

    TextView text_write;
    ImageView image_write;

    TextView text_left;
    ImageView image_left;

    TextView text_last;
    ImageView image_last;

    TextView text_move;
    ImageView image_move;

    TextView text_felt;
    ImageView image_felt;

    TextView text_work;
    ImageView image_work;

    TextView text_drew;
    ImageView image_drew;

    TextView text_walk;
    ImageView image_walk;

    TextView text_want;
    ImageView image_want;

    TextView text_broke;
    ImageView image_broke;

    TextView text_think;
    ImageView image_think;

    TextView text_fill;
    ImageView image_fill;

    TextView text_feel;
    ImageView image_feel;

    TextView text_paint;
    ImageView image_paint;

    TextView text_met;
    ImageView image_met;

    TextView text_need;
    ImageView image_need;

    TextView text_read;
    ImageView image_read;

    TextView text_drove;
    ImageView image_drove;

    TextView text_break;
    ImageView image_break;

    TextView text_ask;
    ImageView image_ask;

    TextView text_put;
    ImageView image_put;

    TextView text_like;
    ImageView image_like;

    TextView text_turn;
    ImageView image_turn;

    TextView text_know;
    ImageView image_know;

    TextView text_listen;
    ImageView image_listen;

    TextView text_call;
    ImageView image_call;

    TextView text_could;
    ImageView image_could;

    TextView text_arrive;
    ImageView image_arrive;

    TextView text_fly;
    ImageView image_fly;

    TextView text_try;
    ImageView image_try;

    TextView text_cry;
    ImageView image_cry;

    TextView text_crew;
    ImageView image_crew;

    TextView text_clean;
    ImageView image_clean;

    TextView text_knew;
    ImageView image_knew;

    TextView text_hate;
    ImageView image_hate;

    TextView text_went;
    ImageView image_went;

    TextView text_enjoy;
    ImageView image_enjoy;

    TextView text_run;
    ImageView image_run;

    TextView text_jump;
    ImageView image_jump;

    TextView text_laugh;
    ImageView image_laugh;

    TextView text_buy;
    ImageView image_buy;

    LinearLayout btnCheck;
    TextView textCheck;

    LinearLayout btnRestart;
    ConstraintLayout btnExit;

    TextView what_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_step3_section3);

        btnExit = (ConstraintLayout) findViewById(R.id.btnExit_a1_step3_sect3);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Section3.this, A1Step3Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception exit_error) {}
            }
        });

        text_sea = (TextView) findViewById(R.id.text_sea_a1_step3_section3);
        image_sea = (ImageView) findViewById(R.id.img_a1_step3_sea_correct);
        text_say = (TextView) findViewById(R.id.text_say_a1_step3_section3);
        image_say = (ImageView) findViewById(R.id.img_a1_step3_say_correct);
        text_slow = (TextView) findViewById(R.id.text_slow_a1_step3_section3);
        image_slow = (ImageView) findViewById(R.id.img_a1_step3_slow_correct);
        text_see = (TextView) findViewById(R.id.text_see_a1_step3_section3);
        image_see = (ImageView) findViewById(R.id.img_a1_step3_see_correct);
        text_slim = (TextView) findViewById(R.id.text_slim_a1_step3_section3);
        image_slim = (ImageView) findViewById(R.id.img_a1_step3_slim_correct);
        text_swim = (TextView) findViewById(R.id.text_swim_a1_step3_section3);
        image_swim = (ImageView) findViewById(R.id.img_a1_step3_swim_correct);
        text_stay = (TextView) findViewById(R.id.text_stay_a1_step3_section3);
        image_stay = (ImageView) findViewById(R.id.img_a1_step3_stay_correct);
        text_said = (TextView) findViewById(R.id.text_said_a1_step3_section3);
        image_said = (ImageView) findViewById(R.id.img_a1_step3_said_correct);
        text_talk = (TextView) findViewById(R.id.text_talk_a1_step3_section3);
        image_talk = (ImageView) findViewById(R.id.img_a1_step3_talk_correct);
        text_tell = (TextView) findViewById(R.id.text_tell_a1_step3_section3);
        image_tell = (ImageView) findViewById(R.id.img_a1_step3_tell_correct);
        text_travel = (TextView) findViewById(R.id.text_travel_a1_step3_section3);
        image_travel= (ImageView) findViewById(R.id.img_a1_step3_travel_correct);
        text_thought = (TextView) findViewById(R.id.text_thought_a1_step3_section3);
        image_thought = (ImageView) findViewById(R.id.img_a1_step3_thought_correct);
        text_tidy = (TextView) findViewById(R.id.text_tidy_a1_step3_section3);
        image_tidy = (ImageView) findViewById(R.id.img_a1_step3_tidy_correct);
        text_clear = (TextView) findViewById(R.id.text_clear_a1_step3_section3);
        image_clear = (ImageView) findViewById(R.id.img_a1_step3_clear_correct);
        text_draw = (TextView) findViewById(R.id.text_draw_a1_step3_section3);
        image_draw = (ImageView) findViewById(R.id.img_a1_step3_draw_correct);
        text_love = (TextView) findViewById(R.id.text_love_a1_step3_section3);
        image_love = (ImageView) findViewById(R.id.img_a1_step3_love_correct);
        text_live = (TextView) findViewById(R.id.text_live_a1_step3_section3);
        image_live = (ImageView) findViewById(R.id.img_a1_step3_live_correct);
        text_leave = (TextView) findViewById(R.id.text_leave_a1_step3_section3);
        image_leave = (ImageView) findViewById(R.id.img_a1_step3_leave_correct);
        text_right = (TextView) findViewById(R.id.text_right_a1_step3_section3);
        image_right = (ImageView) findViewById(R.id.img_a1_step3_right_correct);
        text_write = (TextView) findViewById(R.id.text_write_a1_step3_section3);
        image_write = (ImageView) findViewById(R.id.img_a1_step3_write_correct);
        text_left = (TextView) findViewById(R.id.text_left_a1_step3_section3);
        image_left = (ImageView) findViewById(R.id.img_a1_step3_left_correct);
        text_last = (TextView) findViewById(R.id.text_last_a1_step3_section3);
        image_last = (ImageView) findViewById(R.id.img_a1_step3_last_correct);
        text_move = (TextView) findViewById(R.id.text_move_a1_step3_section3);
        image_move = (ImageView) findViewById(R.id.img_a1_step3_move_correct);
        text_move = (TextView) findViewById(R.id.text_move_a1_step3_section3);
        image_move = (ImageView) findViewById(R.id.img_a1_step3_move_correct);
        text_felt = (TextView) findViewById(R.id.text_felt_a1_step3_section3);
        image_felt = (ImageView) findViewById(R.id.img_a1_step3_felt_correct);
        text_work = (TextView) findViewById(R.id.text_work_a1_step3_section3);
        image_work = (ImageView) findViewById(R.id.img_a1_step3_work_correct);
        text_drew = (TextView) findViewById(R.id.text_drew_a1_step3_section3);
        image_drew = (ImageView) findViewById(R.id.img_a1_step3_drew_correct);
        text_walk = (TextView) findViewById(R.id.text_walk_a1_step3_section3);
        image_walk = (ImageView) findViewById(R.id.img_a1_step3_walk_correct);
        text_want = (TextView) findViewById(R.id.text_want_a1_step3_section3);
        image_want = (ImageView) findViewById(R.id.img_a1_step3_want_correct);
        text_broke = (TextView) findViewById(R.id.text_broke_a1_step3_section3);
        image_broke = (ImageView) findViewById(R.id.img_a1_step3_broke_correct);
        text_think = (TextView) findViewById(R.id.text_think_a1_step3_section3);
        image_think = (ImageView) findViewById(R.id.img_a1_step3_think_correct);
        text_fill = (TextView) findViewById(R.id.text_fill_a1_step3_section3);
        image_fill = (ImageView) findViewById(R.id.img_a1_step3_fill_correct);
        text_feel = (TextView) findViewById(R.id.text_feel_a1_step3_section3);
        image_feel = (ImageView) findViewById(R.id.img_a1_step3_feel_correct);
        text_paint = (TextView) findViewById(R.id.text_paint_a1_step3_section3);
        image_paint = (ImageView) findViewById(R.id.img_a1_step3_paint_correct);
        text_met = (TextView) findViewById(R.id.text_met_a1_step3_section3);
        image_met = (ImageView) findViewById(R.id.img_a1_step3_met_correct);
        text_need = (TextView) findViewById(R.id.text_need_a1_step3_section3);
        image_need = (ImageView) findViewById(R.id.img_a1_step3_need_correct);
        text_read = (TextView) findViewById(R.id.text_read_a1_step3_section3);
        image_read = (ImageView) findViewById(R.id.img_a1_step3_read_correct);
        text_drove = (TextView) findViewById(R.id.text_drove_a1_step3_section3);
        image_drove = (ImageView) findViewById(R.id.img_a1_step3_drove_correct);
        text_break = (TextView) findViewById(R.id.text_break_a1_step3_section3);
        image_break = (ImageView) findViewById(R.id.img_a1_step3_break_correct);
        text_ask = (TextView) findViewById(R.id.text_ask_a1_step3_section3);
        image_ask = (ImageView) findViewById(R.id.img_a1_step3_ask_correct);
        text_put = (TextView) findViewById(R.id.text_put_a1_step3_section3);
        image_put = (ImageView) findViewById(R.id.img_a1_step3_put_correct);
        text_like = (TextView) findViewById(R.id.text_like_a1_step3_section3);
        image_like = (ImageView) findViewById(R.id.img_a1_step3_like_correct);
        text_turn = (TextView) findViewById(R.id.text_turn_a1_step3_section3);
        image_turn = (ImageView) findViewById(R.id.img_a1_step3_turn_correct);
        text_know = (TextView) findViewById(R.id.text_know_a1_step3_section3);
        image_know = (ImageView) findViewById(R.id.img_a1_step3_know_correct);
        text_listen = (TextView) findViewById(R.id.text_listen_a1_step3_section3);
        image_listen = (ImageView) findViewById(R.id.img_a1_step3_listen_correct);
        text_call = (TextView) findViewById(R.id.text_call_a1_step3_section3);
        image_call = (ImageView) findViewById(R.id.img_a1_step3_call_correct);
        text_could = (TextView) findViewById(R.id.text_could_a1_step3_section3);
        image_could = (ImageView) findViewById(R.id.img_a1_step3_could_correct);
        text_arrive = (TextView) findViewById(R.id.text_arrive_a1_step3_section3);
        image_arrive = (ImageView) findViewById(R.id.img_a1_step3_arrive_correct);
        text_fly = (TextView) findViewById(R.id.text_fly_a1_step3_section3);
        image_fly = (ImageView) findViewById(R.id.img_a1_step3_fly_correct);
        text_try = (TextView) findViewById(R.id.text_try_a1_step3_section3);
        image_try = (ImageView) findViewById(R.id.img_a1_step3_try_correct);
        text_cry = (TextView) findViewById(R.id.text_cry_a1_step3_section3);
        image_cry = (ImageView) findViewById(R.id.img_a1_step3_cry_correct);
        text_crew = (TextView) findViewById(R.id.text_crew_a1_step3_section3);
        image_crew = (ImageView) findViewById(R.id.img_a1_step3_crew_correct);
        text_clean = (TextView) findViewById(R.id.text_clean_a1_step3_section3);
        image_clean = (ImageView) findViewById(R.id.img_a1_step3_clean_correct);
        text_knew = (TextView) findViewById(R.id.text_knew_a1_step3_section3);
        image_knew = (ImageView) findViewById(R.id.img_a1_step3_knew_correct);
        text_hate = (TextView) findViewById(R.id.text_hate_a1_step3_section3);
        image_hate = (ImageView) findViewById(R.id.img_a1_step3_hate_correct);
        text_went = (TextView) findViewById(R.id.text_went_a1_step3_section3);
        image_went = (ImageView) findViewById(R.id.img_a1_step3_went_correct);
        text_enjoy = (TextView) findViewById(R.id.text_enjoy_a1_step3_section3);
        image_enjoy = (ImageView) findViewById(R.id.img_a1_step3_enjoy_correct);
        text_run = (TextView) findViewById(R.id.text_run_a1_step3_section3);
        image_run = (ImageView) findViewById(R.id.img_a1_step3_run_correct);
        text_jump = (TextView) findViewById(R.id.text_jump_a1_step3_section3);
        image_jump = (ImageView) findViewById(R.id.img_a1_step3_jump_correct);
        text_laugh = (TextView) findViewById(R.id.text_laugh_a1_step3_section3);
        image_laugh = (ImageView) findViewById(R.id.img_a1_step3_laugh_correct);
        text_buy = (TextView) findViewById(R.id.text_buy_a1_step3_section3);
        image_buy = (ImageView) findViewById(R.id.img_a1_step3_buy_correct);

        text_sea.setTextSize(25);
        text_sea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_sea.setVisibility(View.INVISIBLE);
                if (text_sea.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_sea.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_sea.setTextSize(30);
                }
                else
                {
                    text_sea.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_sea.setTextSize(25);
                }
            }
        });

        text_say.setTextSize(25);
        text_say.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_say.setVisibility(View.INVISIBLE);
                if (text_say.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_say.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_say.setTextSize(30);
                }
                else
                {
                    text_say.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_say.setTextSize(25);
                }
            }
        });

        text_slow.setTextSize(25);
        text_slow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_slow.setVisibility(View.INVISIBLE);
                if (text_slow.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_slow.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_slow.setTextSize(30);
                }
                else
                {
                    text_slow.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_slow.setTextSize(25);
                }
            }
        });

        text_see.setTextSize(25);
        text_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_see.setVisibility(View.INVISIBLE);
                if (text_see.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_see.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_see.setTextSize(30);
                }
                else
                {
                    text_see.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_see.setTextSize(25);
                }
            }
        });

        text_slim.setTextSize(25);
        text_slim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_slim.setVisibility(View.INVISIBLE);
                if (text_slim.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_slim.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_slim.setTextSize(30);
                }
                else
                {
                    text_slim.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_slim.setTextSize(25);
                }
            }
        });

        text_swim.setTextSize(25);
        text_swim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_swim.setVisibility(View.INVISIBLE);
                if (text_swim.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_swim.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_swim.setTextSize(30);
                }
                else
                {
                    text_swim.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_swim.setTextSize(25);
                }
            }
        });

        text_stay.setTextSize(25);
        text_stay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_stay.setVisibility(View.INVISIBLE);
                if (text_stay.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_stay.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_stay.setTextSize(30);
                }
                else
                {
                    text_stay.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_stay.setTextSize(25);
                }
            }
        });

        text_said.setTextSize(25);
        text_said.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_said.setVisibility(View.INVISIBLE);
                if (text_said.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_said.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_said.setTextSize(30);
                }
                else
                {
                    text_said.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_said.setTextSize(25);
                }
            }
        });

        text_talk.setTextSize(25);
        text_talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_talk.setVisibility(View.INVISIBLE);
                if (text_talk.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_talk.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_talk.setTextSize(30);
                }
                else
                {
                    text_talk.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_talk.setTextSize(25);
                }
            }
        });

        text_tell.setTextSize(25);
        text_tell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_tell.setVisibility(View.INVISIBLE);
                if (text_tell.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_tell.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_tell.setTextSize(30);
                }
                else
                {
                    text_tell.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_tell.setTextSize(25);
                }
            }
        });

        text_travel.setTextSize(25);
        text_travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_travel.setVisibility(View.INVISIBLE);
                if (text_travel.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_travel.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_travel.setTextSize(30);
                }
                else
                {
                    text_travel.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_travel.setTextSize(25);
                }
            }
        });

        text_thought.setTextSize(25);
        text_thought.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_thought.setVisibility(View.INVISIBLE);
                if (text_thought.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_thought.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_thought.setTextSize(30);
                }
                else
                {
                    text_thought.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_thought.setTextSize(25);
                }
            }
        });

        text_tidy.setTextSize(25);
        text_tidy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_tidy.setVisibility(View.INVISIBLE);
                if (text_tidy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_tidy.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_tidy.setTextSize(30);
                }
                else
                {
                    text_tidy.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_tidy.setTextSize(25);
                }
            }
        });

        text_clear.setTextSize(25);
        text_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_clear.setVisibility(View.INVISIBLE);
                if (text_clear.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_clear.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_clear.setTextSize(30);
                }
                else
                {
                    text_clear.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_clear.setTextSize(25);
                }
            }
        });

        text_draw.setTextSize(25);
        text_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_draw.setVisibility(View.INVISIBLE);
                if (text_draw.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_draw.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_draw.setTextSize(30);
                }
                else
                {
                    text_draw.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_draw.setTextSize(25);
                }
            }
        });

        text_love.setTextSize(25);
        text_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_love.setVisibility(View.INVISIBLE);
                if (text_love.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_love.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_love.setTextSize(30);
                }
                else
                {
                    text_love.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_love.setTextSize(25);
                }
            }
        });

        text_live.setTextSize(25);
        text_live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_live.setVisibility(View.INVISIBLE);
                if (text_live.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_live.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_live.setTextSize(30);
                }
                else
                {
                    text_live.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_live.setTextSize(25);
                }
            }
        });

        text_leave.setTextSize(25);
        text_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_leave.setVisibility(View.INVISIBLE);
                if (text_leave.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_leave.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_leave.setTextSize(30);
                }
                else
                {
                    text_leave.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_leave.setTextSize(25);
                }
            }
        });

        text_right.setTextSize(25);
        text_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_right.setVisibility(View.INVISIBLE);
                if (text_right.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_right.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_right.setTextSize(30);
                }
                else
                {
                    text_right.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_right.setTextSize(25);
                }
            }
        });

        text_write.setTextSize(25);
        text_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_write.setVisibility(View.INVISIBLE);
                if (text_write.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_write.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_write.setTextSize(30);
                }
                else
                {
                    text_write.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_write.setTextSize(25);
                }
            }
        });

        text_left.setTextSize(25);
        text_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_left.setVisibility(View.INVISIBLE);
                if (text_left.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_left.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_left.setTextSize(30);
                }
                else
                {
                    text_left.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_left.setTextSize(25);
                }
            }
        });

        text_last.setTextSize(25);
        text_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_last.setVisibility(View.INVISIBLE);
                if (text_last.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_last.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_last.setTextSize(30);
                }
                else
                {
                    text_last.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_last.setTextSize(25);
                }
            }
        });

        text_move.setTextSize(25);
        text_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_move.setVisibility(View.INVISIBLE);
                if (text_move.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_move.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_move.setTextSize(30);
                }
                else
                {
                    text_move.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_move.setTextSize(25);
                }
            }
        });

        text_felt.setTextSize(25);
        text_felt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_felt.setVisibility(View.INVISIBLE);
                if (text_felt.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_felt.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_felt.setTextSize(30);
                }
                else
                {
                    text_felt.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_felt.setTextSize(25);
                }
            }
        });

        text_work.setTextSize(25);
        text_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_work.setVisibility(View.INVISIBLE);
                if (text_work.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_work.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_work.setTextSize(30);
                }
                else
                {
                    text_work.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_work.setTextSize(25);
                }
            }
        });

        text_drew.setTextSize(25);
        text_drew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_drew.setVisibility(View.INVISIBLE);
                if (text_drew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_drew.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_drew.setTextSize(30);
                }
                else
                {
                    text_drew.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_drew.setTextSize(25);
                }
            }
        });

        text_walk.setTextSize(25);
        text_walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_walk.setVisibility(View.INVISIBLE);
                if (text_walk.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_walk.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_walk.setTextSize(30);
                }
                else
                {
                    text_walk.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_walk.setTextSize(25);
                }
            }
        });

        text_want.setTextSize(25);
        text_want.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_want.setVisibility(View.INVISIBLE);
                if (text_want.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_want.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_want.setTextSize(30);
                }
                else
                {
                    text_want.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_want.setTextSize(25);
                }
            }
        });

        text_broke.setTextSize(25);
        text_broke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_broke.setVisibility(View.INVISIBLE);
                if (text_broke.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_broke.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_broke.setTextSize(30);
                }
                else
                {
                    text_broke.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_broke.setTextSize(25);
                }
            }
        });

        text_think.setTextSize(25);
        text_think.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_think.setVisibility(View.INVISIBLE);
                if (text_think.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_think.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_think.setTextSize(30);
                }
                else
                {
                    text_think.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_think.setTextSize(25);
                }
            }
        });

        text_fill.setTextSize(25);
        text_fill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_fill.setVisibility(View.INVISIBLE);
                if (text_fill.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_fill.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_fill.setTextSize(30);
                }
                else
                {
                    text_fill.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_fill.setTextSize(25);
                }
            }
        });

        text_feel.setTextSize(25);
        text_feel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_feel.setVisibility(View.INVISIBLE);
                if (text_feel.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_feel.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_feel.setTextSize(30);
                }
                else
                {
                    text_feel.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_feel.setTextSize(25);
                }
            }
        });

        text_paint.setTextSize(25);
        text_paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_paint.setVisibility(View.INVISIBLE);
                if (text_paint.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_paint.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_paint.setTextSize(30);
                }
                else
                {
                    text_paint.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_paint.setTextSize(25);
                }
            }
        });

        text_met.setTextSize(25);
        text_met.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_met.setVisibility(View.INVISIBLE);
                if (text_met.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_met.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_met.setTextSize(30);
                }
                else
                {
                    text_met.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_met.setTextSize(25);
                }
            }
        });

        text_need.setTextSize(25);
        text_need.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_need.setVisibility(View.INVISIBLE);
                if (text_need.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_need.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_need.setTextSize(30);
                }
                else
                {
                    text_need.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_need.setTextSize(25);
                }
            }
        });

        text_read.setTextSize(25);
        text_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_read.setVisibility(View.INVISIBLE);
                if (text_read.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_read.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_read.setTextSize(30);
                }
                else
                {
                    text_read.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_read.setTextSize(25);
                }
            }
        });

        text_drove.setTextSize(25);
        text_drove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_drove.setVisibility(View.INVISIBLE);
                if (text_drove.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_drove.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_drove.setTextSize(30);
                }
                else
                {
                    text_drove.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_drove.setTextSize(25);
                }
            }
        });

        text_break.setTextSize(25);
        text_break.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_break.setVisibility(View.INVISIBLE);
                if (text_break.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_break.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_break.setTextSize(30);
                }
                else
                {
                    text_break.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_break.setTextSize(25);
                }
            }
        });

        text_ask.setTextSize(25);
        text_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_ask.setVisibility(View.INVISIBLE);
                if (text_ask.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_ask.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_ask.setTextSize(30);
                }
                else
                {
                    text_ask.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_ask.setTextSize(25);
                }
            }
        });

        text_put.setTextSize(25);
        text_put.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_put.setVisibility(View.INVISIBLE);
                if (text_put.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_put.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_put.setTextSize(30);
                }
                else
                {
                    text_put.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_put.setTextSize(25);
                }
            }
        });

        text_like.setTextSize(25);
        text_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_like.setVisibility(View.INVISIBLE);
                if (text_like.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_like.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_like.setTextSize(30);
                }
                else
                {
                    text_like.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_like.setTextSize(25);
                }
            }
        });

        text_turn.setTextSize(25);
        text_turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_turn.setVisibility(View.INVISIBLE);
                if (text_turn.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_turn.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_turn.setTextSize(30);
                }
                else
                {
                    text_turn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_turn.setTextSize(25);
                }
            }
        });

        text_know.setTextSize(25);
        text_know.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_know.setVisibility(View.INVISIBLE);
                if (text_know.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_know.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_know.setTextSize(30);
                }
                else
                {
                    text_know.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_know.setTextSize(25);
                }
            }
        });

        text_listen.setTextSize(25);
        text_listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_listen.setVisibility(View.INVISIBLE);
                if (text_listen.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_listen.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_listen.setTextSize(30);
                }
                else
                {
                    text_listen.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_listen.setTextSize(25);
                }
            }
        });

        text_call.setTextSize(25);
        text_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_call.setVisibility(View.INVISIBLE);
                if (text_call.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_call.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_call.setTextSize(30);
                }
                else
                {
                    text_call.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_call.setTextSize(25);
                }
            }
        });

        text_could.setTextSize(25);
        text_could.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_could.setVisibility(View.INVISIBLE);
                if (text_could.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_could.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_could.setTextSize(30);
                }
                else
                {
                    text_could.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_could.setTextSize(25);
                }
            }
        });

        text_arrive.setTextSize(25);
        text_arrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_arrive.setVisibility(View.INVISIBLE);
                if (text_arrive.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_arrive.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_arrive.setTextSize(30);
                }
                else
                {
                    text_arrive.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_arrive.setTextSize(25);
                }
            }
        });

        text_fly.setTextSize(25);
        text_fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_fly.setVisibility(View.INVISIBLE);
                if (text_fly.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_fly.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_fly.setTextSize(30);
                }
                else
                {
                    text_fly.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_fly.setTextSize(25);
                }
            }
        });

        text_try.setTextSize(25);
        text_try.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_try.setVisibility(View.INVISIBLE);
                if (text_try.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_try.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_try.setTextSize(30);
                }
                else
                {
                    text_try.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_try.setTextSize(25);
                }
            }
        });

        text_cry.setTextSize(25);
        text_cry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_cry.setVisibility(View.INVISIBLE);
                if (text_cry.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_cry.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_cry.setTextSize(30);
                }
                else
                {
                    text_cry.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_cry.setTextSize(25);
                }
            }
        });

        text_crew.setTextSize(25);
        text_crew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_crew.setVisibility(View.INVISIBLE);
                if (text_crew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_crew.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_crew.setTextSize(30);
                }
                else
                {
                    text_crew.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_crew.setTextSize(25);
                }
            }
        });

        text_clean.setTextSize(25);
        text_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_clean.setVisibility(View.INVISIBLE);
                if (text_clean.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_clean.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_clean.setTextSize(30);
                }
                else
                {
                    text_clean.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_clean.setTextSize(25);
                }
            }
        });

        text_knew.setTextSize(25);
        text_knew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_knew.setVisibility(View.INVISIBLE);
                if (text_knew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_knew.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_knew.setTextSize(30);
                }
                else
                {
                    text_knew.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_knew.setTextSize(25);
                }
            }
        });

        text_hate.setTextSize(25);
        text_hate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_hate.setVisibility(View.INVISIBLE);
                if (text_hate.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_hate.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_hate.setTextSize(30);
                }
                else
                {
                    text_hate.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_hate.setTextSize(25);
                }
            }
        });

        text_went.setTextSize(25);
        text_went.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_went.setVisibility(View.INVISIBLE);
                if (text_went.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_went.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_went.setTextSize(30);
                }
                else
                {
                    text_went.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_went.setTextSize(25);
                }
            }
        });

        text_enjoy.setTextSize(25);
        text_enjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_enjoy.setVisibility(View.INVISIBLE);
                if (text_enjoy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_enjoy.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_enjoy.setTextSize(30);
                }
                else
                {
                    text_enjoy.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_enjoy.setTextSize(25);
                }
            }
        });

        text_run.setTextSize(25);
        text_run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_run.setVisibility(View.INVISIBLE);
                if (text_run.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_run.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_run.setTextSize(30);
                }
                else
                {
                    text_run.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_run.setTextSize(25);
                }
            }
        });
        text_jump.setTextSize(25);
        text_jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_jump.setVisibility(View.INVISIBLE);
                if (text_jump.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_jump.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_jump.setTextSize(30);
                }
                else
                {
                    text_jump.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_jump.setTextSize(25);
                }
            }
        });

        text_laugh.setTextSize(25);
        text_laugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_laugh.setVisibility(View.INVISIBLE);
                if (text_laugh.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_laugh.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_laugh.setTextSize(30);
                }
                else
                {
                    text_laugh.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_laugh.setTextSize(25);
                }
            }
        });

        text_buy.setTextSize(25);
        text_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                image_buy.setVisibility(View.INVISIBLE);
                if (text_buy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    text_buy.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_buy.setTextSize(30);
                }
                else
                {
                    text_buy.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    text_buy.setTextSize(25);
                }
            }
        });

        btnCheck = (LinearLayout) findViewById(R.id.btnCheck);
        textCheck = (TextView) findViewById(R.id.textViewCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnCheck.isEnabled()) {
                        if ((text_sea.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_say.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_slow.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_see.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_slim.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_swim.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_stay.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_said.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_talk.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_tell.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_travel.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_thought.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_tidy.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_clear.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_draw.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_love.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_live.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_leave.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_right.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_write.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_left.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_last.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_move.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_felt.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_work.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_drew.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_walk.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_want.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_broke.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_think.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_fill.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_feel.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_paint.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_met.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_need.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_read.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_drove.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_break.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_ask.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_put.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_like.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_turn.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_know.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_listen.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_call.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_could.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_arrive.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_fly.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_try.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_cry.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_crew.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_clean.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_hate.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_went.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_enjoy.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_run.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_jump.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_laugh.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                text_buy.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                        )) {
                            restart_everything();
                        } else {

                            if (text_sea.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_say.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_slow.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_see.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_slim.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_swim.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_stay.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_said.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_talk.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_tell.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_travel.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_thought.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_tidy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_clear.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_draw.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_love.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_live.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_leave.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_right.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_write.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_left.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_last.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_move.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_felt.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_work.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_drew.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_walk.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_want.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_broke.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_think.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_fill.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_feel.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_paint.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_met.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_need.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_read.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_drove.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_break.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_ask.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_put.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_like.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_turn.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_know.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_listen.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_call.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_could.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_arrive.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_fly.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_try.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_cry.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_crew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_clean.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_hate.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_went.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_enjoy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_run.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_jump.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_laugh.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                    text_buy.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                            ) {
                                btnCheck.setEnabled(false);
                                btnCheck.setBackground(getResources().getDrawable(R.drawable.button_green));
                                textCheck.setText("Correct");
                                textCheck.setTextColor(getResources().getColor(R.color.colorButton));
                            } else {
                                btnCheck.setEnabled(false);
                                btnCheck.setBackground(getResources().getDrawable(R.drawable.button_red));
                                textCheck.setText("Wrong");
                                what_text.setVisibility(View.VISIBLE);
                                what_text.setEnabled(true);
                                textCheck.setTextColor(getResources().getColor(R.color.colorButton));
                            }

                            if (text_sea.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_sea.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_sea.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_sea.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_sea.setVisibility(View.VISIBLE);
                            } else {
                                image_sea.setVisibility(View.INVISIBLE);
                            }

                            if (text_say.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_say.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_say.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_say.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_say.setVisibility(View.VISIBLE);
                            } else {
                                image_say.setVisibility(View.INVISIBLE);
                            }

                            if (text_slow.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_slow.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_slow.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_slow.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_slow.setVisibility(View.VISIBLE);
                            } else {
                                image_slow.setVisibility(View.INVISIBLE);
                            }

                            if (text_see.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_see.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_see.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_see.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_see.setVisibility(View.VISIBLE);
                            } else {
                                image_see.setVisibility(View.INVISIBLE);
                            }

                            if (text_slim.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_slim.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_slim.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_slim.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_slim.setVisibility(View.VISIBLE);
                            } else {
                                image_slim.setVisibility(View.INVISIBLE);
                            }

                            if (text_swim.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_swim.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_swim.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_swim.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_swim.setVisibility(View.VISIBLE);
                            } else {
                                image_swim.setVisibility(View.INVISIBLE);
                            }

                            if (text_stay.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_stay.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_stay.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_stay.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_stay.setVisibility(View.VISIBLE);
                            } else {
                                image_stay.setVisibility(View.INVISIBLE);
                            }

                            if (text_said.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_said.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_said.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_said.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_said.setVisibility(View.VISIBLE);
                            } else {
                                image_said.setVisibility(View.INVISIBLE);
                            }

                            if (text_talk.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_talk.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_talk.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_talk.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_talk.setVisibility(View.VISIBLE);
                            } else {
                                image_talk.setVisibility(View.INVISIBLE);
                            }

                            if (text_tell.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_tell.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_tell.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_tell.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_tell.setVisibility(View.VISIBLE);
                            } else {
                                image_tell.setVisibility(View.INVISIBLE);
                            }

                            if (text_travel.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_travel.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_travel.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_travel.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_travel.setVisibility(View.VISIBLE);
                            } else {
                                image_travel.setVisibility(View.INVISIBLE);
                            }

                            if (text_thought.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_thought.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_thought.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_thought.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_thought.setVisibility(View.VISIBLE);
                            } else {
                                image_thought.setVisibility(View.INVISIBLE);
                            }

                            if (text_tidy.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_tidy.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_tidy.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_tidy.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_tidy.setVisibility(View.VISIBLE);
                            } else {
                                image_tidy.setVisibility(View.INVISIBLE);
                            }

                            if (text_clear.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_clear.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_clear.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_clear.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_clear.setVisibility(View.VISIBLE);
                            } else {
                                image_clear.setVisibility(View.INVISIBLE);
                            }

                            if (text_draw.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_draw.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_draw.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_draw.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_draw.setVisibility(View.VISIBLE);
                            } else {
                                image_draw.setVisibility(View.INVISIBLE);
                            }

                            if (text_love.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_love.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_love.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_love.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_love.setVisibility(View.VISIBLE);
                            } else {
                                image_love.setVisibility(View.INVISIBLE);
                            }

                            if (text_live.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_live.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_live.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_live.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_live.setVisibility(View.VISIBLE);
                            } else {
                                image_live.setVisibility(View.INVISIBLE);
                            }

                            if (text_leave.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_leave.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_leave.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_leave.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_leave.setVisibility(View.VISIBLE);
                            } else {
                                image_leave.setVisibility(View.INVISIBLE);
                            }

                            if (text_right.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_right.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_right.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_right.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_right.setVisibility(View.VISIBLE);
                            } else {
                                image_right.setVisibility(View.INVISIBLE);
                            }

                            if (text_write.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_write.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_write.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_write.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_write.setVisibility(View.VISIBLE);
                            } else {
                                image_write.setVisibility(View.INVISIBLE);
                            }

                            if (text_left.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_left.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_left.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_left.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_left.setVisibility(View.VISIBLE);
                            } else {
                                image_left.setVisibility(View.INVISIBLE);
                            }

                            if (text_last.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_last.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_last.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_last.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_last.setVisibility(View.VISIBLE);
                            } else {
                                image_last.setVisibility(View.INVISIBLE);
                            }

                            if (text_move.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_move.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_move.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_move.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_move.setVisibility(View.VISIBLE);
                            } else {
                                image_move.setVisibility(View.INVISIBLE);
                            }

                            if (text_felt.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_felt.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_felt.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_felt.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_felt.setVisibility(View.VISIBLE);
                            } else {
                                image_felt.setVisibility(View.INVISIBLE);
                            }

                            if (text_work.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_work.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_work.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_work.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_work.setVisibility(View.VISIBLE);
                            } else {
                                image_work.setVisibility(View.INVISIBLE);
                            }

                            if (text_drew.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_drew.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_drew.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_drew.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_drew.setVisibility(View.VISIBLE);
                            } else {
                                image_drew.setVisibility(View.INVISIBLE);
                            }

                            if (text_walk.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_walk.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_walk.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_walk.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_walk.setVisibility(View.VISIBLE);
                            } else {
                                image_walk.setVisibility(View.INVISIBLE);
                            }

                            if (text_want.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_want.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_want.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_want.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_want.setVisibility(View.VISIBLE);
                            } else {
                                image_want.setVisibility(View.INVISIBLE);
                            }

                            if (text_broke.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_broke.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_broke.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_broke.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_broke.setVisibility(View.VISIBLE);
                            } else {
                                image_broke.setVisibility(View.INVISIBLE);
                            }

                            if (text_think.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_think.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_think.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_think.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_think.setVisibility(View.VISIBLE);
                            } else {
                                image_think.setVisibility(View.INVISIBLE);
                            }

                            if (text_fill.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_fill.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_fill.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_fill.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_fill.setVisibility(View.VISIBLE);
                            } else {
                                image_fill.setVisibility(View.INVISIBLE);
                            }

                            if (text_feel.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_feel.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_feel.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_feel.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_feel.setVisibility(View.VISIBLE);
                            } else {
                                image_feel.setVisibility(View.INVISIBLE);
                            }

                            if (text_paint.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_paint.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_paint.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_paint.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_paint.setVisibility(View.VISIBLE);
                            } else {
                                image_paint.setVisibility(View.INVISIBLE);
                            }

                            if (text_met.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_met.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_met.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_met.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_met.setVisibility(View.VISIBLE);
                            } else {
                                image_met.setVisibility(View.INVISIBLE);
                            }

                            if (text_need.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_need.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_need.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_need.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_need.setVisibility(View.VISIBLE);
                            } else {
                                image_need.setVisibility(View.INVISIBLE);
                            }

                            if (text_read.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_read.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_read.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_read.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_read.setVisibility(View.VISIBLE);
                            } else {
                                image_read.setVisibility(View.INVISIBLE);
                            }

                            if (text_drove.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_drove.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_drove.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_drove.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_drove.setVisibility(View.VISIBLE);
                            } else {
                                image_drove.setVisibility(View.INVISIBLE);
                            }

                            if (text_break.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_break.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_break.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_break.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_break.setVisibility(View.VISIBLE);
                            } else {
                                image_break.setVisibility(View.INVISIBLE);
                            }

                            if (text_ask.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_ask.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_ask.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_ask.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_ask.setVisibility(View.VISIBLE);
                            } else {
                                image_ask.setVisibility(View.INVISIBLE);
                            }

                            if (text_put.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_put.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_put.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_put.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_put.setVisibility(View.VISIBLE);
                            } else {
                                image_put.setVisibility(View.INVISIBLE);
                            }

                            if (text_like.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_like.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_like.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_like.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_like.setVisibility(View.VISIBLE);
                            } else {
                                image_like.setVisibility(View.INVISIBLE);
                            }

                            if (text_turn.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_turn.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_turn.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_turn.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_turn.setVisibility(View.VISIBLE);
                            } else {
                                image_turn.setVisibility(View.INVISIBLE);
                            }

                            if (text_know.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_know.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_know.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_know.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_know.setVisibility(View.VISIBLE);
                            }

                            if (text_listen.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_listen.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_listen.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_listen.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_listen.setVisibility(View.VISIBLE);
                            } else {
                                image_listen.setVisibility(View.INVISIBLE);
                            }

                            if (text_call.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_call.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_call.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_call.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_call.setVisibility(View.VISIBLE);
                            } else {
                                image_call.setVisibility(View.INVISIBLE);
                            }

                            if (text_could.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_could.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_could.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_could.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_could.setVisibility(View.VISIBLE);
                            } else {
                                image_could.setVisibility(View.INVISIBLE);
                            }

                            if (text_arrive.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_arrive.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_arrive.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_arrive.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_arrive.setVisibility(View.VISIBLE);
                            } else {
                                image_arrive.setVisibility(View.INVISIBLE);
                            }

                            if (text_fly.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_fly.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_fly.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_fly.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_fly.setVisibility(View.VISIBLE);
                            } else {
                                image_fly.setVisibility(View.INVISIBLE);
                            }

                            if (text_try.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_try.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_try.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_try.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_try.setVisibility(View.VISIBLE);
                            } else {
                                image_try.setVisibility(View.INVISIBLE);
                            }

                            if (text_cry.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_cry.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_cry.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_cry.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_cry.setVisibility(View.VISIBLE);
                            } else {
                                image_cry.setVisibility(View.INVISIBLE);
                            }

                            if (text_crew.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_crew.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_crew.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_crew.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_crew.setVisibility(View.VISIBLE);
                            } else {
                                image_crew.setVisibility(View.INVISIBLE);
                            }

                            if (text_clean.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_clean.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_clean.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_clean.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_clean.setVisibility(View.VISIBLE);
                            } else {
                                image_clean.setVisibility(View.INVISIBLE);
                            }

                            if (text_knew.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_knew.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_knew.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_knew.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_knew.setVisibility(View.VISIBLE);
                            } else {
                                image_knew.setVisibility(View.INVISIBLE);
                            }

                            if (text_hate.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_hate.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_hate.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_hate.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_hate.setVisibility(View.VISIBLE);
                            } else {
                                image_hate.setVisibility(View.INVISIBLE);
                            }

                            if (text_went.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_went.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_went.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_went.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_went.setVisibility(View.VISIBLE);
                            } else {
                                image_want.setVisibility(View.INVISIBLE);
                            }

                            if (text_enjoy.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_enjoy.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_enjoy.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_enjoy.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_enjoy.setVisibility(View.VISIBLE);
                            } else {
                                image_enjoy.setVisibility(View.INVISIBLE);
                            }

                            if (text_run.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_run.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_run.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_run.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_run.setVisibility(View.VISIBLE);
                            } else {
                                image_run.setVisibility(View.INVISIBLE);
                            }

                            if (text_jump.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_jump.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_jump.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_jump.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_jump.setVisibility(View.VISIBLE);
                            } else {
                                image_jump.setVisibility(View.INVISIBLE);
                            }

                            if (text_laugh.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_laugh.setBackground(getResources().getDrawable(R.drawable.button_red));
                                text_laugh.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                                image_laugh.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                                image_laugh.setVisibility(View.VISIBLE);
                            } else {
                                image_laugh.setVisibility(View.INVISIBLE);
                            }

                            if (text_buy.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                                image_buy.setBackground(getResources().getDrawable(R.drawable.button_green));
                                text_buy.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                                image_buy.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                                image_buy.setVisibility(View.VISIBLE);
                            } else {
                                image_buy.setVisibility(View.INVISIBLE);
                            }
                        }
                    }
                }
        });

        btnRestart = (LinearLayout) findViewById(R.id.btnRestart);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart_everything();
            }
        });

        what_text = (TextView) findViewById(R.id.textViewWhat);
        what_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (
                        (
                                text_say.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_see.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_swim.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_said.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_tell.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_thought.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_draw.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_leave.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_write.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_left.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_felt.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_drew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_broke.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_think.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_feel.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_met.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_read.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_drove.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_break.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_put.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_know.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_could.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_fly.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_went.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_run.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_buy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                        ) && (
                                text_sea.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_slow.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_slim.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_stay.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_talk.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_travel.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_tidy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_clear.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_love.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_live.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_right.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_last.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_move.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_work.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_walk.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_want.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_fill.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_paint.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_need.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_ask.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_like.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_turn.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_listen.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_call.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_arrive.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_try.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_cry.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_crew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_clean.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_hate.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_enjoy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_jump.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                        text_laugh.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                        )
                ) {
                    Dialog1 dialog1 = new Dialog1();
                    dialog1.show(getSupportFragmentManager(), "");
                } else if (
                        text_say.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_see.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_swim.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_said.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_tell.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_thought.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_draw.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_leave.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_write.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_left.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_felt.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_drew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_broke.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_think.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_feel.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_met.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_read.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_drove.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_break.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_put.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_know.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_could.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_fly.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_went.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_run.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_buy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                ) {
                    Dialog2 dialog2 = new Dialog2();
                    dialog2.show(getSupportFragmentManager(), "");
                } else if (
                        text_sea.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                text_slow.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                text_slim.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                text_stay.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                text_talk.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                text_travel.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_tidy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_clear.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_love.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_live.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_right.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_last.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_move.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_work.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_walk.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_want.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_fill.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_paint.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_need.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_ask.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_like.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_turn.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_listen.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_call.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_arrive.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_try.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_cry.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_crew.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_clean.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_hate.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_enjoy.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_jump.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                text_laugh.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                ) {
                    Dialog3 dialog3 = new Dialog3();
                    dialog3.show(getSupportFragmentManager(), "");
                }
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

    private void restart_everything()
    {

        check_enabled();
        try {
            text_sea.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_sea.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_say.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_say.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_slow.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_slow.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_see.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_see.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_slim.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_slim.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_swim.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_swim.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_stay.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_stay.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_said.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_said.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_talk.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_talk.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_tell.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_tell.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_travel.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_travel.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_thought.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_thought.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_tidy.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_tidy.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_clear.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_clear.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_draw.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_draw.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_love.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_love.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_clear.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_clear.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_draw.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_draw.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_love.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_love.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_live.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_live.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_leave.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_leave.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_right.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_right.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_write.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_write.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_left.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_left.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_last.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_last.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_move.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_move.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_felt.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_felt.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_work.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_work.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_drew.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_drew.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_walk.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_walk.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_want.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_want.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_broke.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_broke.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_think.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_think.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_fill.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_fill.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_feel.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_feel.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_paint.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_paint.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_met.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_met.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_need.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_need.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_read.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_read.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_drove.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_drove.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_break.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_break.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_ask.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_ask.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_put.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_put.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_like.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_like.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_turn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_turn.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_know.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_know.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_listen.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_listen.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_call.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_call.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_could.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_could.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_arrive.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_arrive.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_fly.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_fly.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_try.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_try.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_cry.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_cry.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_crew.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_crew.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_clean.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_clean.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_knew.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_knew.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_hate.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_hate.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_hate.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_hate.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_went.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_went.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_enjoy.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_enjoy.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_run.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_run.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_jump.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_jump.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_laugh.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_laugh.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}

        try {
            text_buy.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            image_buy.setVisibility(View.INVISIBLE);
        }
        catch (Exception e)
        {}
    }

    private void check_enabled()
    {
        btnCheck.setEnabled(true);
        btnCheck.setBackground(getResources().getDrawable(R.drawable.button_blue));
        textCheck.setText("Check");
        textCheck.setTextColor(getResources().getColor(R.color.colorButton));
        what_text.setVisibility(View.INVISIBLE);
        what_text.setEnabled(false);
    }
}

