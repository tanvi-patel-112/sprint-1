package com.demo.Service;

import java.util.List;

import com.demo.Online_Food_System.Entity.MenuItem;

public interface MenuItemService {
    MenuItem createMenuItem(MenuItem menuItem);
    MenuItem getMenuItem(int itemId);
    List<MenuItem> getAllMenuItems();
    MenuItem updateMenuItem(MenuItem menuItem);
    void deleteMenuItem(int itemId);
}
