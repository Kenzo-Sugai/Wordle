package controller;
import java.awt.Color;
import model.*;
import javax.swing.JOptionPane;
import view.Front;
import java.util.Random;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Controller {
    Front janela;
    public Controller(Front janela){
        this.janela = janela;
    }
    
    public String NewWord(){
        NewWord nw = new NewWord();
        return nw.word();
    }
    
    public void Search(int i, String answer){
        Search srch = new Search();
        srch.search(janela, i, answer);
    }
    
}
