package model;
import view.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Search {
   
   boolean verificacao(char word, char[] ans, String resp){
        for(int k = 0; k < resp.length(); k++){
            if(word == ans[k]){
                return true;
            }
        }
        return false;
    }
   
    public void search(Front janela, int i, String answer){
        String resp = janela.getSubmit_txtfield().getText().toUpperCase();
        char[] word = resp.toCharArray();
        char[] ans = answer.toCharArray();
        char[] cor = new char[5];
        int contador = 0;
        for(int j = 0; j < resp.length(); j++){
            if(word[j] == ans[j]){
                cor[j] = '2';
                contador++;
            }
            else{
                if(verificacao(word[j], ans, resp)) cor[j] = '1';
                else cor[j] = '0';
            }
        }
        
        
        switch(i){
            case 1:
                janela.getL00().setText(String.valueOf(word[0]));
                janela.getL01().setText(String.valueOf(word[1]));
                janela.getL02().setText(String.valueOf(word[2]));
                janela.getL03().setText(String.valueOf(word[3]));
                janela.getL04().setText(String.valueOf(word[4]));
                if(cor[0] == '0') janela.getL00().setForeground(Color.red);
                if(cor[0] == '1') janela.getL00().setForeground(Color.yellow);
                if(cor[0] == '2') janela.getL00().setForeground(Color.green);
                
                if(cor[1] == '0') janela.getL01().setForeground(Color.red);
                if(cor[1] == '1') janela.getL01().setForeground(Color.yellow);
                if(cor[1] == '2') janela.getL01().setForeground(Color.green);
                
                if(cor[2] == '0') janela.getL02().setForeground(Color.red);
                if(cor[2] == '1') janela.getL02().setForeground(Color.yellow);
                if(cor[2] == '2') janela.getL02().setForeground(Color.green);
                
                if(cor[3] == '0') janela.getL03().setForeground(Color.red);
                if(cor[3] == '1') janela.getL03().setForeground(Color.yellow);
                if(cor[3] == '2') janela.getL03().setForeground(Color.green);
                
                if(cor[4] == '0') janela.getL04().setForeground(Color.red);
                if(cor[4] == '1') janela.getL04().setForeground(Color.yellow);
                if(cor[4] == '2') janela.getL04().setForeground(Color.green);
                break;
            case 2:
                janela.getL10().setText(String.valueOf(word[0]));
                janela.getL11().setText(String.valueOf(word[1]));
                janela.getL12().setText(String.valueOf(word[2]));
                janela.getL13().setText(String.valueOf(word[3]));
                janela.getL14().setText(String.valueOf(word[4]));
                if(cor[0] == '0') janela.getL10().setForeground(Color.red);
                if(cor[0] == '1') janela.getL10().setForeground(Color.yellow);
                if(cor[0] == '2') janela.getL10().setForeground(Color.green);
                
                if(cor[1] == '0') janela.getL11().setForeground(Color.red);
                if(cor[1] == '1') janela.getL11().setForeground(Color.yellow);
                if(cor[1] == '2') janela.getL11().setForeground(Color.green);
                
                if(cor[2] == '0') janela.getL12().setForeground(Color.red);
                if(cor[2] == '1') janela.getL12().setForeground(Color.yellow);
                if(cor[2] == '2') janela.getL12().setForeground(Color.green);
                
                if(cor[3] == '0') janela.getL13().setForeground(Color.red);
                if(cor[3] == '1') janela.getL13().setForeground(Color.yellow);
                if(cor[3] == '2') janela.getL13().setForeground(Color.green);
                
                if(cor[4] == '0') janela.getL14().setForeground(Color.red);
                if(cor[4] == '1') janela.getL14().setForeground(Color.yellow);
                if(cor[4] == '2') janela.getL14().setForeground(Color.green);
                break;
            case 3:
                janela.getL20().setText(String.valueOf(word[0]));
                janela.getL21().setText(String.valueOf(word[1]));
                janela.getL22().setText(String.valueOf(word[2]));
                janela.getL23().setText(String.valueOf(word[3]));
                janela.getL24().setText(String.valueOf(word[4]));
                if(cor[0] == '0') janela.getL20().setForeground(Color.red);
                if(cor[0] == '1') janela.getL20().setForeground(Color.yellow);
                if(cor[0] == '2') janela.getL20().setForeground(Color.green);
                
                if(cor[1] == '0') janela.getL21().setForeground(Color.red);
                if(cor[1] == '1') janela.getL21().setForeground(Color.yellow);
                if(cor[1] == '2') janela.getL21().setForeground(Color.green);
                
                if(cor[2] == '0') janela.getL22().setForeground(Color.red);
                if(cor[2] == '1') janela.getL22().setForeground(Color.yellow);
                if(cor[2] == '2') janela.getL22().setForeground(Color.green);
                
                if(cor[3] == '0') janela.getL23().setForeground(Color.red);
                if(cor[3] == '1') janela.getL23().setForeground(Color.yellow);
                if(cor[3] == '2') janela.getL23().setForeground(Color.green);
                
                if(cor[4] == '0') janela.getL24().setForeground(Color.red);
                if(cor[4] == '1') janela.getL24().setForeground(Color.yellow);
                if(cor[4] == '2') janela.getL24().setForeground(Color.green);
                break;
            case 4:
                janela.getL30().setText(String.valueOf(word[0]));
                janela.getL31().setText(String.valueOf(word[1]));
                janela.getL32().setText(String.valueOf(word[2]));
                janela.getL33().setText(String.valueOf(word[3]));
                janela.getL34().setText(String.valueOf(word[4]));
                if(cor[0] == '0') janela.getL30().setForeground(Color.red);
                if(cor[0] == '1') janela.getL30().setForeground(Color.yellow);
                if(cor[0] == '2') janela.getL30().setForeground(Color.green);
                
                if(cor[1] == '0') janela.getL31().setForeground(Color.red);
                if(cor[1] == '1') janela.getL31().setForeground(Color.yellow);
                if(cor[1] == '2') janela.getL31().setForeground(Color.green);
                
                if(cor[2] == '0') janela.getL32().setForeground(Color.red);
                if(cor[2] == '1') janela.getL32().setForeground(Color.yellow);
                if(cor[2] == '2') janela.getL32().setForeground(Color.green);
                
                if(cor[3] == '0') janela.getL33().setForeground(Color.red);
                if(cor[3] == '1') janela.getL33().setForeground(Color.yellow);
                if(cor[3] == '2') janela.getL33().setForeground(Color.green);
                
                if(cor[4] == '0') janela.getL34().setForeground(Color.red);
                if(cor[4] == '1') janela.getL34().setForeground(Color.yellow);
                if(cor[4] == '2') janela.getL34().setForeground(Color.green);
                break;
            case 5:
                janela.getL40().setText(String.valueOf(word[0]));
                janela.getL41().setText(String.valueOf(word[1]));
                janela.getL42().setText(String.valueOf(word[2]));
                janela.getL43().setText(String.valueOf(word[3]));
                janela.getL44().setText(String.valueOf(word[4]));
                if(cor[0] == '0') janela.getL40().setForeground(Color.red);
                if(cor[0] == '1') janela.getL40().setForeground(Color.yellow);
                if(cor[0] == '2') janela.getL40().setForeground(Color.green);
                
                if(cor[1] == '0') janela.getL41().setForeground(Color.red);
                if(cor[1] == '1') janela.getL41().setForeground(Color.yellow);
                if(cor[1] == '2') janela.getL41().setForeground(Color.green);
                
                if(cor[2] == '0') janela.getL42().setForeground(Color.red);
                if(cor[2] == '1') janela.getL42().setForeground(Color.yellow);
                if(cor[2] == '2') janela.getL42().setForeground(Color.green);
                
                if(cor[3] == '0') janela.getL43().setForeground(Color.red);
                if(cor[3] == '1') janela.getL43().setForeground(Color.yellow);
                if(cor[3] == '2') janela.getL43().setForeground(Color.green);
                
                if(cor[4] == '0') janela.getL44().setForeground(Color.red);
                if(cor[4] == '1') janela.getL44().setForeground(Color.yellow);
                if(cor[4] == '2') janela.getL44().setForeground(Color.green);
                break;
            case 6:
                janela.getL50().setText(String.valueOf(word[0]));
                janela.getL51().setText(String.valueOf(word[1]));
                janela.getL52().setText(String.valueOf(word[2]));
                janela.getL53().setText(String.valueOf(word[3]));
                janela.getL54().setText(String.valueOf(word[4]));
                if(cor[0] == '0') janela.getL50().setForeground(Color.red);
                if(cor[0] == '1') janela.getL50().setForeground(Color.yellow);
                if(cor[0] == '2') janela.getL50().setForeground(Color.green);
                
                if(cor[1] == '0') janela.getL51().setForeground(Color.red);
                if(cor[1] == '1') janela.getL51().setForeground(Color.yellow);
                if(cor[1] == '2') janela.getL51().setForeground(Color.green);
                
                if(cor[2] == '0') janela.getL52().setForeground(Color.red);
                if(cor[2] == '1') janela.getL52().setForeground(Color.yellow);
                if(cor[2] == '2') janela.getL52().setForeground(Color.green);
                
                if(cor[3] == '0') janela.getL53().setForeground(Color.red);
                if(cor[3] == '1') janela.getL53().setForeground(Color.yellow);
                if(cor[3] == '2') janela.getL53().setForeground(Color.green);
                
                if(cor[4] == '0') janela.getL54().setForeground(Color.red);
                if(cor[4] == '1') janela.getL54().setForeground(Color.yellow);
                if(cor[4] == '2') janela.getL54().setForeground(Color.green);
                break;
        }
        if(contador == 5){
            JOptionPane.showMessageDialog(janela, "VOCE ACERTOU MANE");
            janela.setVisible(false);
        }
        
    }
}
