package com.example.android.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cat = 0;
    int dog = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String getName() {
        EditText nameInput = findViewById(R.id.name_text_input);
        return nameInput.getText().toString();
    }

    private void setText (String summary) {
        TextView answear = findViewById(R.id.summary_tv);
        answear.setText(summary);
    }

    public void check(View view) {
        countPoints();
        String summary = prepareMessage();
        setText(summary);
    }

    private void swim() {
        RadioGroup swimRg = findViewById(R.id.swim_rg);
        RadioButton swimRbYes = findViewById(R.id.swim_yes_rb);
        RadioButton swimRbNo = findViewById(R.id.swim_no_rb);
        if (swimRbYes.getId() == swimRg.getCheckedRadioButtonId()) {
            dog += 1;
        }
        if (swimRbNo.getId() == swimRg.getCheckedRadioButtonId()) {
            cat += 1;
        }
    }

    private void climb() {
        RadioGroup climbRg = findViewById(R.id.climbing_rg);
        RadioButton climbRbNo = findViewById(R.id.climbing_no_rb);
        RadioButton climbRbYes = findViewById(R.id.climbing_yes_rb);
        if (climbRbNo.getId() == climbRg.getCheckedRadioButtonId()) {
            dog += 1;
        }
        if (climbRbYes.getId() == climbRg.getCheckedRadioButtonId()) {
            cat += 1;
        }
    }

    private void food() {
        RadioGroup foodRg = findViewById(R.id.food_rg);
        RadioButton foodRbNo = findViewById(R.id.food_no_rb);
        RadioButton foodRbYes = findViewById(R.id.food_yes_rb);
        if (foodRbNo.getId() == foodRg.getCheckedRadioButtonId()) {
            dog += 1;
        }
        if (foodRbYes.getId() == foodRg.getCheckedRadioButtonId()) {
            cat += 1;
        }
    }

    private void instructions() {
        RadioGroup instructionsRg = findViewById(R.id.instructions_rg);
        RadioButton instructionsRbYes = findViewById(R.id.instructions_yes_rb);
        RadioButton instructionsRbNo = findViewById(R.id.instructions_no_rb);
        if (instructionsRbYes.getId() == instructionsRg.getCheckedRadioButtonId()) {
            dog += 1;
        }
        if (instructionsRbNo.getId() == instructionsRg.getCheckedRadioButtonId()) {
            cat += 1;
        }
    }

    private void drink() {
        CheckBox water = findViewById(R.id.water_cb);
        CheckBox milk = findViewById(R.id.milk_cb);
        if (water.isChecked()) {
            dog += 1;
        }
        if (milk.isChecked()) {
            cat += 1;
        }
    }

    private void countPoints() {
        dog = 0;
        cat = 0;
        swim();
        instructions();
        food();
        climb();
        drink();
    }

    private String prepareMessage() {
        String name = getName();
        String summary =  name + " ";
        if (dog > cat) {
            summary += "if you were animal you would be a dog ;)";
        } else if (dog < cat) {
            summary += "if you were animal you would be a cat ;)";
        } else {
            summary += "if you were animal you could be cat or dog...";
        }
        return summary;
    }
}
