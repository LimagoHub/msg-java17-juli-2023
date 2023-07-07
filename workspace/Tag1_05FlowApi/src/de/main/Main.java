package de.main;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

import de.processors.MyProcessor;
import de.subscriber.EndSubscriber;

public class Main {

	public static void main(String[] args) {
		
		List<String> liste = List.of("1","2","drei","4","fuenf","1","2","drei","4","fuenf");
		
		EndSubscriber<Integer> subscriber = new EndSubscriber<>();
		MyProcessor processor = new MyProcessor(Integer::valueOf);
		
		SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
		publisher.subscribe(processor);
		processor.subscribe(subscriber);
		
		liste.forEach(publisher::submit);
		
		publisher.close();
		
		System.out.println("Ende");
		
	}

}
