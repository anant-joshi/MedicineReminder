package com.kjsce.hackathon.medicinereminder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String MEAL_TIME_FRAGMENT_TAG = "MTFT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.activity_main)!=null){
            SetMealTimeFragment mealTimeFragment = new SetMealTimeFragment();
              getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.activity_main, mealTimeFragment, MEAL_TIME_FRAGMENT_TAG).commit();
        }
    }
}