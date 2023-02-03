package com.son.playground.repository.rank;

import com.querydsl.core.types.Projections;
import com.son.playground.domain.Rank;
import com.son.playground.dto.req.RankReqDto;
import com.son.playground.dto.res.RankResDto;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.son.playground.domain.QRank.rank;

public class CustomRankRepositoryImpl extends QuerydslRepositorySupport implements CustomRankRepository {
    public CustomRankRepositoryImpl() {
        super(Rank.class);
    }

    @Override
    public List<RankResDto> selectAll(RankReqDto req) {
        return from(rank)
                .select(
                        Projections.bean(
                                RankResDto.class,
                                rank.rankId,
                                rank.gameId,
                                rank.ranker,
                                rank.score,
                                rank.useYn,
                                rank.regDt
                        )
                )
                .where(
                        rank.useYn.eq("Y"),
                        rank.gameId.eq(req.getGameId())
                )
                .fetch();
    }
}
