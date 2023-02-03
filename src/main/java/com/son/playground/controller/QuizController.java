package com.son.playground.controller;

import com.son.playground.service.FourCharacterIdiomService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final FourCharacterIdiomService fourCharacterIdiomService;
    @GetMapping("/four-character-idiom")
    public ResponseEntity<?> getFourCharacterIdioms() {
        return new ResponseEntity<>(fourCharacterIdiomService.getFourCharacterIdioms(), HttpStatus.OK);
    }
}
