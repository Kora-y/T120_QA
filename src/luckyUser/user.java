package luckyUser;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class user {

    LocalDateTime registerDate = LocalDateTime.now();

    String name;

    public user() {

    }

    public user(String name , LocalDateTime registerDate) {

        this.name = name;
        this.registerDate = registerDate;

    }

}
