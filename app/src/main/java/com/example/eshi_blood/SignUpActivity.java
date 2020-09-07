package com.example.eshi_blood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        viewPager = (ViewPager) findViewById(R.id.registration_view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter((getSupportFragmentManager()));
        adapter.AddFragment(new EligibilityCheckFragment(), "Eligibility Check");
        adapter.AddFragment(new PersonalInformationFragment(), "Personal Information");

        viewPager.setAdapter(adapter);
    }
}
