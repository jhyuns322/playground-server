package com.son.playground.service;

import com.son.playground.dto.req.RankReqDto;
import com.son.playground.dto.res.RankResDto;

import java.util.List;

public interface RankService {
    List<RankResDto> getRanks(RankReqDto req);
    void addRank(RankReqDto req) throws Exception;
}
