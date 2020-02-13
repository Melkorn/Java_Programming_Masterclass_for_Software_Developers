package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String albumName;
    private ArrayList<Song> songsList;

    public Album(String artist, String albumName) {
        this.artist = artist;
        this.albumName = albumName;
        this.songsList = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songsList.add(new Song(title, duration));
            return true;
        }else System.out.println("this song already exist");
        return false;
    }

    public Song findSong(String title){
        for(Song testSong: this.songsList){
            if(testSong.getTitle().equals(title)){
                return testSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int songNumber, LinkedList<Song> playList){
        int trackID = songNumber -1;
        if((trackID >= 0) && trackID <= (this.songsList.size())){
            playList.add(this.songsList.get(trackID));
            return  true;
        }
        System.out.println("There is no track number " + trackID + " in this album" );
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song testSong = findSong(title);
        if (testSong != null) {
            playList.add(testSong);
        } else System.out.println("there is no song of this tittle in this album");
        return false;
    }

}
