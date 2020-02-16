package LinkedLists;

import java.util.*;

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
    Scanner scanner = new Scanner(System.in);
    ListIterator<Song> listIterator = playList.listIterator();
    if(playList.size() == 0) {
        System.out.println("No songs in this playlist");
    } else {
        boolean quit = false;
        boolean forward = true;
        System.out.println(" Playing " + listIterator.next().toString());

        while(!quit){



            System.out.println(" Press: " +
                    "1 - to Quit" +
                    "2 - to play next song" +
                    "3 - to play previous song" +
                    "4 - reply current song" +
                    "5 - to show all songs inf playlist" +
                    "6 - to print menu" +
                    "7 - to delete current song");

            int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("Exiting playList");
                quit = true;
                break;
            case 2:
                if(!forward){
                    if(listIterator.hasNext()){
                        listIterator.next();
                    }
                    forward = true;

                }
                if(listIterator.hasNext()) {
                    System.out.println("Now playing  " + listIterator.next().toString());
                } else {
                    System.out.println("The End of PlayList");
                    forward = false;
                }
                break;
            case 3:
                if(forward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    forward = false;
                }
                if(listIterator.hasPrevious()) {
                    System.out.println("Now playing  " + listIterator.previous().toString());
                } else {
                    System.out.println("The Start of PlayList");
                    forward = true;
                }
                break;
            case 4:
                if(forward){
                    if(listIterator.hasPrevious()){
                        System.out.println(" Now playing " + listIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println(" You are on the Start, no song to reply");
                    }
                } else {
                    if(listIterator.hasNext()){
                        System.out.println(" Now playing " + listIterator.next().toString());
                        forward = true
                    } else {
                        System.out.println(" The end of playList no song to reply");
                    }
                }
                break;
            case 5:
                printList(playList);
                break;
            case 6:
                printMenu();
                break;
            case 7:
                if(playList.size() > 0){
                    listIterator.remove();
                    System.out.println("Song removed from playlist");
                }
                break;
        }
        }


    }

}

public static void printList(LinkedList <Song> list){
    Iterator<Song> iterator = list.iterator();
    System.out.println(" ------------------------");
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
    System.out.println(" ------------------------");
}

public static void printMenu(){
    System.out.println(" Press: " +
            "1 - to Quit" +
            "2 - to play next song" +
            "3 - to play previous song" +
            "4 - reply current song" +
            "5 - to show all songs inf playlist" +
            "6 - to print menu" +
            "7 - to delete current song");
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