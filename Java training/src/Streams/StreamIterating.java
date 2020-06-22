package Streams;

import java.util.stream.Stream;

public class StreamIterating {

	public static void main(String[] args) {
		
      Stream.iterate(1, p->p+1)
            .filter(p->p%5==0)
            .limit(5)
            .forEach(System.out::println);
	}
}
