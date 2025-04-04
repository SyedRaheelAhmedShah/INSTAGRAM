package ManagerClassesForAllFragments;

public class Home_Fragment_Manager_Data {
    private int id;
    private int Story_Picture;
    private String story_User_Name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStory_Picture() {
        return Story_Picture;
    }

    public void setStory_Picture(int story_Picture) {
        Story_Picture = story_Picture;
    }


    public String getStory_User_Name() {
        return story_User_Name;
    }

    public void setStory_User_Name(String story_User_Name) {
        this.story_User_Name = story_User_Name;
    }

    public Home_Fragment_Manager_Data(int id, int story_Picture, String story_User_Name) {
        this.id = id;
        Story_Picture = story_Picture;
        this.story_User_Name = story_User_Name;
    }


}
