package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;


/**
 * AppConfig 라는 설정 클래스를 통해 각 역할의 구현체를 한번에 지정할 수 있다.
 * - 사용 영역의 코드는 손대지 않고, 구성 영역의 코드만 변경하여 OCP 원칙을 잘 지킬수 있게 되었다.
 */

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
//        return new FixDiscountPolicy();
    }
}
