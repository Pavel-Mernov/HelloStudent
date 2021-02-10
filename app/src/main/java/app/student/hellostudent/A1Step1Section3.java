package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import app.student.hellostudent.Dialog1;
import app.student.hellostudent.Dialog2;
import app.student.hellostudent.Dialog3;


public class A1Step1Section3 extends AppCompatActivity {
    ConstraintLayout btnExit;
    ConstraintLayout btnRestart;

    TextView textCheck;
    ConstraintLayout btnCheck;



    TextView can_text;
    ImageView can_img;

    TextView climb_text;
    ImageView climb_img;

    TextView came_text;
    ImageView came_img;

    TextView were_text;
    ImageView were_img;

    TextView where_text;
    ImageView where_img;

    TextView weer_text;
    ImageView weer_img;

    TextView cold_text;
    ImageView cold_img;

    TextView cloud_text;
    ImageView cloud_img;

    TextView could_text;
    ImageView could_img;

    TextView head_text;
    ImageView head_img;

    TextView hand_text;
    ImageView hand_img;

    TextView had_text;
    ImageView had_img;

    TextView read_text;
    ImageView read_img;

    TextView reed_text;
    ImageView reed_img;

    TextView was_text;
    ImageView was_img;

    TextView talked_text;
    ImageView talked_img;

    TextView tidy_text;
    ImageView tidy_img;

    TextView took_text;
    ImageView took_img;

    TextView like_text;
    ImageView like_img;

    TextView love_text;
    ImageView love_img;

    TextView look_text;
    ImageView look_img;

    TextView come_text;
    ImageView come_img;

    TextView some_text;
    ImageView some_img;

    TextView want_text;
    ImageView want_img;

    TextView wait_text;
    ImageView wait_img;

    TextView went_text;
    ImageView went_img;

    TextView washed_text;
    ImageView washed_img;

    TextView watch_text;
    ImageView watch_img;

    TextView take_text;
    ImageView take_img;

    TextView is_text;
    ImageView is_img;

    TextView bot_text;
    ImageView bot_img;

    TextView go_text;
    ImageView go_img;

    TextView sow_text;
    ImageView sow_img;

    TextView buy_text;
    ImageView buy_img;

    TextView bike_text;
    ImageView bike_img;

    TextView be_text;
    ImageView be_img;

    TextView saw_text;
    ImageView saw_img;

    TextView bright_text;
    ImageView bright_img;

    TextView bought_text;
    ImageView bought_img;

    TextView sea_text;
    ImageView sea_img;

    TextView red_text;
    ImageView red_img;

    TextView rat_text;
    ImageView rat_img;

    TextView rode_text;
    ImageView rode_img;

    TextView rice_text;
    ImageView rice_img;

    TextView ride_text;
    ImageView ride_img;

    TextView hive_text;
    ImageView hive_img;

    TextView live_text;
    ImageView live_img;

    TextView have_text;
    ImageView have_img;

    TextView stay_text;
    ImageView stay_img;

    TextView start_text;
    ImageView start_img;

    TextView smile_text;
    ImageView smile_img;

    TextView see_text;
    ImageView see_img;

    TextView study_text;
    ImageView study_img;

