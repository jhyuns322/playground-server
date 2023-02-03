package com.son.playground.dto.res;

import com.son.playground.dto.res.common.BaseResDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FourCharacterIdiomResDto extends BaseResDto {
    private String fciAnswer;
    private String fciSubAnswer;
    private String fciQuestion;
}
