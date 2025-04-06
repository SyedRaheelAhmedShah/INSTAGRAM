package AdaptersForAllFragments;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.List;

import ManagerClassesForAllFragments.Home_Fragment_Manager_Data_Midle_Screen;

public class Adapter_For_Midle_Screen extends RecyclerView.Adapter<Adapter_For_Midle_Screen.ViewHolder> {

    List<Home_Fragment_Manager_Data_Midle_Screen> MidleScreenSectionDataArray;
    Context context;

    public Adapter_For_Midle_Screen(List<Home_Fragment_Manager_Data_Midle_Screen> midleScreenSectionDataArray, Context context) {
        MidleScreenSectionDataArray = midleScreenSectionDataArray;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.home_page_midle_view_post_reels, parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Home_Fragment_Manager_Data_Midle_Screen homeFragmentManagerDataMidleScreen=MidleScreenSectionDataArray.get(position);
        holder.midle_Screen_Profile_Pic.setImageResource(homeFragmentManagerDataMidleScreen.getMidle_Screen_Profile_pic());
        holder.midle_Screen_Profile_Name.setText(homeFragmentManagerDataMidleScreen.getMidle_Screen_Profile_User_Name());
        holder.midle_Screen_Post_Post.setImageResource(homeFragmentManagerDataMidleScreen.getMidle_Screen_Posts());
        holder.music.setText(homeFragmentManagerDataMidleScreen.getMusic());
        holder.caption.setText(homeFragmentManagerDataMidleScreen.getDescription());
        holder.post_Likes.setText(homeFragmentManagerDataMidleScreen.getPostlikes());
        holder.usermidleScreenUser_Name.setText(homeFragmentManagerDataMidleScreen.getMidle_Screen_Profile_User_Name());
    }

    @Override
    public int getItemCount() {
        return MidleScreenSectionDataArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView midle_Screen_Profile_Pic, midle_Screen_Post_Post;
        private TextView midle_Screen_Profile_Name, music,caption, post_Likes,usermidleScreenUser_Name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            midle_Screen_Profile_Pic=itemView.findViewById(R.id.profile_Pic);
            midle_Screen_Post_Post=itemView.findViewById(R.id.midleScreenUser_Post);
            midle_Screen_Profile_Name=itemView.findViewById(R.id.midleScreenUser_Name);
            music=itemView.findViewById(R.id.music_Title);
            caption=itemView.findViewById(R.id.post_Caption);
            post_Likes=itemView.findViewById(R.id.midleScreenpost_likes);
            usermidleScreenUser_Name=itemView.findViewById(R.id.usermidleScreenUser_Name);
        }
    }
}
