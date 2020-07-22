//Playlist Class
import java.util.ArrayList; // importing library that is required for arraylists 
import java.util.HashSet; // importing library required for hashsets in Java 
import java.util.Iterator; 
import java.util.List; 
import java.util.Scanner; 
import java.util.Set; 


public class Playlist {

    private String name;
    private String genre;
    private List<Song> lista_tragoudion = new ArrayList<Song>(); // Song List of the playlist 

    public Playlist() { // constructor
        name = "my_playlist"; // name of the playlist 
        genre = "Rock"; // Playlist Genre 
        // Song(String Title, String Artist, String Duration, String Album)
        Song s1 = new Song("Imagine", "John Lennon", "3:26", "Imagine"); // Creating 10 songs 
        Song s2 = new Song("Sweet Child O'Mine", "Guns N' Roses", "4:50", "Appetite for Destruction");
        Song s3 = new Song("Hotel California", "Eagles", "6:20", "Hotel California");
        Song s4 = new Song("Africa", "Toto", "4:57", "Toto IV");
        Song s5 = new Song("Paradise City", "Guns N' Roses", "6:48", "Appetite for Destruction");
        Song s6 = new Song("Born to Run", "Bruce Springsteen", "5:05", "Born to Run");
        Song s7 = new Song("It's my life", "Bon Jovi", "4:20", "Crush");
        Song s8 = new Song("Another brick in the wall", "Pink Floyd", "3:49", "The Wall");
        Song s9 = new Song("Seven Nation Army", "The White Stripes", "3:51", "Elephant");
        Song s10 = new Song("Smells Like Teen Spirit", "Nirvana", "5:01", "Nevermind");
        lista_tragoudion.add(s1); // Adding the songs to the playlist 
        lista_tragoudion.add(s2);
        lista_tragoudion.add(s3);
        lista_tragoudion.add(s4);
        lista_tragoudion.add(s5);
        lista_tragoudion.add(s6);
        lista_tragoudion.add(s7);
        lista_tragoudion.add(s8);
        lista_tragoudion.add(s9);
        lista_tragoudion.add(s10);

    }

    void printList() { // Function that prints out the playlist 
        System.out.println("The name of the playlist is : " + name + " , the Genre is : " + genre + " \n The songs that belong in the playlist are: "); 
        System.out.println("Song Title \t Artist Names \t Duration \t Album ");
        for (int i = 0; i < lista_tragoudion.size(); i++) { // loop that will be done as many times as the size of the playlist  
            System.out.print(lista_tragoudion.get(i).getTitle() + "\t\t " + lista_tragoudion.get(i).getArtist() + "\t\t " + lista_tragoudion.get(i).getDuration() + "\t " + lista_tragoudion.get(i).getAlbum() + "\n");
        }
    }//end of printing function 

    void printUniqueArtists() { //Function that prints out all the unique artists ( Doesnt print out the same artist twice 
        // Using Sets in Java will allow us to print duplicates once .
        // That's why converting the list into a Set will come in handy .
        Set<Song> set_tragoudion;
        set_tragoudion = new HashSet<>(lista_tragoudion);
        
        System.out.println("\n Artist Names");

        lista_tragoudion.stream().forEach((t) -> { // adds each song to the set ( Lamda Expression )
            set_tragoudion.add(t);
        });
        set_tragoudion.stream().forEach((_item) -> {
            System.out.println(_item.getArtist()); //For each song in the set , The Artist's name gets printed 
        });
    }

    void printUniqueAlbum() { // Same as the function above but instead of Artist name this one is for Album Names  
        Set<Song> set_tragoudion;
        set_tragoudion = new HashSet<>(lista_tragoudion);
        
        System.out.println("\n Album Names");

        lista_tragoudion.stream().forEach((t) -> {
            set_tragoudion.add(t);
        });
        set_tragoudion.stream().forEach((_item) -> {
            System.out.println(_item.getAlbum());
        });

    }

  

