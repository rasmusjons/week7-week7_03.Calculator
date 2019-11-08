
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Reader {

    private Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);

    }

    public String readString() {
        String word = reader.nextLine();
        return word;

    }

    public int readInteger() {
        int number = Integer.parseInt(reader.nextLine());
        return number;

    }

}
