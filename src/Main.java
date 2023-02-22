import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
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
        boolean filesExist = true;
        ArrayList<String> adjectiveList = readFile("a.txt");
        ArrayList<String> nounList = readFile("n.txt");
        Random randomCalc = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Press 'q' to quit, any other button to generate a new funny");
        if(adjectiveList.size() == 0||nounList.size() == 0)
            filesExist = false;
        while(filesExist){
            if (input.nextLine().equals("q")){
                filesExist = false;
                break;
            }
            System.out.println(adjectiveList.get(randomCalc.nextInt(adjectiveList.size())) + " " +nounList.get(randomCalc.nextInt(nounList.size())) );

        }
    }
}