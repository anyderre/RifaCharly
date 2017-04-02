package com.DEMO.printdemo;

import android.os.Bundle;
import android.app.Activity;

import android.support.v4.content.ContextCompat;
import android.widget.TabHost;

import static android.support.v4.content.ContextCompat.getDrawable;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
// ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_person_add_black_24dp
        TabHost.TabSpec spec = tabHost.newTabSpec("Registrar");
        spec.setContent(R.id.tab1);
        spec.setIndicator("",getDrawable(getApplicationContext(), R.drawable.doctor)
        );
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Rifas");
        spec.setContent(R.id.tab2);
        spec.setIndicator("", getDrawable(getApplicationContext(), R.drawable.ra));
        tabHost.addTab(spec);


    }

}
