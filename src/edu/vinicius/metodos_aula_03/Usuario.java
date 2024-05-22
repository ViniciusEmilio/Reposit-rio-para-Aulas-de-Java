package edu.vinicius.metodos_aula_03;

public class Usuario {
    
    public static void main(String[] args) throws Exception{

        Smart_Tv smart_Tv = new Smart_Tv();

        System.out.println("A TV está Ligada? " + smart_Tv.ligada);
        System.out.println("Canal atual: " + smart_Tv.canal);
        System.out.println("Volume atual: " + smart_Tv.volume);
        
        smart_Tv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smart_Tv.ligada);

        smart_Tv.aumentarVolume();
        smart_Tv.aumentarVolume();
        smart_Tv.aumentarVolume();
        smart_Tv.aumentarVolume();
        smart_Tv.aumentarVolume();
        System.out.println("Volume atual: " + smart_Tv.volume);

        smart_Tv.mudarCanal(13);
        System.out.println("Canal Atual: " + smart_Tv.canal);

    }
}
