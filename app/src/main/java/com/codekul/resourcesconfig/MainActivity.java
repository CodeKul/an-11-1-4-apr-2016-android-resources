package com.codekul.resourcesconfig;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // providing resources

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        if(savedInstanceState != null){
//
//            Long dateStored = savedInstanceState.getLong("selected_date");
//            if(dateStored != null){
//
//                CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);
//                if(calendarView != null){
//                    calendarView.setDate(dateStored);
//                }
//            }
//        }
//        Toast.makeText(this,"On Create",Toast.LENGTH_SHORT).show();
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//
//        if((CalendarView) findViewById(R.id.calendarView) != null)
//        outState.putLong("selected_date",((CalendarView)findViewById(R.id.calendarView)).getDate());
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//        Toast.makeText(this,"On Destroy",Toast.LENGTH_SHORT).show();
//    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this,"On Restart",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){


            findViewById(R.id.rootLayout).setBackgroundResource(R.drawable.my1);

        }
        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){

            findViewById(R.id.rootLayout).setBackgroundResource(R.drawable.my2);
        }
        else{

            findViewById(R.id.rootLayout).setBackgroundResource(R.drawable.my3);
        }
    }
}
