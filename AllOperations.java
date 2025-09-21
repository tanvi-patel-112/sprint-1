package com.demo.Operation;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.demo.Online_Food_System.Entity.MenuItem;
import com.demo.Online_Food_System.Entity.Order;
import com.demo.Online_Food_System.Entity.OrderItem;
import com.demo.Online_Food_System.Entity.Payment;
import com.demo.Online_Food_System.Entity.Restaurant;
import com.demo.Online_Food_System.Entity.User;
import com.demo.Service.MenuItemService;
import com.demo.Service.OrderItemService;
import com.demo.Service.OrderService;
import com.demo.Service.PaymentService;
import com.demo.Service.RestaurantService;
import com.demo.Service.UserService;

import com.demo.ServiceImpl.MenuItemServiceImple;
import com.demo.ServiceImpl.OrderItemServiceImple;
import com.demo.ServiceImpl.OrderServiceImple;
import com.demo.ServiceImpl.PaymentServiceImple;
import com.demo.ServiceImpl.RestaurantServiceImple;
import com.demo.ServiceImpl.UserServiceImple;

public class AllOperations {

    static Scanner sc = new Scanner(System.in);

    // Services
    static UserService userService = new UserServiceImple();
    static RestaurantService restaurantService = new RestaurantServiceImple();
    static MenuItemService menuItemService = new MenuItemServiceImple();
    static OrderService orderService = new OrderServiceImple();
    static OrderItemService orderItemService = new OrderItemServiceImple();
    static PaymentService paymentService = new PaymentServiceImple();

