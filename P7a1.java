import java.util.Scanner;

class Student {
    int id_No;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student (int id_No,int no_of_subjects_registered,String[] subject_code,int[] subject_credits,String[] grade_obtained){
        this.id_No=id_No;
        this.no_of_subjects_registered=no_of_subjects_registered;
        this.subject_code=subject_code;
        this.subject_credits=subject_credits;
        this.grade_obtained=grade_obtained;
    }
    public int grade(String grade){
        switch (grade) {
            case "A++":{return 10;}
            case "A+":{return 9;
                      }
            case "A":{return 8;
                      }
            case "B++":{return 7;
                    }
            case "B+":{return 6;
                    }
            case "B":{return 5;
                    }
            case "C++":{return 4;
                    }
            case "C+":{return 3;
                    }
            case "C":{return 2;
                     }
            case "a++":{return 10;
                    }
            case "a+":{return 9;
                    }
            case "a":{return 8;
                    }
            case "b++":{return 7;
                        }
            case "b+":{return 6;
                       }
            case "b":{return 5;
                  }
            case "c++":{return 4;
                  }
            case "c+":{return 3;
                  }
            case "c":{return 2;
                  }
            default:{return 1;
                    }
        }
    }
    public void calSPI(){
        double Total_subject_credits=0;
        double Total_points=0;
        for(int i=0;i<this.no_of_subjects_registered;i++){
         Total_subject_credits+=subject_credits[i];
         Total_points+=subject_credits[i]*grade(grade_obtained[i]);
        }
        this.spi=Total_points/Total_subject_credits;
        System.out.println("spi="+this.spi);
 }
}

public class P7a1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter id number:");
        int id_No=s.nextInt();
        System.out.print("Enter no_of_subjects_registered :");
        int no_of_subjects_registered=s.nextInt();
        System.out.print("Enter subject_code:");
        String[] subject_code=new String[no_of_subjects_registered];
        for(int i=0;i<no_of_subjects_registered;i++){
            System.out.print("sub"+(i+1)+":");
            subject_code[i]=s.next();
        }
        System.out.print("Enter subject_credits:");
        int[] subject_credits=new int[no_of_subjects_registered];
        String[] grade_obtained=new String[no_of_subjects_registered];
        for(int i=0;i<no_of_subjects_registered;i++){
            System.out.print("sub"+(i+1)+":");
            subject_credits[i]=s.nextInt();
        }
        System.out.print("Enter grade_obtained:");
        for(int i=0;i<no_of_subjects_registered;i++){
            System.out.print("sub"+(i+1)+":");
            grade_obtained[i]=s.next();
        }
        Student S1=new Student(id_No, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
        S1.calSPI();
    }
    
}
