package cn.LysGroup.service;

import cn.LysGroup.domain.Items;

import java.util.List;

public interface ItemsService {
    /**
     * 通过id查询
     * @param id
     * @return
     */
    Items findById(int id);

    /**
     * 查询所有
     * @return
     */
    List<Items> findAll();
}
