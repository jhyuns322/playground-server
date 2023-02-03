package com.son.playground.domain;

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
    private Long gameId;
    @Column(name = "RANKER")
    private Long ranker;
    @Column(name = "SCORE")
    private Long score;
    @Column(name = "USE_YN")
    private String useYn;
    @Column(name = "REG_DT")
    private LocalDateTime regDt;
}
