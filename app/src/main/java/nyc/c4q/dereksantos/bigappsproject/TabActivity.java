package nyc.c4q.dereksantos.bigappsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.dereksantos.bigappsproject.adapters.ViewPageAdapter;

public class TabActivity extends AppCompatActivity {

    FragmentPagerAdapter fragmentPagerAdapter;
    TabLayout tabLayout;
    static String iconClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Intent intent = getIntent();
        iconClicked = intent.getStringExtra("ICON_TITLE");


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        viewPager.setCurrentItem(1);
    }

    public static String getIconClicked() {
        return iconClicked;
    }
}
