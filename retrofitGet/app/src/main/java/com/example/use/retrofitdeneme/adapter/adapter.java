package com.example.use.retrofitdeneme.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import com.example.use.retrofitdeneme.Model.Bilgiler;
import com.example.use.retrofitdeneme.R;

import java.util.List;

public class adapter extends BaseAdapter {
    List<Bilgiler> list;
    Context context;

    public adapter(List<Bilgiler> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        EditText userid=convertView.findViewById(R.id.userId);
        EditText id=convertView.findViewById(R.id.Id);
        EditText title=convertView.findViewById(R.id.title);
        EditText body=convertView.findViewById(R.id.body);
        userid.setText(""+list.get(position).getUserId());
        id.setText(""+list.get(position).getId());
        title.setText(""+list.get(position).getTitle());
        body.setText(""+list.get(position).getBody());
        return convertView;
    }
}
