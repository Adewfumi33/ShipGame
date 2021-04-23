import java.util.Scanner;
class Main {
  public void msg (String m) {
    System.out.println(m);
  }
}

class Board {
  public Board () {
    o = new Main();
  }

  public void placeShip(int row, int startColumn) {
    if (row == 0) shipRow = "a";
    else if (row == 1) shipRow = "b";
    else if (row == 2) shipRow = "c";
    else if (row == 3) shipRow = "d";
    else if (row == 4) shipRow = "e";
    else if (row == 5) shipRow = "f";
    else if (row == 6) shipRow = "g";
    else if (row == 7) shipRow = "h";
    else if (row == 8) shipRow = "i";
    else if (row == 9) shipRow = "j";

    columnOne = startColumn;
    columnTwo = startColumn +1;
    columnThree = startColumn +2;
    columnFour = startColumn +3;
    columnFive = startColumn +4;
  }

  public int checkWinStatus() {
    int hits = 0;
    if (shipRow == "a") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && a[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && a[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && a[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && a[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && a[ColumnOne] ==5) ++hits;
      }
    }

    if (shipRow == "b") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && b[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && b[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && b[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && b[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && b[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "c") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && c[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && c[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && c[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && c[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && c[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "d") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && d[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && d[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && d[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && d[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && d[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "e") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && e[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && e[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && e[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && e[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && e[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "f") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && f[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && f[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && f[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && f[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && f[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "g") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && g[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && g[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && g[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && g[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && g[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "h") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && h[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && h[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && h[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && h[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && h[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "i") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && i[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && i[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && i[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && i[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && i[ColumnOne] ==5) ++hits;
      }
    }
    if (shipRow == "j") {
      for (int idx =0; idx < 10; ++idx) {
        if (ColumnOne == idx && j[ColumnOne] ==5) ++hits;
        if (ColumnTwo == idx && j[ColumnOne] ==5) ++hits;
        if (ColumnThree == idx && j[ColumnOne] ==5) ++hits;
        if (ColumnFour == idx && j[ColumnOne] ==5) ++hits;
        if (ColumnFive == idx && j[ColumnOne] ==5) ++hits;
      }
    }

    String msg = "So far the number of hits you have is: " + hits;
    System.out.println(msg);
    return hits;
  }
  public void handleUserGuess() {
    boolean hit = false;
    Scanner userInput = new Scanner(System.in);
    System.outprintln("which Row? (a,b,c,d,e,f,g,h,i,j)");
    String row = userInput.nextLine();
    System.out.print.ln("which Coloumn? (0,1,2,3,4,5,6,7,8,9)");
    int column = userInput.nextInt();

    o.msg("\n\n You entered " + row + column + "\n");
    if (row.equals(shipRow)) {
      if (
        (column == columnOne) ||
        (column == columnTwo) ||
        (column == columnThree) ||
        (column == columnFour) ||
        (column == columnFive) 

      ) {
     
     if (row.equals("a")) {
       a[column] =5;
       hit = true;
     }
      else if (row.equals("b")) {
       b[column] = 5;
       hit = true;
     }
      else if (row.equals("c")) {
       c[column] = 5;
       hit = true;
     }
      else if (row.equals("d")) {
       d[column] = 5;
       hit = true;
     }
      else if (row.equals("e")) {
       e[column] = 5;
       hit = true;
     }
      else if (row.equals("f")) {
       f[column] = 5;
       hit = true;
     }
      else if (row.equals("g")) {
       g[column] = 5;
       hit = true;
     }
      else if (row.equals("h")) {
       h[column] = 5;
       hit = true;
     }
      else if (row.equals("i")) {
       i[column] = 5;
       hit = true;
     }
      else if (row.equals("j")) {
       j[column] = 5;
       hit = true;
     }
     else o.msg("You did not provide a valid column number");
      }
    }
    else if ((row.equals"a") && column <=9) { a[column] =1; }
    else if ((row.equals"b") && column <=9) { a[column] =1; }
    else if ((row.equals"c") && column <=9) { a[column] =1; }
    else if ((row.equals"d") && column <=9) { a[column] =1; }
    else if ((row.equals"e") && column <=9) { a[column] =1; }
    else if ((row.equals"f") && column <=9) { a[column] =1; }
    else if ((row.equals"g") && column <=9) { a[column] =1; }
    else if ((row.equals"h") && column <=9) { a[column] =1; }
    else if ((row.equals"i") && column <=9) { a[column] =1; }
    else if ((row.equals"j") && column <=9) { a[column] =1; }
    else {
      System.out.println("You enterned an invalid row and /or column, come on now, lets keep it on the board please... row must be between a-j inclusive, columns must be between 0-9 inclusive...");
    }
    if (hit == false) o.msg("Thats was a MISS!");
    else o.msg("That was a HIT!!! .. uh oh!!")
  }

  public void showBoard () {
    System.out.println("\n\n*****Game Board*****");
    System.out.println("   0  1  2  3  4  5  6  7  8  9");

    System.out.print("a  ");
    for(int indx = 0; idx <=9; ++idx) {
      System.out.print(a[idx]);
      System.out.print("  ");
    }
    System.out.print("\nb  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(b[idx]);
      System.out.print("  ");
    }
     System.out.print("\nc  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(b[idx]);
      System.out.print("  ");
    }
     System.out.print("\ne  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(e[idx]);
      System.out.print("  ");
    }
     System.out.print("\nf  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(f[idx]);
      System.out.print("  ");
    }
     System.out.print("\ng  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(g[idx]);
      System.out.print("  ");
    }
     System.out.print("\nh  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(h[idx]);
      System.out.print("  ");
    }
     System.out.print("\ni  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(i[idx]);
      System.out.print("  ");
    }
     System.out.print("\nj  ");
    for (int idx =0; idx <=9; ++idx) {
      System.out.print(j[idx]);
      System.out.print("  ");
    }
    System.out.println("\n\n");
 }

Out o;
public int[] a = {0,0,0,0,0,0,0,0,0,0};
public int[] b = {0,0,0,0,0,0,0,0,0,0};
public int[] c = {0,0,0,0,0,0,0,0,0,0};
public int[] d = {0,0,0,0,0,0,0,0,0,0};
public int[] e = {0,0,0,0,0,0,0,0,0,0};
public int[] f = {0,0,0,0,0,0,0,0,0,0};
public int[] g = {0,0,0,0,0,0,0,0,0,0};
public int[] h = {0,0,0,0,0,0,0,0,0,0};
public int[] i = {0,0,0,0,0,0,0,0,0,0};
public int[] j = {0,0,0,0,0,0,0,0,0,0};
public String shipRow;
public int columnOne;
public int columnTwo;
public int columnThree;
public int columnFour;
public int columnFive;
}

public class Main {
  public static void main(String[] args) {
    Out o = new Out();
    o.msg("Welcome to Access Point Find-a-ship!");
    o.msg("I bet you cant find my ship!!!");
    o.msg(".... well, at least not in less than 40 guess whch I become invisible to you!");
    int hits = 0;
    int guesses = 0;

    Board b = new Board();
    int rowRandom = (int)(Math.random() * 9); //0 to 9
    int coulmnStartRandom = (int)(Math.random() * 4); //0 to 4
    b.placeShip(rowRandom, coulmnStartRandom);
  
  while (hits < 5) {
    b.showBoard();
    b.handleUserGuess();
    hits = b.checkWinStatus();
    ++guesses;
    o.msg("Youre up to " + guesses + " guesses now...");
    if (guessess ==40) break;
  }

  if (gueeses == 40) {
    o.msg("\n\nOhhh yeahhhhh!!!!!");
    o.msg("")
  }

    
  }
}