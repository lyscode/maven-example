package cn.LysGroup.service.impl;

import cn.LysGroup.dao.ItemsDao;
import cn.LysGroup.domain.Items;
import cn.LysGroup.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao dao;
    @Override
    public Items findById(int id) {
        return dao.findById(3);
    }

    @Override
    public List<Items> findAll() {
        return dao.findAll();
    }
}
