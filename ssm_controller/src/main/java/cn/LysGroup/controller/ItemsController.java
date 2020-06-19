package cn.LysGroup.controller;

import cn.LysGroup.domain.Items;
import cn.LysGroup.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService service;
    @RequestMapping("/test")
    public String test(Model model){
        Items item = service.findById(3);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
