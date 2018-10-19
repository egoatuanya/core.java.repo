package ArraysPractice;

public class StudentNames {

    public void giveStudentNames() {
        String[] studentNames = {"Pooja", "Priya", "Kavya", "Anita", "Brita", "Zita"};

        System.out.println(studentNames.length);

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }
    }

        public void findStudentNames()
    {
        String [] studentNames = new String[7];
        studentNames[0] = "Pooja";
        studentNames[1] ="Priya";
        studentNames[2] = "Kavya";
        studentNames[3] = "Anita";
        studentNames[5] ="Brita";
        studentNames[6] = "Zita";


        for (int i = 0;i< studentNames.length; i++)
        {
            if (studentNames[i]=="Kavya")
            {
                System.out.println("This is Kavya's grade");
            }

            else
            {
                System.out.println("Kavya's grade is not available");
            }
            break;

        }



    }
    }




