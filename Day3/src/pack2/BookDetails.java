package pack2;
import java.util.Scanner;

import pack2.Book;
import pack2.EngineeringBookk;

public class BookDetails {

	public static void main(String[] args) {
		Book book1=new Book();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Book No");
		book1.setBookNo(sc.nextInt());
		System.out.println("Enter Book Title");
		book1.setTitle(sc.nextLine());
		System.out.println("Enter Author Name");
		book1.setAuthor(sc.nextLine());
		System.out.println("Enter Book Price");
		book1.setPrice(sc.nextFloat());

		EngineeringBook ebook=new EngineeringBook();
		System.out.println("Enter Book category");
		ebook.setCategory(sc.next());

	}
}
