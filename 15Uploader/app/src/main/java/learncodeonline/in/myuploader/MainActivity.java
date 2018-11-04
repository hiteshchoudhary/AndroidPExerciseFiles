package learncodeonline.in.myuploader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar, progressBarHorizontal;
    Button start, end, upload;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);

        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        upload = findViewById(R.id.upload);

        progressBar.setVisibility(View.GONE);

    }

    public void start(View view){
        progressBar.setVisibility(View.VISIBLE);
    }

    public void end(View view){
        progressBar.setVisibility(View.GONE);
    }

    public void upload(View view){
        fakeProgress(progress);
    }

    public void fakeProgress(final int progress){

        progressBarHorizontal.setProgress(progress);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                fakeProgress(progress + 10);
            }
        });
        thread.start();

    }



}
