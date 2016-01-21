package p1;

public class Main {

    public static void main(String[] args) {
        String [] names = {"John", "Jill", "Jane", "Jorge"};
        String [] tests = {"Test 1", "Test 2", "Test 3"};
        double [][] grades = {
                {85, 90, 80},
                {86, 95, 82},
                {80, 90, 89},
                {88, 97, 90}};

        //Average for each student
        for(int s = 0; s < 4; s++){
            for(int r = 0; r < 4; r++) {
               for (int c = 0; c < 1; c++) {
                       System.out.print(names[s] + "'s average is " + (grades[r][c] + grades[r][c + 1] + grades[r][c + 2]) / 3);
                       System.out.println();
                   s++;
               }
            }
        }

        //Average for each test
        for(int t = 0; t < 3; t++) {
            for (int r = 0; r < 1; r++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(tests[t] + "'s average is " + (grades[r][c] + grades[r + 1][c] + grades[r + 2][c] + grades[r + 3][c]) / 4);
                    System.out.println();
                    t++;
                }
            }
        }
    }
}
