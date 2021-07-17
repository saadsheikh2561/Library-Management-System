package com.company;
/*
* Book Class
 */
public class Book {
    private  String BookName;
    private String PublisherName;
    private int PublishedYear;
    private int Copies;
    private int IssueDate;                      //Data Members to get and set the information related to Book
    private int ReturnDate;                        //Encapsulation has been Done in this Assignment restrict the access of Data member of class book
    private int month;
    private int Returnmonth;
    private double Fine;
    Book()
    {
        this.BookName="Abc";
        this.PublisherName="XYZ";
        this.PublishedYear=1234;                    //Default Constructor
        this.Copies=0;
        this.ReturnDate=0;
        this.month=0;
        this.Fine=0;
        this.Returnmonth=0;

    }
    Book(String BookName,String PublisherName,int Year,int Books_Limit,int returnDate,int month,double Fine,int ReturnMonth)
    {
        this.BookName=BookName;
        this.PublishedYear=Year;
        this.PublisherName=PublisherName;      //Parameterize Constructor
        this.Copies=Books_Limit;
        this.ReturnDate=returnDate;
        this.month=month;
        this.Fine=Fine;
        this.Returnmonth=ReturnMonth;
    }

    public void setReturnmonth(int returnmonth) {
        Returnmonth = returnmonth;
    }

    public int getReturnmonth() {
        return Returnmonth;
    }

    public void setFine(double fine) {
        Fine = fine;
    }

    public double getFine() {
        return Fine;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setCopies(int copies) {
        Copies = copies;
    }

    public int getCopies() {
        return Copies;
    }

    public void setIssueDate(int issueDate) {
        IssueDate = issueDate;
    }

    public int getIssueDate() {
        return IssueDate;
    }

    public void setReturnDate(int returnDate) {
        ReturnDate = returnDate;
    }

    public int getReturnDate() {
        return ReturnDate;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setPublisherName(String publisherName) {
        PublisherName = publisherName;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublishedYear(int publishedYear) {
        PublishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return PublishedYear;
    }

}
