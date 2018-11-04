package learncodeonline.in.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicy;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy = findViewById(R.id.imageView);

        imageViewDicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollOurDice();
            }
        });

    }

    private void rollOurDice(){
        int myRanNumber = myRandomNumber.nextInt(6) + 1;

        switch (myRanNumber) {
            case 1:
                imageViewDicy.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy.setImageResource(R.drawable.dice6);
                break;
        }

    }




}









