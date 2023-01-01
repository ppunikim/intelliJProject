package com.ppuni.memo.DTO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class HomeDTO {

    // header 부분
    private String userid;   // 사용자 아이디
    private String location; // 위치
    private int seq;         // 고유 식별 번호

    // body 부분
    private String img;     // 이미지
    private String yyyymm;  // 글쓴 날짜
    private String feeling;   // 글쓰는 부분
    private int heart;      // 하트 누른 갯수

    // footer 부분
    private String question; // 댓글


}
