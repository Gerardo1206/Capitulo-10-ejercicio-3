package capitulo10.ejercicio.pkg3;

public class Capitulo10Ejercicio3 {

    public static void main(String[] args) {
        TennisGame j1=new TennisGame();
        DoublesTennisGame j2=new DoublesTennisGame();
        
        j2.setPlayer("j1", "j2", "j3", "j4");
        
        System.out.println(j2.getPlayer1());
        System.out.println(j2.getPlayer2());
        System.out.println(j2.getPlayerPartner1());
        System.out.println(j2.getPlayerPartner2());
        
        j1.setPlayer("j1", "j2");
        System.out.println(j1.getPlayer1()+" "+j1.getPlayer2());
        j1.setFinalScore(0, 0);
        System.out.println(j1.getFinalScore1()+" "+j1.getScorePlayer1()+" "+j1.getFinalScore2()+" "+j1.getSocrePlayer2());
        j1.setFinalScore(4, 4);
        System.out.println(j1.getFinalScore1()+" "+j1.getScorePlayer1()+" "+j1.getFinalScore2()+" "+j1.getSocrePlayer2());
        j1.setFinalScore(5, 1);
        System.out.println(j1.getFinalScore1()+" "+j1.getScorePlayer1()+" "+j1.getFinalScore2()+" "+j1.getSocrePlayer2());
        j1.setFinalScore(1, 2);
        System.out.println(j1.getFinalScore1()+" "+j1.getScorePlayer1()+" "+j1.getFinalScore2()+" "+j1.getSocrePlayer2());
        j1.setFinalScore(3, 4);
        System.out.println(j1.getFinalScore1()+" "+j1.getScorePlayer1()+" "+j1.getFinalScore2()+" "+j1.getSocrePlayer2());
    }
    
}
