package in.inspiredmemories.doitt_theconfessionbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_details);

        Button forgot1 = (Button) findViewById(R.id.forgotdetails);
        // Set a click listener on that View
        assert forgot1 != null;
        forgot1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent forgotdIntent = new Intent(ForgotDetails.this, LoginActivity.class);
                startActivity(forgotdIntent);
            }
        });

    }
}
