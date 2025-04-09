package AdaptersForAllFragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.ArrayList;

import ManagerClassesForAllFragments.Home_Fragment_Manager_Data_Story;

public class Adapter_For_Story_Section extends RecyclerView.Adapter<Adapter_For_Story_Section.ViewHolder> {


    ArrayList<Home_Fragment_Manager_Data_Story> StorySectionDataArray;
    Context context;

    public Adapter_For_Story_Section(ArrayList<Home_Fragment_Manager_Data_Story> storySectionDataArray, Context context) {
        StorySectionDataArray = storySectionDataArray;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.home_page_story_section, parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Home_Fragment_Manager_Data_Story homeFragmentManagerData=StorySectionDataArray.get(position);
        holder.story_User_Image.setImageResource(homeFragmentManagerData.getStory_Picture());
        holder.story_User_Name.setText(homeFragmentManagerData.getStory_User_Name());
    }
    @Override
    public int getItemCount() {
        return StorySectionDataArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView story_User_Image;
        private TextView story_User_Name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            story_User_Image = itemView.findViewById(R.id.user_Hightlishts);
            story_User_Name = itemView.findViewById(R.id.Story_user_name);
        }
    }
}
