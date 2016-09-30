package com.kjsce.hackathon.medicinereminder;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SetMealTimeFragment extends Fragment {
    public static final String PREFS_NAME = "mealtime_preference";
    SharedPreferences preferences = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_set_meal_time,container,true);
        CardView breakfastCard = (CardView) rootView.findViewById(R.id.breakfast_button_card);
        CardView lunchCard = (CardView) rootView.findViewById(R.id.lunch_button_card);
        CardView dinnerCard = (CardView) rootView.findViewById(R.id.dinner_button_card);
        breakfastCard.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //TODO: Add code for breakfast time
                    }
                }
        );

        lunchCard.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //TODO: Add code for breakfast time
                    }
                }
        );

        dinnerCard.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //TODO: Add code for breakfast time
                    }
                }
        );

        return super.onCreateView(inflater, container, savedInstanceState);

    }
}
