// Main class to demonstrate interfaces
public class Interface {
    public static void main(String[] args) {
        // Creating a Queen object that implements the chessPlayer interface
        Queen q1 = new Queen();
        q1.moves();  // Calls the overridden moves method of Queen
    }
}

// Interface chessPlayer: serves as a contract for any chess piece
interface chessPlayer {
    // Abstract method: any class implementing chessPlayer must define this method
    void moves();
}

// Queen class implements chessPlayer and defines the moves specific to Queen
class Queen implements chessPlayer {
    // Implementation of the moves method for Queen
    public void moves() {
        System.out.println("Queen moves: up, down, left, right, diagonal (in all 4 directions)");
    }
}

// Rook class implements chessPlayer and defines the moves specific to Rook
class Rook implements chessPlayer {
    // Implementation of the moves method for Rook
    public void moves() {
        System.out.println("Rook moves: up, down, left, right");
    }
}

// King class implements chessPlayer and defines the moves specific to King
class King implements chessPlayer {
    // Implementation of the moves method for King
    public void moves() {
        System.out.println("King moves: up, down, left, right (by 1 step)");
    }
}
