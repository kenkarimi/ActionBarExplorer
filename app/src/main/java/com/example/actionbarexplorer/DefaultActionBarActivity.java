package com.example.actionbarexplorer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DefaultActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_actionbar_activity);

        /*Theme in AndroidManifest: AppTheme.Light.DarkActionBar(We override the main theme which is of type NoActionBar)*/
        /*For this code to work, the main app theme or the theme for this specific activity can't be NoActionBar. There'll be an error because we're trying to enable or set a title on an action bar that isn't there.*/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Default Action Bar");
    }
}
