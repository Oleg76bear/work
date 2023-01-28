package HomeTest;

    /* «адание 7
    ≈сть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]
    Ќеобходимо написать программу котора€ посчитает максимально возможную сумму
    которую можно получить из данного массива, с условием что элементы включенные в
    сумму не должны сто€ть на соседних индексах (должен быть минимум один елемент
    между ними).
 */
    public class Work_W7 {
        public static void main(String[] args) {
            int[] a =
                    {1, 0, 4, 8, 9, 1};

            int even=0;
            for (int i=0;i<a.length;i++){

                if(i%2==0) {
                    even=even+a[i];
                }
            }
            int odd=0;
            for (int i=0;i<a.length;i++){

                if(i%2!=0) {
                    odd=odd+a[i];
                }
            }
            System.out.println(Math.max(even, odd));
        }
    }

