package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class NewWord {
    
    public String word(){
    Random rd = new Random();
        int w = rd.nextInt(0, 200);
        String palavra;
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
          for (int i = 0; i < w; i++)
              br.readLine();
          palavra = br.readLine();
          System.out.println(palavra);
          return palavra;
        }
        catch(IOException e){
            System.out.println(e);
        }
        return "words";
    }
}
