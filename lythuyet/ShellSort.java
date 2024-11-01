public class ShellSort {
   // ham sap xep
   public void shellSort(int arr[]) {
    int inner, outer;
    int valueToInsert;
    int interval = 1;
    int elements = arr.length;
    int i = 0;

    while (interval <= elements / 3) {
        interval = interval * 3 + 1;
    }

    while (interval > 0) {
        for (outer = interval; outer < elements; outer++) {
            valueToInsert = arr[outer];
            inner = outer;

            while (inner > interval - 1 && arr[inner - interval] >= valueToInsert) {
                arr[inner] = arr[inner - interval];
                inner -= interval;
                System.out.println(" Di chuyen phan tu: " + arr[inner]);
            }

            arr[inner] = valueToInsert;
            System.out.println(" Chen phan tu: " + valueToInsert 
                    + ", tai vi tri: " + inner);
        }

        interval = (interval - 1) / 3;
        i++;

        System.out.print("Vong lap thu " + i + ": ");
        display(arr);
    }
}

public void display(int arr[]) {
    int i;
    System.out.print("[");

    // Duyet qua tat ca phan tu
    for (i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

    System.out.print("]\n");
}

public static void main(String[] args) {
    // khoi tao mang arr
    int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };

    ShellSort shellSort = new ShellSort();
    System.out.println("Mang du lieu dau vao: ");
    shellSort.display(arr);
    System.out.println("-----------------------------");
    shellSort.shellSort(arr);
    System.out.println("-----------------------------");
    System.out.println("\nMang sau khi da sap xep: ");
    shellSort.display(arr);
} 
}
