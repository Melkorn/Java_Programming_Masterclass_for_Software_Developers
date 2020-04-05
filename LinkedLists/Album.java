package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

// InnerClassesChallenge
// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.

public class Album {
    private String artist;
    private String albumName;
    private  SongList songs;
    //private ArrayList<Song> songsList;

    public Album(String artist, String albumName) {
        this.artist = artist;
        this.albumName = albumName;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.addSong(new Song(title, duration));

//        if(findSong(title) == null){
//            this.songsList.add(new Song(title, duration));
//            return true;
//        }else System.out.println("this song already exist");
//        return false;
    }

    public Song findSong(String title){
        return this.songs.findSong(title);
//        for(Song testSong: this.songsList){
//            if(testSong.getTitle().equals(title)){
//                return testSong;
//            }
//        }
//        return null;
    }

    public Song findSong(int trackNumber){
        return this.songs.findSong(trackNumber);
//        for(Song testSong: this.songsList){
//            if(testSong.getTitle().equals(title)){
//                return testSong;
//            }
//        }
//        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        else {
            System.out.println("There is no track number " + trackNumber + " in this album");
            return false;
        }

    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
        } else System.out.println("there is no song of this tittle in this album");
            return false;

    }


    private class SongList{
        private ArrayList<Song> songsList;

        public SongList() {
            this.songsList = new ArrayList<Song>();
        }

        public boolean addSong(Song song){
            if(songsList.contains(song)){
                return false;
            } else this.songsList.add(song);
                return true;
        }

        public Song findSong(String title){
            for(Song testSong: this.songsList){
                if(testSong.getTitle().equals(title)){
                 return testSong;
                }
            }
                return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if ((index > 0) && (index<=songsList.size())){
                return songsList.get(index);
            } else {
                System.out.println(" Track Number does not exist ");
                return null;
            }
        }






    }



}
