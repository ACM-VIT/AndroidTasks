package com.ssindher11.androidtasks.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.ssindher11.androidtasks.FragmentSwitchInterface;
import com.ssindher11.androidtasks.R;
import com.ssindher11.androidtasks.fragments.AkshitsFragment;
import com.ssindher11.androidtasks.fragments.DevanshsFragment;
import com.ssindher11.androidtasks.fragments.JerelynsFragment;
import com.ssindher11.androidtasks.fragments.SampleFragment;
import com.ssindher11.androidtasks.fragments.VibhoresFragment;

public class HomeActivity extends AppCompatActivity {

    private static FragmentSwitchInterface fragmentSwitchInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        switchFragment(new SampleFragment());
        findViewById(R.id.ib_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitchInterface.switchToHome();
            }
        });
        fragmentSwitchInterface = new FragmentSwitchInterface() {
            @Override
            public void switchToHome() {
                switchFragment(new SampleFragment());
            }

            @Override
            public void switchToAkshit() {
                switchFragment(new AkshitsFragment());
            }

            @Override
            public void switchToDevansh() {
                switchFragment(new DevanshsFragment());
            }

            @Override
            public void switchToJerelyn() {
                switchFragment(new JerelynsFragment());
            }

            @Override
            public void switchToVibhore() {
                switchFragment(new VibhoresFragment());
            }
        };
    }

    void switchFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }

    public static FragmentSwitchInterface getFragmentSwitchInterface() {
        return fragmentSwitchInterface;
    }


}
