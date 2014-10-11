package com.codepath.jaiminshah.parseplayapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
/**
 * Created by jaimins on 10/10/14.
 */
public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        Parse.initialize(this, "wR0QJAoFmkwwAbGjqI8bWvhpKbRTv19FpSgwIRk1", "ny2ltChTYfmZtDpIouSuCERXUvAXFTMB269d4rY2");

        ParseInstallation.getCurrentInstallation().saveInBackground();

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
