package sut.ee.boydz.android_first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, addrEditText, phoneEditText,
            userEditText, passwordEditText;
    private String nameString,addressString, phoneString, userString,
            passwordString,genderString, imageString;




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

    public void clickSingUpSign(View view) {

        // Get Value From Edit Text
        nameString = nameEditText.getText().toString().trim();
        addressString = addrEditText.getText().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText .getText().toString().trim();

        //Check space
        if (nameString.equals("")|| addressString.equals("")||
                phoneString.equals("")|| userString.equals("")|| passwordString.equals("")) {
            //Have space
            MyAlet myAlet = new MyAlet(this, R.drawable.bird48,
                    "Error", "please put your data"); //create instant
            myAlet.myDialog();
        }
    } // clickSign

} //Main Class
