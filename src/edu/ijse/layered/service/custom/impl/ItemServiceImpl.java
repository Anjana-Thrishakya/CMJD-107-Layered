/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.dto.ItemDto;
import edu.ijse.layered.eneity.ItemEntity;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class ItemServiceImpl implements ItemService {
    
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String save(ItemDto dto) throws Exception {
        ItemEntity entity = new ItemEntity(dto.getCode(), dto.getDescription(),
                dto.getPack(), dto.getUnitPrice(), dto.getQoh());
        return itemDao.save(entity);
    }

    @Override
    public String update(ItemDto dto) throws Exception {
        return null;
    }

    @Override
    public String delete(String code) throws Exception {
        return null;
    }

    @Override
    public ItemDto get(String code) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemDto> getAll() throws Exception {
        return null;
    }

}
