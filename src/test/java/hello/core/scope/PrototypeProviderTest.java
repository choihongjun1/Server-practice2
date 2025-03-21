package hello.core.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrototypeProviderTest {

    @Test
    void providerTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SingletonWithPrototypeTest1.ClientBean.class, PrototypeTest.PrototypeBean.class);

        SingletonWithPrototypeTest1.ClientBean clientBean1 = ac.getBean(SingletonWithPrototypeTest1.ClientBean.class);
        int count1 = clientBean1.logic();
        assertThat(count1).isEqualTo(1);

        SingletonWithPrototypeTest1.ClientBean clientBean2 = ac.getBean(SingletonWithPrototypeTest1.ClientBean.class);
        int count2 = clientBean2.logic();
        assertThat(count2).isEqualTo(1);
    }
}
