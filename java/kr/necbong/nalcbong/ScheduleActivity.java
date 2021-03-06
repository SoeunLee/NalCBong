package kr.necbong.nalcbong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScheduleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        final Intent intent = new Intent(this, AlarmActivity.class);

        TextView title = (TextView) findViewById(R.id.title_schedule);   // 타이틀: 일정
        title.setPaintFlags(title.getPaintFlags() | Paint.FAKE_BOLD_TEXT_FLAG); // 한글 굵은 서체

        TextView calenderButton = (TextView)findViewById(R.id.button_calender);   // 버튼: 캘린더

        TextView changeMenuButton = (TextView) findViewById(R.id.button_change_menu_schedule);   // 버튼: 메뉴(알람)
        changeMenuButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                finish();
            }
        });

    }
}
