package mn.optional.param.iface.bug;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

import javax.annotation.Nullable;

public interface TestAPI {
    @Get("/")
    public void test(@Nullable @QueryValue String testParam);
}
