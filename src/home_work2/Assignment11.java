package home_work2;

public class Assignment11 {
    public static void main(String[] args) {

        Symbol symbol = new Symbol();
        symbol.printLine('-', 'x', 10);
        symbol.printLine('|', 'y', 10);
    }

    public static class Symbol {

        public void printLine(char symb, char vect, int lenght) {
            if (vect == 'x') {
                for (int i = 0; i <= lenght; i++) {
                    System.out.print(symb);
                }
                System.out.println("\n");
            } else if (vect == 'y') {
                for (int i = 0; i <= lenght; i++) {
                    System.out.println(symb);

                }
            } else {
                System.out.println("введите правильное направление");
            }
        }
    }
}
