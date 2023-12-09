import java.util.*;
public class ArrayStats {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int length = scanner.nextInt();
int[] numbers = new int[length];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < length; i++) {
numbers[i] = scanner.nextInt();
}
double mean = calculateMean(numbers);
System.out.println("Mean: " + mean);
double median = calculateMedian(numbers);
System.out.println("Median: " + median);
int mode = calculateMode(numbers);
System.out.println("Mode: " + mode);
scanner.close();
}
public static double calculateMean(int[] numbers) {
int sum = 0;
for (int num : numbers) {
sum += num;
}
return (double) sum / numbers.length;
}
public static double calculateMedian(int[] numbers) {
Arrays.sort(numbers);
int length = numbers.length;
if (length % 2 != 0) {
return (double) numbers[length / 2];
} else {
return (double) (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
}
}
public static int calculateMode(int[] numbers) {
Map<Integer, Integer> frequencyMap = new HashMap<>();
int maxFrequency = 0;
int mode = 0;
for (int num : numbers) {
int frequency = frequencyMap.getOrDefault(num, 0) + 1;
frequencyMap.put(num, frequency);
if (frequency > maxFrequency) {
maxFrequency = frequency;
mode = num;
}
}
return mode;
}
}
