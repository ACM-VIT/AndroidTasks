package com.ssindher11.androidtasks.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;
import com.ssindher11.androidtasks.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DevanshsFragment extends Fragment {

    private Button animationbtn;
    private EditText edt1;
    private LottieAnimationView animationView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_devanshs, container, false);

        animationView=view.findViewById(R.id.animation_view);

        animationbtn=view.findViewById(R.id.animationbtn);
        edt1=view.findViewById(R.id.edt1);

        edt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String spd=edt1.getText().toString();
                Float speed=Float.parseFloat(spd);
                animationView.setSpeed(speed);

                animationView.setAnimation("77-im-thirsty.json");
                animationView.loop(Boolean.parseBoolean("true"));
                animationView.playAnimation();
            }
        });
        return view;

//TODO : Welcome to your Fragment Devansh.
        //TODO : Step 1, Inflate your layout file
        //TODO : Step 2, Assign views to your JAVA Objects (Binding view to code)
        //TODO : Step 3, Once you become familiar with Fragments, choose any animation from Lottie
        //TODO : Step 4, Show the animation of your choice in your fragment. Take the speed of animation as an input from user
        //TODO : Step 5, Put a start button in your fragment, pressing which starts the Animation
        //TODO : P.S. The library has already been integrated. Refer to Lottie documentations and start coding part
        //TODO : A sample Fragment has been worked for you to see how view bindings are done in Fragments.
    }
}
