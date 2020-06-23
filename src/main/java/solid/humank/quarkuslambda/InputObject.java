package solid.humank.quarkuslambda;

import java.time.OffsetDateTime;

public class InputObject {

    private String name;
    private String greeting;
    private OffsetDateTime offsetDateTime;

    public OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    public InputObject setOffsetDateTime(OffsetDateTime offsetDateTime) {
        this.offsetDateTime = offsetDateTime;
        return this;
    }
    public String getName() {
        return name;
    }

    public InputObject setName(String name) {
        this.name = name;
        return this;
    }

    public String getGreeting() {
        return greeting;
    }

    public InputObject setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
}
