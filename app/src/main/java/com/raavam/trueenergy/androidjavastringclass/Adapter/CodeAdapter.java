package com.raavam.trueenergy.androidjavastringclass.Adapter;

import android.content.Context;
import android.text.Html;
import android.text.InputType;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.raavam.trueenergy.androidjavastringclass.Model.DataModel;
import com.raavam.trueenergy.androidjavastringclass.R;

import java.util.ArrayList;

public class CodeAdapter extends ArrayAdapter {

    private Context mCtx;
    ArrayList<DataModel> CodeList;

    public CodeAdapter(Context context, int textViewResourceId, ArrayList objects) {
        super(context, textViewResourceId, objects);
        this.mCtx = context;
        CodeList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.custom_layout, null);
        TextView txt_java_code = (TextView) v.findViewById(R.id.txt_java_code);
        TextView txt_output = (TextView) v.findViewById(R.id.txt_output);
        TextView txt_explanation = (TextView) v.findViewById(R.id.txt_explanation);
        txt_explanation.setSingleLine(false);


        txt_java_code.setText(CodeList.get(position).getCodeJava());
        txt_output.setText(CodeList.get(position).getOutput());
        txt_explanation.setText(CodeList.get(position).getExplanation());


        return v;

    }

}