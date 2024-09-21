package com.example.actionbarexplorer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CustomActionBarActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_actionbar_activity);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        /*Theme in AndroidManifest: AppTheme.Light.NoActionBar(We're making our own, so we don't need one)
         * Theme for this activity has to be NoActionBar because using a theme with an action bar makes it impossible to set this toolbar as the support action bar.
        */
        /*For this code to work, the main app theme or the theme for this specific activity can't be NoActionBar. There'll be an error because we're trying to enable or set a title on an action bar that isn't there.*/
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Custom Action Bar");
    }
}
