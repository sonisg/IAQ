package com.grocery.service;

import com.grocery.dao.CartDao;
import com.grocery.dao.InventoryDao;
import com.grocery.dao.ItemDao;
import com.grocery.dao.UserDao;
import com.grocery.model.Cart;
import com.grocery.model.Inventory;
import com.grocery.model.Item;
import com.grocery.model.User;

public class ItemService {

    ItemDao itemDao = new ItemDao();

    InventoryDao inventoryDao = new InventoryDao();

    CartDao cartDao = new CartDao();

    UserDao userDao = new UserDao();

    public User addUser(String name, String address, Integer wallet){
        User user = new User(name, address, wallet);
        userDao.getUserHashMap().put(user.getName(), user);
        System.out.println("User name : "+ user.getName());
        System.out.println("Wallet : "+ user.getWallet());
        return user;
    }
    public Item addItem(String brand, String category, Integer price){
        Item item = new Item (brand, category, price);
        String key = brand+category;
        itemDao.getItemHashMap().put(key, item);
        return item;
    }

    private Item updateItem (String brand, String category, Integer price){
        String key = brand+category;
        if(itemDao.getItemHashMap().containsKey(key)){
            Item item = itemDao.getItemHashMap().get(key);
            item.setBrand(brand);
            item.setCategory(category);
            item.setPrice(price);
            System.out.println("Updated price:" + item.getPrice());
            return item;
        }else {
            Item addedItem = addItem(brand, category, price);
            return addedItem;
        }
    }

    public Inventory addInventory(String brand, String category, Integer units){
        String key = brand + category;
        if(itemDao.getItemHashMap().containsKey(key)){
            Item item = itemDao.getItemHashMap().get(key);
            Inventory inventory = new Inventory(item, units);
            inventoryDao.inventoryHashMap.put(key, inventory);
            return inventory;
        } else {
            Item newItem = addItem(brand, category, null);
            Inventory inventory = new Inventory(newItem, units);
            return inventory;
        }
    }

    public Cart addCart(String user, String brand, String category, Integer units){
        if(userDao.getUserHashMap().containsKey(user)){
            User user1 = userDao.userHashMap.get(user);
            String key = brand + category;
            if(inventoryDao.getInventoryHashMap().containsKey(key)){
                Inventory inventory = inventoryDao.inventoryHashMap.get(key);
                if(inventory.getUnits()>units){
                    Cart cart = new Cart(user1, brand, category, units);
                    cartDao.getCartHashMap().put(user, cart);
                    System.out.println("cart user " + cart.getUser().getName());
                    return cart;
                }
            }
        } else {
           System.out.println("User not found");
        }
        return null;
    }

    public Cart getCart(String name){
        if(cartDao.getCartHashMap().containsKey(name)){
            Cart cart = cartDao.getCartHashMap().get(name);
            String key = cart.getBrand() + cart.getCategory();
            if(itemDao.getItemHashMap().containsKey(key)){
                Item item = itemDao.itemHashMap.get(key);
                Integer totalPrice = cart.getUnits() * item.getPrice();
                cartDao.getCartHashMap().get(name).setTotalPrice(totalPrice);
                System.out.println("Get Cart for User");
                System.out.println("User name "+ cart.getUser().getName());
                System.out.println("Brand name "+ cart.getBrand());
                System.out.println("category name "+ cart.getCategory());
                System.out.println("Total price "+ totalPrice);
                return cart;
            }else{
                System.out.println("No item found");
            }
        } else {
            System.out.println("Add user");
        }
        return null;
    }

    public void checkout(String name) {
        if (cartDao.getCartHashMap().containsKey(name)) {
            if (userDao.getUserHashMap().containsKey(name)) {
                if(userDao.getUserHashMap().get(name).getWallet() > cartDao.getCartHashMap().get(name).getTotalPrice()){
                    Integer totalAmount = userDao.getUserHashMap().get(name).getWallet() - cartDao.getCartHashMap().get(name).getTotalPrice();
                    userDao.getUserHashMap().get(name).setWallet(totalAmount);
                    System.out.println("Wallet Balance" + userDao.getUserHashMap().get(name).getWallet());
                    System.out.println("Checkout Successful");
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }
    }

}
