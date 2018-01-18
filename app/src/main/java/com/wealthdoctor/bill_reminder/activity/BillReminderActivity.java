package com.wealthdoctor.bill_reminder.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wealthdoctor.R;
import com.wealthdoctor.bill_reminder.expandable_recycler_view.expand.ExpandActivity;



public class BillReminderActivity extends AppCompatActivity {

    private FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_reminder);

        addButton = (FloatingActionButton) findViewById(R.id.fab_add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(BillReminderActivity.this, BillReminderListActivity.class);
                startActivity(intent);
            }
        });

        Button expand = (Button) findViewById(R.id.expand_button);
        //expand.setOnClickListener(navigateTo(ExpandActivity.class));
        expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BillReminderActivity.this, ExpandActivity.class);
                startActivity(intent);
            }
        });
    }
}
