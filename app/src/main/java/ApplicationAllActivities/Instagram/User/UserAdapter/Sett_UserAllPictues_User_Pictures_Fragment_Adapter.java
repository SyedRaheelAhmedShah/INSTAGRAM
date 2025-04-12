package ApplicationAllActivities.Instagram.User.UserAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.List;

import ApplicationAllActivities.Instagram.User.UserPageManagerClassesForFragments.User_Pictures_Fragment_Manager;

public class Sett_UserAllPictues_User_Pictures_Fragment_Adapter extends RecyclerView.Adapter<Sett_UserAllPictues_User_Pictures_Fragment_Adapter.ViewHolder> {

    private List<User_Pictures_Fragment_Manager> userAllPictures;
    private Context context;

    public Sett_UserAllPictues_User_Pictures_Fragment_Adapter(List<User_Pictures_Fragment_Manager> userAllPictures, Context context) {
        this.userAllPictures = userAllPictures;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_all_pictures, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User_Pictures_Fragment_Manager pictureModel = userAllPictures.get(position);
        holder.pictures.setImageResource(pictureModel.getPictures()); // Fixed!
    }

    @Override
    public int getItemCount() {
        return userAllPictures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pictures;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pictures = itemView.findViewById(R.id.userAllPictures);
        }
    }

}
