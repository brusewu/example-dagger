package com.example.demo.dagger_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        person = new Person();
        MainComponent component = DaggerMainComponent.builder()
                .mainModule(new MainModule()).build();
        component.inject(this);
    }
}
