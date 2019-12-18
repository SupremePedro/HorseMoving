import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HorseMoving {
    public static void main(String[] args) throws IOException {
        String startInputMessage = "Введите стартовую позицию коня в формате 'a1' без кавычек ";
        String finishInputMessage = "Введите конечную позицию коня в формате 'a1' без кавычек ";
        int startPosNumber[] = getChessPosition(startInputMessage);
        int finishPosNumber[] = getChessPosition(finishInputMessage);


        int absChar = Math.abs(startPosNumber[0] - finishPosNumber[0]);
        int absNum = Math.abs(startPosNumber[1] - finishPosNumber[1]);

        if (absChar == 1 && absNum == 2 || absChar == 2 && absNum == 1) {
            System.out.println("Ход возможен");
        } else {
            System.out.println("Ход невозможен");
        }
    }

    public static int[] getChessPosition(String message) throws IOException {
        String pos;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] posNumber = new int[2];
        do {
            System.out.println(message);
            pos = reader.readLine();
            if(pos.length()==2){
                posNumber[0] = pos.charAt(0) - 96;
                posNumber[1] = pos.charAt(1) - 48;
                if (posNumber[0] > 0 && posNumber[0] < 9 && posNumber[0] > 0 && posNumber[1] < 9) {
                    break;
                }
            }

            System.out.println("Ошибка ввода!!! Попробуйте еще раз...");
        } while (true);
        return posNumber;
    }
}
