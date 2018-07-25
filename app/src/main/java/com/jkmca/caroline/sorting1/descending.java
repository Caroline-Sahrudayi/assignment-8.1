package com.jkmca.caroline.sorting1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class descending extends AppCompatActivity {
    /*declaring variables*/
    ArrayAdapter<String> AscAdaptor;
    ListView list2;
    Button asce;
    Button desc;
    String[] Descen = new String[]{"september","october","november","may","march","june","july","january","february","august","april"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descending);
        list2=(ListView)findViewById(R.id.dynamic2);
        desc=(Button)findViewById(R.id.descendbtn1);
        asce=(Button)findViewById(R.id.ascendbtn);
        /*creating the array adapter object*/
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,Descen);
        /*setting the adapter */
        list2.setAdapter(adapter2);
    }
}
