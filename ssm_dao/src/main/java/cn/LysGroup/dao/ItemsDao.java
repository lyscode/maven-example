package cn.LysGroup.dao;

import cn.LysGroup.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsDao {
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
