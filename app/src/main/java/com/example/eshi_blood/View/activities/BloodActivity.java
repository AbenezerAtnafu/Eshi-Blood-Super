package com.example.eshi_blood.View.activities;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.eshi_blood.Adapter.BloodViewPagerAdapter;
import com.example.eshi_blood.R;
import com.example.eshi_blood.View.fragments.BloodDonateFragment;
import com.example.eshi_blood.View.fragments.HomeFragment;
import com.example.eshi_blood.View.fragments.NewsAndEventFragment;
import com.example.eshi_blood.View.fragments.NotficationFragment;
import com.example.eshi_blood.View.fragments.UserFragment;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class BloodActivity extends AppCompatActivity {

    private ViewPager2 bloodActivityViewPager;
    private BloodViewPagerAdapter bloodViewPagerAdapter;
    private TabLayout tabLayout;

    private ImageView bloodImageView;
    private TextView nameTextView;
    private TextView ageTextView;
    private TextView phoneTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

        bloodImageView = findViewById(R.id.blood_image_view);
        nameTextView = findViewById(R.id.name_text_view);
        ageTextView = findViewById(R.id.age_text_view);
        phoneTextView = findViewById(R.id.phone_text_view);

        bloodActivityViewPager = findViewById(R.id.blood_activity_view_pager);
        tabLayout = findViewById(R.id.blood_activity_tab_layout);
        bloodViewPagerAdapter = new BloodViewPagerAdapter(this);

        bloodViewPagerAdapter.addFragment(new HomeFragment(),"home");
        bloodViewPagerAdapter.addFragment(new NewsAndEventFragment(), "newsAndEvent");
        bloodViewPagerAdapter.addFragment(new BloodDonateFragment(), "bloodDonation");
        bloodViewPagerAdapter.addFragment(new NotficationFragment(), "notification");
        bloodViewPagerAdapter.addFragment(new UserFragment(), "userInfo");

        bloodActivityViewPager.setAdapter(bloodViewPagerAdapter);



        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, bloodActivityViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                ViewGroup vg = (ViewGroup) BloodActivity.this.bloodImageView.getParent();
                switch (position){
                    case 0:{
                        tab.setIcon(R.drawable.ic_home_black_24dp);

                        break;
                    }
                    case 1:{
                        tab.setIcon(R.drawable.ic_event_black_24dp);
                        BadgeDrawable badgeDrawable = tab.getOrCreateBadge();
                        badgeDrawable.setNumber(2);
                        break;
                    }
                    case 2:{
                        tab.setIcon(R.drawable.ic_blood_drop);
                        break;
                    }
                    case 3:{
                        tab.setIcon(R.drawable.ic_notifications_black_24dp);
                        BadgeDrawable badgeDrawable = tab.getOrCreateBadge();
                        badgeDrawable.setNumber(2);
                        break;
                    }
                    case 4:{
                        tab.setIcon(R.drawable.ic_person_black_24dp);
                        break;
                    }
                }
            }
        }
        );
        tabLayoutMediator.attach();



    }
}
