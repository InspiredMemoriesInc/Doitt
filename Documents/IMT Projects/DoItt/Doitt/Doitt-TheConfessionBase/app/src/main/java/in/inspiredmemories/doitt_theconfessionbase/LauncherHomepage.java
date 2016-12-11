package in.inspiredmemories.doitt_theconfessionbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LauncherHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_homepage);

        TextView welcome = (TextView) findViewById(R.id.intro);
        welcome.setText("Welcome to");
        TextView welcometo = (TextView) findViewById(R.id.introd);
        welcometo.setText("Confession Base");
        TextView welcometoc = (TextView) findViewById(R.id.introdu);
        welcometoc.setText("to fireup everything arround you");

        Button letsgo = (Button) findViewById(R.id.loginButton);
        // Set a click listener on that View
        assert letsgo != null;
        letsgo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(LauncherHomepage.this, LoginActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
}
