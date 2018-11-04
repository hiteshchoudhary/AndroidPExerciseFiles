package learncodeonline.in.examtimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this, R.raw.three);

        final TextView mnumber = findViewById(R.id.mnumber);
        final TextView done = findViewById(R.id.done);

        new CountDownTimer(10000, 1000){

            public void onTick(long millisecondsUntilDone){

                mnumber.setText("Time: " + String.valueOf(millisecondsUntilDone/1000));

            }
            public void onFinish(){

                done.setText("Done !!");
                m1.start();

            }


        }.start();


    }
}
