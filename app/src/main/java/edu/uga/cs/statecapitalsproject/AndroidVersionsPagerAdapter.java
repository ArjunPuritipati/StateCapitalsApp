package edu.uga.cs.statecapitalsproject;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AndroidVersionsPagerAdapter extends FragmentStateAdapter {

    public AndroidVersionsPagerAdapter(
            FragmentManager fragmentManager,
            Lifecycle lifecycle ) {
        super( fragmentManager, lifecycle );
    }

    // called by android, not by us. To create a new instance of a fragment
    @Override
    public Fragment createFragment(int position){
        return AndroidVersionFragment
                .newInstance( position );
    }

    //
    @Override
    public int getItemCount() {
        return AndroidVersionFragment
                .getNumberOfVersions();
    }

}
