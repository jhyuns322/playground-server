package com.son.playground.dto.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class RankReqDto {
    private String gameId;
    private String ranker;
    private int score;
    private String useYn;
}
