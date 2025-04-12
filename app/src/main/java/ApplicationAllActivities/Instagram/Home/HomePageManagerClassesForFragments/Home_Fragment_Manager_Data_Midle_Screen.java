package ApplicationAllActivities.Instagram.Home.HomePageManagerClassesForFragments;

public class Home_Fragment_Manager_Data_Midle_Screen {
    int Midle_Screen_Profile_pic, Midle_Screen_Posts;
    String Midle_Screen_Profile_User_Name, Music, description,postlikes;

    public Home_Fragment_Manager_Data_Midle_Screen(int midle_Screen_Profile_pic, int midle_Screen_Posts, String postlikes, String midle_Screen_Profile_User_Name, String music, String description) {
        Midle_Screen_Profile_pic = midle_Screen_Profile_pic;
        Midle_Screen_Posts = midle_Screen_Posts;
        postlikes = postlikes;
        Midle_Screen_Profile_User_Name = midle_Screen_Profile_User_Name;
        Music = music;
        this.description = description;
    }


    public int getMidle_Screen_Profile_pic() {
        return Midle_Screen_Profile_pic;
    }

    public void setMidle_Screen_Profile_pic(int midle_Screen_Profile_pic) {
        Midle_Screen_Profile_pic = midle_Screen_Profile_pic;
    }

    public int getMidle_Screen_Posts() {
        return Midle_Screen_Posts;
    }

    public void setMidle_Screen_Posts(int midle_Screen_Posts) {
        Midle_Screen_Posts = midle_Screen_Posts;
    }

    public String getPostlikes() {
        return postlikes;
    }

    public void setPostlikes(String postlikes) {
        postlikes = postlikes;
    }

    public String getMidle_Screen_Profile_User_Name() {
        return Midle_Screen_Profile_User_Name;
    }

    public void setMidle_Screen_Profile_User_Name(String midle_Screen_Profile_User_Name) {
        Midle_Screen_Profile_User_Name = midle_Screen_Profile_User_Name;
    }

    public String getMusic() {
        return Music;
    }

    public void setMusic(String music) {
        Music = music;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
