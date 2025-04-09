package AdaptersForAllFragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.List;

import ManagerClassesForAllFragments.UserAllPictues_Manager;

public class UserAllPictues_Adapter extends RecyclerView.Adapter<UserAllPictues_Adapter.ViewHolder> {

    private List<UserAllPictues_Manager> userAllPictures;
    private Context context;

    public UserAllPictues_Adapter(List<UserAllPictues_Manager> userAllPictures, Context context) {
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
        UserAllPictues_Manager pictureModel = userAllPictures.get(position);
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
