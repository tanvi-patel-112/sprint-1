package com.demo.Dao;

import java.util.List;

import com.demo.Online_Food_System.Entity.MenuItem;

public interface MenuItemDA0 {
    MenuItem createMenuItem(MenuItem menuItem);
    MenuItem getMenuItem(String menuItemId);
    List<MenuItem> getAllMenuItems();
    MenuItem updateMenuItem(MenuItem menuItem);
    void deleteMenuItem(int itemId);
	MenuItem getMenuItem(int itemId);
}

