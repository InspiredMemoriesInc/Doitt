package in.inspiredmemories.doitt_theconfessionbase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginToHome = (Button)findViewById(R.id.login_in_login);
        Button forgotToForgot = (Button)findViewById(R.id.forgot_in_login);
        Button signUpTosignUp = (Button)findViewById(R.id.signup_in_login);
        loginToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginToHomeIntent = new Intent(LoginActivity.this,Activity_Custom_View_icon_text_tabs.class);
                startActivity(loginToHomeIntent);
            }
        });

        forgotToForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotToForgotIntent = new Intent(LoginActivity.this, ForgotDetails.class);
                startActivity(forgotToForgotIntent);
            }
        });

        signUpTosignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUpTosignUpIntent = new Intent(LoginActivity.this, SignnUpActivity.class);
                startActivity(signUpTosignUpIntent);
            }
        });
    }
}
