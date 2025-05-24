package ApplicationAllActivities.Instagram.User.FragmentsForUserPage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.instagram.R;
import com.google.android.material.tabs.TabLayout;

import ApplicationAllActivities.Instagram.User.UserAdapter.Sett_Tab_ViewPager_User_Profile_Fragment_Adapter;

public class User_Profile_Fragment extends Fragment {

    TabLayout user_Profile_TabLayout;
    ViewPager user_Profile_ViewPager;

    public User_Profile_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_user__profile_, container, false);

        user_Profile_TabLayout = rootView.findViewById(R.id.user_Profile_tablayout);
        user_Profile_ViewPager = rootView.findViewById(R.id.user_Profile_ViewPager);

        Sett_Tab_ViewPager_User_Profile_Fragment_Adapter adapter = new Sett_Tab_ViewPager_User_Profile_Fragment_Adapter(getChildFragmentManager());
        user_Profile_ViewPager.setAdapter(adapter);

        // Link TabLayout with ViewPager
        user_Profile_TabLayout.setupWithViewPager(user_Profile_ViewPager);

        return rootView;

    }

}