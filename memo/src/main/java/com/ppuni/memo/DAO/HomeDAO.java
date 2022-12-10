package com.ppuni.memo.DAO;

import com.ppuni.memo.DTO.HomeDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeDAO {
    //xml 와 DTO 를 연결해주는 것.
    List<HomeDTO> getList(HomeDTO homeDTO);

}
