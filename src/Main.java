import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    public static ArrayList<String> readFile(String fileName){
        ArrayList<String> wordList = new ArrayList<>();
        try{
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                wordList.add(data);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(fileName + " not found!!! :(");
        }
        return wordList;
    }


    public static void main(String[] args) {
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        ArrayList<String> adjectiveList = readFile("a.txt");
        ArrayList<String> nounList = readFile("n.txt");
        if (!(nounList.size() == 0 || adjectiveList.size() == 0))
            new GUI(adjectiveList,nounList);
        else
            System.out.println("you're missing the files!");
    }
}