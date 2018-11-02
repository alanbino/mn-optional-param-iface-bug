package mn.optional.param.iface.bug;

import io.micronaut.http.annotation.Controller;

@Controller("/test")
public class TestController implements TestAPI {

    @Override
    public void test(String testParam) {
        System.out.println("TEST");
    }
}
