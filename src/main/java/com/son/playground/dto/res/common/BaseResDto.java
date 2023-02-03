package com.son.playground.dto.res.common;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseResDto {
    private String useYn;
    private LocalDateTime regDt;
}
