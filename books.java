package com.javatpoint;
import java.util.Scanner;
public class books 
{
    book theBooks[] = new book[50];
    public static int count;
    Scanner sc = new Scanner(System.in);
 
    public int compareBookObjects(book b1, book b2)
    {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) 
        {
            System.out.println("Book of this Name Already Exists.");
            //return 0;
        }
        if (b1.sno == b2.sno) 
        {
            System.out.println("Book of this Serial Number Already Exists.");
            //return 0;
        }
        return 1;
    }

    public void addBook(book b)
    {
        for (int i = 0; i < count; i++) 
        {
            if (this.compareBookObjects(b, this.theBooks[i]) == 0)
                return;
        }
        if (count < 50) 
        {
            theBooks[count] = b;
            count++;
        }
        else 
        {
            System.out.println("No More Books Can Be Added.");
        }
    }

    public void searchBySno()
    {

        System.out.println("SEARCH BY SERIAL NUMBER");
        int sno;
        System.out.println("Enter Serial Number of Book:");
        sno = sc.nextInt();
        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tTotal Qty");
        for (int i = 0; i < count; i++) 
        {
            if (sno == theBooks[i].sno) 
            {
               System.out.println(theBooks[i].sno + "\t\t"+ theBooks[i].bookName + "\t\t"+ theBooks[i].authorName + "\t\t"+ theBooks[i].bookQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book for Serial Number "+ sno + " Found.");
    }

    public void searchByAuthorName()
    {
        System.out.println( "SEARCH BY AUTHOR'S NAME");
        sc.nextLine();
        System.out.println("Enter Author Name:");
        String authorName = sc.nextLine();
        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tTotal Qty");
        for (int i = 0; i < count; i++) 
        {
            if (authorName.equalsIgnoreCase(theBooks[i].authorName)) 
            {
                System.out.println(theBooks[i].sno + "\t\t"+ theBooks[i].bookName + "\t\t"+ theBooks[i].authorName + "\t\t"+ theBooks[i].bookQty);
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + authorName + " Found.");
    }

    public void showAllBooks()
    {
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println("S.No\t\tName\t\tAuthor\t\tTotal Qty");
        for (int i = 0; i < count; i++) 
        {
            System.out.println(theBooks[i].sno + "\t\t"+ theBooks[i].bookName + "\t\t"+ theBooks[i].authorName + "\t\t"+ theBooks[i].bookQty);
        }
    }

    public void upgradeBookQty()
    {
        System.out.println("UPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Serial Number of Book");
        int sno = sc.nextInt();
        for (int i = 0; i < count; i++) 
        {
            if (sno == theBooks[i].sno) 
            {
                System.out.println( "Enter Number of Books to be Added:");
 
                int addQty = sc.nextInt();
                theBooks[i].bookQty += addQty;
                return;
            }
        }
    }

    public void display()
    {
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book."); 
        System.out.println("Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
    }

}

