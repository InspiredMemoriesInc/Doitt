package in.inspiredmemories.doitt_theconfessionbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignnUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signn_up);

        Button signin = (Button) findViewById(R.id.signin);
        // Set a click listener on that View
        assert signin != null;
        signin.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent signinIntent = new Intent(SignnUpActivity.this, LoginActivity.class);
                startActivity(signinIntent);
            }
        } );


        Button Makeit = (Button) findViewById(R.id.signup);
        // Set a click listener on that View
        assert Makeit != null;
        Makeit.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent MakeitIntent = new Intent(SignnUpActivity.this, LauncherHomepage.class);
                startActivity(MakeitIntent);
            }
        });
    }
}
