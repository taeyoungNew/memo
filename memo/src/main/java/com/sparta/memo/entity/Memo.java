package com.sparta.memo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Memo {
	// 메모의 id
    private Long id;
    // 메모를 쓴 유저네임
    private String username;
    // 메모의 내용
    private String contents;
}