package ApplicationAllActivities.Instagram.User.UserAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import ApplicationAllActivities.Instagram.User.FragmentsForUserPage.User_Pictures_Fragment;
import ApplicationAllActivities.Instagram.User.FragmentsForUserPage.User_Tags_Fragment;
import ApplicationAllActivities.Instagram.User.FragmentsForUserPage.User_Videos_Fragment;

public class Sett_Tab_ViewPager_User_Profile_Fragment_Adapter extends FragmentPagerAdapter {
    public Sett_Tab_ViewPager_User_Profile_Fragment_Adapter(@NonNull FragmentManager fm) {
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
