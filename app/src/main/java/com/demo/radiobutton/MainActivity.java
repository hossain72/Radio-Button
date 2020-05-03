package com.demo.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    /*    private RadioButton radioButton;*/
    private RadioButton maleRadioBtn, femaleRadioBtn, othersRadioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        maleRadioBtn = findViewById(R.id.male);
        femaleRadioBtn = findViewById(R.id.female);
        othersRadioBtn = findViewById(R.id.others);

    }

    public void checkRadioBtn(View view) {

    /*    int selectID = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(selectID);
        Toast.makeText(this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();*/

        if (maleRadioBtn.isChecked()) {
            Toast.makeText(this, maleRadioBtn.getText().toString(), Toast.LENGTH_SHORT).show();
        } else if (femaleRadioBtn.isChecked()) {
            Toast.makeText(this, femaleRadioBtn.getText().toString(), Toast.LENGTH_SHORT).show();
        } else if (othersRadioBtn.isChecked()) {
            Toast.makeText(this, othersRadioBtn.getText().toString(), Toast.LENGTH_SHORT).show();
        }

    }
}
