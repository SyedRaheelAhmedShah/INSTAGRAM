package AdaptersForAllFragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import AllFragments.User_Pictures_Fragment;
import AllFragments.User_Tags_Fragment;
import AllFragments.User_Videos_Fragment;

public class ViewPagerUserProfileAdapter extends FragmentPagerAdapter {
    public ViewPagerUserProfileAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new User_Pictures_Fragment();
            case 1:
                return new User_Videos_Fragment();
            case 2:
                return new User_Tags_Fragment();
            default:
                return new User_Pictures_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Photos";
            case 1:
                return "Videos";
            case 2:
                return "Tags";
            default:
                return "Photos";
        }
    }
}
