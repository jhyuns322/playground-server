package com.son.playground.dto.res;

import com.son.playground.dto.res.common.BaseResDto;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RankResDto extends BaseResDto {
    private Long rankId;
    private String gameId;
    private String ranker;
    private int score;
}