    // ===== User Operations =====
    public static User userInputs() {
        System.out.print("Enter user id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        User u = new User();
        u.setId(id);
        u.setUsername(username);
        u.setPassword(password);
        u.setEmail(email);
        u.setAddress(address);
        u.setPhoneNumber(phone);
        return u;
    }

    public static void userOperations() {
        while (true) {
            System.out.println("\n--- User Operations ---");
            System.out.println("1. Add User");
            System.out.println("2. Get User by ID");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Back to Main Menu");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    User u = userInputs();
                    userService.createUser(u);
                    System.out.println("User saved: " + u);
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    User user = userService.getUser(uid);
                    System.out.println(user);
                    break;
                    
                case 3: // Update
                    System.out.print("Enter User ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    User existing = userService.getUser(updateId);
                    if (existing != null) {
                        User updated = userInputs();
                        updated.setId(updateId);
                        userService.updateUser(updated);
                        System.out.println("User Updated: " + updated);
                    } else {
                        System.out.println("User not found!");
                    }
                    break;

                case 4: // Delete
                    System.out.print("Enter User ID to Delete: ");
                    int deleteId = sc.nextInt();
                    userService.deleteUser(deleteId);
                    System.out.println("User Deleted.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Wrong input.");
            }
        }
    }

    // ===== Restaurant Operations =====
    public static Restaurant restaurantInputs() {
        System.out.print("Enter restaurant id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter restaurant name: ");
        String name = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter user ID: ");
        int userId = sc.nextInt();

        Restaurant r = new Restaurant();
        r.setRestaurantId(id);
        r.setName(name);
        r.setAddress(address);
        r.setPhoneNumber(phone);
        r.setUser(userService.getUser(userId));
        return r;
    }
    public static void restaurantOperations() {
        while (true) {
            System.out.println("\n--- Restaurant Operations ---");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Get Restaurant by ID");
            System.out.println("3. Update Restaurant");
            System.out.println("4. Delete Restaurant");
            System.out.println("5. Back to Main Menu");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Restaurant r = restaurantInputs();
                    if (r != null) {
                    restaurantService.createRestaurant(r);
                    System.out.println("Restaurant saved: " + r);
                    }
                    break;
                case 2:
                    System.out.print("Enter Restaurant ID: ");
                    int rid = sc.nextInt();
                    Restaurant res = restaurantService.getRestaurant(rid);
                    System.out.println(res);
                    break;
                    
               
                case 3: //  UPDATE
                    System.out.print("Enter Restaurant ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    Restaurant existing = restaurantService.getRestaurant(updateId);
                    if (existing != null) {
                        System.out.println("Enter new details:");
                        Restaurant updated = restaurantInputs();
                        updated.setRestaurantId(updateId); 
                        restaurantService.updateRestaurant(updated);
                        System.out.println("Restaurant Updated: " + updated);
                    } else {
                        System.out.println("Restaurant not found!");
                    }
                    break;

                case 4: //  DELETE
                    System.out.print("Enter Restaurant ID to Delete: ");
                    int deleteId = sc.nextInt();
                    restaurantService.deleteRestaurant(deleteId);
                    System.out.println("Restaurant Deleted.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Wrong input.");
            }
        }
    }
                  

    // ===== MenuItem Operations =====
    public static MenuItem menuItemInputs() {
        System.out.print("Enter menuitem id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter menu item name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter restaurant ID: ");
        int rid = sc.nextInt();

        MenuItem mi = new MenuItem();
        mi.setItemId(id);
        mi.setName(name);
        mi.setPrice(price);
        mi.setRestaurant(restaurantService.getRestaurant(rid));
        return mi;
    }

    public static void menuItemOperations() {
        while (true) {
            System.out.println("\n--- MenuItem Operations ---");
            System.out.println("1. Add MenuItem");
            System.out.println("2. Get MenuItem by ID");
            System.out.println("3. Update MenuItem");
            System.out.println("4. Delete MenuItem");
            System.out.println("5. Back to Main Menu");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    MenuItem mi = menuItemInputs();
                    if (mi != null) {
                    menuItemService.createMenuItem(mi);
                    System.out.println("MenuItem saved: " + mi);
                    }
                    break;
                case 2:
                    System.out.print("Enter MenuItem ID: ");
                    int mid = sc.nextInt();
                    MenuItem menu = menuItemService.getMenuItem(mid);
                    System.out.println(menu);
                    break;
               
                case 3: //  UPDATE
                    System.out.print("Enter MenuItem ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    MenuItem existing = menuItemService.getMenuItem(updateId);
                    if (existing != null) {
                        System.out.println("Enter new details:");
                        MenuItem updated = menuItemInputs();
                        updated.setItemId(updateId); 
                        menuItemService.updateMenuItem(updated);
                        System.out.println("MenuItem Updated: " + updated);
                    } else {
                        System.out.println("MenuItem not found!");
                    }
                    break;

                case 4: //  DELETE
                    System.out.print("Enter MenuItem ID to Delete: ");
                    int deleteId = sc.nextInt();
                    menuItemService.deleteMenuItem(deleteId);
                    System.out.println("MenuItem Deleted.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Wrong input.");
            }
        }
    }
                    

    // ===== Order Operations =====
    public static Order orderInputs() {
        System.out.print("Enter orderid: ");
        int orderid = sc.nextInt();

        System.out.print("Enter user ID: ");
        int uid = sc.nextInt();

        System.out.print("Enter restaurant ID: ");
        int rid = sc.nextInt();

        System.out.print("Enter totalamount: ");
        double totalamount = sc.nextDouble();

        Order o = new Order();
        o.setOrderId(orderid);
        o.setUser(userService.getUser(uid));
        o.setRestaurant(restaurantService.getRestaurant(rid));
        o.setOrderDate(LocalDateTime.now());
        o.setTotalAmount(totalamount);
        return o;
    }

    public static void orderOperations() {
        while (true) {
            System.out.println("\n--- Order Operations ---");
            System.out.println("1. Create Order");
            System.out.println("2. Get Order by ID");
            System.out.println("3. Update Order");
            System.out.println("4. Delete Order");
            System.out.println("5. Back to Main Menu");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Order o = orderInputs();
                    orderService.createOrder(o);
                    System.out.println("Order saved: " + o);
                    break;
                case 2:
                    System.out.print("Enter Order ID: ");
                    int oid = sc.nextInt();
                    Order ord = orderService.getOrder(oid);
                    System.out.println(ord);
                    break;
                
                case 3: //  UPDATE
                    System.out.print("Enter Order ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    Order existing = orderService.getOrder(updateId);
                    if (existing != null) {
                        System.out.println("Enter new details:");
                        Order updated = orderInputs();
                        updated.setOrderId(updateId); 
                        orderService.updateOrder(updated);
                        System.out.println("Order Updated: " + updated);
                    } else {
                        System.out.println("Order not found!");
                    }
                    break;

                case 4: //  DELETE
                    System.out.print("Enter Order ID to Delete: ");
                    int deleteId = sc.nextInt();
                    orderService.deleteOrder(deleteId);
                    System.out.println("Order Deleted.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Wrong input.");
            }
        }
    }

                   

    // ===== OrderItem Operations =====
    public static OrderItem orderItemInputs() {
        System.out.print("Enter orderitemid: ");
        int orderitemid = sc.nextInt();

        System.out.print("Enter Order ID: ");
        int orderId = sc.nextInt();

        System.out.print("Enter MenuItem ID: ");
        int menuId = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Order order = orderService.getOrder(orderId);
        MenuItem menuItem = menuItemService.getMenuItem(menuId);

        OrderItem oi = new OrderItem();
        oi.setOrderItemId(orderitemid);
        oi.setOrder(order);
        oi.setMenuItem(menuItem);
        oi.setQuantity(qty);
        oi.setPrice(menuItem.getPrice() * qty);

        // Update order total
        order.setTotalAmount(order.getTotalAmount() + oi.getPrice());
        orderService.updateOrder(order);
        return oi;
    }

    public static void orderItemOperations() {
        while (true) {
            System.out.println("\n--- OrderItem Operations ---");
            System.out.println("1. Add OrderItem");
            System.out.println("2. Get OrderItem by ID");
            System.out.println("3. Update OrderItem");
            System.out.println("4. Delete OrderItem");
            System.out.println("5. Back to Main Menu");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    OrderItem oi = orderItemInputs();
                    orderItemService.createOrderItem(oi);
                    System.out.println("OrderItem saved: " + oi);
                    break;
                case 2:
                    System.out.print("Enter OrderItem ID: ");
                    int oid = sc.nextInt();
                    OrderItem item = orderItemService.getOrderItem(oid);
                    System.out.println(item);
                    break;
                
                case 3: // UPDATE
                    System.out.print("Enter OrderItem ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    OrderItem existing = orderItemService.getOrderItem(updateId);
                    if (existing != null) {
                        System.out.println("Enter new details:");
                        OrderItem updated = orderItemInputs();
                        updated.setOrderItemId(updateId); // 
                        orderItemService.updateOrderItem(updated);
                        System.out.println("OrderItem Updated: " + updated);
                    } else {
                        System.out.println("OrderItem not found!");
                    }
                    break;

                case 4: //  DELETE
                    System.out.print("Enter OrderItem ID to Delete: ");
                    int deleteId = sc.nextInt();
                    orderItemService.deleteOrderItem(deleteId);
                    System.out.println("OrderItem Deleted.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Wrong input.");
            }
        }
    }

                    
    // ===== Payment Operations =====
    public static Payment paymentInputs() {
        System.out.print("Enter paymentid: ");
        int paymentid = sc.nextInt();

        System.out.print("Enter Order ID: ");
        int orderId = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Payment Method: ");
        String method = sc.nextLine();

        Order order = orderService.getOrder(orderId);

        Payment p = new Payment();
        p.setPaymentId(paymentid);
        p.setOrder(order);
        p.setAmount(amt);
        p.setPaymentDate(LocalDateTime.now());
        p.setPaymentMethod(method);
        return p;
    }

    public static void paymentOperations() {
        while (true) {
            System.out.println("\n--- Payment Operations ---");
            System.out.println("1. Add Payment");
            System.out.println("2. Get Payment by ID");
            System.out.println("3. Update Payment");
            System.out.println("4. Delete Payment");
            System.out.println("5. Back to Main Menu");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Payment p = paymentInputs();
                    paymentService.createPayment(p);
                    System.out.println("Payment saved: " + p);
                    break;
                case 2:
                    System.out.print("Enter Payment ID: ");
                    int pid = sc.nextInt();
                    Payment pay = paymentService.getPayment(pid);
                    System.out.println(pay);
                    break;
                
                case 3: //  UPDATE
                    System.out.print("Enter Payment ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    Payment existing = paymentService.getPayment(updateId);
                    if (existing != null) {
                        System.out.println("Enter new details:");
                        Payment updated = paymentInputs();
                        updated.setPaymentId(updateId); // पुराना ID रखना है
                        paymentService.updatePayment(updated);
                        System.out.println("Payment Updated: " + updated);
                    } else {
                        System.out.println("Payment not found!");
                    }
                    break;

                case 4: //  DELETE
                    System.out.print("Enter Payment ID to Delete: ");
                    int deleteId = sc.nextInt();
                    paymentService.deletePayment(deleteId);
                    System.out.println("Payment Deleted.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Wrong input.");
            }
        }
    }
}
                   