    TextView what_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_step1_section3);


        btnExit = (ConstraintLayout) findViewById(R.id.btnExit_a1_step1_sect3);
        btnRestart = (ConstraintLayout) findViewById(R.id.btnRestart_a1_step1_sect3);
        btnCheck = (ConstraintLayout) findViewById(R.id.btnCheck_a1_step1_sect3);
        textCheck = (TextView) findViewById(R.id.textViewCheck);


        can_text = (TextView) findViewById(R.id.can_text_a1_step1_section3);
        can_text.setTextSize(25);
        can_img = (ImageView) findViewById(R.id.can_img_a1_step1_correct);

        climb_text = (TextView) findViewById(R.id.climb_text_a1_step1_section3);
        climb_text.setTextSize(25);
        climb_img = (ImageView) findViewById(R.id.climb_img_a1_step1_correct);

        came_text = (TextView) findViewById(R.id.came_text_a1_step1_section3);
        came_text.setTextSize(25);
        came_img = (ImageView) findViewById(R.id.came_img_a1_step1_correct);

        were_text = (TextView) findViewById(R.id.were_text_a1_step1_section3);
        were_text.setTextSize(25);
        were_img = (ImageView) findViewById(R.id.were_img_a1_step1_correct);

        where_text = (TextView) findViewById(R.id.where_text_a1_step1_section3);
        where_text.setTextSize(25);
        where_img = (ImageView) findViewById(R.id.where_img_a1_step1_correct);

        weer_text = (TextView) findViewById(R.id.weer_text_a1_step1_section3);
        weer_text.setTextSize(25);
        weer_img = (ImageView) findViewById(R.id.weer_img_a1_step1_correct);

        cold_text = (TextView) findViewById(R.id.cold_text_a1_step1_section3);
        cold_text.setTextSize(25);
        cold_img = (ImageView) findViewById(R.id.cold_img_a1_step1_correct);

        cloud_text = (TextView) findViewById(R.id.cloud_text_a1_step1_section3);
        cloud_text.setTextSize(25);
        cloud_img = (ImageView) findViewById(R.id.cloud_img_a1_step1_correct);

        could_text = (TextView) findViewById(R.id.could_text_a1_step1_section3);
        could_text.setTextSize(25);
        could_img = (ImageView) findViewById(R.id.could_img_a1_step1_correct);

        head_text = (TextView) findViewById(R.id.head_text_a1_step1_section3);
        head_text.setTextSize(25);
        head_img = (ImageView) findViewById(R.id.head_img_a1_step1_correct);

        hand_text = (TextView) findViewById(R.id.hand_text_a1_step1_section3);
        hand_text.setTextSize(25);
        hand_img = (ImageView) findViewById(R.id.hand_img_a1_step1_correct);

        had_text = (TextView) findViewById(R.id.had_text_a1_step1_section3);
        had_text.setTextSize(25);
        had_img = (ImageView) findViewById(R.id.had_img_a1_step1_correct);

        read_text = (TextView) findViewById(R.id.read_text_a1_step1_section3);
        read_text.setTextSize(25);
        read_img = (ImageView) findViewById(R.id.read_img_a1_step1_correct);

        reed_text = (TextView) findViewById(R.id.reed_text_a1_step1_section3);
        reed_text.setTextSize(25);
        reed_img = (ImageView) findViewById(R.id.reed_img_a1_step1_correct);

        was_text = (TextView) findViewById(R.id.was_text_a1_step1_section3);
        was_text.setTextSize(25);
        was_img = (ImageView) findViewById(R.id.was_img_a1_step1_correct);

        talked_text = (TextView) findViewById(R.id.talked_text_a1_step1_section3);
        talked_text.setTextSize(25);
        talked_img = (ImageView) findViewById(R.id.talked_img_a1_step1_correct);

        tidy_text = (TextView) findViewById(R.id.tidy_text_a1_step1_section3);
        can_text.setTextSize(25);
        tidy_img = (ImageView) findViewById(R.id.tidy_img_a1_step1_correct);

        took_text = (TextView) findViewById(R.id.took_text_a1_step1_section3);
        took_text.setTextSize(25);
        took_img = (ImageView) findViewById(R.id.took_img_a1_step1_correct);

        like_text = (TextView) findViewById(R.id.like_text_a1_step1_section3);
        like_text.setTextSize(25);
        like_img = (ImageView) findViewById(R.id.like_img_a1_step1_correct);

        love_text = (TextView) findViewById(R.id.love_text_a1_step1_section3);
        love_text.setTextSize(25);
        love_img = (ImageView) findViewById(R.id.love_img_a1_step1_correct);

        look_text = (TextView) findViewById(R.id.look_text_a1_step1_section3);
        look_text.setTextSize(25);
        look_img = (ImageView) findViewById(R.id.look_img_a1_step1_correct);

        come_text = (TextView) findViewById(R.id.come_text_a1_step1_section3);
        come_text.setTextSize(25);
        come_img = (ImageView) findViewById(R.id.come_img_a1_step1_correct);

        some_text = (TextView) findViewById(R.id.some_text_a1_step1_section3);
        some_text.setTextSize(25);
        some_img = (ImageView) findViewById(R.id.some_img_a1_step1_correct);

        want_text = (TextView) findViewById(R.id.want_text_a1_step1_section3);
        want_text.setTextSize(25);
        want_img = (ImageView) findViewById(R.id.want_img_a1_step1_correct);

        wait_text = (TextView) findViewById(R.id.wait_text_a1_step1_section3);
        wait_text.setTextSize(25);
        wait_img = (ImageView) findViewById(R.id.wait_img_a1_step1_correct);

        went_text = (TextView) findViewById(R.id.went_text_a1_step1_section3);
        went_text.setTextSize(25);
        went_img = (ImageView) findViewById(R.id.went_img_a1_step1_correct);

        washed_text = (TextView) findViewById(R.id.washed_text_a1_step1_section3);
        washed_text.setTextSize(25);
        washed_img = (ImageView) findViewById(R.id.washed_img_a1_step1_correct);

        watch_text = (TextView) findViewById(R.id.watch_text_a1_step1_section3);
        watch_text.setTextSize(25);
        watch_img = (ImageView) findViewById(R.id.watch_img_a1_step1_correct);

        take_text = (TextView) findViewById(R.id.take_text_a1_step1_section3);
        take_text.setTextSize(25);
        take_img = (ImageView) findViewById(R.id.take_img_a1_step1_correct);

        is_text = (TextView) findViewById(R.id.is_text_a1_step1_section3);
        is_text.setTextSize(25);
        is_img = (ImageView) findViewById(R.id.is_img_a1_step1_correct);

        bot_text = (TextView) findViewById(R.id.bot_text_a1_step1_section3);
        bot_text.setTextSize(25);
        bot_img = (ImageView) findViewById(R.id.bot_img_a1_step1_correct);

        go_text = (TextView) findViewById(R.id.go_text_a1_step1_section3);
        go_text.setTextSize(25);
        go_img = (ImageView) findViewById(R.id.go_img_a1_step1_correct);

        sow_text = (TextView) findViewById(R.id.sow_text_a1_step1_section3);
        sow_text.setTextSize(25);
        sow_img = (ImageView) findViewById(R.id.sow_img_a1_step1_correct);

        buy_text = (TextView) findViewById(R.id.buy_text_a1_step1_section3);
        buy_text.setTextSize(25);
        buy_img = (ImageView) findViewById(R.id.buy_img_a1_step1_correct);

        bike_text = (TextView) findViewById(R.id.bike_text_a1_step1_section3);
        bike_text.setTextSize(25);
        bike_img = (ImageView) findViewById(R.id.bike_img_a1_step1_correct);

        be_text = (TextView) findViewById(R.id.be_text_a1_step1_section3);
        be_text.setTextSize(25);
        be_img = (ImageView) findViewById(R.id.be_img_a1_step1_correct);

        saw_text = (TextView) findViewById(R.id.saw_text_a1_step1_section3);
        saw_text.setTextSize(25);
        saw_img = (ImageView) findViewById(R.id.saw_img_a1_step1_correct);

        bright_text = (TextView) findViewById(R.id.bright_text_a1_step1_section3);
        bright_text.setTextSize(25);
        bright_img = (ImageView) findViewById(R.id.bright_img_a1_step1_correct);

        bought_text = (TextView) findViewById(R.id.bought_text_a1_step1_section3);
        bought_text.setTextSize(25);
        bought_img = (ImageView) findViewById(R.id.bought_img_a1_step1_correct);

        sea_text = (TextView) findViewById(R.id.sea_text_a1_step1_section3);
        sea_text.setTextSize(25);
        sea_img = (ImageView) findViewById(R.id.sea_img_a1_step1_correct);

        red_text = (TextView) findViewById(R.id.red_text_a1_step1_section3);
        red_text.setTextSize(25);
        red_img = (ImageView) findViewById(R.id.red_img_a1_step1_correct);

        rat_text = (TextView) findViewById(R.id.rat_text_a1_step1_section3);
        rat_text.setTextSize(25);
        rat_img = (ImageView) findViewById(R.id.rat_img_a1_step1_correct);

        rode_text = (TextView) findViewById(R.id.rode_text_a1_step1_section3);
        rode_text.setTextSize(25);
        rode_img = (ImageView) findViewById(R.id.rode_img_a1_step1_correct);

        rice_text = (TextView) findViewById(R.id.rice_text_a1_step1_section3);
        rice_text.setTextSize(25);
        rice_img = (ImageView) findViewById(R.id.rice_img_a1_step1_correct);

        ride_text = (TextView) findViewById(R.id.ride_text_a1_step1_section3);
        ride_text.setTextSize(25);
        ride_img = (ImageView) findViewById(R.id.ride_img_a1_step1_correct);

        hive_text = (TextView) findViewById(R.id.hive_text_a1_step1_section3);
        hive_text.setTextSize(25);
        hive_img = (ImageView) findViewById(R.id.hive_img_a1_step1_correct);

        live_text = (TextView) findViewById(R.id.live_text_a1_step1_section3);
        live_text.setTextSize(25);
        live_img = (ImageView) findViewById(R.id.live_img_a1_step1_correct);

        have_text = (TextView) findViewById(R.id.have_text_a1_step1_section3);
        have_text.setTextSize(25);
        have_img = (ImageView) findViewById(R.id.have_img_a1_step1_correct);

        stay_text = (TextView) findViewById(R.id.stay_text_a1_step1_section3);
        stay_text.setTextSize(25);
        stay_img = (ImageView) findViewById(R.id.stay_img_a1_step1_correct);

        start_text = (TextView) findViewById(R.id.start_text_a1_step1_section3);
        start_text.setTextSize(25);
        start_img = (ImageView) findViewById(R.id.start_img_a1_step1_correct);

        smile_text = (TextView) findViewById(R.id.smile_text_a1_step1_section3);
        smile_text.setTextSize(25);
        smile_img = (ImageView) findViewById(R.id.smile_img_a1_step1_correct);

        see_text = (TextView) findViewById(R.id.see_text_a1_step1_section3);
        see_text.setTextSize(25);
        see_img = (ImageView) findViewById(R.id.see_img_a1_step1_correct);

        study_text = (TextView) findViewById(R.id.study_text_a1_step1_section3);
        study_text.setTextSize(25);
        study_img = (ImageView) findViewById(R.id.study_img_a1_step1_correct);

        what_text = (TextView) findViewById(R.id.textViewWhat);
        what_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((can_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        came_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        were_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        could_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        can_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        had_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        read_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        was_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        took_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        come_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        went_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        take_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        is_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        go_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        buy_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        be_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        saw_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        bought_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        rode_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        ride_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        have_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                        see_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)) &&
                        (
                                climb_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        where_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        weer_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        cold_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        cloud_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        head_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        hand_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        reed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        talked_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        tidy_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        like_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        love_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        some_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        washed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        watch_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        bot_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        sow_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        bike_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        bright_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        sea_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        red_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        rat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        rice_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        hive_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        live_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        stay_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        start_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        smile_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                                        study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                        ))
                {
                    Dialog1 dialog1 = new Dialog1();
                    dialog1.show(getSupportFragmentManager(), "");
                }
                else if
                (can_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                came_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                were_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                could_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                can_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                had_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                read_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                was_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                took_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                come_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                went_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                take_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                is_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                go_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                buy_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                be_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                saw_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                bought_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                rode_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                ride_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                have_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) ||
                                see_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                ) {
                    Dialog2 dialog2 = new Dialog2();
                    dialog2.show(getSupportFragmentManager(), "");
                } else
                if (                                            climb_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        where_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        weer_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        cold_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        cloud_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        head_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        hand_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        reed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        talked_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        tidy_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        like_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        love_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        some_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        washed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        watch_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        bot_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        sow_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        bike_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        bright_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        sea_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        red_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        rat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        rice_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        hive_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        live_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        stay_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        start_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        smile_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) ||
                        study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                ) {
                    Dialog3 dialog3 = new Dialog3();
                    dialog3.show(getSupportFragmentManager(), "");
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(A1Step1Section3.this, A1Step1Sections.class);
                    startActivity(intent);
                    finish();
            }
        });


        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if ((
                            can_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    climb_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    came_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    were_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    where_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    weer_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    cold_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    could_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    cloud_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    can_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    head_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    hand_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    had_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    read_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    reed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    was_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    talked_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    tidy_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    took_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    like_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    love_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    come_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    some_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    went_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    washed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    watch_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    take_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    is_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    bot_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    go_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    sow_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    buy_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    bike_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    be_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    saw_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    bright_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    bought_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    sea_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    red_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    rat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    rode_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    rice_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    ride_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    hive_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    live_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    have_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    stay_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    start_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    smile_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    see_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                    study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)
                    )) {
                        restart();
                    } else {
                        if (
                                can_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        climb_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        came_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        were_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        where_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        weer_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        cold_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        could_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        cloud_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        can_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        head_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        hand_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        had_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        read_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        reed_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        was_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        talked_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        tidy_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        took_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        look_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        like_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        love_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        come_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        some_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        want_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        wait_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        went_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        washed_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        watch_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        take_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        is_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        bot_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        go_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        sow_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        buy_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        bike_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        be_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        saw_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        bright_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        bought_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        sea_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        red_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        rat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        rode_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        rice_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        ride_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        hive_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        live_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        have_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        stay_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        start_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        smile_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark) &&
                                        see_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark) &&
                                        study_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark)
                        ) {
                            btnCheck.setBackground(getResources().getDrawable(R.drawable.button_green));
                            textCheck.setTextColor(getResources().getColor(R.color.colorButton));
                            textCheck.setText("Correct");
                        } else {
                            btnCheck.setBackground(getResources().getDrawable(R.drawable.button_red));
                            textCheck.setTextColor(getResources().getColor(R.color.colorButton));
                            textCheck.setText("Wrong");
                            what_text.setVisibility(View.VISIBLE);
                            what_text.setEnabled(true);
                        }
                        if (can_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            can_img.setVisibility(View.VISIBLE);
                            can_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            can_img.setVisibility(View.INVISIBLE);
                        }

                        if (climb_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            climb_img.setVisibility(View.VISIBLE);
                            climb_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            climb_img.setVisibility(View.INVISIBLE);
                        }

                        if (came_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            came_img.setVisibility(View.VISIBLE);
                            came_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            came_img.setVisibility(View.INVISIBLE);
                        }

                        if (were_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            were_img.setVisibility(View.VISIBLE);
                            were_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            were_img.setVisibility(View.INVISIBLE);
                        }

                        if (where_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            where_img.setVisibility(View.VISIBLE);
                            where_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            where_img.setVisibility(View.INVISIBLE);
                        }

                        if (weer_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            weer_img.setVisibility(View.VISIBLE);
                            weer_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            weer_img.setVisibility(View.INVISIBLE);
                        }

                        if (cold_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            cold_img.setVisibility(View.VISIBLE);
                            cold_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            cold_img.setVisibility(View.INVISIBLE);
                        }

                        if (cloud_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            cloud_img.setVisibility(View.VISIBLE);
                            cloud_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            cloud_img.setVisibility(View.INVISIBLE);
                        }

                        if (could_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            could_img.setVisibility(View.VISIBLE);
                            could_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            could_img.setVisibility(View.INVISIBLE);
                        }

                        if (head_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            head_img.setVisibility(View.VISIBLE);
                            head_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            head_img.setVisibility(View.INVISIBLE);
                        }


                        if (hand_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            hand_img.setVisibility(View.VISIBLE);
                            hand_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            hand_img.setVisibility(View.INVISIBLE);
                        }

                        if (had_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            had_img.setVisibility(View.VISIBLE);
                            had_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            had_img.setVisibility(View.INVISIBLE);
                        }

                        if (read_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            read_img.setVisibility(View.VISIBLE);
                            read_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            read_img.setVisibility(View.INVISIBLE);
                        }

                        if (reed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            reed_img.setVisibility(View.VISIBLE);
                            reed_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            reed_img.setVisibility(View.INVISIBLE);
                        }

                        if (was_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            was_img.setVisibility(View.VISIBLE);
                            was_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            was_img.setVisibility(View.INVISIBLE);
                        }

                        if (talked_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            talked_img.setVisibility(View.VISIBLE);
                            talked_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            talked_img.setVisibility(View.INVISIBLE);
                        }

                        if (tidy_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            tidy_img.setVisibility(View.VISIBLE);
                            tidy_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            tidy_img.setVisibility(View.INVISIBLE);
                        }

                        if (took_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            took_img.setVisibility(View.VISIBLE);
                            took_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            took_img.setVisibility(View.INVISIBLE);
                        }

                        if (like_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            like_img.setVisibility(View.VISIBLE);
                            like_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            like_img.setVisibility(View.INVISIBLE);
                        }

                        if (love_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            love_img.setVisibility(View.VISIBLE);
                            love_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            love_img.setVisibility(View.INVISIBLE);
                        }

                        if (look_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            look_img.setVisibility(View.VISIBLE);
                            look_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            look_img.setVisibility(View.INVISIBLE);
                        }

                        if (come_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            come_img.setVisibility(View.VISIBLE);
                            come_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            come_img.setVisibility(View.INVISIBLE);
                        }

                        if (some_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            some_img.setVisibility(View.VISIBLE);
                            some_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            some_img.setVisibility(View.INVISIBLE);
                        }

                        if (want_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            want_img.setVisibility(View.VISIBLE);
                            want_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            want_img.setVisibility(View.INVISIBLE);
                        }

                        if (wait_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            wait_img.setVisibility(View.VISIBLE);
                            wait_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            want_img.setVisibility(View.INVISIBLE);
                        }

                        if (went_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            went_img.setVisibility(View.VISIBLE);
                            went_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            went_img.setVisibility(View.INVISIBLE);
                        }

                        if (washed_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            washed_img.setVisibility(View.VISIBLE);
                            washed_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            washed_img.setVisibility(View.INVISIBLE);
                        }

                        if (watch_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            watch_img.setVisibility(View.VISIBLE);
                            watch_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            watch_img.setVisibility(View.INVISIBLE);
                        }

                        if (take_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            take_img.setVisibility(View.VISIBLE);
                            take_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            take_img.setVisibility(View.INVISIBLE);
                        }

                        if (is_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            is_img.setVisibility(View.VISIBLE);
                            is_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            is_img.setVisibility(View.INVISIBLE);
                        }

                        if (bot_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            bot_img.setVisibility(View.VISIBLE);
                            bot_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            bot_img.setVisibility(View.INVISIBLE);
                        }

                        if (go_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            go_img.setVisibility(View.VISIBLE);
                            go_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            go_img.setVisibility(View.INVISIBLE);
                        }

                        if (sow_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            sow_img.setVisibility(View.VISIBLE);
                            sow_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            sow_img.setVisibility(View.INVISIBLE);
                        }

                        if (buy_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            buy_img.setVisibility(View.VISIBLE);
                            buy_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            buy_img.setVisibility(View.INVISIBLE);
                        }

                        if (bike_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            bike_img.setVisibility(View.VISIBLE);
                            bike_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            bike_img.setVisibility(View.INVISIBLE);
                        }

                        if (be_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            be_img.setVisibility(View.VISIBLE);
                            be_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            be_img.setVisibility(View.INVISIBLE);
                        }

                        if (saw_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            saw_img.setVisibility(View.VISIBLE);
                            saw_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            saw_img.setVisibility(View.INVISIBLE);
                        }

                        if (bright_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            bright_img.setVisibility(View.VISIBLE);
                            bright_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            bright_img.setVisibility(View.INVISIBLE);
                        }

                        if (bought_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            bought_img.setVisibility(View.VISIBLE);
                            bought_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            bought_img.setVisibility(View.INVISIBLE);
                        }

                        if (sea_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            sea_img.setVisibility(View.VISIBLE);
                            sea_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            sea_img.setVisibility(View.INVISIBLE);
                        }

                        if (red_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            red_img.setVisibility(View.VISIBLE);
                            red_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            red_img.setVisibility(View.INVISIBLE);
                        }

                        if (rat_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            rat_img.setVisibility(View.VISIBLE);
                            rat_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            rat_img.setVisibility(View.INVISIBLE);
                        }

                        if (rode_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            rode_img.setVisibility(View.VISIBLE);
                            rode_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            rode_img.setVisibility(View.INVISIBLE);
                        }

                        if (rice_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            rice_img.setVisibility(View.VISIBLE);
                            rice_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            rice_img.setVisibility(View.INVISIBLE);
                        }

                        if (ride_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            ride_img.setVisibility(View.VISIBLE);
                            ride_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            ride_img.setVisibility(View.INVISIBLE);
                        }

                        if (hive_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            hive_img.setVisibility(View.VISIBLE);
                            hive_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            hive_img.setVisibility(View.INVISIBLE);
                        }


                        if (live_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            live_img.setVisibility(View.VISIBLE);
                            live_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            live_img.setVisibility(View.INVISIBLE);
                        }

                        if (have_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            have_img.setVisibility(View.VISIBLE);
                            have_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            have_img.setVisibility(View.INVISIBLE);
                        }

                        if (stay_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            stay_img.setVisibility(View.VISIBLE);
                            stay_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            stay_img.setVisibility(View.INVISIBLE);
                        }

                        if (start_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            start_img.setVisibility(View.VISIBLE);
                            start_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            stay_img.setVisibility(View.INVISIBLE);
                        }

                        if (smile_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            smile_img.setVisibility(View.VISIBLE);
                            smile_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            smile_img.setVisibility(View.INVISIBLE);
                        }

                        if (see_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            see_img.setVisibility(View.VISIBLE);
                            see_text.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                        } else {
                            see_img.setVisibility(View.INVISIBLE);
                        }

                        if (study_text.getCurrentTextColor() != getResources().getColor(R.color.colorPrimaryDark)) {
                            study_img.setVisibility(View.VISIBLE);
                            study_text.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                        } else {
                            study_img.setVisibility(View.INVISIBLE);
                        }
                    }
                }

        });


        can_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                can_img.setVisibility(View.INVISIBLE);
                if (can_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    can_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    can_text.setTextSize(30);
                }
                else
                {
                    can_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    can_text.setTextSize(25);
                }
            }
        });


        climb_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                climb_img.setVisibility(View.INVISIBLE);
                if (climb_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    climb_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    climb_text.setTextSize(30);
                }
                else
                {
                    climb_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    climb_text.setTextSize(25);
                }
            }
        });


        came_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                came_img.setVisibility(View.INVISIBLE);
                if (came_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    came_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    came_text.setTextSize(30);
                }
                else
                {
                    came_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    came_text.setTextSize(25);
                }
            }
        });


        were_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                were_img.setVisibility(View.INVISIBLE);
                if (were_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    were_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    were_text.setTextSize(30);
                }
                else
                {
                    were_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    were_text.setTextSize(25);
                }
            }
        });

        where_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                where_img.setVisibility(View.INVISIBLE);
                if (where_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    where_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    where_text.setTextSize(30);
                }
                else
                {
                    where_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    where_text.setTextSize(25);
                }
            }
        });


        weer_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                weer_img.setVisibility(View.INVISIBLE);
                if (weer_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    weer_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    weer_text.setTextSize(30);
                }
                else
                {
                    weer_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    weer_text.setTextSize(25);
                }
            }
        });


        cold_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                cold_img.setVisibility(View.INVISIBLE);
                if (cold_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    cold_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    cold_text.setTextSize(30);
                }
                else
                {
                    cold_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    cold_text.setTextSize(25);
                }
            }
        });

        cloud_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                cloud_img.setVisibility(View.INVISIBLE);
                if (cloud_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    cloud_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    cloud_text.setTextSize(30);
                }
                else
                {
                    cloud_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    cloud_text.setTextSize(25);
                }
            }
        });

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

        head_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                head_img.setVisibility(View.INVISIBLE);
                if (head_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    head_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    head_text.setTextSize(30);
                }
                else
                {
                    head_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    head_text.setTextSize(25);
                }
            }
        });

        hand_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                hand_img.setVisibility(View.INVISIBLE);
                if (hand_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    hand_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    hand_text.setTextSize(30);
                }
                else
                {
                    hand_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    hand_text.setTextSize(25);
                }
            }
        });

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

        reed_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                reed_img.setVisibility(View.INVISIBLE);
                if (reed_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    reed_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    reed_text.setTextSize(30);
                }
                else
                {
                    reed_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    reed_text.setTextSize(25);
                }
            }
        });

        was_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                was_img.setVisibility(View.INVISIBLE);
                if (was_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    was_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    was_text.setTextSize(30);
                }
                else
                {
                    was_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    was_text.setTextSize(25);
                }
            }
        });

        talked_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                talked_img.setVisibility(View.INVISIBLE);
                if (talked_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    talked_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    talked_text.setTextSize(30);
                }
                else
                {
                    talked_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    talked_text.setTextSize(25);
                }
            }
        });

        tidy_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                tidy_img.setVisibility(View.INVISIBLE);
                if (tidy_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    tidy_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    tidy_text.setTextSize(30);
                }
                else
                {
                    tidy_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    tidy_text.setTextSize(25);
                }
            }
        });

        took_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                tidy_img.setVisibility(View.INVISIBLE);
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

        like_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                like_img.setVisibility(View.INVISIBLE);
                if (like_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    like_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    like_text.setTextSize(30);
                }
                else
                {
                    like_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    like_text.setTextSize(25);
                }
            }
        });

        love_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                love_img.setVisibility(View.INVISIBLE);
                if (love_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    love_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    love_text.setTextSize(30);
                }
                else
                {
                    love_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    love_text.setTextSize(25);
                }
            }
        });

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

        some_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                some_img.setVisibility(View.INVISIBLE);
                if (some_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    some_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    some_text.setTextSize(30);
                }
                else
                {
                    some_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    some_text.setTextSize(25);
                }
            }
        });

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

        washed_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                washed_img.setVisibility(View.INVISIBLE);
                if (washed_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    washed_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    washed_text.setTextSize(30);
                }
                else
                {
                    washed_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    washed_text.setTextSize(25);
                }
            }
        });

        watch_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                watch_img.setVisibility(View.INVISIBLE);
                if (watch_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    watch_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    watch_text.setTextSize(30);
                }
                else
                {
                    watch_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    watch_text.setTextSize(25);
                }
            }
        });

        take_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                take_img.setVisibility(View.INVISIBLE);
                if (take_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    take_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    take_text.setTextSize(30);
                }
                else
                {
                    take_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    take_text.setTextSize(25);
                }
            }
        });

        is_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                is_img.setVisibility(View.INVISIBLE);
                is_img.setVisibility(View.INVISIBLE);
                if (is_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    is_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    is_text.setTextSize(30);
                }
                else
                {
                    is_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    is_text.setTextSize(25);
                }
            }
        });

        bot_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                bot_img.setVisibility(View.INVISIBLE);
                if (bot_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    bot_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    bot_text.setTextSize(30);
                }
                else
                {
                    bot_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    bot_text.setTextSize(25);
                }
            }
        });

        go_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                go_img.setVisibility(View.INVISIBLE);
                if (go_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    go_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    go_text.setTextSize(30);
                }
                else
                {
                    go_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    go_text.setTextSize(25);
                }
            }
        });

        sow_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                sow_img.setVisibility(View.INVISIBLE);
                if (sow_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    sow_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    sow_text.setTextSize(30);
                }
                else
                {
                    sow_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    sow_text.setTextSize(25);
                }
            }
        });

        buy_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                buy_img.setVisibility(View.INVISIBLE);
                if (buy_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    buy_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    buy_text.setTextSize(30);
                }
                else
                {
                    buy_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    buy_text.setTextSize(25);
                }
            }
        });

        bike_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                bike_img.setVisibility(View.INVISIBLE);
                if (bike_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    bike_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    bike_text.setTextSize(30);
                }
                else
                {
                    bike_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    bike_text.setTextSize(25);
                }
            }
        });

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

        saw_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                saw_img.setVisibility(View.INVISIBLE);
                if (saw_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    saw_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    saw_text.setTextSize(30);
                }
                else
                {
                    saw_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    saw_text.setTextSize(25);
                }
            }
        });

        bright_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                bright_img.setVisibility(View.INVISIBLE);
                if (bright_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    bright_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    bright_text.setTextSize(30);
                }
                else
                {
                    bright_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    bright_text.setTextSize(25);
                }
            }
        });

        bought_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                bought_img.setVisibility(View.INVISIBLE);
                if (bought_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    bought_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    bought_text.setTextSize(30);
                }
                else
                {
                    bought_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    bought_text.setTextSize(25);
                }
            }
        });;

        sea_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                sea_img.setVisibility(View.INVISIBLE);
                if (sea_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    sea_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    sea_text.setTextSize(30);
                }
                else
                {
                    sea_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    sea_text.setTextSize(25);
                }
            }
        });

        red_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                red_img.setVisibility(View.INVISIBLE);
                if (red_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    red_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    red_text.setTextSize(30);
                }
                else
                {
                    red_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    red_text.setTextSize(25);
                }
            }
        });

        rat_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                rat_img.setVisibility(View.INVISIBLE);
                if (rat_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    rat_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    rat_text.setTextSize(30);
                }
                else
                {
                    rat_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    rat_text.setTextSize(25);
                }
            }
        });

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

        rice_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                rice_img.setVisibility(View.INVISIBLE);
                if (rice_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    rice_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    rice_text.setTextSize(30);
                }
                else
                {
                    rice_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    rice_text.setTextSize(25);
                }
            }
        });

        ride_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                ride_img.setVisibility(View.INVISIBLE);
                if (ride_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    ride_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    ride_text.setTextSize(30);
                }
                else
                {
                    ride_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    ride_text.setTextSize(25);
                }
            }
        });

        hive_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                hive_img.setVisibility(View.INVISIBLE);
                if (hive_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    hive_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    hive_text.setTextSize(30);
                }
                else
                {
                    hive_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    hive_text.setTextSize(25);
                }
            }
        });


        live_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                live_img.setVisibility(View.INVISIBLE);
                if (live_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    live_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    live_text.setTextSize(30);
                }
                else
                {
                    live_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    live_text.setTextSize(25);
                }
            }
        });

        have_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                have_img.setVisibility(View.INVISIBLE);
                if (have_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    have_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    have_text.setTextSize(30);
                }
                else
                {
                    have_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    have_text.setTextSize(25);
                }
            }
        });

        stay_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                stay_img.setVisibility(View.INVISIBLE);
                if (stay_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    stay_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    stay_text.setTextSize(30);
                }
                else
                {
                    stay_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    stay_text.setTextSize(25);
                }
            }
        });

        start_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                start_img.setVisibility(View.INVISIBLE);
                if (start_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    start_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    start_text.setTextSize(30);
                }
                else
                {
                    start_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    start_text.setTextSize(25);
                }
            }
        });

        smile_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                smile_img.setVisibility(View.INVISIBLE);
                if (smile_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    smile_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    smile_text.setTextSize(30);
                }
                else
                {
                    smile_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    smile_text.setTextSize(25);
                }
            }
        });

        see_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_enabled();
                see_img.setVisibility(View.INVISIBLE);
                if (see_text.getCurrentTextColor() == getResources().getColor(R.color.colorPrimaryDark))
                {
                    see_text.setTextColor(getResources().getColor(R.color.colorPrimary));
                    see_text.setTextSize(30);
                }
                else
                {
                    see_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    see_text.setTextSize(25);
                }
            }
        });

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

    }

    private void restart()
    {
        check_enabled();
        can_text.setTextSize(25);
        can_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        can_img.setVisibility(View.INVISIBLE);

        climb_text.setTextSize(25);
        climb_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        climb_img.setVisibility(View.INVISIBLE);

        came_text.setTextSize(25);
        came_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        came_img.setVisibility(View.INVISIBLE);

        were_text.setTextSize(25);
        were_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        were_img.setVisibility(View.INVISIBLE);

        where_text.setTextSize(25);
        where_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        where_img.setVisibility(View.INVISIBLE);

        weer_text.setTextSize(25);
        weer_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        weer_img.setVisibility(View.INVISIBLE);

        cold_text.setTextSize(25);
        cold_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        cold_img.setVisibility(View.INVISIBLE);

        cloud_text.setTextSize(25);
        cloud_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        cloud_img.setVisibility(View.INVISIBLE);

        could_text.setTextSize(25);
        could_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        could_img.setVisibility(View.INVISIBLE);

        head_text.setTextSize(25);
        head_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        head_img.setVisibility(View.INVISIBLE);

        hand_text.setTextSize(25);
        hand_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        hand_img.setVisibility(View.INVISIBLE);

        had_text.setTextSize(25);
        had_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        had_img.setVisibility(View.INVISIBLE);

        read_text.setTextSize(25);
        read_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        read_img.setVisibility(View.INVISIBLE);

        reed_text.setTextSize(25);
        reed_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        reed_img.setVisibility(View.INVISIBLE);

        was_text.setTextSize(25);
        was_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        was_img.setVisibility(View.INVISIBLE);

        talked_text.setTextSize(25);
        talked_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        talked_img.setVisibility(View.INVISIBLE);

        tidy_text.setTextSize(25);
        tidy_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        tidy_img.setVisibility(View.INVISIBLE);

        took_text.setTextSize(25);
        took_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        took_img.setVisibility(View.INVISIBLE);

        like_text.setTextSize(25);
        like_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        like_img.setVisibility(View.INVISIBLE);

        love_text.setTextSize(25);
        love_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        love_img.setVisibility(View.INVISIBLE);

        look_text.setTextSize(25);
        look_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        look_img.setVisibility(View.INVISIBLE);

        come_text.setTextSize(25);
        come_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        come_img.setVisibility(View.INVISIBLE);

        some_text.setTextSize(25);
        some_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        some_img.setVisibility(View.INVISIBLE);

        want_text.setTextSize(25);
        want_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        want_img.setVisibility(View.INVISIBLE);

        wait_text.setTextSize(25);
        wait_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        wait_img.setVisibility(View.INVISIBLE);

        went_text.setTextSize(25);
        went_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        went_img.setVisibility(View.INVISIBLE);

        washed_text.setTextSize(25);
        washed_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        washed_img.setVisibility(View.INVISIBLE);

        watch_text.setTextSize(25);
        watch_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        watch_img.setVisibility(View.INVISIBLE);

        take_text.setTextSize(25);
        take_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        take_img.setVisibility(View.INVISIBLE);

        is_text.setTextSize(25);
        is_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        is_img.setVisibility(View.INVISIBLE);

        bot_text.setTextSize(25);
        bot_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        bot_img.setVisibility(View.INVISIBLE);

        go_text.setTextSize(25);
        go_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        go_img.setVisibility(View.INVISIBLE);

        sow_text.setTextSize(25);
        sow_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        sow_img.setVisibility(View.INVISIBLE);

        buy_text.setTextSize(25);
        buy_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        buy_img.setVisibility(View.INVISIBLE);

        bike_text.setTextSize(25);
        bike_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        bike_img.setVisibility(View.INVISIBLE);

        be_text.setTextSize(25);
        be_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        be_img.setVisibility(View.INVISIBLE);

        saw_text.setTextSize(25);
        saw_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        saw_img.setVisibility(View.INVISIBLE);

        bright_text.setTextSize(25);
        bright_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        bright_img.setVisibility(View.INVISIBLE);

        bought_text.setTextSize(25);
        bought_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        bought_img.setVisibility(View.INVISIBLE);

        sea_text.setTextSize(25);
        sea_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        sea_img.setVisibility(View.INVISIBLE);

        red_text.setTextSize(25);
        red_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        red_img.setVisibility(View.INVISIBLE);

        rat_text.setTextSize(25);
        rat_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rat_img.setVisibility(View.INVISIBLE);

        rode_text.setTextSize(25);
        rode_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rode_img.setVisibility(View.INVISIBLE);

        rice_text.setTextSize(25);
        rice_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rice_img.setVisibility(View.INVISIBLE);

        ride_text.setTextSize(25);
        ride_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        ride_img.setVisibility(View.INVISIBLE);

        hive_text.setTextSize(25);
        hive_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        hive_img.setVisibility(View.INVISIBLE);

        live_text.setTextSize(25);
        live_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        live_img.setVisibility(View.INVISIBLE);

        have_text.setTextSize(25);
        have_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        have_img.setVisibility(View.INVISIBLE);

        stay_text.setTextSize(25);
        stay_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        stay_img.setVisibility(View.INVISIBLE);

        start_text.setTextSize(25);
        start_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        start_img.setVisibility(View.INVISIBLE);

        smile_text.setTextSize(25);
        smile_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        smile_img.setVisibility(View.INVISIBLE);

        see_text.setTextSize(25);
        see_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        see_img.setVisibility(View.INVISIBLE);

        study_text.setTextSize(25);
        study_text.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        study_img.setVisibility(View.INVISIBLE);
    }

    private void check_enabled()
    {
        btnCheck.setBackground(getResources().getDrawable(R.drawable.button_blue));
        textCheck.setTextColor(getResources().getColor(R.color.colorButton));
        textCheck.setText("Check");
        what_text.setVisibility(View.INVISIBLE);
        what_text.setEnabled(false);
    }
}
