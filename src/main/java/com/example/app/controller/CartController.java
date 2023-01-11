package com.example.app.controller;

import com.example.app.domain.vo.*;
import com.example.app.service.AddressService;
import com.example.app.service.BoardService;
import com.example.app.service.CartService;
import com.example.app.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cart/*")
public class CartController {
    private final ReplyService replyService;
    private final CartService cartService;
    private final BoardService boardService;
    private final AddressService addressService;
    // 장바구니 추가
    @PostMapping("/add")
    public String add(@RequestBody CartVO cartVO){
        cartService.insertCart(cartVO);
        return "insert success";
    }
    // 장바구니 검사
    @PostMapping("/check")
    public int check(@RequestBody int proId){
        return cartService.checkCart(proId);
    }

    // 장바구니 삭제
    @PostMapping("/delete")
    public void delete(@RequestBody CartVO cartVO){
        cartService.deleteCart(cartVO);
    }

    // 배송지 추가
    @PostMapping("/address")
    public void address(@RequestBody AddressVO addressVO){
        addressService.insertAddress(addressVO);
    }

    //    추가
    @PostMapping("/new")
    public String write(@RequestBody ReplyVO replyVO){
        replyService.register(replyVO);
        return "write success";
    }


//    수정
//    @PatchMapping(value = {"/{rno}", "/{rno}/{replyWriter}"})
////    @PutMapping(value = {"/{rno}", "/{rno}/{replyWriter}"})
//    public void modify(@RequestBody ReplyVO replyVO, @PathVariable("rno") Long replyNumber, @PathVariable(value = "replyWriter", required = false) String replyWriter){
//        replyVO.setReplyNumber(replyNumber);
//        replyVO.setReplyWriter(Optional.ofNullable(replyWriter).orElse(replyService.show(replyNumber).getReplyWriter()));
//        replyService.modify(replyVO);
//    }

    @PostMapping("/modify")
    public void modify(@RequestBody ReplyVO replyVO){
//        Optional은 JDK8부터 지원되는 검증 클래스이며, ofNullable(Object)로 사용한다.
//        ifPresent()를 사용하여 null 여부 검사가 가능하며, null이 아니라면 기존 Object 객체를 그대로 사용한다.
//        orElse를 사용하면 null일 경우 대체할 객체를 작성할 수 있다.
        replyVO.setReplyWriter(Optional.ofNullable(replyVO.getReplyWriter()).orElse(replyService.show(replyVO.getReplyNumber()).getReplyWriter()));
        replyService.modify(replyVO);
    }

    //    댓글 삭제
    @DeleteMapping("/{replyNumber}")
    public void remove(@PathVariable Long replyNumber){
        replyService.remove(replyNumber);
    }

    //    댓글 1개 조회
    @GetMapping("/{replyNumber}")
    public ReplyVO show(@PathVariable Long replyNumber){
        return replyService.show(replyNumber);
    }

    @GetMapping("/serial/{proCode}")
    public List<SerialVO> showSerial(@PathVariable String proCode){
        return replyService.showAllSerial(proCode);
    }
}























