/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.dao.custom;

import edu.ijse.layered.dao.SuperDAO;
import edu.ijse.layered.eneity.ItemEntity;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public interface ItemDao extends SuperDAO{

    String save(ItemEntity entity) throws Exception;

    String update(ItemEntity entity) throws Exception;

    String delete(String code) throws Exception;

    String gItemEntityet(String code) throws Exception;

    ArrayList<ItemEntity> getAll() throws Exception;

}
