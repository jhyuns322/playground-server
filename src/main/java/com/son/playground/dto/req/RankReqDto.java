package com.son.playground.dto.req;

import lombok.Getter;

@Getter
public class RankReqDto {
    private Long rankId;
    private String gameId;
    private String ranker;
    private int score;
}
