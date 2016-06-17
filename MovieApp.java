// Melanie Myers
// Lab 10 
// 6/16/2016
// This app asks user for desired category of movies and returns movies that match that category. 


import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp extends Movie {


	public MovieApp(String ti, int cat) {
		super(ti, cat);
	}

	public static void main(String[] args) {

		int choice= 0;

		Scanner reader = new Scanner (System.in);


		Movie LoveActually = new Movie("Love Actually", 1);
		Movie FindingNemo = new Movie("Finding Nemo", 2);
		Movie Alladin = new Movie("Alladin", 2);
		Movie TheExorcist = new Movie("The Exorcist", 3);
		Movie Avatar = new Movie("Avatar", 4);
		Movie Cinderella = new Movie("Cinderella", 2);
		Movie Titanic = new Movie("Titanic", 1);
		Movie Frozen = new Movie("Frozen", 2);
		Movie Zodiac = new Movie("Zodiac", 3);
		Movie SnowWhite = new Movie("Snow White",2);
		
		// category key: 1= drama, 2= animated, 3= horror, 4= SciFi

		LoveActually.setCategory(1);
		FindingNemo.setCategory(2);
		Alladin.setCategory(2);
		TheExorcist.setCategory(3);
		Avatar.setCategory(4);
		Cinderella.setCategory(2);
		Titanic.setCategory(1);
		Frozen.setCategory(2);
		Zodiac.setCategory(3);
		SnowWhite.setCategory(2);

		LoveActually.setTitle("Love Actually");
		FindingNemo.setTitle("Finding Nemo");
		Alladin.setTitle("Alladin");
		TheExorcist.setTitle("The Exorcist");
		Avatar.setTitle("Avatar");
		Cinderella.setTitle("Cinderella");
		Titanic.setTitle("Titanic");
		Frozen.setTitle("Frozen");
		Zodiac.setTitle("Zodiac");
		SnowWhite.setTitle("Snow White");

		ArrayList<Movie> movies = new ArrayList<Movie>(); 
		movies.add(LoveActually);
		movies.add(FindingNemo);
		movies.add(Alladin);
		movies.add(TheExorcist);
		movies.add(Avatar);
		movies.add(Cinderella);
		movies.add(Titanic);
		movies.add(Frozen);
		movies.add(Zodiac);
		movies.add(SnowWhite);

		System.out.println("Welcome to the Movie List Application!");
		System.out.println("");
		System.out.println("There are " + movies.size() + " movies in this list.");

		boolean keepGoing = true;

		while (keepGoing){

			boolean keepAsking = true;

			while (keepAsking)	{
				System.out.println("What category are you interested in? Please select a number." + "\n"
						+ "1. Drama " + "\n" 
						+ "2. Animated" + "\n"
						+ "3. Horror" + "\n"
						+ "4. SciFi" + "\n");

				choice = reader.nextInt();

				if (choice > 4 || choice < 1){
					System.out.println("Invalid entry.");
				}
				else {
					keepAsking = false;
				}
			}


			System.out.println("Here are the movies we have from that category:");

			for (int i = 0; i < movies.size(); i++){

				Movie a = movies.get(i);

				if (a.getCategory()== choice){
					System.out.println(a.getTitle());
				}

			}
			System.out.println("");
			System.out.println("Would you like to select another category?");
			reader.nextLine();
			String answer = reader.nextLine();

			if (answer.equalsIgnoreCase("no")){
				System.out.println("Goodbye!");
				keepGoing = false;
			}
		}







		reader.close();

	}



}



