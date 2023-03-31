package Controller;

import Service.OrderService;
import entity.Order;

@RestController
@RequestMapping("/orders")
public class Orders {
    @Autowired
    RestTemplate customer;
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    OrderService orderService;
    @GetMapping("/getOrders/{id}")
    public Order getOrders(@PathVariable("id") String id)
    {

        return orderService.findById(id);
    }
    @PostMapping("/saveOrders")
    public Order saveOrders(@RequestBody Order order)
    {
        return orderService.save(order);
    }

}
