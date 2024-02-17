package hello.core.singleton;

public class StatefulService {

//    private int price; //상태를 유지하는 필드 10000 -> 20000

    //void -> int 로 변경,
    public int order(String name, int price) {
        System.out.println("name = " + name + "price = " + price);
//        this.price = price; //여기가 문제!
        return price; //return 값으로 price 를 바로 넘겨버린다.
    }

//    public int getPrice() {
//        return price;
//    }
}
