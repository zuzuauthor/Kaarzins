package zuzusoft.com.kaarzins;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout;
import nl.psdcompany.duonavigationdrawer.views.DuoMenuView;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;
import zuzusoft.com.kaarzins.adapter.CarAdapter;
import zuzusoft.com.kaarzins.fragments.CarListFragment;
import zuzusoft.com.kaarzins.helper.BaseActivity;

/**
 * Created by mukeshnarayan on 30/07/18.
 */

public class HomeActivity1 extends BaseActivity implements DuoMenuView.OnMenuClickListener {

    private DuoDrawerLayout mDuoDrawerLayout;
    private DuoMenuView mDuoMenuView;
    private Toolbar mToolbar;

    private zuzusoft.com.kaarzins.adapter.MenuAdapter mMenuAdapter;

    private ArrayList<String> mTitles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initViews();

    }

    private void initViews() {

        mTitles = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.menuOptions)));

        // Initialize the views
        mDuoDrawerLayout = (DuoDrawerLayout) findViewById(R.id.drawer);
        mDuoMenuView = (DuoMenuView) mDuoDrawerLayout.getMenuView();
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        handleMenu();

        // Handle drawer actions
        handleDrawer();

        // Show main fragment in container
        goToFragment(new CarListFragment(), false);
        //mMenuAdapter.setViewSelected(0, true);
        setTitle(mTitles.get(0));

    }


    private void handleDrawer() {
        DuoDrawerToggle duoDrawerToggle = new DuoDrawerToggle(this,
                mDuoDrawerLayout,
                mToolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        mDuoDrawerLayout.setDrawerListener(duoDrawerToggle);
        duoDrawerToggle.syncState();

    }

    private void handleMenu() {

      // MenuBuilder menuBuilder = new MenuBuilder(context);
        mMenuAdapter = new zuzusoft.com.kaarzins.adapter.MenuAdapter(mTitles);
        mDuoMenuView.setOnMenuClickListener(this);
        mDuoMenuView.setAdapter(mMenuAdapter);
    }

    @Override
    public void onFooterClicked() {
        Toast.makeText(this, "onFooterClicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onHeaderClicked() {

        goToActivity(ProfileActivity.class, null);
    }

    private void goToFragment(Fragment fragment, boolean addToBackStack) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (addToBackStack) {
            transaction.addToBackStack(null);
        }

        transaction.add(R.id.container, fragment).commit();
    }

    @Override
    public void onOptionClicked(int position, Object objectClicked) {
        // Set the toolbar title
        setTitle(mTitles.get(position));

        // Set the right options selected
       // mMenuAdapter.setViewSelected(position, true);

        // Navigate to the right fragment
        switch (position) {
            default:
                goToFragment(new CarListFragment(), false);
                break;
        }

        // Close the drawer
        mDuoDrawerLayout.closeDrawer();
    }

}