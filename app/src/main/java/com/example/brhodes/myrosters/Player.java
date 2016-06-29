package com.example.brhodes.myrosters;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by brhodes on 6/28/2016.
 */
public class Player implements Parcelable {
    private String name;
    private String age;
    private String school;
    private String height;
    private int playerPictureResId;

    public Player(String name, String age, String school, String height, int playerPictureRedId) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.height = height;
        this.playerPictureResId = playerPictureRedId;
    }

    // Constructor to use when re-constructing object from a parcel
    // @param in a parcel from which to read this object
    public Player(Parcel in) {
        readFromParcel(in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getPlayerPictureResId() {
        return playerPictureResId;
    }

    public void setPlayerPicture(int playerPictureResId) {
        this.playerPictureResId = playerPictureResId;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        // We just need to write each field into the
        // parcel. When we read from parcel, they
        // will come back in the same order
        dest.writeString(this.name);
        dest.writeString(this.age);
        dest.writeString(this.school);
        dest.writeString(this.height);
        dest.writeInt(playerPictureResId);
    }

    // Called from the constructor to create this object from a parcel.
    // @param in parcel from which to re-create object
    private void readFromParcel(Parcel in) {
        // We just need to read back each
        // field in the order that it was
        // written to the parcel
        this.name = in.readString();
        this.age = in.readString();
        this.school = in.readString();
        this.height = in.readString();
        this.playerPictureResId = in.readInt();
    }

    // This field is needed for Android to be able to
    // create new objects, individually or as arrays.
    //
    // This also means that you can use use the default
    // constructor to create the object and use another
    // method to hydrate it as necessary.
    public static final Parcelable.Creator CREATOR =
            new Parcelable.Creator() {
                public Player createFromParcel(Parcel in) {
                    return new Player(in);
                }

                public Player[] newArray(int size) {
                    return new Player[size];
                }
            };
}

