package com.hjl.test.controller;

import com.hjl.test.Bean.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huangjinlong7 on 2018/5/14.
 */
@Controller
@RequestMapping
public class IndexController {

  @RequestMapping("/firstPage")
  public String index(Model model) {
    List<Person> list = new ArrayList<>();
    Person p = new Person();
    p.setAge(10);
    p.setName("hjl");
    list.add(p);
    p = new Person();
    p.setAge(11);
    p.setName("hyj");
    list.add(p);
    p = new Person();
    p.setAge(12);
    p.setName("hhy");
    list.add(p);
    model.addAttribute("singlePerson", p);
    model.addAttribute("people", list);
    return "index";
  }

}
