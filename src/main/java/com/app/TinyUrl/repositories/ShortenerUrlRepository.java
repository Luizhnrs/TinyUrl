package com.app.TinyUrl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.TinyUrl.entities.LongUrl;

public interface ShortenerUrlRepository extends JpaRepository <LongUrl, String> {

}
