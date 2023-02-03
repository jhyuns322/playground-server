package com.son.playground.dto.res;

import com.son.playground.dto.res.common.BaseResDto;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class GameResDto extends BaseResDto {
    private String gameId;
    private String gameNm;
}
