import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {

    public int[][] input() {
        Scanner scanner = new Scanner(System.in);
        String arrayString = "";
        ArrayList<String> array = new ArrayList<>();

        do {
            System.out.println("Введите строку массива: ");
            arrayString = scanner.nextLine();
            if (!arrayString.equals(""))
                array.add(arrayString);
        } while (!arrayString.equals(""));

        int[][] resArray = new int[array.size()][];

        for (int i = 0; i < array.size(); i++) {
            resArray[i] = Arrays.stream(array.get(i).split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return resArray;
    }

    public boolean validate(int[][] value) {
        int status[] = new int[4];
        Arrays.fill(status, 0); // 0 - строки, 1 - столбцы, 2 - глав. диаг, 3 - втор. диаг.
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                //Если матрица не квадратная возвращаем false
                if (value.length != value[i].length) {
                    return false;
                } else {
                    status[0] += value[i][j];
                    status[1] += value[j][i];
                    if (i == j)
                        status[2] += value[j][i];
                    if (i + j == value.length - 1)
                        status[3] += value[i][j];
                }
            }
            if (status[0] != status[1]) {
                return false;
            } else {
                result.add(status[0]);
                status[0] = status[1] = 0;
            }
        }
        result.add(status[2]);
        result.add(status[3]);

        //проверка сумм

        int current = result.get(0);
        for (int item : result) {
            if (item != current){
                return false;
            }
        }
        return true;
    }
}
