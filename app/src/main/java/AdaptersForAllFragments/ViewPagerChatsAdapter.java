package AdaptersForAllFragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Chats_Fragment;
import ApplicationAllActivities.Instagram.Home.FragmentsForHomePage.Home_Fragment;

public class ViewPagerChatsAdapter extends FragmentPagerAdapter {
private List<Fragment> mFragmentList=new ArrayList<>();
    public ViewPagerChatsAdapter(@NonNull FragmentManager fm) {
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


