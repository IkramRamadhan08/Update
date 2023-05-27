package androidx.leanback.leanbackshowcase.app;


import androidx.fragment.app.FragmentActivity;
import androidx.leanback.leanbackshowcase.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Screen extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash_Screen.this,MainActivity.class);
            Splash_Screen.this.startActivity(intent);
            Splash_Screen.this.finish();
        },4000);
    }
}