package com.sample;

public class TopicRepository  implements Container<Topic>{

	@Override
	public Iterator<Topic> getIterator(Topic[] topics) {
		return new TopicIterator(topics);
	}


	

}
