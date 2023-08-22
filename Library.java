package com.javatpoint;
import java.util.Scanner;
public class Library 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(  "Select From The Following Options:");
        books obj = new books();
        int ch;
        int search;
        do {
            obj.display();
            ch = sc.nextInt();
            switch (ch) 
            {
            case 1:
                book b = new book();
                obj.addBook(b);
                break;
            case 2:
                obj.upgradeBookQty();
                break;
            case 3:
                System.out.println(" press 1 to Search with Book Serial Number.");
                System.out.println(" Press 2 to Search with Book's Author Name.");
                search = sc.nextInt();

                switch (search)
                {
                case 1:
                    obj.searchBySno();
                    break;
                case 2:
                    obj.searchByAuthorName();
                }
                break;
            case 4:
                obj.showAllBooks();
                break;
            default:
                System.out.println("ENTER BETWEEN 0 TO 4:");
            }
        }
        while (ch != 0);
    }
}
