package kr.necbong.nalcbong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AlarmActivity extends Activity {

    // TODO: Jongmin + Soeun
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        final Intent scheduleIntent = new Intent(this, ScheduleActivity.class);
        final Intent addAlarmIntent = new Intent(this, AddAlarmActivity.class);

        TextView title = (TextView) findViewById(R.id.title_alarm);   // 타이틀: 알람
        TextView add = (TextView) findViewById(R.id.add_alarm); // 타이틀 : +(알람 추가)
        title.setPaintFlags(title.getPaintFlags() | Paint.FAKE_BOLD_TEXT_FLAG); // 한글 굵은 서체

        TextView changeMenuButton = (TextView) findViewById(R.id.button_change_menu_alarm);   // 버튼: 메뉴(일정)
        changeMenuButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(scheduleIntent);
                finish();
            }
        });

        TextView addAlarmButton = (TextView) findViewById(R.id.add_alarm); // 버튼 : 알람 추가
        addAlarmButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(addAlarmIntent);
                finish();
            }
        });
    }
}
