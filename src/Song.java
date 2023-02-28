import java.util.*;
public class Song {

    private String title;
    private String artist;

    private ArrayList<String> nameList = new ArrayList();

    public Song(String t, String a){
        title = t;
        artist = a;
    }

    public String getTitle(){ return title;}

    public String getArtist(){ return artist;}

    public int howMany(ArrayList<String> arrList) {
        arrList.replaceAll(String::toLowerCase);
        nameList.addAll(arrList);
        //int newNum = nameList.size();
        int num = arrList.size();

        for (int i = nameList.size() - arrList.size(); i < nameList.size(); i++) {
            for (int j = 0; j < nameList.size() - arrList.size(); j++) {
                if (nameList.get(i).equals(nameList.get(j))) {
                    num--;
                }
            }
        }
        if(Collections.frequency(arrList,arrList.get(0))==arrList.size() && num == arrList.size()){
            num = 1;
        }
        return num;
    }
    }
