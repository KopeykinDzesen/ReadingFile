import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class Main {

    static String[][] array = new String[5][3];
    static Scanner scanner;

    public static void main(String[] args) {

        openFile();
        readFile();
        outFile();

    }

    static void openFile(){
        try{
            scanner = new Scanner(new File("res/1.txt"));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Файл не найден!");
        }
    }

    static void readFile(){
        while (scanner.hasNext()){
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = scanner.next();
                }
            }
        }
    }

    static void outFile(){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }

}
