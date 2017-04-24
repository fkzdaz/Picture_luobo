package com.example.fang.picture_luobo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Fkz on 2017/4/24.
 */

public class ToastUtil {
    private Toast toast;
    public void showToast(Context context,String content){
        if (toast==null){
            toast=Toast.makeText(context,content,Toast.LENGTH_SHORT);
        }
        else {

        }
    }
}
