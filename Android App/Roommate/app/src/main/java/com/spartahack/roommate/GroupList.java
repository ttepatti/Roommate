package com.spartahack.roommate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GroupList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_list);

        TextView b1 = (TextView) findViewById(R.id.roommates);
        TextView b2 = (TextView) findViewById(R.id.brunchbuddies);

        View.OnClickListener handler1 = new View.OnClickListener() {
            public void onClick(View v) {
                // it was the 1st button
                Intent i = new Intent(getApplicationContext(), RoommateActivity.class);
                startActivity(i);
            }
        };

        View.OnClickListener handler2 = new View.OnClickListener() {
            public void onClick(View v) {
                // it was the 2nd button
                Intent i = new Intent(getApplicationContext(), BrunchBuddiesActivity.class);
                startActivity(i);
            }
        };

        b1.setOnClickListener(handler1);
        b2.setOnClickListener(handler2);
    }
}
