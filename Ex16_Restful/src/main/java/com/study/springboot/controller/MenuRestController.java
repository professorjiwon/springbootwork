package com.study.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.domain.Menu;
import com.study.springboot.domain.Taste;
import com.study.springboot.domain.Type;
import com.study.springboot.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuRestController {
	
	@Autowired
	MenuService menuService;
	
	@GetMapping
	public List<Menu> menuAllList() {
		return menuService.menuAllList();
	}
	
	/*
	 /menu/type/KR
	 /menu/type/CH
	 /menu/type/JP
	 */
	@GetMapping("/type/{type}")
	public List<Menu> findByType(@PathVariable(name="type") Type type) {
		return menuService.findByType(type);
	}
	
	@GetMapping("/type/{type}/taste/{taste}")
	public List<Menu> findByTypeAndTaste(@PathVariable(name="type") Type type,
										 @PathVariable(name="taste") Taste taste)
	{
		return menuService.findByTypeAndTaste(type, taste);
	}
}









