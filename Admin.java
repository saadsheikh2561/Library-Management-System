package com.company;
/*
 * Admin Class
 */
import java.util.Scanner;
public class Admin {
    // Encapsulation has been Done in this Assignment restrict the access of Data member of class Admin
    private String adminName;
    private String Password;
    private String Pass1="admin";                    //Data Members to get and set the information related to Admin
     static Book[] B;       //Array of Book
     static Student[] issuestudent;    //Array of Student
     static int i=0;
    Scanner sc=new Scanner(System.in);

    Admin()
    {
        this.adminName="Abc";
        this.Password="admin";
        this.B=new Book[500];                                   //Default Constructor
        this.issuestudent=new Student[500];
    }
    Admin(String AdminName,String Password,Book[] B,Student[] s)
    {
        this.adminName=AdminName;
        this.Password=Password;                     //Private Constructor
        this.B=B;
        this.issuestudent=s;
    }
        //setter and Getter
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getPass() {
        return Pass1;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }
    public void Password()
    {
        //Password
        String Pass;
        System.out.println("Enter The Password(I set the Password by Default as 'admin') :");
        Pass=sc.next();
        setPassword(Pass);

    }
    public  void AddBook()
    {
        //Function to add book in the Library
        String name;
        String PublisherName;
        int Year;
        int copies;
        char choice;


        Book[] obj=new Book[500];
        for(;i<500;i++)
        {

             obj[i]=new Book();
            System.out.println("Enter the name of the Book: ");
            name=sc.next();
            System.out.println("Enter Publisher Name of Book: ");
            PublisherName=sc.next();
            System.out.println("Enter the Year in which the had been Published: ");
            Year=sc.nextInt();
            System.out.println("Enter the number of Copies this Book has: ");
            copies=sc.nextInt();
            obj[i].setBookName(name);
            obj[i].setPublisherName(PublisherName);
            obj[i].setPublishedYear(Year);
            obj[i].setCopies(copies);
            Admin.B[i]=obj[i];

            System.out.println("Do you want to Enter another Book(Y/N): ");
            choice=sc.next().charAt(0);

            if(choice=='Y'|| choice=='y')
            {
                continue;
            }
            else {
                i++;
                break;
            }
        }

    }
    public void RecordModifier()
    {
        //Function to modify the information Related to Book
        String name;
        String PublisherName;
        int year;
        int copies;
        boolean b=false;

        System.out.println("Enter the Name of Book which you want to Modify: ");
        name=sc.next();
        System.out.println("Enter the Publisher Name of that Book : ");
        PublisherName=sc.next();
        System.out.println("Enter the Published Year of that Book: ");
        year=sc.nextInt();
        for(int i=0;i<500;i++)
        {
            if(Admin.B[i]!=null) {
                if (name.equals(B[i].getBookName()) && PublisherName.equals(B[i].getPublisherName()) && year == B[i].getPublishedYear()) {

                    System.out.println("Enter the Name of Book that you want to place instead of that: ");
                    name = sc.next();
                    System.out.println("Enter the Publisher Name of Book: ");
                    PublisherName = sc.next();
                    System.out.println("Enter the Published Year of  Book: ");
                    year = sc.nextInt();
                    System.out.println("Enter the number of Copies this Book has: ");
                    copies = sc.nextInt();
                    B[i].setBookName(name);
                    B[i].setPublisherName(PublisherName);
                    B[i].setPublishedYear(year);
                    B[i].setCopies(copies);
                    System.out.println(" The Book information Has Been Modified ");
                    b=true;
                    break;
                }
            }
        }
        if(!b)
        {
            System.out.println("There is no such book with this Name and Publisher Name in the Library");
        }
    }
    public void DeleteRecord()
    {
        //Method to Delete Book From the Library
        String name;
        String PublisherName;
        int year;
        int copies;
        boolean b=false;

        System.out.println("Enter the Name of Book which you want to Delete: ");
        name=sc.next();
        System.out.println("Enter the Publisher Name of that Book : ");
        PublisherName=sc.next();
        System.out.println("Enter the Published Year of that Book: ");
        year=sc.nextInt();
        for(int i=0;i<500;i++)
        {
            if(Admin.B[i]!=null) {
                if (name.equals(B[i].getBookName()) && PublisherName.equals(B[i].getPublisherName()) && year == B[i].getPublishedYear()) {
                    B[i] = null;
                    System.out.println("The Book Record has Been Sucessfully deleted");
                    b=true;
                    break;
                }
            }
        }
        if(!b)
        {
            System.out.println("There is no such book with this BookName and ");
        }
    }
    public void StudentRecord()
    {
        //Method to Record the Student information while issuing the Book
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
                b=true;
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

                }
            }

        }
        if(!b)
        {
            System.out.println("The Book is not Available in the Library");
        }


    }
    public void DisplayBook()
    {
        //Method to Display all the Books in the Library
        boolean b=false;
        if(i==0)
        {
            b=true;
            System.out.println("There is no Book Available in Library");
        }
        else {
            for (int j = 0; j < i; j++) {
                    if(Admin.B[j]!=null) {
                        System.out.println("Following Books are Availble in a Libraray");
                        System.out.println("The Name of the Book is " + Admin.B[j].getBookName());
                        System.out.println("The Publisher of this Book is :" + Admin.B[j].getPublisherName());
                        System.out.println("The Year in which Book Had been Published is :" + Admin.B[j].getPublishedYear());
                        System.out.println("The number of Copies of this Books in the libraries are :" + Admin.B[j].getCopies());
                        b=true;
                    }
            }
        }
        if(!b)
        {
            System.out.println("There is no Book in the library");
        }
    }
    public void ChangePassword()
    {
        //Method To change the Password of admin
        String Pass;
        System.out.println("Enter The New Password :");
        Pass=sc.next();
        Pass1=Pass;
        setPassword(Pass);
        System.out.println("Password Sucessfully Changed");
    }
    public void IssueBook()
    {
        //Method to Display the Book which are being Issued in a particular month
        int month;
        boolean B=false;
            System.out.println("Enter the month which you want the record of : ");
            month = sc.nextInt();
            while (month < 0 || month > 12) {
                System.out.println("Enter the month again as you have enter an invalid month: ");
                month = sc.nextInt();
            }
        for(int i=0;i<500;i++) {
            if(Admin.B[i]!=null) {
                if (month == (Admin.B[i].getMonth())) {
                    System.out.println("The books that issued this month");
                    System.out.println("The Name of the Book is " + Admin.B[i].getBookName());
                    B = true;
                }
            }

        }
        if(!B)
        {
            System.out.println("There is no Book Isssued this month");
        }
    }
}
