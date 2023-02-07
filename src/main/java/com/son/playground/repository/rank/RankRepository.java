package com.son.playground.repository.rank;

import com.son.playground.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends JpaRepository<Rank, Long>, CustomRankRepository {
    boolean existsByGameIdAndRanker(String gameId, String ranker);
}
