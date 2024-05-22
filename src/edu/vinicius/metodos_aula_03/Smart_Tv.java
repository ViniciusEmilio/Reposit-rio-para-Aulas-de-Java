package edu.vinicius.metodos_aula_03;

public class Smart_Tv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

}
