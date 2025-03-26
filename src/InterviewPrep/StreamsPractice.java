package InterviewPrep;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractice {
    public static void main(String[] args) {
        /* Collectors.toList() creates a mutable list and is available since Java 8,
        while .toList() creates an immutable list and requires Java 16 or later. */


        // Filter Even Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12);

        // Old
        // List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

        // New
        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println("Even Numbers: " + evenNumbers);


        // Find the Maximum value
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);
        System.out.println("Maximum: " + maxNumber.get());

        // Sum Of Elements
        int sumOfElements = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sumOfElements);

        System.out.println("----------------------------------------------------------");

        // Strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Convert All Strings To Uppercase
//        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println("Uppercase Names: " + upperCaseNames);

        System.out.println("----------------------------------------------------------");
        // Sorting A List Of Numbers
        List<Integer> unsortedNumbers = Arrays.asList(10, 3, 4, 5, 2, 71, 15);

//        List<Integer> sortedNumbers = unsortedNumbers.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedNumbers = unsortedNumbers.stream().sorted().toList();
        System.out.println("Sorted List: " + sortedNumbers);

        // Count Numbers That Are Greater Than 5 In The List
        long numberCountGreaterThan5 = unsortedNumbers.stream().filter(number -> number > 5).count();
        System.out.println("Count Of Numbers Greater Than 5: " + numberCountGreaterThan5);

        // Get Distinct Elements
        List<Integer> repeatedNumbers = Arrays.asList(1, 1, 2, 3, 4, 4, 2, 3, 5);

//        List<Integer> distinctNumbers = repeatedNumbers.stream().distinct().collect(Collectors.toList());
        List<Integer> distinctNumbers = repeatedNumbers.stream().distinct().toList();
        System.out.println("Distinct Numbers: " + distinctNumbers);


        // Reduce To Sum
        int sumOfDistinctNumbers = distinctNumbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum Of Distinct Numbers: " + sumOfDistinctNumbers);

        // Get A Random Number
        // This returns the first element same as findFirst in sequential processing
        Optional<Integer> randomNumberFromDistinct = distinctNumbers.stream().findAny();
        System.out.println("Random Number: " + randomNumberFromDistinct.get());

        // This returns any value from the stream
        Optional<Integer> parallelRandomNumber = distinctNumbers.parallelStream().findAny();
        System.out.println("Parallel Processing: " + parallelRandomNumber.get());

        System.out.println("----------------------------------------------------------");

        // List First Names
        List<String> fullNames = Arrays.asList(" Alice Johnson", "Bob Harris ", "Charlie Lou");
        // List<String> firstNames = fullNames.stream().map(name -> name.split(" ")[0]).collect(Collectors.toList());
        List<String> firstNames = fullNames.stream().map(name -> name.strip().split(" ")[0]).toList();
        System.out.println("First Names: " + firstNames);

        System.out.println("----------------------------------------------------------");


        // All Match
        List<Integer> realNumbers = Arrays.asList(-1, -2, -4);
        List<Integer> wholeNumbers = Arrays.asList(1, 2, 3, 4, 6);
        boolean containsOnlyPositives = wholeNumbers.stream().allMatch(number -> number > 0);
        System.out.println("Contains Only Positive Numbers? " + containsOnlyPositives);

        // None Match
        boolean noneNegative = realNumbers.stream().noneMatch(number -> number > 0);
        System.out.println("Only Negative Numbers? " + noneNegative);

        // Find First
        Optional<Integer> firstNumber = wholeNumbers.stream().findFirst();
        System.out.println("First Number: " + firstNumber.get());

        // Use FlatMap To Flatten A Nested List
        List<List<Integer>> nestedNumbers =
                Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(3, 4),
                        Arrays.asList(5, 7, 8, 5)
                );

//        List<Integer> flatList = nestedNumbers.stream().flatMap(List::stream).collect(Collectors.toList());
        List<Integer> flatList = nestedNumbers.stream().flatMap(List::stream).toList();
        System.out.println("Flat List: " + flatList);

        // Grouping Elements
        // Map<Integer, List<User>> usersByAge = users.stream().collect(Collectors.groupingBy(User::getAge));

        // Peek Elements
        System.out.print("Peeked Numbers: ");
        // List<Integer> peekedAtNumbers = numbers.stream().peek(System.out::println).toList();
        List<Integer> peekedAtNumbers = numbers.stream().peek(num -> System.out.print(num + " ")).toList();
        System.out.println();
        // First Three Elements
        // List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
        List<Integer> limited = numbers.stream().limit(3).toList();
        System.out.println("First Three Elements: " + limited);

        // Skip First Two Elements
        List<Integer> skipped = numbers.stream().skip(3).toList();
        System.out.println("Skipped Three Elements: " + skipped);

        // Convert To Set, Remove Duplicates
        Set<Integer> uniqueNumbers = repeatedNumbers.stream().collect(Collectors.toSet());
        // Above line same as:
        // Set<Integer> uniqueNumbers1 = new HashSet<>(repeatedNumbers);

        System.out.println("Set (No Duplicates): " + uniqueNumbers);

        // Summarizing Statistics
        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(stats);


    }
}
