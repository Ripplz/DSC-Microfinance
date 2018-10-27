package com.example.dscmicrofinance.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dscmicrofinance.R;
import com.example.dscmicrofinance.main.menu.AboutActivity;
import com.example.dscmicrofinance.main.menu.ContactActivity;
import com.example.dscmicrofinance.main.menu.OurServicesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMoney(View view) {
    }

    public void launchAbout(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void launchOurServices(View view) {
        Intent intent = new Intent(this, OurServicesActivity.class);
        startActivity(intent);
    }

    public void launchContact(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }

    public void logOut(View view) {
        finish();
    }
}
