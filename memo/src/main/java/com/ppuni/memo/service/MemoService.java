package com.ppuni.memo.service;

import com.ppuni.memo.DAO.HomeDAO;
import com.ppuni.memo.DTO.HomeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoService {

    @Autowired(required = false) private HomeDAO homeDAO;


    public List<HomeDTO> getList(HomeDTO homeDTO) {
        return homeDAO.getList(homeDTO);
    }
}
