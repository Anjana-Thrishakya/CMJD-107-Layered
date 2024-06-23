/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;

import edu.ijse.layered.dao.custom.impl.ItemDaoImpl;

/**
 *
 * @author anjan
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDao(DaoTypes type){
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
            case CUSTOMER:
                return null;
            case ORDER:
                return null;
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        ITEM, CUSTOMER, ORDER
    }
}
