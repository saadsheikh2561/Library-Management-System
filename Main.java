package com.company;
/*
*Name Sheikh Muhammad Saad
* Roll no 20I-0919
* Department Software Engineering
* Section Q
* Assignment Object Oriented Programming
* Library Management System
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    char ch;           //this variable is used to enter admin or Student mode
        Scanner sc=new Scanner (System.in);
        Admin Add=new Admin();
        Student St1=new Student();
        do{
            //Menu
            System.out.println("Press # to open the admin menu");
            System.out.println("Press $ to open the student menu.");
            System.out.println("Press < to exit");
            System.out.print("Enter your Choice :");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case '#':       //this case is to enter admin mode
                {
                        Add.Password();   //this method is called to take Password from the user which default set as "admin"
                        if(Add.getPassword().equals(Add.getPass()))  //if statment to check Password
                        {
                            System.out.println("Password Sucessfully Matched ");   //Print after checking
                            int choice;
                            //Menu of Admin Mode
                            System.out.println("Welcome to Admin Mode");
                            System.out.println("Press 1 to add a new book.");
                            System.out.println("Press 2 to modify a book record.");
                            System.out.println("Press 3 to delete a book detail.");
                            System.out.println("Press 4 to add student record upon issue of a book (it should record issue date, return date and fine ( penalty)");
                            System.out.println("Press 5 to view all available books.");
                            System.out.println("Press 6 to view the records of all books issued in a particular month");
                            System.out.println("Press 7 to change the password.");
                            System.out.println("Press 8 to go back to Main-menu");
                            System.out.print("Enter your choice : ");
                            choice = sc.nextInt();
                            sc.nextLine();
                            switch (choice) {
                                case 1: {
                                    Add.AddBook();  //method to add new book
                                    break;
                                }
                                case 2: {
                                    Add.RecordModifier();  //method to modify added book
                                    break;
                                }
                                case 3: {
                                    Add.DeleteRecord();   //method to delete the Entered Book
                                    break;
                                }
                                case 4: {
                                    int Enter;
                                    do {

                                       System.out.println("Press 1 to Enroll a Student");
                                       System.out.println("Press 2 if the Student is Already Enrolled And Issue a Book");
                                       System.out.println("Press Anyother key to Exit This Menu");
                                       System.out.println("Enter your Choice: ");
                                       Enter = sc.nextInt();
                                       if (Enter == 1) {
                                           St1.Add_rollNumber();
                                           Boolean B = false;                        //Method to Record Student issue information
                                           if (B == true) {
                                               Add.StudentRecord();
                                           }

                                       } else if (Enter == 2) {
                                           Boolean B;                        //Method to Record Student issue information
                                           B = St1.EnterRollNumber();
                                           if (B == true) {
                                               Add.StudentRecord();
                                           }
                                           if (!B) {
                                               break;
                                           }
                                       }
                                   }while(Enter>=1 && Enter <=2);
                                    break;
                                }
                                case 5: {
                                    Add.DisplayBook();  //Method to Display All the Book present in the Library
                                    break;
                                }
                                case 6:
                                {
                                    Add.IssueBook();     //method to Find the record of book issued in a particular month
                                    break;
                                }
                                case 7: {
                                     Add.ChangePassword();      //this method is used to change password of Admin mode
                                    break;
                                }
                                default:
                                    break;

                            }
                        }
                        else        // if in case Password Didn't match
                        {
                            System.out.println("The Password Didn't Match Please Try Again");
                        }

                    break;
                }
                case '$':  // This case is to Enter Student Mode
                {

                    int choice ;
                    //Menu of Admin Mode
                    System.out.println("Welcome to Student Mode");
                    System.out.println("Press 0 to Enroll Students and Information");
                    System.out.println("Press 1 to search a book available in the library stock");
                    System.out.println("Press 2 to borrow a particular book from library.");
                    System.out.println("Press 3 to read a particular book ");
                    System.out.println("Press 4 to return a Book");
                    System.out.println("Press 5 to go back to the general menu");
                    System.out.println("Enter your choice :");
                    choice=sc.nextInt();
                    sc.nextLine();
                    switch(choice)
                    {
                        case 0:
                        {
                            St1.Add_rollNumber();   //this case is to Enrolled the Student which are Studying in University and any other Institution
                            break;
                        }
                        case 1:
                        {
                            Boolean B;
                              B=St1.EnterRollNumber();  //Checking Weather the Entered Roll number is correct or not
                              if(B==true) {
                                  St1.AvailableBook(); // If student want to search a book weather the book is available in Library or not
                              }
                              break;
                        }
                        case 2:
                        {
                            Boolean B;
                            B=St1.EnterRollNumber();    //Checking Weather the Entered Roll number is correct or not
                            if(B==true) {
                               St1.Borrow();  //Method to Borrow a Book From the Library
                            }
                            break;
                        }
                        case 3:
                        {
                            Boolean B;
                            B=St1.EnterRollNumber(); //Roll number checking
                            if(B==true) {
                                St1.Read();  //Method to Read the Book From the Library
                            }
                            break;
                        }
                        case 4:
                        {
                            Boolean B;
                            B=St1.EnterRollNumber();  //Roll number checking
                            if(B==true)
                            {
                                St1.ReturnBook();  //Method to return a book which was Borrowed by a Student
                            }

                        }
                        default:
                            break;

                    }
                    break;
                }

                default:
                    break;
            }

        }while(ch!='<');
    }
}
