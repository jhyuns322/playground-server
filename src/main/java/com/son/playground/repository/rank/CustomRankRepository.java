package com.son.playground.repository.rank;

import com.son.playground.dto.req.RankReqDto;
import com.son.playground.dto.res.RankResDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomRankRepository {
    List<RankResDto> selectAll(RankReqDto req);
}
