package AdaptersForAllFragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import AllFragments.Chats_Fragment;
import AllFragments.Home_Fragment;

public class ViewPagerChatsAdapter extends FragmentPagerAdapter {

    public ViewPagerChatsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Chats_Fragment();
//
            default:
                return new Home_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
