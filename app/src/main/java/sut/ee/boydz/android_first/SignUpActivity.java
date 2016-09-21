package sut.ee.boydz.android_first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, addrEditText, phoneEditText, userEditText, passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        addrEditText = (EditText)findViewById(R.id.editText2);
        phoneEditText = (EditText) findViewById(R.id.editText3);
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);

    } // Main Method



} //Main Class
