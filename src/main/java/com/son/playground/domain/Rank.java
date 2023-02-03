package com.son.playground.domain;

import com.son.playground.dto.req.RankReqDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "tb_rank")
@NoArgsConstructor
public class Rank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RANK_ID")
    private Long rankId;
    @Column(name = "GAME_ID")
    private String gameId;
    @Column(name = "RANKER")
    private String ranker;
    @Column(name = "SCORE")
    private int score;
    @Column(name = "USE_YN")
    private String useYn;
    @Column(name = "REG_DT")
    private LocalDateTime regDt;

    @Builder
    public Rank(RankReqDto req) {
        this.gameId = req.getGameId();
        this.ranker = req.getRanker();
        this.score = req.getScore();
        this.useYn = "Y";
    }
}
