package com.sparta.t11_12.controller;

import com.sparta.t11_12.domain.Memo;
import com.sparta.t11_12.dto.MemoRequestDto;
import com.sparta.t11_12.service.MemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemoController {
    private  final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @GetMapping("/memos")
    public List<Memo> getMemos(){
        return memoService.getMemos();
    }

    @PostMapping("/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto){
        Memo memo = memoService.createMemo(requestDto);
        return memo;
    }
}
