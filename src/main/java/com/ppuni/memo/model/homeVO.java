package com.ppuni.memo.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class homeVO {

    // header 부분
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;         // 고유 식별 번호

    @Column(nullable = false, length = 30)
    private String userid;   // 사용자 아이디

    @Column(length = 900)
    private String location; // 위치

    // body 부분

    @Column(length = 900)
    private String img;     // 이미지
    private String yyyymm;  // 글쓴 날짜
    private String feeling;   // 글쓰는 부분
    private int heart;      // 하트 누른 갯수

    // footer 부분
    @Column(length = 900)
    private String question; // 댓글

    @ColumnDefault("user")
    private String role;    // Enum 을 쓰는게 좋다. (도메인이 정해짐 : admin, manager, user 등 설정가능)
    @CreationTimestamp // 시간 자동으로 입력된다.
    private Timestamp createDate;
}
