package com.example.demo.dagger_test;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bruse on 2018/10/23.
 */
@Module
public class MainModule {

    @Provides
    Person providesPerson(){

        Log.d("bruse","a person module");
        return new Person();
    }
}
