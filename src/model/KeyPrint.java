package model;
import view.*;
public class KeyPrint {
    
    public void Print(Front janela, char[] word){
        janela.getL00().setText(String.valueOf(word[0]));
        janela.getL01().setText(String.valueOf(word[1]));
        janela.getL02().setText(String.valueOf(word[2]));
        janela.getL03().setText(String.valueOf(word[3]));
        janela.getL04().setText(String.valueOf(word[4]));
    }
}
