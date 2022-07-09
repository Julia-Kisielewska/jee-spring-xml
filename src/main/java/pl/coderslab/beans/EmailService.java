package pl.coderslab.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailService implements MessageService {
    private String message;

    @Override
    public void send() {
        System.out.println(message);
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }


}
