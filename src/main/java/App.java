import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            HelloWorld bean1 = (HelloWorld) context.getBean("helloworld");
            System.out.println(bean1.getMessage());

            HelloWorld bean2 = (HelloWorld) context.getBean("helloworld");
            Cat cat1 = (Cat) context.getBean("cat");
            Cat cat2 = (Cat) context.getBean("cat");

            System.out.println("HelloWorld singleton (bean1 == bean2): " + (bean1 == bean2));
            System.out.println("Cat prototype (cat1 == cat2): " + (cat1 == cat2));
        }
    }
}