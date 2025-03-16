package hello.core.autowired;

import hello.core.discount.DiscountPolicy;

import java.util.List;
import java.util.Map;

public class AllBeanTest {

    static class DiscountService {
        private final Map<String, DiscountPolicy> policyMap;
        private final List<DiscountPolicy> policies;
    }
}
