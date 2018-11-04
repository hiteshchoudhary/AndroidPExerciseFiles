package learncodeonline.in.jsonproject;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Student {

    private String name;
    @SerializedName("course_count")
    private int courseCount;
    private String email;

    @SerializedName("video")
    private List<Video> mVideo;

    @SerializedName("course")
    private Course mCourse;

    public Student(String name, int course_count, String email, Course course, List<Video> video) {
        this.name = name;
        this.courseCount = course_count;
        this.email = email;
        mCourse = course;
        mVideo = video;
    }
}
