package mx.com.technogi.testing.contracts;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import mx.com.technogi.testing.ConsumerDrivenContractsServerApplication;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by Carlos on 15/03/17.
 */
@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerDrivenContractsServerApplication.class)
public class AccountBase {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}
