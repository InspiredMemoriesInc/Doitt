package in.inspiredmemories.doitt_theconfessionbase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by spoorthi on 26/11/2016.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, LauncherHomepage.class);
        startActivity(intent);
        finish();
    }
}
