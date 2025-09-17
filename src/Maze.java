import java.util.Scanner;

public class Maze {
    private static final int BEEN_HERE = 1;
    private static final int CURRENT = 2;
    private static final int DESTINATION = 5;

    private static final int SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] maze = new int[SIZE][SIZE];
        int posX = 0, posY = SIZE - 1;

        maze[0][SIZE - 1] = DESTINATION;

        while (maze[posY][posX] != DESTINATION) {
            maze[posY][posX] = CURRENT;
            printMaze(maze);

            System.out.print("Choose direction (up, down, left, right): ");
            String direction = scanner.nextLine().trim().toLowerCase();

            maze[posY][posX] = BEEN_HERE;

            int newX = posX;
            int newY = posY;

            switch (direction) {
                case "up"    -> newY--;
                case "down"  -> newY++;
                case "left"  -> newX--;
                case "right" -> newX++;
                default -> {
                    System.out.println("Invalid direction. Try again.");
                    continue;
                }
            }

            if (isOutOfBounds(newX, newY)) {
                System.out.println("You can't go that way. Try a different direction.");
            } else {
                posX = newX;
                posY = newY;
            }
        }

        maze[posY][posX] = CURRENT;
        printMaze(maze);
        System.out.println("Congrats, you reached the destination!");
    }

    private static boolean isOutOfBounds(int x, int y) {
        return x < 0 || x >= SIZE || y < 0 || y >= SIZE;
    }

    private static void printMaze(int[][] maze) {
        for (int[] row : maze) {
            for (int cell : row) {
                char symbol = switch (cell) {
                    case CURRENT -> 'P';
                    case BEEN_HERE -> '.';
                    case DESTINATION -> 'X';
                    default -> '-';
                };
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}