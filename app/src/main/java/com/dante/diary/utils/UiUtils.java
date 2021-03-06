package com.dante.diary.utils;

import android.app.Activity;
import android.app.Dialog;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.dante.diary.R;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;


public class UiUtils {

    public static void showSnack(View rootView, int textId) {
        if (null != rootView) {
            Snackbar.make(rootView, textId, Snackbar.LENGTH_SHORT).show();
        }
    }

    public static void showSnack(View rootView, String text) {
        if (null != rootView) {
            Snackbar.make(rootView, text, Snackbar.LENGTH_SHORT).show();
        }
    }

    public static void showSnackLong(View rootView, int textId) {
        if (null != rootView) {
            Snackbar.make(rootView, textId, Snackbar.LENGTH_LONG).show();
        }
    }

    public static void showSnackLong(View rootView, int textId, int actionTextId, View.OnClickListener onClickListener) {
        if (null != rootView) {
            Snackbar.make(rootView, textId, Snackbar.LENGTH_LONG).setAction(actionTextId, onClickListener).show();
        }
    }

    public static void showSnackLong(View rootView, String text, int actionTextId, View.OnClickListener onClickListener) {
        if (null != rootView) {
            Snackbar.make(rootView, text, Snackbar.LENGTH_LONG).setAction(actionTextId, onClickListener).show();
        }
    }

    public static void showSnack(View rootView, int textId, int actionTextId, View.OnClickListener onClickListener) {
        if (null != rootView) {
            Snackbar.make(rootView, textId, Snackbar.LENGTH_SHORT).setAction(actionTextId, onClickListener).show();
        }
    }

    public static void showSnack(View rootView, String text, int actionTextId, View.OnClickListener onClickListener) {
        if (null != rootView) {
            Snackbar.make(rootView, text, Snackbar.LENGTH_SHORT).setAction(actionTextId, onClickListener).show();
        }
    }

    public static void showSnackLong(View rootView, String text) {
        if (null != rootView) {
            Snackbar.make(rootView, text, Snackbar.LENGTH_LONG).show();
        }
    }

    public static void showDetailDialog(Activity activity, String text) {
        Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.intro_detail);
        dialog.show();
        TextView textView = (TextView) dialog.findViewById(R.id.introduction);
        textView.setOnClickListener(v1 -> dialog.dismiss());
        textView.setText(text);
    }

    public static void sleep(int seconds) {
        try {
            Log.i(TAG, "Start sleep...");
            Thread.sleep(seconds * 1000);
            Log.i(TAG, "End sleep.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
