package com.son.playground.service.impl;

import com.son.playground.domain.Rank;
import com.son.playground.dto.req.RankReqDto;
import com.son.playground.dto.res.RankResDto;
import com.son.playground.repository.rank.RankRepository;
import com.son.playground.service.RankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RankServiceImpl implements RankService {

    private final RankRepository rankRepository;

    @Override
    public List<RankResDto> getRanks(RankReqDto req) {
        return rankRepository.selectAll(req);
    }

    @Override
    public void addRank(RankReqDto req) throws Exception {
        if (rankRepository.existsByGameIdAndRanker(req.getGameId(), req.getRanker())) {
            throw new Exception("Ranker already exists");
        }
        rankRepository.save(Rank.builder().req(req).build());
    }
}
