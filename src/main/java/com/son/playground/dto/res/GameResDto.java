package com.son.playground.dto.res;

import com.son.playground.dto.res.common.BaseResDto;
import lombok.Setter;

@Setter
public class GameResDto extends BaseResDto {
    private String gameId;
    private String gameNm;
}
