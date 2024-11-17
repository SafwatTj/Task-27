import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер ячейки:");
        int i = scanner.nextInt();
        System.out.println(arr[i]);


         */
        List<Auto> autos = List.of(
                new Auto(1),
                new Auto(2),
                new Auto(4),
                new Auto(4),
                new Auto(5)
        );
        System.out.println(getByUin(autos, 2));
    }

    public static Auto getByUin(List<Auto> autoList, int findId){
        List<Auto> collect = autoList.stream().filter(a -> a.getId() == findId).collect(Collectors.toList());
        if(collect.size()>1){
            throw new DuplicateAutoException();
        }
        System.out.println("qwertyuiop[]");
        if(collect.isEmpty()){
            return null;
        } else {
            return collect.get(0);
        }
    }

}