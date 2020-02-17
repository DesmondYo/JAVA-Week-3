import java.util.Arrays;

public class HomeWork {

		public static void main(String[] args) {
		
					// 1A & B. 
						int [] ages = { 2, 3, 8, 9, 23, 28, 64, 93, 100};
						int averageOfAges = ages.length;
						int numberOne = ages [ages.length - ages.length];
						int lastNumber = ages[ages.length - 1];
						
						System.out.println("93 - 2 = " + (lastNumber -numberOne));
					// 1C. 
						int totalAges = 0;
						
						for (int i = 0; i < averageOfAges; i++) {
							totalAges += ages[i];
							System.out.println("Average age = " + totalAges / averageOfAges);
						}
						
					 // 2D. 
						String[] names = new String [6];
						
						names[0] = "Sam";
						names[1] = "Tommy";
						names[2] = "Tim";
						names[3] = "Sally";
						names[4] = "Buck";
						names[5] = "Bob";
						
						int total = 0;
						
						for ( int i = 0; i < names.length; i++ ) {
							total += names[i].length();				
						
						double averageLetters = total / names.length;
						
							System.out.println(averageLetters);
							
						}
					
					// 2E. 
						String[] name = new String [6];
						
						name[0] = "Sam";
						name[1] = "Tommy";
						name[2] = "Tim";
						name[3] = "Sally";
						name[4] = "Buck";
						name[5] = "Bob";
						
						int totalOfNames = 0;
						
						String allNames = "";			
						
						for (int i = 0; i< name.length; i++) {
							allNames += name [i] + " ";
						}
							System.out.println(allNames);
						
					// 3. How do you access the last element of any array? You would do [ages.length - 1]; 
					
					// 4. How do you access the first element of any array? It would be [0]; 
							
					// 5. 
						String[] titles = new String [6];
							
						titles[0] = "Sam";
						titles[1] = "Tommy";
						titles[2] = "Tim";
						titles[3] = "Sally";
						titles[4] = "Buck";
						titles[5] = "Bob";
							
						int [] nameLengths = new int [titles.length];
						for (int i = 0; i< titles.length; i++) {
							nameLengths[i] = titles [i].length();
						}
						System.out.println(Arrays.toString(nameLengths));
						
					// 6. 
						String[] celebrites  = new String [6];
						
						celebrites[0] = "Sam";
						celebrites[1] = "Tommy";
						celebrites[2] = "Tim";
						celebrites[3] = "Sally";
						celebrites[4] = "Buck";
						celebrites[5] = "Bob";
						
						int sum = 0;
						for (int i = 0; i < nameLengths.length; i++) {
							sum += nameLengths [i];
						}
							System.out.println(total);
							
					// 7. 
							System.out.println(multiplyString ("Desmond Loves Basketball ", 3));
				
					// 8. 
						String firstName = "Nick";
						String lastName = "Suwyn";
						String fullName = createFullName (firstName, lastName);
						
						System.out.println(fullName);
						
					// 9. 
						int[] milesPerHour = new int [5];
						int averageMilePerour = milesPerHour.length;
						
						milesPerHour[0] = 20;
						milesPerHour[1] = 40;
						milesPerHour[2] = 60;
						milesPerHour[3] = 80;
						milesPerHour[4] = 100;
						
						boolean sum1 = isSumGreaterThan100(milesPerHour);
						System.out.println(isSumGreaterThan100(milesPerHour));
						
					// 10 & 11. 
						double[] numbers1 = new double [5];
						
						numbers1[0] = 97.5;
						numbers1[1] = 87.6;
						numbers1[2] = 84.4;
						numbers1[3] = 93.5;
						numbers1[4] = 83.6;
						
						double[] numbers2 = new double [4];
						
						numbers2[0] = 93.32;
						numbers2[1] = 93.32;
						numbers2[2] = 93.32;
						numbers2[3] = 93.32;
						
						System.out.println(calculateAverage (numbers1));
						
					// 12.
						int hotWeather = 100;
						boolean isHotToday = hotWeather > 85;
						double moneyInWallet = 50.47;
						
						System.out.println("Will I buy a drink today? " + willBuyDrink (isHotToday, moneyInWallet));
				
					//13.
						double[] kobeBryantsAveragePoints = new double [6];
						
						kobeBryantsAveragePoints[0] = 36.3;
						kobeBryantsAveragePoints[1] = 34.6;
						kobeBryantsAveragePoints[2] = 39.5;
						kobeBryantsAveragePoints[3] = 25.3;
						kobeBryantsAveragePoints[4] = 53.64;
						kobeBryantsAveragePoints[5] = 35.86;
					
						double [] lebronJamesAveragePoints = new double [5];
						
						lebronJamesAveragePoints [0] = 34.5;
						lebronJamesAveragePoints [1] = 23.67;
						lebronJamesAveragePoints [2] = 45.32;
						lebronJamesAveragePoints [3] = 54.54;
						lebronJamesAveragePoints [4] = 23.65;
					
						System.out.println("Who is the greatest of them all = " + whoIsTheGreatestBasketballPlayer (kobeBryantsAveragePoints) );
						
				}						
					// 7. 
					public static String multiplyString (String str, int num) {
						String result ="";
						for (int i = 0; i < num; i++) {
							result +=str;
						}
						return result;
						}
		
					// 8.
						public static String createFullName (String x, String y) {
							return x + " " + y;
						}
					
					// 9.
						public static boolean isSumGreaterThan100(int[] milesPerHour) {
							int totalMilesPerHour = 0;
							
							for (int i = 0; i < milesPerHour.length; i++) {
								totalMilesPerHour += milesPerHour[i];
							}
							
							if (totalMilesPerHour > 100) {
								return true;
							} else {
							return false;
							}
						}
						
					// 10.
						public static double calculateAverage (double[] numbers) {
							
							double sum = 0;
							
							for (double number : numbers) {
								sum += number;
							}
							return sum / numbers.length;
						}

					// 11. 
						public static boolean calculateAverage1 (double[] numbers1, double [] numbers2) {
							double number1Average = calculateAverage(numbers1);
							double number2Average = calculateAverage(numbers2);
							return (number1Average > number2Average);
						}
					
					// 12. 
						public static boolean willBuyDrink(boolean isHotToday, double moneyInPocket) {
							return isHotToday && moneyInPocket > 10.50;
						}
						
					// 13. 
						// This method determines who is the greatest basketball player and that is factored by average points. I took Kobe Bryant's and Lebron James average points and it returned true
						// because Kobe had better points than Lebron. I created this to show accurate points and decide who was the better basketball player. 
						
						public static boolean whoIsTheGreatestBasketballPlayer (double [] lebronJamesAveragePoints) {
						
						double kobeBryantsAveragePoints = 0;
						
						for (int i = 0; i < lebronJamesAveragePoints.length; i++) {
							
							kobeBryantsAveragePoints+=lebronJamesAveragePoints[i];
						
						}
						
						if (kobeBryantsAveragePoints > lebronJamesAveragePoints.length ) {
							return true;
						} else {
							return false;
						}
						
					}
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		
		


		
				
				
		
		

			
				
		
