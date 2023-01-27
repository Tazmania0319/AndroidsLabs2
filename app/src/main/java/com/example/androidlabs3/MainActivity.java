package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstText = findViewById(R.id.inputtext);

        EditText theEdit = findViewById(R.id.editText);

        final Button btn = findViewById(R.id.button);
        btn.setText("Press Me");
        btn.setOnClickListener( (click) ->  { btn.setText("Label has been updated"); });

        CheckBox cb = findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener( (compoundButton, b) -> {

            Snackbar.make(theEdit, "Checkbox is now " + b, Snackbar.LENGTH_LONG)
                    .setAction("Undo", click-> compoundButton.setChecked( !b )).show();

        });
    }
}