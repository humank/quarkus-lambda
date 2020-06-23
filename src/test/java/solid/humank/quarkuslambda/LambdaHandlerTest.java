package solid.humank.quarkuslambda;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.amazon.lambda.test.LambdaClient;
import io.quarkus.test.junit.QuarkusTest;

import java.time.OffsetDateTime;

@QuarkusTest
public class LambdaHandlerTest {

    @Test
    public void testSimpleLambdaSuccess() throws Exception {
        InputObject in = new InputObject();
        in.setGreeting("Hello");
        in.setName("Stu");
        in.setOffsetDateTime(OffsetDateTime.now());
        OutputObject out = LambdaClient.invoke(OutputObject.class, in);
        Assertions.assertEquals("Hello Stu", out.getResult());
        Assertions.assertTrue(out.getRequestId().matches("aws-request-\\d"), "Expected requestId as 'aws-request-<number>'");
    }


    @Test
    public void writeToJson() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        InputObject in = new InputObject();
        in.setOffsetDateTime(OffsetDateTime.now());
        in.setName("Bill");
        in.setGreeting("Hello");
        String value = mapper.writeValueAsString(in);
        System.out.println(value);
    }

}
