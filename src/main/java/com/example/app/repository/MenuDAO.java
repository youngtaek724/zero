package com.example.app.repository;

import com.example.app.domain.vo.MenuVO;
import com.example.app.domain.vo.ProductVO;
import com.example.app.mapper.MenuMapper;
import com.example.app.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MenuDAO {
    private final ProductMapper productMapper;

    public List<MenuVO> showMenu(){return productMapper.showMenu(); }


}
