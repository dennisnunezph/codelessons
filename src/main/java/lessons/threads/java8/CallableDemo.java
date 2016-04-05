package lessons.threads.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by dennis on 4/5/16.
 */
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //executorSingleThread();
        //invokeAll();
        invokeAny();
    }

    private static void executorSingleThread() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Callable<Integer> futureTask = getCallable();

        Future<Integer> future = executor.submit(futureTask);

        System.out.println("future done? " + future.isDone());

        Integer result = future.get();

        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result);
    }

    public static Callable<Integer> getCallable() {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(10);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        return task;
    }

    public static void invokeAll() throws InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
                () -> "task1",
                () -> "task2",
                () -> "task3");

        try {
            executor.invokeAll(callables)
                    .stream()
                    .map(future -> {
                        try {
                            return future.get();
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    })
                    .forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public static void invokeAny() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
                callable("task1", 2),
                callable("task2", 1),
                callable("task3", 3));

        String result = executor.invokeAny(callables);
        System.out.println(result);
    }

    public static Callable<String> callable(String result, long sleepSeconds) {
        return () -> {
            TimeUnit.SECONDS.sleep(sleepSeconds);
            return result;
        };
    }
}
