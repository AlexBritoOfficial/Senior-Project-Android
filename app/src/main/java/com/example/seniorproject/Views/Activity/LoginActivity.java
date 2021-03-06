package com.example.seniorproject.Views.Activity;

import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.example.seniorproject.R;
import com.example.seniorproject.Views.Fragment.HomePageFragment;
import com.example.seniorproject.Views.Fragment.LoginFragment;
import com.google.android.material.appbar.MaterialToolbar; //prob not used

public class LoginActivity extends SingleFragmentActivity {

    public static String LOGIN_FRAGMENT_ACTIVITY = "Login Fragment Activity";

    @Override
    protected Fragment createFragment() {
        return new LoginFragment();
    }
}
