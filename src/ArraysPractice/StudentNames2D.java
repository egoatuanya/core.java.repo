package ArraysPractice;
import java.util.Scanner;

public class StudentNames2D {
    private String [][] studentNames() {
        String[][] names = new String[2][3];
        names[0][0] = "Fatima";
        names[0][1] = "Jubril";
        names[0][2] = "Kavya";

        names[1][0] = "Dickson";
        names[1][1] = "Victory";
        names[1][2] = "Nehemiah";
        return names;

    }

    public void getStudentNames() {
        String[][] nameOfStudent = this.studentNames();

        //System.out.println(names[1][1]);
        for (int r = 0; r < nameOfStudent.length; r++) {
            for (int c = 0; c < nameOfStudent[r].length; c++)
                System.out.println(nameOfStudent[r][c]);

        }

    }

    public void findStudentNames() {
        String[][] nameOfStudent = this.studentNames();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name you wish to search");
        String nameToSearch = scan.nextLine();
        for (int r = 0; r < nameOfStudent.length; r++){
            for (int c = 0; c < nameOfStudent[r].length; c++) {
                if (nameToSearch.equalsIgnoreCase(nameOfStudent[r][c])) {
                    System.out.println(nameToSearch + "is a student");
                    return;
                }

                }
            }
            System.out.println(nameToSearch + " is not a student");
            }



    }

