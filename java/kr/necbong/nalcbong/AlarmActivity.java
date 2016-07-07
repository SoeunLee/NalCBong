package kr.necbong.nalcbong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlarmActivity extends Activity {

    // TODO: Jongmin + Soeun
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        final Intent intent = new Intent(this, ScheduleActivity.class);

        TextView title = (TextView) findViewById(R.id.title_alarm);   // 타이틀: 알람
        title.setPaintFlags(title.getPaintFlags() | Paint.FAKE_BOLD_TEXT_FLAG); // 한글 굵은 서체

        TextView changeMenuButton = (TextView) findViewById(R.id.button_change_menu_alarm);   // 버튼: 메뉴(일정)
        changeMenuButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                finish();
            }
        });
    }
}
