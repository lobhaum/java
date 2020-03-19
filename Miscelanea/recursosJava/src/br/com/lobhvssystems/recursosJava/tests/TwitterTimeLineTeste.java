package br.com.lobhvssystems.recursosJava.tests;

import java.util.List;
import java.util.Scanner;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterTimeLineTeste {

	public static void main(String[] args) throws TwitterException {

		TwitterConnection tc = new TwitterConnection();
		TwitterFactory tf = new TwitterFactory(tc.twitterConn().build());
		
		
		Twitter twitter = tf.getInstance();
		System.out.print("Digite o termo a ser pesquisado: ");
		Scanner sc = new Scanner(System.in);
		String termo = sc.nextLine(); // converte o scanner em string
		sc.close();

		List<Status> statuses = twitter.getUserTimeline(termo);
		int i = 0;
		for (Status status : statuses) {
			i++;
			System.out.println(i + ": " + status.getUser().getName() + " - " + status.getUser().getScreenName() + " - "
					+ status.getCreatedAt() + ": " + status.getText());
		}
//		// twitter = TwitterFactory.getSingleton();
//		Query query = new Query(termo);
//		QueryResult result = twitter.search(query);
//		// List<Status> tweets = result.getTweets();
//		for (Status status : result.getTweets()) {
//			System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
//		}

	}

}
