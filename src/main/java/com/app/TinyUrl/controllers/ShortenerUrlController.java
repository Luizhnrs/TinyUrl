package com.app.TinyUrl.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.TinyUrl.controllers.requests.UrlRequest;

@RestController
public class ShortenerUrlController {
    @PostMapping(value = "/shortener-url")
    public ResponseEntity<Void> shortUrl(@RequestBody UrlRequest request){
        
        return ResponseEntity.ok().build();
    }
}
