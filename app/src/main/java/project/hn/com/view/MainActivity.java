package project.hn.com.view;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import project.hn.com.mylibrary.LayoutManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG_COUNTRIES_FRAGMENT = "tag_countries_fragment";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new CountryFragment(), TAG_COUNTRIES_FRAGMENT)
                    .commit();
        }

    }


}
