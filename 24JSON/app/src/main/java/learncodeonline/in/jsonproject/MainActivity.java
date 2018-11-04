package learncodeonline.in.jsonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//        Student student = new Student("Hitesh", 5, "hitesh@lco.in");
//
//        String json = gson.toJson(student);


//       String json = "{\"course_count\":5,\"email\":\"hitesh@lco.in\",\"name\":\"Hitesh\"}";
//       Student student = gson.fromJson(json, Student.class);
//
//        Log.d("TEST", student.toString());

        List<Video> videos = new ArrayList<>();
        videos.add(new Video("Intro", 4));
        videos.add(new Video("Exercise files", 8));
        videos.add(new Video("Installation", 12));


        Course course = new Course("Java", "Bootcamp");
        Student student = new Student("hitesh", 3, "hitesh@lco.in", course, videos);
        String json = gson.toJson(student);

//        String json = "{\"course_count\":3,\"email\":\"hitesh@lco.in\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"name\":\"hitesh\"}";
//        Student student = gson.fromJson(json, Student.class);


//        Log.d("TEST", student.toString());
        Log.d("TEST", json);





    }
}
