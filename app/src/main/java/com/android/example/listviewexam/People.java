
package com.android.example.listviewexam;

/**
 * Created by ws on 2015-08-31.
 *
 * 사람클래스
 */
public class People {

    private String name;
    private String phoneNumber;
    private int imageResourced;

    public People(String name, String phoneNumber, int imageResourced) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.imageResourced = imageResourced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImageResourced() {
        return imageResourced;
    }

    public void setImageResourced(int imageResourced) {
        this.imageResourced = imageResourced;
    }
}
