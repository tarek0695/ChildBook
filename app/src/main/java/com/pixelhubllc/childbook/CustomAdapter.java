package com.pixelhubllc.childbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] titleString;
    String[] descriptionString;
    private LayoutInflater inflater;


    public CustomAdapter(Context context, String[] titleString, String[] descriptionString) {
        this.context = context;
        this.titleString = titleString;
        this.descriptionString = descriptionString;
    }

    @Override
    public int getCount() {
        return titleString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_layout, parent, false);
        }

        TextView textView1 = convertView.findViewById(R.id.textView1);
        TextView textView2 = convertView.findViewById(R.id.textView2);

        textView1.setText(titleString[position]);
        textView2.setText(descriptionString[position]);
        return convertView;
    }
}
