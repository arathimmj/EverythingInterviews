//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
//        https://www.w3schools.com/dsa/dsa_algo_bubblesort.php
        BubbleSort bs = new BubbleSort();
        bs.sort();
        System.out.println("Bubble Sort Done!!");

        System.out.println("Selection Sort");
//        https://www.w3schools.com/dsa/dsa_algo_selectionsort.php
        SelectionSort ss = new SelectionSort();
        ss.sort();
    }
}