
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Playlist playlist1 =new Playlist(); // creating a new playlist 
        playlist1.printList(); // prints out the playlist before we edit it 
      
        playlist1.printUniqueArtists(); // prints unique artists in the playlist
        playlist1.printUniqueAlbum();// prints unique albums in the playlist
        System.out.println("Please insert the name of the song you want to edit!");
        Scanner input = new Scanner(System.in); 
       String apantisi=input.nextLine();//reads the name of the song 
       playlist1.editList(apantisi); // Edits the song with the name read above 
       
        playlist1.printList(); // printing the playlist after editing it 
       
      System.out.println("\n Please insert the name of the artist in order to print their songs");
      apantisi=input.nextLine();//reads name of the artist 
      playlist1.artistSpecificSongs(apantisi); // prints the songs of the specific artist 
      
      System.out.println("\n Please insert the name of the album in order to print all the songs that belong to it ");
      apantisi=input.nextLine();
      playlist1.albumSpecificSongs(apantisi); //prints out all the songs that belong to that playlist and have the name read above . 
      
      System.out.println("\n Please insert the name of the song you want to remove from the playlist ");
      apantisi=input.nextLine();
      playlist1.deleteSong(apantisi); // Deleting all songs with such name 
       playlist1.printList();//Finally it prints out the end result of the playlist .
      
      

    }
    
}
