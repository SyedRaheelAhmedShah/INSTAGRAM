package ApplicationAllActivities.Instagram.User.FragmentsForUserPage;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;

import java.util.ArrayList;
import java.util.List;

import ApplicationAllActivities.Instagram.User.UserAdapter.Sett_UserAllPictues_User_Pictures_Fragment_Adapter;
import ApplicationAllActivities.Instagram.User.UserPageManagerClassesForFragments.User_Pictures_Fragment_Manager;

public class User_Pictures_Fragment extends Fragment {

RecyclerView userAllPicturesRecyclerview;
    public User_Pictures_Fragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_user__pictures, container, false);


        userAllPicturesRecyclerview=rootview.findViewById(R.id.user_pictures_recyclerview);
        List<User_Pictures_Fragment_Manager> userAllPictures=new ArrayList<>();
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_1));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_4));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_3));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_5));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_6));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_6));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_5));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_3));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_4));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_1));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_6));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_5));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_3));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_4));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_1));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_1));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_4));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_3));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_5));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_6));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_6));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_5));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_3));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_4));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_1));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_6));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_5));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_3));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_4));
        userAllPictures.add(new User_Pictures_Fragment_Manager(R.drawable.story_1));
        userAllPicturesRecyclerview.setLayoutManager(new GridLayoutManager(getContext(), 5));

        Sett_UserAllPictues_User_Pictures_Fragment_Adapter adapter=new Sett_UserAllPictues_User_Pictures_Fragment_Adapter(userAllPictures,getContext());
        userAllPicturesRecyclerview.setAdapter(adapter);

        return rootview;
    }
}