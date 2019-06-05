package com.sample;

public class Main {
	
	 public static void main(String[] args) {
	     
		 Topic t1 = new Topic("Java");
		 Topic t2 = new Topic("Javascript");
		 Topic t3= new Topic("Docker");
		 Topic[] topics = new Topic[3];
		 topics[0]=t1;
		 topics[1]=t2;
		 topics[2]=t3;
		 TopicRepository topicRepository = new TopicRepository();
		 Iterator<Topic> iterator = topicRepository.getIterator(topics);
		 System.out.println(iterator.next());
		 System.out.println(iterator.next());
		 System.out.println(iterator.next());
	   } 
}
