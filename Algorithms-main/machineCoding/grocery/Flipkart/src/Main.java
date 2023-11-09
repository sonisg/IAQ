import com.grocery.service.ItemService;

public class Main {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        itemService.addUser("Aman", "Kormangla", 1000);
        itemService.addItem("amul", "milk", 100);
        itemService.addItem("nestle", "milk", 110);
        itemService.addInventory("amul", "milk",10);
        itemService.addCart("Aman", "amul", "milk", 1);
        itemService.getCart("Aman");
        itemService.checkout("Aman");

//        itemService.addUser("Aman", "Kormangla", 100);
//        itemService.addItem("amul", "milk", 100);
//        itemService.addItem("nestle", "milk", 110);
//        itemService.addInventory("amul", "milk",10);
//        itemService.addCart("Aman", "amul", "milk", 11);
//        itemService.getCart("Aman");
//        itemService.checkout("Aman");
    }
}