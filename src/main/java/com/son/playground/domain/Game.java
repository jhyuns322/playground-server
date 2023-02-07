package com.son.playground.domain;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @Column(name = "GAME_ID")
    private String gameId;
    @Column(name = "GAME_NM")
    private String gameNm;
    @Column(name = "USE_YN")
    private String useYn;
    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime regDt;
}
