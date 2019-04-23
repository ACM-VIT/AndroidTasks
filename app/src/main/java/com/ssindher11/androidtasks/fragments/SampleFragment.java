package com.ssindher11.androidtasks.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ssindher11.androidtasks.R;
import com.ssindher11.androidtasks.activities.HomeActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SampleFragment extends Fragment {

    private Button akshitsButton, devanshsButton, jerelynsButton, vibhoresButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Inflating (Creating) View
        View view = inflater.inflate(R.layout.fragment_sample, container, false);

        //Assigning Java Names to UI elements
        intializeViews(view);

        //Assigning actions to elements
        akshitsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.getFragmentSwitchInterface().switchToAkshit();
            }
        });

        devanshsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.getFragmentSwitchInterface().switchToDevansh();
            }
        });

        jerelynsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.getFragmentSwitchInterface().switchToJerelyn();
            }
        });

        vibhoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity.getFragmentSwitchInterface().switchToVibhore();
            }
        });

        return view;
    }

    void intializeViews(View view){
        akshitsButton = view.findViewById(R.id.btn_akshit);
        devanshsButton = view.findViewById(R.id.btn_devansh);
        jerelynsButton = view.findViewById(R.id.btn_jerelyn);
        vibhoresButton = view.findViewById(R.id.btn_vibhore);
    }
}
