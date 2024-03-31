package com.lamecke.mytwitter.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "tb_tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private long tweetId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private  User user;
    private  String content;
    @CreationTimestamp
    private Instant createTimeInstant;

    public long getTweetId() {
        return tweetId;
    }

    public void setTweetId(long tweetId) {
        this.tweetId = tweetId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreateTimeInstant() {
        return createTimeInstant;
    }

    public void setCreateTimeInstant(Instant createTimeInstant) {
        this.createTimeInstant = createTimeInstant;
    }



}
