package kr.necbong.nalcbong;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class AddAlarmActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_alarm);
        TextView saveAlarmButton = (TextView) findViewById(R.id.save_alarm);   // 버튼 : 알람 저장
        TextView cancelAlarmButton = (TextView) findViewById(R.id.cancel_alarm); // 버튼 : 알람 취소
        TimePicker timePicker = (TimePicker) findViewById(R.id.time_picker); // 시간 설정

        saveAlarmButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cancelAlarmButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}

// test