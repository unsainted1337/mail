package com.example.mail;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ArrAdapter extends ArrayAdapter<data_get_set> {
    public ArrAdapter(@NonNull Context context, int resource, @NonNull ArrayList<data_get_set> objects) {
        super(context, resource, objects);
    }
}
