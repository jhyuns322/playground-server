package com.son.playground.controller;

import com.son.playground.dto.req.RankReqDto;
import com.son.playground.service.RankService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/rank")
@RequiredArgsConstructor
public class RankController {

    private final RankService rankService;

    @GetMapping("/")
    public ResponseEntity<?> getRanks(@RequestBody RankReqDto req) {
        return new ResponseEntity<>(rankService.getRanks(req), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> addRank(RankReqDto req) {
        try{
            rankService.addRank(req);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
