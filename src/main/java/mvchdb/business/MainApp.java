package mvchdb.business;

import mvchdb.business.entities.User;
import mvchdb.business.service.UserService;
import mvchdb.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        List<User> list = userService.getUsers();

        for (User u: list) {
            System.out.println(u);
            System.out.println();
        }

        User user = new User(-1,"Oleg","Gernov",(byte)26,"boss@trello.ru","boss");

        System.out.println(user);

        userService.addUser(user);

        userService.deleteUser(7);

        context.close();

    }
}
