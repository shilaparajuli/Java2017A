import java.util.Scanner;

public class VlcPlayer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        OpenFile file = new OpenFile();
        Playlist newplaylist= new Playlist();
        int choice;
        System.out.println("Enter your choice");
        do {
            System.out.println();
            System.out.println();
            System.out.println("Enter 1 to open a file");
            System.out.println("Enter 2 to create a playlist");
            System.out.println("Enter 3 to open a playlist");
            System.out.println("Enter 4 to exit");
            choice = userInput.nextInt();
            userInput.nextLine();
            if(choice==1) file.readfile();
            else if(choice==2) newplaylist.createPlaylist();
            else if(choice==3) newplaylist.openPlaylist();
            else if(choice==4) System.out.println("BYE");
            else System.out.println("Please Input a valid choice");
        }while(choice!=4);
    }

}

class OpenFile{
    Scanner userInput = new Scanner(System.in);
    String name;
    public void readfile()
    {
        System.out.println("Enter the name of file to open");
        name = userInput.nextLine();
        System.out.println("Playing Now .. "+name);
        System.out.println("Press Enter to Close");
        userInput.nextLine();
    }
}

class Playlist{
    Scanner userInput = new Scanner(System.in);
    public void createPlaylist()
    {
        System.out.println("Enter the name for a playlist");
        String text=userInput.nextLine();
        System.out.println("New Playlist "+text+" created!");
        System.out.println("Enter files to add");
        String list = userInput.nextLine();
        System.out.println(list+" added to playlist");
    }
    public void openPlaylist()
    {
        System.out.println("Enter the name of playlist to open");
        String filename = userInput.nextLine();
        System.out.println("Playing Now Playlist ... "+filename);
        userInput.nextLine();
    }
}

