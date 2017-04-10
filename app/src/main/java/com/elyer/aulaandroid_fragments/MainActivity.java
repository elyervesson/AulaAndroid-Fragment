package com.elyer.aulaandroid_fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.elyer.aulaandroid_fragments.fragment.FragmentOne;
import com.elyer.aulaandroid_fragments.fragment.FragmentTwo;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment(View view){
        Fragment fragment;
        if(view == findViewById(R.id.button01)) {
            fragment = new FragmentOne();
            FragmentManager fragmentManager = getFragmentManager();
            //Replace the fragment to the fragment one
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_place, fragment);
            fragmentTransaction.commit();
        }
        if(view == findViewById(R.id.button02)) {
            fragment = new FragmentTwo();
            FragmentManager fragmentManager = getFragmentManager();
            //Replace the fragment to the fragment two
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_place, fragment);
            fragmentTransaction.commit();
        }
    }
}
