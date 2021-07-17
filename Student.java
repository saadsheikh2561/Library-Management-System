package com.company;
/*
* Class of Student
*/
import java.util.Scanner;

public class Student {
    // Encapsulation has been Done in this Assignment restrict the access of Data member of class Student
    private String StudentName;
    private String Department;
    private int rollno;                           //Data Members to get and set the information related to Student
    static Student[] s1; //Array of Student
    private static int i=0;
    Scanner sc=new Scanner(System.in);

    Student()
    {

        this.StudentName="ABC";
        this.Department="XYZ";
        this.rollno=123;                        //Default Constructor
        this.s1=new Student[1500];
    }
    Student(String StudenName,String Department,int rollno,Student[] s1)
    {
        this.StudentName=StudenName;
        this.Department=Department;             //Parametrize Constructor
        this.rollno=rollno;
        this.s1=s1;
    }
  //Setter and Getter
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }
    public void Add_rollNumber()
    {
        //Adding roll number of student which are studying in A institution
        Student[] SC=new Student[1500];
        int rollno;
        String Department;
        String Name;
        char ch;
        for(;i<1500;i++) {
            SC[i]=new Student();
            System.out.println("Enter Roll Number  to Enroll Student in the Library : ");
            rollno=sc.nextInt();
            System.out.println("Enter Name of Student to Enroll Student in the Library: ");
            Name=sc.next();
            System.out.println("Enter the Department of Student to Enroll Student in the Library: ");
            Department=sc.next();
            SC[i].setRollno(rollno);
            SC[i].setDepartment(Department);
            SC[i].setStudentName(Name);
            Student.s1[i]=SC[i];
            System.out.println("Do you want to add another Student(Y/N): ");
            ch=sc.next().charAt(0);
            if(ch=='y'||ch=='Y')
            {
                continue;
            }
            else
            {
                i++;
                break;
            }

        }
    }
    Boolean  EnterRollNumber()
    {
        //Function to enter roll number after every thing a student want to do if Student is Enrolled in a Library
        Boolean B=false;
        int RollNo;
        System.out.println("Enter the Roll Number: ");
        RollNo=sc.nextInt();
        for(int i=0;i<1500;i++) {
            if (s1[i] != null) {
                if (RollNo == s1[i].getRollno()) {
                    System.out.println("You Have Entered a correct Roll No");
                    B = true;
                    break;

                }
            }
        }
        if(!B)
        {
            System.out.println("You Haven't enter a correct roll no or either you are not enrollled");
        }
        return B;
    }
    public void AvailableBook()
    {
        //Checking the book Weather the Book is Available in Library or not
        String BookName;
        String PubName;
        int Year;
        boolean b=false;
        System.out.println("Enter the Name of the Book: ");
        BookName= sc.next();
        System.out.println("Enter Name of Publisher: ");
        PubName=sc.next();
        System.out.println("Enter Year in which Book is Being Published: ");
        Year=sc.nextInt();
        for(int i=0;i<500;i++)
        {

            if(Admin.B[i]!=null)
            {

                if(BookName.equals(Admin.B[i].getBookName()) && PubName.equals(Admin.B[i].getPublisherName()) && Year==Admin.B[i].getPublishedYear())
                {
                    System.out.println("This Book is available in the Library");
                    System.out.println("This Book has "+Admin.B[i].getCopies()+" copies in the Library");
                    b=true;
                    break;
                }

            }

        }
        if(!b)
        {
            System.out.println("There is No such book With this Name available in the Library");
        }

    }
     public void Read()
     {
         //Reading a book
         String BookName;
         int copies;
         boolean b=false;
         System.out.println("Enter the name of you want to Read: ");
         BookName=sc.next();
         for(int i=0;i<500;i++)
         {
             if(Admin.B[i]!=null) {
                 if (BookName.equals(Admin.B[i].getBookName()) && Admin.B[i].getCopies() != 0) {
                     System.out.println("The number of Copies of this Books are " + Admin.B[i].getCopies());
                     copies = Admin.B[i].getCopies();
                     copies--;
                     Admin.B[i].setCopies(copies);
                     System.out.println("Take out this book You can read this Book ThankYou");
                     System.out.println("The Number of copies of this book left are: " + Admin.B[i].getCopies());
                     b=true;
                     break;
                 }
             }
         }
         if(!b)
         {
             System.out.println("There is No such book With this Name available in the Library");
         }

     }
     public void Borrow()
     {
         //Borrow a book
         String BookName1;
         int copies1;
         char choice1;
         int Issuedate1;
         int month1;
         int returndate1;
         double Fine1;
         int returnmonth;
         Boolean b=false;

         System.out.println("Enter the name of book you want: ");
         BookName1=sc.next();
         for(int i=0;i<500;i++)
         {
             if(Admin.B[i]!=null) {
                 if (BookName1.equals(Admin.B[i].getBookName()) && Admin.B[i].getCopies() != 0) {
                     System.out.println("Do you Want to Take out This Book(Y/N) ");
                     choice1 = sc.next().charAt(0);
                     if (choice1 == 'y' || choice1 == 'Y') {
                         System.out.println("Enter the Issue Date(from 1-31): ");
                         Issuedate1 = sc.nextInt();
                         System.out.println("Issue month :");
                         month1 = sc.nextInt();
                         System.out.println("Enter the Return Date");
                         returndate1 = sc.nextInt();
                         System.out.println("Enter the Return Month: ");
                         returnmonth = sc.nextInt();
                         while (Issuedate1 < 0 || Issuedate1 > 31 || month1 < 0 || month1 > 12 || returndate1 < 0 || returndate1 > 31 || returnmonth < 0 || returnmonth > 12) {
                             System.out.println("Enter the Issue Date again you just made a mistake: ");
                             Issuedate1 = sc.nextInt();
                             System.out.println("Issue month :");
                             month1 = sc.nextInt();
                             System.out.println("Enter the Return Date");
                             returndate1 = sc.nextInt();
                             System.out.println("Enter the Return Month: ");
                             returnmonth = sc.nextInt();
                         }
                         System.out.println("Enter Fine :");
                         Fine1 = sc.nextDouble();
                         Admin.B[i].setReturnmonth(returnmonth);
                         Admin.B[i].setFine(Fine1);
                         Admin.B[i].setIssueDate(Issuedate1);
                         Admin.B[i].setMonth(month1);
                         Admin.B[i].setReturnDate(returndate1);
                         System.out.println("The number of Copies of this Books In the Library are: " + Admin.B[i].getCopies());
                         copies1 = Admin.B[i].getCopies();
                         copies1--;
                         Admin.B[i].setCopies(copies1);
                         System.out.println("Take out this book You can Borrow this Book ThankYou");
                         System.out.println("The Number of copies of this book left are: " + Admin.B[i].getCopies());
                         System.out.println();
                         break;
                     }
                     b=true;
                 }

             }
         }
         if(!b)
         {
             System.out.println("There is no book with this name is available in Library");
         }
     }
     public void ReturnBook()
     {
         //Return a book;
         String BookName;
         int copies;
         char choice;
         boolean b=false;
         int returndate;
         int month;

         System.out.println("Enter the name of Book you want to Return: ");
         BookName=sc.next();
         for(int i=0;i<500;i++)
         {
             if(Admin.B[i]!=null)
             {
                 if(BookName.equals(Admin.B[i].getBookName()) )
                 {
                     System.out.println("Do you Want to return This Book(Y/N) ");
                     choice=sc.next().charAt(0);
                     if(choice=='y'|| choice=='Y') {
                         System.out.println("Enter the Return Date Date(from 1-31): ");
                         returndate = sc.nextInt();
                         System.out.println("Enter the Return Month(1-12) :");
                         month=sc.nextInt();
                         while (returndate < 0 || returndate > 31|| month<0 ||month>12) {
                             System.out.println("Enter the return Date again you just made a mistake: ");
                             returndate = sc.nextInt();
                             System.out.println("Enter the Return Month(1-12) :");
                             month=sc.nextInt();
                         }

                          if( month>Admin.B[i].getReturnmonth())
                          {
                              System.out.println("Your Fine is: 500");
                          }
                          else if(month==Admin.B[i].getReturnmonth() && returndate>Admin.B[i].getReturnDate())
                          {
                              System.out.println("Your Fine is: 500");
                          }
                         System.out.println("The number of Copies of this Books In the Library are previously: " + Admin.B[i].getCopies());
                         copies = Admin.B[i].getCopies();
                         copies++;
                         Admin.B[i].setCopies(copies);
                         System.out.println("You Have SucessFully return The Book");
                         System.out.println("The Number of copies of this book are now : " + Admin.B[i].getCopies());
                         b=true;
                         break;
                     }
                 }

             }
         }
         if(!b)
         {
             System.out.println("There no such book with this name in Library");
         }
     }

}
