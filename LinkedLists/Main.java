package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
public static void main(String[] args) {


    Album album = new Album("Tylor Swift", "1989");
    album.addSong("BLank Space", 3.15);
    album.addSong("Style", 3.05);
    album.addSong("Wildest Dreams", 4.15);
    album.addSong("Bad Blood", 3.43);
    album.addSong("Welcome to New York", 3.46);

    albums.add(album);

    album= new Album("Eminem", "The Slim Shady LP");
    album.addSong("My Name Is", 4.13);
    album.addSong("I'm Shady", 3.31);
    album.addSong("As the World Turns", 3.46);
    album.addSong("Role Model", 3.25);
    album.addSong("'97 Bonnie & Clyde", 5.16);

    albums.add(album);

    LinkedList<Song> playList = new LinkedList<Song>();

    albums.get(0).addToPlayList(3, playList);
    albums.get(1).addToPlayList(2, playList);
    albums.get(1).addToPlayList(3, playList);
    albums.get(0).addToPlayList(2, playList);
    albums.get(1).addToPlayList(4, playList);
    albums.get(1).addToPlayList(5, playList);

    play(playList);
}

private static void play(LinkedList<Song> playList){
    ListIterator<Song> listIterator = playList.listIterator();
    if(playList.size() == 0) {
        System.out.println("No songs in this playlist");
    } else {
        boolean quit = false;
        System.out.println(" Playing " + listIterator.next().toString());

   // while(quit){
   //     System.out.println(" ");

  //  }


    }

}


}

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()