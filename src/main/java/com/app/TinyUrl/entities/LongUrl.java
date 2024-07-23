package com.app.TinyUrl.entities;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Indexed;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(name = "urls")
public class LongUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String longUrl;

    private String shortUrl;

    private LocalDateTime createdAt;

    public LongUrl(String id, String longUrl, String shortUrl, LocalDateTime createdAt) {
        this.id = id;
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
        this.createdAt = createdAt;
    }

    public LongUrl(){
        
    }
}