package com.son.playground.dto.res;

import com.son.playground.dto.res.common.BaseResDto;
import lombok.Setter;

@Setter
public class RankResDto extends BaseResDto {
    private Long rankId;
    private Long gameId;
    private Long ranker;
    private Long score;
}
