package _5_Stream_API;

public class _1_Basic {

//	
//	| Operation                                      | Purpose                                    | Example                                           |
//	| ---------------------------------------------- | ------------------------------------------ | ------------------------------------------------- |
//	| `.filter()`                                    | Keep only elements that match a condition  | `filter(x -> x > 10)`                             |
//	| `.map()`                                       | Transform each element                     | `map(String::toUpperCase)`                        |
//	| `.sorted()`                                    | Sort stream elements                       | `sorted()` or `sorted(Comparator.reverseOrder())` |
//	| `.distinct()`                                  | Remove duplicates                          | `distinct()`                                      |
//	| `.limit()`                                     | Take first n elements                      | `limit(3)`                                        |
//	| `.collect()`                                   | Convert stream result back to List/Set/Map | `collect(Collectors.toList())`                    |
//	| `.count()`                                     | Count elements                             | `count()`                                         |
//	| `.anyMatch()` / `.allMatch()` / `.noneMatch()` | Condition checks                           | `anyMatch(x -> x > 10)`                           |
//	| `.reduce()`                                    | Combine elements (e.g., sum, max)          | `reduce(0, Integer::sum)`                         |
//	| `.forEach()`                                   | Loop through each                          | `forEach(System.out::println)`                    |

}


//🧩 Advanced Java List Logical Programs (7–9 yrs)

