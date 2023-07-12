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

    private ImageButton underline_btn;
    private ImageButton bold_btn;
    private ImageButton italic_btn;
    private ImageButton strike_btn;
    private EditText editText;
    private ImageButton color_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text);
        underline_btn = (ImageButton) findViewById(R.id.underline);
        bold_btn = (ImageButton) findViewById(R.id.bold);
        italic_btn = (ImageButton) findViewById(R.id.italic);
        strike_btn = (ImageButton) findViewById(R.id.strikethrough);
        color_btn = (ImageButton) findViewById(R.id.color);
        underline_btn.setOnClickListener(this);
        bold_btn.setOnClickListener(this);
        strike_btn.setOnClickListener(this);
        italic_btn.setOnClickListener(this);
        color_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int middle = v.getId();
        String s = String.valueOf(editText.getText());
        if (middle == R.id.bold) {
            addStyleSpan_bold(s);
        } else if (middle == R.id.underline) {
            addUnderLineSpan(s);
        } else if (middle == R.id.italic) {
            addStyleSpan_italic(s);
        } else if (middle == R.id.strikethrough) {
            addStrikeSpan(s);
        } else if (middle==R.id.color) {
            addForeColorSpan(s);

        }
    }

    private void addStyleSpan_bold(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), editText.getSelectionStart(), editText.getSelectionEnd(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addStyleSpan_italic(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new StyleSpan(Typeface.ITALIC),  editText.getSelectionStart(), editText.getSelectionEnd(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addUnderLineSpan(String s) {
        SpannableString spanString = new SpannableString(s);

        spanString.setSpan(new UnderlineSpan(),  editText.getSelectionStart(), editText.getSelectionEnd(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addStrikeSpan(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new StrikethroughSpan(),  editText.getSelectionStart(), editText.getSelectionEnd(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

    private void addForeColorSpan(String s) {
        SpannableString spanString = new SpannableString(s);
        spanString.setSpan(new ForegroundColorSpan(Color.BLUE),  editText.getSelectionStart(), editText.getSelectionEnd(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        editText.setText(spanString);
    }

}