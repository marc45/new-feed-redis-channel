package org.feedchannel.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface FeedSourceRepository
{
	List<String> getAllFeedUris();
	
	void save(FeedItem feedItem);
	
	void reset();
	
	void setNewFeedItemEventListener(NewFeedItemEventListener newFeedItemEventListener);

	boolean exists(FeedItem feedItem);

	void pushFeedUri(String... feedUri);

	String popFeedUri();
}
