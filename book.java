package com.javatpoint;
import java.util.Scanner; 
public class book 
{
    public int sno;
    public String bookName;
    public String authorName;
    public int bookQty;
    Scanner sc = new Scanner(System.in);
    
    public book()
    {
        System.out.println("Enter Serial No of Book:");
        this.sno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Name:");
        this.bookName = sc.nextLine();
        System.out.println("Enter Author Name:");
        this.authorName = sc.nextLine();
        System.out.println("Enter Quantity of Books:");
        this.bookQty = sc.nextInt();
    }
}