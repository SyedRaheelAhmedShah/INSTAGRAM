package ApplicationAllActivities.Instagram.Home.HomeAdapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Chats_Fragment;
import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Home_Fragment;

public class ViewPager_sectio_Cha_camer_Fragment_Adapter extends FragmentPagerAdapter {
private List<Fragment> mFragmentList=new ArrayList<>();
    public ViewPager_sectio_Cha_camer_Fragment_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new Home_Fragment();
            case 1: return new Chats_Fragment();
            default: return new Home_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}


