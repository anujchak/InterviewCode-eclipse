import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<employee>l= List.of(new employee(1,"anuj","dev",100),

                new employee(1,"anuj","dev",100),
                new employee(2,"dudu","HR",1000),
                new employee(3,"bodhi","test",101),
                new employee(4,"ram","dev",10),
                new employee(5,"sam","HR",50)
        );
        System.out.println(l.stream().map(employee::getName).collect(Collectors.toList()));
    }
}