    void editList(String titlos) { //Function that allows us to edit a song of the playlist . All it requires is a song's title . 
        int repeat,found = -1; // found is a flag that indicates if the song is in the playlist
        do {
            int i = -1;
            do { // checking if the song is in the playlist 
                i++;
                if (titlos.equalsIgnoreCase(lista_tragoudion.get(i).getTitle())) { // checking if the song is in the playlist ( Non Case Sensitive ) 
                    found = i; // if the song is found then found is equal to the song's id in the playlist 
                }

            } while (found == -1 && i < (lista_tragoudion.size()) - 1); // Loop that goes through the playlist until it finds the song 
            if (found == -1) { // if the song wasn't found after going through the whole playlist 
                System.out.println("There's no such song in the playlist!!!!Error 404 Song not found!!");
            } else { // if the song is found 
                System.out.println("Which part of the song would you like to edit ??? Press 1 for Title . Press 2 for the Artist .  Press 3 for Duration . Press 4 for the Album ");
                Scanner input = new Scanner(System.in);
               // Reads the user's choice 
                int apantisi;
                do {//input check
                    
                    apantisi = input.nextInt();
                    if (apantisi > 4 && apantisi < 1) {// input check
                        System.out.println("Please insert a valid option ! \n Press 1 for Title . Press 2 for the Artist .  Press 3 for Duration . Press 4 for the Album");
                    }

                } while (apantisi < 0 && apantisi > 5);
                //the song was succesfully found and now it there will be a specific action taken according to the user's choice . 
                if (apantisi == 1) {//Option 1 : Editing the title 
                    System.out.println("Please insert the new title of the song : " + lista_tragoudion.get(found).getTitle());
                    String neos_titlos = input.next();//reads the new title 
                    lista_tragoudion.get(found).setTitle(neos_titlos); // sets the new title 
                } else if (apantisi == 2) {//Option 2 : Artist Name
                    System.out.println("Please insert a new Artist Name for the song :  " + lista_tragoudion.get(found).getTitle());
                    String neos_kallitexnis = input. next();
                    lista_tragoudion.get(found).setArtist(neos_kallitexnis);// Sets the new artist name 

                } else if (apantisi == 3) {//Option 3 : Duration 
                    System.out.println("Please insert the new duration for the song with the title :  " + lista_tragoudion.get(found).getTitle());
                    String nea_diarkeia = input. next();//using next because we have to clear out the cache memory 
                    lista_tragoudion.get(found).setDuration(nea_diarkeia);//sets the new duration 

                } else if (apantisi == 4) {//Option 4 : New Album Name 
                    System.out.println("Please insert a new Album name for the song with the title : " + lista_tragoudion.get(found).getTitle());
                    String neo_album = input.next(); 
                    lista_tragoudion.get(found).setAlbum(neo_album);//new album name 

                }

            }
            repeat = 2; //variable that helps to check if there were multiple edits 
            if (found != -1) { //if the song was found and the first action was done then it asks if we want to do any further actions 
                System.out.println("Would you like do to anything else ? For Yes press 1 .For No press  2 ");
                Scanner input = new Scanner(System.in);
                do {//input check
                    repeat = input.nextInt();
                } while (repeat != 1 && repeat != 2); //input check    
            }
        } while (repeat == 1); // if the input is 2 then it stops the loop 

    }//enf of  editlist

    void artistSpecificSongs(String kallitexnis) { // printing songs that belong to a specific artist 
        int counter=0;
        for (int i = 0; i < lista_tragoudion.size(); i++) { // Checks if the artist is in the list 

            if (kallitexnis.equalsIgnoreCase(lista_tragoudion.get(i).getArtist())) {  // if there's a song with that artist 
                System.out.print(lista_tragoudion.get(i).getTitle() +"\n"); // prints out the title of the song 
                counter++;// increases the counter by one 
            }
        }
        if (counter==0) // if the counter is 0 then there wasnt any song that belongs to that artist 
         {
         System.out.println("There's no such artist in the playlist !");
         }
        
    }//telos artistSpecificSongs

    void albumSpecificSongs(String onoma_album) { // Same with the function above but this one is for album names 
        int counter=0;
        for (int i = 0; i < lista_tragoudion.size(); i++) {

            if (onoma_album.equalsIgnoreCase(lista_tragoudion.get(i).getAlbum())) {
                System.out.print(lista_tragoudion.get(i).getTitle()+"\n");
                counter++;
            }
        }
            if (counter==0)
         {
         System.out.println("There's no such album in the playlist !");
         }
              
       

    }//end of function

    void deleteSong(String onoma_tragoudiou) { // Function that deletes song . Requires the name of the song
      int  counter=0; // metritis pou tha mas voithisei se periptosi pou den vrethei to tragoudi me ton sigkekrimeno titlo 
         for (int i = 0; i < lista_tragoudion.size(); i++) {

            if (onoma_tragoudiou.equalsIgnoreCase(lista_tragoudion.get(i).getTitle())) { // if the song is in the playlist ( Non Case Sensitive Comparison ) 
                System.out.println("The song with the id of "+i+ "was deleted from the list . The title of the song was : "+lista_tragoudion.get(i).getTitle());
                lista_tragoudion.remove(i); // deleting the song from the list 
                counter=1; // succesful deletion flag 
                
            }
        }
         if (counter==0) // if the counter is 0 then there was no song found hence no song was deleted 
         {
         System.out.println("There's no such song in the playlist . No song was deleted!"); 
         }

    }//eo function

}//end of class
