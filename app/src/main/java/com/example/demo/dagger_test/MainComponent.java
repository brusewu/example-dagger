package com.example.demo.dagger_test;

import dagger.Component;

/**
 * Created by bruse on 2018/10/23.
 */
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
