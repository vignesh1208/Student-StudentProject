package Programming;
import java.util.*;

public class MovieRatingCollector 
{
    public static class RatingCollectorImpl implements RatingCollector {
        
    	HashMap<String,Double> Avgratings=new HashMap<String,Double>();
    	HashMap<String,Double> sum=new HashMap<String,Double>();
    	HashMap<String,Integer> ratingsCount=new HashMap<String,Integer>();
    	@Override
        public void putNewRating(String movie, double rating) {
    		Double ratings; 
    		Integer count;
    		Double totalsum;
    		if(Avgratings.containsKey(movie))
           {
        	  ratings=Avgratings.get(movie);
        	  count=ratingsCount.get(movie);
        	  totalsum=sum.get(movie);
        	  totalsum+=rating;
        	  sum.put(movie,totalsum);
        	  ratings=(totalsum)/(count+1);
        	  Avgratings.put(movie,ratings);
        	  ratingsCount.put(movie,count+1);
           }
    		else
    		{
    			Avgratings.put(movie,rating);
    			ratingsCount.put(movie,1);
    			sum.put(movie,rating);
    		}
        }

        @Override
        public double getAverageRating(String movie) {
			if(Avgratings.containsKey(movie))
			{
				return Avgratings.get(movie);
			}
			else
				return 0;
        }

        @Override
        public int getRatingCount(String movie) {
        	if(ratingsCount.containsKey(movie))
			{
				return ratingsCount.get(movie);
			}
			else
				return 0;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////


    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}