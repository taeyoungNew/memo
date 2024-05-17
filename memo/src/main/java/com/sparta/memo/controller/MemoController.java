package com.sparta.memo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sparta.memo.controller.dto.MemoResponseDto;

@RestController
@RequestMapping("/api")
public class MemoController {
	
	@PostMapping("/memos")
	public MemoResponseDto createMemo(@RequestBody MemoResponseDto requestDto) {
		// 데이터는 바디부분에 json형태로 받을 예정
		return null;
	}
	
}
