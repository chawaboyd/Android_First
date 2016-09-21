package sut.ee.boydz.android_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SignUpActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText nameEditText, addrEditText, phoneEditText,
            userEditText, passwordEditText;
    private String nameString,addressString, phoneString, userString,
            passwordString,genderString, imageString;
    private RadioButton maleRadioButton, femaleRadioButton;
    private ImageView imageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    //Bind Widget ********
        nameEditText = (EditText) findViewById(R.id.editText); // alt+Enter
        addrEditText = (EditText)findViewById(R.id.editText2);
        phoneEditText = (EditText) findViewById(R.id.editText3);
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);
        maleRadioButton = (RadioButton) findViewById(R.id.radioButton);
        femaleRadioButton = (RadioButton) findViewById(R.id.radioButton2);
        imageView = (ImageView) findViewById(R.id.imageView);

        //ImageView Controller ****
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(Intent.createChooser(intent, "Please select your photo!"),1);
            }//onClick
        });

    } // Main Method

    @Override //alt+insert then select Override Method and then find onActivityResult.
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == 1)&& (resultCode == RESULT_OK)) {

            Log.d("SUTFriendV1", "Result ==> Sucess");



        }


    } //onActivityResult

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
                    "Error", "Please, put your data!"); //create instant
            myAlet.myDialog();
        } else if (!(maleRadioButton.isChecked()|| femaleRadioButton.isChecked())) {
            //Non check Gender
            MyAlet myAlet =new MyAlet(this, R.drawable.rat48,
                    "Error", "Please, select Gender!");
            myAlet.myDialog();
        }
    } // clickSign

} //Main Class
