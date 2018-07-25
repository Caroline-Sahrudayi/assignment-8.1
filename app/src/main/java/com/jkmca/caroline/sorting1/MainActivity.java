package com.jkmca.caroline.sorting1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    /*declaring variables*/
    ArrayAdapter<String> AscAdaptor;
    ListView List;
    String[] Months = new String[]{"January", "Feb", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    Button asce;
    Button desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List = (ListView) findViewById(R.id.dynamic);
        /*creating the array adapter object*/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, Months);
        /*setting the adapter */
        List.setAdapter(adapter);
        asce = (Button) findViewById(R.id.ascendbtn);
        desc = (Button) findViewById(R.id.descendbtn);
        /*setting the event listener on ascending button*/
        asce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*creating an explicit intent to ascending activity*/
                Intent ascend = new Intent(MainActivity.this, ascending.class);
                /*starting the intent*/
                startActivity(ascend);
            }
        });
    }
}
