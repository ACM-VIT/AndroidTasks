
package com.ssindher11.androidtasks.fragments;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.ssindher11.androidtasks.R;

public class VibhoresFragment extends Fragment {


    private Button growButton;
    private LottieAnimationView animationView;
    private EditText speed;
    private Button ok;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_vibhores, container, false);

        animationView=  v.findViewById(R.id.animation_view);

        growButton=v.findViewById(R.id.btn_grow);
        speed=(EditText)v.findViewById(R.id.text_speed);
        ok=(Button)v.findViewById(R.id.ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s =speed.getText().toString();
                float f=Float.parseFloat(s);

                animationView.setSpeed((float) f);

            }
        });

        growButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                animationView.setAnimation("data.json");
                animationView.loop(Boolean.parseBoolean("true"));
                animationView.playAnimation();
            }
        });

        return v;




        //TODO : Welcome to your Fragment Vibhore.
        //TODO : Step 1, Inflate your layout file
        //TODO : Step 2, Assign views to your JAVA Objects (Binding view to code)
        //TODO : Step 3, Once you become familiar with Fragments, choose any animation from Lottie
        //TODO : Step 4, Show the animation of your choice in your fragment. Take the speed of animation as an input from user
        //TODO : Step 5, Put a start button in your fragment, pressing which starts the Animation
        //TODO : P.S. The library has already been integrated. Refer to Lottie documentations and start coding part
        //TODO : A sample Fragment has been worked for you to see how view bindings are done in Fragments.

    }



}
