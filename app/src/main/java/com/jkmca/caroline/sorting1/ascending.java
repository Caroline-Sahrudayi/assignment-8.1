package com.jkmca.caroline.sorting1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class ascending extends AppCompatActivity{
    /*declaring variables*/
    ArrayAdapter<String> AscAdaptor;
    ListView list1;
    Button asce;
    Button desc;
    String[] Ascen = new String[]{"April", "August", "December", "Feb", "january","July", "June", "March", "May", "November", "October", "September"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ascending);
       list1=(ListView)findViewById(R.id.dynamic1);
       desc=(Button)findViewById(R.id.descendbtn1);
       asce=(Button)findViewById(R.id.ascendbtn);
        /*creating the array adapter object*/
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,Ascen);
        /*setting the adapter */
        list1.setAdapter(adapter1);
        /*creating onclicklistener on descendingbutton*/
        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*creating an explicit intent to descending activity*/

                Intent descending=new Intent(ascending.this, descending.class);
                startActivity(descending);
            }
        });




    }
}
