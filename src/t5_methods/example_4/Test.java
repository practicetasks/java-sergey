package t5_methods.example_4;

public class Test {
    public static void main(String[] args) {
        String[] students1 = {"Backend", "Frontend", "Frontend", "Frontend", "Mobile", "Mobile", "Backend"};
        countStudents(students1, "Backend");

        String[] students2 = {"Frontend", "Frontend", "Backend", "Mobile", "Backend", "Backend", "Backend",};
        countStudents(students2, "Backend");

        String[] students3 = {"Frontend", "Frontend", "Frontend", "Mobile", "Backend", "Frontend", "Backend",};
        countStudents(students3, "Frontend");

        int[] may2022 = {26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24};
//        comfortCount(may2022);
//        printAverageTemp(may2022);

        int[] may2023 = {12, 12, 15, 17, 22, 25, 27, 29, 21, 24, 27, 21, 25, 13, 20, 23, 24, 12, 19, 23, 24, 26, 24, 25, 27, 22, 23, 23, 29, 33, 33};
//        comfortCount(may2023);
//        printAverageTemp(may2023);
        // TODO: посчитать кол-во дней с комфортной температурой (от 17 до 22)
    }

    static void countStudents(String[] students, String course) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(course)) {
                count++;
            }
        }
        System.out.println("Количество студентов " + course + ": " + count);
    }
}
