package com.imobile3.groovypayments.ui.user;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

import com.imobile3.groovypayments.R;
import com.imobile3.groovypayments.ui.BaseActivity;

public class UserProfileActivity extends BaseActivity {

    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile_activity);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        setUpMainNavBar();
        setUpViews();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void setUpMainNavBar() {
        super.setUpMainNavBar();
        mMainNavBar.showBackButton();
        mMainNavBar.showLogo();
    }

    @Override
    protected void initViewModel() {
        // No view model needed.
    }

    private void setUpViews() {
        TextView lblUsername = findViewById(R.id.label_username);
        TextView lblEmail = findViewById(R.id.label_email);
        TextView lblHoursWeek = findViewById(R.id.label_hours_week);

        lblUsername.setText(preferences.getString("username","null"));
    }
}
