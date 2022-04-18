package com.devbelmel.example0002;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonDialog;
    private TextView textViewDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDialog=(TextView) findViewById(R.id.textViewAlertDialog);
        buttonDialog=(Button) findViewById(R.id.buttonَAlertDialog);
        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder AlertBuilder=new AlertDialog.Builder(MainActivity.this);
                AlertBuilder.setMessage(textViewDialog.getText())
                        .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                               textViewDialog.setText("نص بعد ضغط زر تم");
                            }

                        })
                        .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                textViewDialog.setText("نص بعد ضغط زر إلغاء الأمر");
                            }
                        });
                AlertBuilder.create();
                AlertBuilder.show();
            }
        });
    }
}