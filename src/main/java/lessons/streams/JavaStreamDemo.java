package lessons.streams;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by dennis on 6/29/16.
 */
public class JavaStreamDemo {

    public static void main(String[] args) {

        List<Transaction> tlist = new ArrayList<>();

        Transaction t1 = new Transaction();
        t1.setId(22);
        tlist.add(t1);

        Transaction t2 = new Transaction();
        t2.setId(1);
        tlist.add(t2);

        Transaction t3 = new Transaction();
        t3.setId(18);
        tlist.add(t3);

        List<Integer> result = tlist.stream()
                .filter(t -> t.getId() < 20)
                .sorted(comparing(Transaction::getId))
                .map(Transaction::getId)
                .collect(toList());

        result.stream().forEach(i -> System.out.println(i));
    }


}
