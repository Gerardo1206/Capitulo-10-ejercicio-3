package capitulo10.ejercicio.pkg3;

public class TennisGame {
    private String player1;
    private String player2;
    private String scorePlayer1;
    private String scorePlayer2;
    private Integer finalScore1;
    private Integer finalScore2;

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getScorePlayer1() {
        return scorePlayer1;
    }

    public String getSocrePlayer2() {
        return scorePlayer2;
    }

    public Integer getFinalScore1() {
        return finalScore1;
    }

    public Integer getFinalScore2() {
        return finalScore2;
    }
    public void setPlayer(String player1,String player2){
        this.player1=player1;
        this.player2=player2;
    }
    public void setFinalScore(Integer finalScore1,Integer finalScore2){
        if((finalScore1>4 || finalScore1<0) || ((finalScore2>4 || finalScore2<0))){
            this.finalScore1=0;
            this.finalScore2=0;
            this.scorePlayer1="Error";
            this.scorePlayer2="Error";
        }
        else if(finalScore1==4 && finalScore2==4){
            this.finalScore1=0;
            this.finalScore2=0;
            this.scorePlayer1="Error";
            this.scorePlayer2="Error";
        }
        else{
            this.finalScore1=finalScore1;
            this.finalScore2=finalScore2;
            switch(finalScore1){
                case 0:
                    scorePlayer1="love";
                    break;
                case 1:
                    scorePlayer1="15";
                    break;
                case 2:
                    scorePlayer1="30";
                    break;
                case 3:
                    scorePlayer1="40";
                    break;
                case 4:
                    scorePlayer1="game";
                    break;
            }
            switch(finalScore2){
                case 0:
                    scorePlayer2="love";
                    break;
                case 1:
                    scorePlayer2="15";
                case 2:
                    scorePlayer2="30";
                    break;
                case 3:
                    scorePlayer2="40";
                    break;
                case 4:
                    scorePlayer2="game";
                    break;
            }
        }
    }
    
}
