package com.example.richedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.*;
import android.text.*;
import android.view.*;
import android.os.Bundle;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button underline_btn;
    private Button Bold_btn;
    private Button color_btn;
    private Button italic_btn;
    private Button strike_btn;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text);
        underline_btn = (Button) findViewById(R.id.tv_2);
        Bold_btn = (Button) findViewById(R.id.tv_1);
        color_btn = (Button) findViewById(R.id.tv_4);
        italic_btn = (Button) findViewById(R.id.tv_3);
        strike_btn = (Button) findViewById(R.id.tv_5);

        underline_btn.setOnClickListener(this);
        Bold_btn.setOnClickListener(this);
        strike_btn.setOnClickListener(this);
        color_btn.setOnClickListener(this);
        italic_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int middle = v.getId();
        String s = String.valueOf(editText.getText());
        if (middle == R.id.tv_1) {
            addStyleSpan_bold(s);
        } else if (middle == R.id.tv_2) {
            addUnderLineSpan(s);
        } else if (middle == R.id.tv_3) {
            addStyleSpan_italic(s);
        } else if (middle == R.id.tv_4) {
            addForeColorSpan(s);
        } else if (middle == R.id.tv_5) {
            addStrikeSpan(s);
        }
    }

    private void addStyleSpan_bold(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addStyleSpan_italic(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new StyleSpan(Typeface.ITALIC), 0, s.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addUnderLineSpan(String s) {
        SpannableString spanString = new SpannableString(s);

        spanString.setSpan(new UnderlineSpan(), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addStrikeSpan(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new StrikethroughSpan(), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addForeColorSpan(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new ForegroundColorSpan(Color.YELLOW), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

}