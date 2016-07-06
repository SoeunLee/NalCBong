package kr.necbong.nalcbong;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by soeun on 2016. 7. 6..
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();       // 2초후 이미지를 닫아버림
            }
        }, 2000);
    }


}
