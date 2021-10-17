package com.asaniontiveros.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WqbY8mlIorMczbmrdYBTA4ap1CjbCkucTz4NtX2H")
                .clientKey("N4EJw6xSeXU6qVNpwjN34OkfJ26jB68LtDV6rZcF")
                .server("https://parseapi.back4app.com")
                .build());
    }

}
