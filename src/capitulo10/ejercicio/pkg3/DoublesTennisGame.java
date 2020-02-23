package capitulo10.ejercicio.pkg3;

public class DoublesTennisGame extends TennisGame {
    private String playerPartner1;
    private String playerPartner2;

    public String getPlayerPartner1() {
        return playerPartner1;
    }

    public String getPlayerPartner2() {
        return playerPartner2;
    }
    
   
    public void setPlayer(String player1,String player2,String playerPartner1,String playerPartner2){
        super.setPlayer(player1,player2);
        this.playerPartner1=playerPartner1;
        this.playerPartner2=playerPartner2;
    }
}
