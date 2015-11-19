import java.util.Random;

/**
 * Created by Miller on 11/6/2015.
 */
public class GameBoard {
    private static Node[][] board = new Node[10][10];



    public static void main(String[] args){
        //Initialize the game board.
        for(int i=0;i<10;i++){
            for(int j=0; j<10; j++){
                Node node = new Node();
                board[i][j] = node;
            }
        }
        printBoard();
    }

    /*
    METHOD printBoard()
    Prints the initialized 10x10 game board.
    */
    private static void printBoard(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf("%c ", board[i][j].color);
            }
            System.out.println();
        }
    }
}

class Node{
    public char color;

    Node(){
        Random random = new Random();
        int col = random.nextInt(6);
        color = setColor(col);
    }

    private char setColor(int col){
        char co = '\0';

        switch(col) {

            case 0:
                co = 'W';
                break;
            case 1:
                co = 'R';
                break;
            case 2:
                co = 'Y';
                break;
            case 3:
                co = 'G';
                break;
            case 4:
                co = 'B';
                break;
            case 5:
                co = 'P';
                break;

        }

        return co;
    }


}
