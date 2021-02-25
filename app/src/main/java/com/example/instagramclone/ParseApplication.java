package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse madels
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xaVDtTeBeO4kPwvHKwhfwHBto6r30jSdtEYU4vJO")
                .clientKey("GCZLAkJQKwPVS4LyATgmw0QmdeKAvyDyvpkJtSAF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
