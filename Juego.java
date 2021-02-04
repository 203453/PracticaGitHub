public class Juego {
    int puntaje;
    int suma;
    Dados dados;

    public Juego(int puntaje, int suma, Dados dados){
        this.puntaje = puntaje;
        this.suma = suma;
        this.dados = dados;
    }
    
    public int getPuntaje(){

        return puntaje;
    }

    public int getSumar(){
    return dados.getDado1() + dados.getDado2();
    }
}