package com.amin.Fragment_tab_android_pro.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;


public class Main extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);  // tabHost : the Id of Whole TabHost
        tabHost.setup();

        // Tab 1
            TabHost.TabSpec spec1 = tabHost.newTabSpec("Tab1");
            spec1.setContent(R.id.Tab1);// Tabi : Id of each Tab
            spec1.setIndicator("Tab1 Name"); // This is the Shown Text
            tabHost.addTab(spec1);

        // Tab 2
            TabHost.TabSpec spec2 = tabHost.newTabSpec("Tab2");
            spec2.setContent(R.id.Tab2);// Tabi : Id of each Tab
            spec2.setIndicator("Tab2 Name"); // This is the Shown Text
            tabHost.addTab(spec2);

        // Tab 3
            TabHost.TabSpec spec3 = tabHost.newTabSpec("Tab3");
            spec3.setContent(R.id.Tab3);// Tabi : Id of each Tab
            spec3.setIndicator("Tab3 Name"); // This is the Shown Text
            tabHost.addTab(spec3);

        /*final ActionBar actionBar = getActionBar();


        // Specify that tabs should be displayed in the action bar.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Create a tab listener that is called when the user changes tabs.
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                // show the given tab
            }

            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
                // hide the given tab
            }

            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
                // probably ignore this event
            }
        };

        // Add 3 tabs, specifying the tab's text and TabListener
        for (int i = 0; i < 3; i++) {
            actionBar.addTab(
                    actionBar.newTab()
                            .setText("Tab " + (i + 1))
                            .setTabListener(tabListener));
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);*/
    }
}
