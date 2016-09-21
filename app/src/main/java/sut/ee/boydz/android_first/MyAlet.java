package sut.ee.boydz.android_first;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by User on 21/9/2559.
 */
public class MyAlet {

    //Exclicit improtant for creat Alet
    private Context context;
    private int anInt;
    private String titleSring, messageString;

    // Constuctor setter
    public MyAlet(Context context, int anInt, String titleSring, String messageString) {
        this.context = context;
        this.anInt = anInt;
        this.titleSring = titleSring;
        this.messageString = messageString;

    }

    public void myDialog() {

        //this section for Alet
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titleSring);
        builder.setMessage(messageString);
        //set Positive Button
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); // set dialog to dismiss
            }
        });
        builder.show();
    }

} // Main Class
