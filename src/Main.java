import java.beans.BeanProperty;

public class Main {
    @Bean
    public RestTemplate restTemplate (){
        return new RestTemplate;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}