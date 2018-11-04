package learncodeonline.in.jsonproject;

import com.google.gson.annotations.SerializedName;

public class Course {

    @SerializedName("name")
    private String mName;
    @SerializedName("description")
    private String mDescription;

    public Course(String mName, String mDescription) {
        this.mName = mName;
        this.mDescription = mDescription;
    }



}
