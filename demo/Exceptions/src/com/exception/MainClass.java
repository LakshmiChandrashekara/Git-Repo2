package com.exception;

import java.io.IOException;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		do{
			
			System.out.println("Enter the choice");
			System.out.println();
			System.out.println("1. Create a text file ");
			System.out.println("2. Write to a text file");
			System.out.println("3. Read from a text file ");
			System.out.println("4. Exit");
			System.out.println();
			choice = sc.nextInt();
			
				
				switch(choice)
				{
			
				case 1: 
						System.out.println("Enter the path");
						String path=sc.next();
						FileClass file = new FileClass(path);
						try {
							
							file.createFile();
							} catch (IOException e) {
								e.printStackTrace();
							}
						break;
				
				case 2: System.out.println("Enter the path");
						String path1=sc.next();
						System.out.println("enter the data to be written into the file");
						String data = sc.next();
						WriterClass write = new WriterClass(path1);
						try {
							write.doWrite(data);
						} catch (CustomExceptionClass e) {}
						break;
				
				case 3: System.out.println("Enter the path");
						String path3=sc.next();
						ReaderClass read = new ReaderClass(path3);
						read.doRead();
						break;
					
				case 4: break;
				
				default : System.out.println("wrong choice....try again");
						  break;
				}
			
		}while(choice!=4);
		sc.close();
	}

}