//1️⃣ Find Nth Highest (or Lowest) Element from List
//
//Input: [5, 9, 2, 8, 1, 3], N = 2
//Output: 2nd highest = 8
//
//int nth = 2;
//int nthHighest = list.stream()
//        .sorted(Comparator.reverseOrder())
//        .skip(nth - 1)
//        .findFirst()
//        .orElseThrow();
//
//
//🧠 Tests: sorting, skip, findFirst, handling edge cases.
//
//2️⃣ Find All Elements That Occur More Than Once
//Set<Integer> seen = new HashSet<>();
//Set<Integer> duplicates = list.stream()
//        .filter(n -> !seen.add(n))
//        .collect(Collectors.toSet());
//
//
//✅ Shows knowledge of how Set.add() helps detect duplicates.
//
//3️⃣ Find All Unique Elements (No Repetition)
//
//Input: [1, 2, 2, 3, 4, 4, 5]
//Output: [1, 3, 5]
//
//Map<Integer, Long> freq = list.stream()
//        .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//
//List<Integer> unique = freq.entrySet().stream()
//        .filter(e -> e.getValue() == 1)
//        .map(Map.Entry::getKey)
//        .collect(Collectors.toList());
//
//
//🧠 Tests: groupingBy, filter, map.
//
//4️⃣ Find Second Most Frequent Element
//
//Input: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
//Output: 3 (since 4 is most frequent)
//
//Map<Integer, Long> freq = list.stream()
//        .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//
//int secondMost = freq.entrySet().stream()
//        .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
//        .skip(1)
//        .findFirst()
//        .map(Map.Entry::getKey)
//        .orElseThrow();
//
//
//🧠 Tests: frequency counting, sorting by map values.
//
//5️⃣ Partition List into Even and Odd Numbers
//Map<Boolean, List<Integer>> partitioned = list.stream()
//        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//
//
//Output:
//
//true → [2, 4, 6]
//false → [1, 3, 5]
//
//
//🧠 Tests: partitioningBy and boolean grouping.
//
//6️⃣ Sort Custom Objects by Multiple Fields
//
//Example: Sort employees by department, then by salary descending.
//
//employees.sort(Comparator
//        .comparing(Employee::getDepartment)
//        .thenComparing(Employee::getSalary, Comparator.reverseOrder()));
//
//
//🧠 Tests: chained comparators, object sorting, lambda expressions.
//
//7️⃣ Find Common Elements Between Two Lists (Efficiently)
//List<Integer> common = list1.stream()
//        .filter(new HashSet<>(list2)::contains)
//        .collect(Collectors.toList());
//
//
//🧠 Avoids O(n²) complexity by converting to a HashSet.
//
//8️⃣ Find Missing Numbers in a Range
//
//Input: [1, 2, 4, 6]
//Output: [3, 5]
//
//int min = Collections.min(list);
//int max = Collections.max(list);
//
//List<Integer> missing = IntStream.rangeClosed(min, max)
//        .filter(i -> !list.contains(i))
//        .boxed()
//        .collect(Collectors.toList());
//
//
//🧠 Tests range operations + filtering.
//
//9️⃣ Find the First Repeated Element
//Set<Integer> seen = new HashSet<>();
//int firstRepeated = list.stream()
//        .filter(n -> !seen.add(n))
//        .findFirst()
//        .orElse(-1);
//
//
//🧠 Logical reasoning + short-circuiting via findFirst().
//
//🔟 Flatten a List of Lists
//
//Input: [[1,2],[3,4],[5]]
//Output: [1,2,3,4,5]
//
//List<List<Integer>> listOfLists = Arrays.asList(
//        Arrays.asList(1, 2),
//        Arrays.asList(3, 4),
//        Arrays.asList(5)
//);
//
//List<Integer> flat = listOfLists.stream()
//        .flatMap(List::stream)
//        .collect(Collectors.toList());
//
//
//🧠 Tests flatMap() — critical concept for nested structures.
//
//1️⃣1️⃣ Find the Average of Numbers
//double avg = list.stream()
//        .mapToInt(Integer::intValue)
//        .average()
//        .orElse(0);
//
//
//🧠 Shows numeric stream handling and reduction operations.
//
//1️⃣2️⃣ Check If a List is Palindrome
//List<Integer> reversed = new ArrayList<>(list);
//Collections.reverse(reversed);
//
//boolean isPalindrome = list.equals(reversed);
//
//
//🧠 Logical test using List equality.
//
//1️⃣3️⃣ Rotate List Elements (Right Shift)
//
//Input: [1, 2, 3, 4, 5], rotate by 2 → [4, 5, 1, 2, 3]
//
//Collections.rotate(list, 2);
//
//
//🧠 Tests lesser-known but powerful Collections.rotate().
//
//1️⃣4️⃣ Find the Longest Consecutive Sequence
//
//Input: [1, 9, 3, 10, 2, 20]
//Output: 3 (because 1-2-3 is the longest consecutive sequence)
//
//Set<Integer> set = new HashSet<>(list);
//int maxLen = 0;
//
//for (int n : list) {
//    if (!set.contains(n - 1)) { // start of sequence
//        int current = n;
//        int len = 1;
//
//        while (set.contains(current + 1)) {
//            current++;
//            len++;
//        }
//        maxLen = Math.max(maxLen, len);
//    }
//}
//System.out.println("Longest consecutive length: " + maxLen);
//
//
//🧠 Logical reasoning + HashSet optimization.
//
//1️⃣5️⃣ Remove Null or Empty Strings from List
//List<String> cleaned = list.stream()
//        .filter(s -> s != null && !s.isEmpty())
//        .collect(Collectors.toList());
//
//
//🧠 Tests basic filtering & NPE handling.
//
//1️⃣6️⃣ Get Top 3 Maximum Numbers
//List<Integer> top3 = list.stream()
//        .sorted(Comparator.reverseOrder())
//        .limit(3)
//        .collect(Collectors.toList());
//
//
//🧠 Tests sorting + limiting + sub-selection.
//
//1️⃣7️⃣ Group Words by Length
//Map<Integer, List<String>> grouped = list.stream()
//        .collect(Collectors.groupingBy(String::length));
//
//
//🧠 Combines groupingBy with method reference.
//
//1️⃣8️⃣ Find Difference Between Two Lists
//List<Integer> diff = list1.stream()
//        .filter(e -> !list2.contains(e))
//        .collect(Collectors.toList());
//
//
//🧠 Tests filtering and logical comparison.
//
//1️⃣9️⃣ Convert List to Map (Unique Keys)
//Map<Integer, String> map = employees.stream()
//        .collect(Collectors.toMap(Employee::getId, Employee::getName));
//
//
//🧠 Tests stream-to-map conversion.
//
//2️⃣0️⃣ Custom Sorting (e.g. Sort by Last Character)
//list.sort(Comparator.comparing(s -> s.charAt(s.length() - 1)));
//
//
//🧠 Tests Comparator + lambda expression creativity.
//
//🏆 Bonus — Complex Real-World Scenarios
//🔸 Group Transactions by Month or Customer
//
//→ Map<String, List<Transaction>> grouped = transactions.stream().collect(groupingBy(Transaction::getMonth));
//
//🔸 Find the Highest Paid Employee per Department
//
//→ groupingBy(Employee::getDept, collectingAndThen(maxBy(...), Optional::get))
//
//🔸 Merge Two Sorted Lists
//
//→ Manual merging logic using two pointers (tests algorithmic thinking).
//
//💬 Interviewer Insights
//
//At your level (7–9 yrs), interviewers often ask:
//
//“How can you optimize this without Streams?”
//
//“Can you do the same using Streams?”
//
//“How would you handle nulls or duplicates?”
//
//“What’s the time complexity?”
//
//“Which collection is best suited for this problem and why?”
