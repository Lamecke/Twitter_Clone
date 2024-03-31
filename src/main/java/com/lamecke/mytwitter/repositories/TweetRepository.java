package com.lamecke.mytwitter.repositories;

import com.lamecke.mytwitter.entities.Role;
import com.lamecke.mytwitter.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

}

