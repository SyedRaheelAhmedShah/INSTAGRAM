package ApplicationAllActivities.Instagram.Home.FragmentsForHomePage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabSectionViewPagerFragment extends FragmentPagerAdapter {
    private static final List<Fragment> tabFragments = new ArrayList();

    public TabSectionViewPagerFragment(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabFragments.get(position);
    }

    @Override
    public int getCount() {
        return tabFragments.size();
    }

    public void addFragmentOntabbar(Fragment fragment) {
        tabFragments.add(fragment);

    }
}
