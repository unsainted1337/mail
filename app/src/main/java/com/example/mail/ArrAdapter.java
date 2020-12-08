package com.example.mail;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



import java.util.ArrayList;
import java.util.List;

public class ArrAdapter extends ArrayAdapter<data_get_set> {

    Context context;
    int resource;
    List<data_get_set> data_array;

    public ArrAdapter(@NonNull Context context, int resource, @NonNull ArrayList<data_get_set> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        data_array = objects;
    }

    @Override
    public int getCount() {
        return data_array.size();
    }

    @Nullable
    @Override
    public data_get_set getItem(int position) {
        return data_array.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, resource, parent);
        }

        ImageView image = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.txtName);
        TextView l_name = convertView.findViewById(R.id.txtLName);
        TextView birthday = convertView.findViewById(R.id.txtBirthday);

        data_get_set data_item = data_array.get(position);

//        image.setImageBitmap(data_item.getImage());
        name.setText(data_item.getName());
        l_name.setText(data_item.getLname());
        birthday.setText(data_item.getBirthday());

        return convertView;
    }
}
