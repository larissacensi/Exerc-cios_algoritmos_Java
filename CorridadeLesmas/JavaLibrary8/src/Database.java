/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larissa.pelenci
 */

import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class Database {
    private ArrayList<Item> itens;
 
    
    public Database() {
        itens = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        itens.add(item);
    }
    
    
    public void list() {
        for (Item item : itens) {
            item.print();
            System.out.println();
        }
    }
}
