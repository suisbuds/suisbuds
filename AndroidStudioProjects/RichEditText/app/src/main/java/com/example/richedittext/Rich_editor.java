package com.example.richedittext;

import android.content.Context;
import android.graphics.Typeface;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.EditText;
import android.text.*;

public class Rich_editor extends androidx.appcompat.widget.AppCompatEditText  {


    public Rich_editor(Context context){
        super(context);
    }
    //RichEditText的基本编辑功能
    protected void styleValid(int style,int start,int end){
        switch (style) {
            case Typeface.NORMAL:
            case Typeface.BOLD:
            case Typeface.ITALIC:
            case Typeface.BOLD_ITALIC:
                break;
            default:
                return;
        }
        if (start >= end) {
            return;
        }
        getEditableText().setSpan(new StyleSpan(style), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

    protected void styleInvalid(int style,int start,int end){
        switch (style) {
            case Typeface.NORMAL:
            case Typeface.BOLD:
            case Typeface.ITALIC:
            case Typeface.BOLD_ITALIC:
                break;
            default:
                return;
        }
        if (start >= end) {
            return;
        }


    }
}
