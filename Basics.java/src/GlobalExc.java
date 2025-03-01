import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

class Test {
    @MyAnnotation(value = "Hello Annotation")
    public void myMethod() {}

    public static void main(String[] args) throws Exception {
        Method method = Test.class.getMethod("myMethod");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());  // Output: Hello Annotation
    }
}
