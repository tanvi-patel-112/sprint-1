package com.demo.ServiceImpl;

import java.util.List;

import com.demo.DAOIMPL.MenuItemDaoImpl;
import com.demo.Dao.MenuItemDA0;
import com.demo.Online_Food_System.Entity.MenuItem;
import com.demo.Service.MenuItemService;

public class MenuItemServiceImple implements MenuItemService {

    MenuItemDA0 menuItemDao = new MenuItemDaoImpl();

    @Override
    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemDao.createMenuItem(menuItem);
    }

    @Override
    public MenuItem getMenuItem(int menuItemId) {
        return menuItemDao.getMenuItem(menuItemId);
    }

    @Override
    public MenuItem updateMenuItem(MenuItem menuItem) {
        return menuItemDao.updateMenuItem(menuItem);
    }

    @Override
    public void deleteMenuItem(int menuItemId) {
        menuItemDao.deleteMenuItem(menuItemId);
    }

	@Override
	public List<MenuItem> getAllMenuItems() {
		// TODO Auto-generated method stub
		return null;
	}
}
