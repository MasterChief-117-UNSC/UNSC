package com.turling.service;

import com.turling.entity.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> finAll();

    //多级菜单
    public List<Menu> findAllMenu();
}
