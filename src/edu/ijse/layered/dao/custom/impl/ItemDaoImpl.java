/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.eneity.ItemEntity;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class ItemDaoImpl implements ItemDao {

    @Override
    public String save(ItemEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO item VALUES(?,?,?,?,?)", 
                entity.getItemCode(), entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQoh());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(ItemEntity entity) throws Exception {
        return null;
    }

    @Override
    public String delete(String code) throws Exception {
        return null;
    }

    @Override
    public String gItemEntityet(String code) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        return null;
    }

}
