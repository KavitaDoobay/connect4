import java.util.Random;

public class pvcBoard {
    public static int[][] board = new int[7][6];
    //player1=1, player2=2

    public static void setTile(int r, int c, int a){
        if(board[r][c]==0)
            board[r][c]= pvc.getPlayer();
        if(pvc.getPlayer()==1) {
            pvc.setPlayer(2);
        }
        else if(pvc.getPlayer()==2) {
            pvc.setPlayer(1);
        }
        if(isWinner(1, board)){
            pvp.p1Score++;
            pvp.p1Wins++;
            if(pvp.p1Score%3==0)
                pvp.p1Score+=4;
            pvp.p1Win();
        }
        if(isWinner(2, board)){
            pvp.p2Wins++;
            pvp.p2Score++;
            if(pvp.p2Score%3==0)
                pvp.p2Score+=4;
            pvp.p2Win();
        }
    }

    public static void compMove(){
        Random random = new Random();
        int r = random.nextInt(7);
        int c = random.nextInt(6);
        if(board[r][c]!=0){
            while(board[r][c]!=0){
                r= random.nextInt(7);
                c = random.nextInt(6);
            }
        }
        if(isWinner(2, board)){
            pvp.p2Wins++;
            pvp.p2Score++;
            if(pvp.p2Score%3==0)
                pvp.p2Score+=4;
            pvp.p2Win();
        }
        setTile(r, c, 9);
    }
    public static boolean isWinner(int player, int[][] grid){
        //check for 4 across
        for(int row = 0; row<grid.length; row++){
            for (int col = 0;col < grid[0].length - 3;col++){
                if (grid[row][col] == player   &&
                        grid[row][col+1] == player &&
                        grid[row][col+2] == player &&
                        grid[row][col+3] == player){
                    return true;
                }
            }
        }
        //check for 4 up and down
        for(int row = 0; row < grid.length - 3; row++){
            for(int col = 0; col < grid[0].length; col++){
                if (grid[row][col] == player   &&
                        grid[row+1][col] == player &&
                        grid[row+2][col] == player &&
                        grid[row+3][col] == player){
                    return true;
                }
            }
        }
        //check upward diagonal
        for(int row = 3; row < grid.length; row++){
            for(int col = 0; col < grid[0].length - 3; col++){
                if (grid[row][col] == player   &&
                        grid[row-1][col+1] == player &&
                        grid[row-2][col+2] == player &&
                        grid[row-3][col+3] == player){
                    return true;
                }
            }
        }
        //check downward diagonal
        for(int row = 0; row < grid.length - 3; row++){
            for(int col = 0; col < grid[0].length - 3; col++){
                if (grid[row][col] == player   &&
                        grid[row+1][col+1] == player &&
                        grid[row+2][col+2] == player &&
                        grid[row+3][col+3] == player){
                    return true;
                }
            }
        }
        return false;
    }
    public static String btoString() {
        String s = "";
        int cnt = 1;
        for(int a[]: board){
            for(int i: a) {
                if(i==0)
                    s+="("+ cnt + ") ";
                if(i==1)
                    s+="P1 ";
                if(i==2)
                    s+="CP ";
                if(cnt%7==0)
                    s+= "\n";
                cnt++;
            }
        }
        return s;
    }
}
