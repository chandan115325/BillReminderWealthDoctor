package com.wealthdoctor.bill_reminder.calender;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.wealthdoctor.R;
import com.wealthdoctor.bill_reminder.calender.data.CalendarAdapter;
import com.wealthdoctor.bill_reminder.calender.data.Day;
import com.wealthdoctor.bill_reminder.calender.widget.FlexibleCalendar;
import com.wealthdoctor.bill_reminder.calender.data.CalendarAdapter;


import java.util.Calendar;

public class CalenderActivity extends AppCompatActivity {

    private LinearLayout calenderLL;
    private FlexibleCalendar viewCalendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_calender);

        viewCalendar = (FlexibleCalendar) findViewById(R.id.calendar);
        *//*final Button btnCollapse = (Button) findViewById(R.id.btn_collapse);
        final Button btnExpand = (Button) findViewById(R.id.btn_expand);

        calenderLL = (LinearLayout)findViewById(R.id.calender_ll);*//*

        // init calendar
        Calendar cal = Calendar.getInstance();
        CalendarAdapter adapter = new CalendarAdapter(this, cal);
        viewCalendar.setAdapter(adapter);

        // bind events of calendar
        viewCalendar.setCalendarListener(new FlexibleCalendar.CalendarListener() {
            @Override
            public void onDaySelect() {
                Day day = viewCalendar.getSelectedDay();
                Log.i(getClass().getName(), "Selected Day: "
                        + day.getYear() + "/" + (day.getMonth() + 1) + "/" + day.getDay());
            }

            @Override
            public void onItemClick(View v) {
                Day day = viewCalendar.getSelectedDay();
                Log.i(getClass().getName(), "The Day of Clicked View: "
                        + day.getYear() + "/" + (day.getMonth() + 1) + "/" + day.getDay());
            }

            @Override
            public void onDataUpdate() {
                Log.i(getClass().getName(), "Data Updated");
            }

            @Override
            public void onMonthChange() {
                Log.i(getClass().getName(), "Month Changed"
                        + ". Current Year: " + viewCalendar.getYear()
                        + ", Current Month: " + (viewCalendar.getMonth() + 1));
            }

            @Override
            public void onWeekChange(int position) {
                Log.i(getClass().getName(), "Week Changed"
                        + ". Current Year: " + viewCalendar.getYear()
                        + ", Current Month: " + (viewCalendar.getMonth() + 1)
                        + ", Current Week position of Month: " + position);
            }
        });

        // use methods
        viewCalendar.addEventTag(2015, 8, 10);
        viewCalendar.addEventTag(2015, 8, 14);
        viewCalendar.addEventTag(2015, 8, 23);

        viewCalendar.select(new Day(2015, 4, 22));

      *//*  btnCollapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // viewCalendar.collapse(500);
            }
        });
        btnExpand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // viewCalendar.expand(500);
            }
        });*/
    }


}
