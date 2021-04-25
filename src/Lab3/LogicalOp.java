package Lab3;

public class LogicalOp {


    public void findMinMax(int[]array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }else if (array[i] > max) {
                max = array[i];
            }
        }System.out.println("Minimum value in array is " + min);
        System.out.println("Maximum value in array is " + max);
    }
    public void duplicateStringValues(String []array1, String[] array2){
        for (int i = 0; i< array1.length; i++)
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j]))
                    System.out.println(array2[j]);
            }
    }
    public void showDuplicate(String[]array){
        for (int i = 0; i< array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]))
                    System.out.println(array[j]);
            }
        }

    }
    public void showDuplicate(int[]array){
        for (int i = 0; i< array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }

    }
//    public int[] sortAscendArray(int [] array){
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                int no = 0;
//                if (array[i] > array[j]) {
//                    no = array[i];
//                    array[i] = array[j];
//                    array[j] = no;
//                }
//            }System.out.println(array[i]);
//
//        }return array;
//    }
    public int[] insertElement(int[]array, int value,int index){
        array[index] = value;
        for (int i = 0; i < array.length; i++) {
            index = i;
        }return array;

    }
    public int[] copyArrayValues(int[] arr1, int[] arr2) {
        arr2 = arr1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);
        }return arr2;

    }
    public int minNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public int[] skipNoInArray(int[] array, int no1) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == no1) {
                continue;
            }
            System.out.println(array[i]);
        }
        return array;
    }
    public int indexOfArray(int[] array) {
        int index = 0;
        for (int i = 0; i <= array.length; i++) {
            index = i;
        }
        return index;
    }
    public boolean isInArray(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(text)) {
                return true;
            }
        }
        return false;
    }
    public void isInArray(int[] array, int no) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index = i - 1;
            if (array[i] == (no)) {
                index++;
                System.out.println("Array index of entered number is " + index);
            }
        }
    }
    public void setArray(int[]array){
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
            System.out.println(array[i]);
        }

    }
    public int[] evenArray(int[]array){
        int j = 0;
        for (int i = 1; i <= array.length; i++){
            if (i % 2 == 0) {
                array[j] = i;
                j++;
                System.out.println(array[j]);
            }
        }
        return array;
    }

    public void printArray(int[]array){
    for(int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
    }
    public void printReversedArray(String[]array){
        for (int i = array.length-1; i >=0; i--){
            System.out.println(array[i]);
        }
    }
    public void printReversedArray(int[]array){
        for (int i = array.length-1; i >=0; i--){
            System.out.println(array[i]);
        }
    }
    public void printArrayLines(String[]array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            {
                for (j = i; j <= 9; j++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
    public float averageArray(int[]array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        float average = sum/(float)array.length;
        return average;
    }

    public void CozaLozaWoza(int no1,int no2){
        int i = no1;
        while (i <= no2) {
            if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
    public void average7d(int no1, int no2){
        int i = no1;
        int sum = 0;
        int count = 0;
        while(i <=no2) {
            i++;
            if (i%7==0){
                sum += i;
                i++;
                count++;
            }
        }System.out.println("The sum of the given numbers is " +sum);
        float average = sum/count;
        System.out.println("The average of the numbers divided by seven is " + average);
    }
    public void countAverageWhile(int no1, int no2){
        int i = no1;
        int sum = 0;
        int count = 0;
        while (i <= no2){
            sum += i;
            i++;
            count++;

        } System.out.println(sum);
        System.out.println(count);
        float average = sum/count;
        System.out.println(average);

    }
    public void countEvenWhile(int no){
        int i = no;
        while(i % 2 ==0 && i <= 100){
            System.out.println(i++);
            i++;
        }
    }
    public void countOddWhile(int no){
        int i = no;
        while(i % 2 !=0 && i <= 100){
            System.out.println(i++);
            i++;
        }

    }
    public void countHigherWhile(int no1, int no2){
        while(no2 > no1){
            System.out.println(no1);
            no1++;
        }
        while(no1 > no2){
            System.out.println(no2);
            no2++;
        }

    }
    public void countIntervalWhile(int no1, int no2){
        int i = no1;
        while (i <= no2){
            System.out.println(i);
            i++;
        }
    }
    public void countReversedWhile(int number){
        while (number >= -100)
            System.out.println(number--);

    }
    public void count100While(int number){
        while (number <= 100)
            System.out.println(number++);

    }


    public void printPattern() {
        String p = "*";
        int a = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = a; j <= 7; j++) {
                System.out.print(p);
            }a++;
            System.out.println();
        }
    }
    public float averageIntervalNumbers(int no1, int no2) {
        int sum = 0;
        float count = 0;
        for (int i = no1; i <= no2; i++) {
            sum += i;
            count++;
        }
        float average = sum / count;
        return average;
    }
    public int sumIntervalNumbers(int no1, int no2) {
        int sum = 0;
        for (int i = no1; i <= no2; i++) {
            sum += i;
        }
        return sum;

    }
    public void showOddNumbers(int number){
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) ;
            System.out.println(i++);
        }

    }
    public void showEvenNumbers(int number){
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) ;
            System.out.println(i++);
        }

    }
    public void showLowerToHigher(int no1, int no2) {
        int higher = checkHigherNumber(no1,no2);
        int lower = checkLowerNumber(no1, no2);
        for (int i = lower; i <= higher;  i++)
            System.out.println(i);
    }
    public void showInterval(int no1, int no2) {
        for (int i = no1; i <= no2; i++)
        System.out.println(i);
    }
    public void countTo100(int number) {
        for (int i = number; i <= 100; i++)
            System.out.println(i);
    }
    public void countFrom100(int number) {
        for (int i = number; i >= -100; i--)
            System.out.println(i);
    }
    public void isHighestNumber(int no1, int no2, int no3) {
        if (no1 >= no2 && no1 >= no3) {
            System.out.println("The highest number is " + no1);
        } else if (no2 >= no1 && no2 >= no3) {
            System.out.println("The highest number is " + no2);
        } else if (no3 >= no1 && no3 >= no2) {
            System.out.println("The highest number is " + no3);
        } else {
            System.out.println("Hopa");
        }
    }
    public void isEligibleToVote(int number) {
        if (number >= 18) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public void isEvenNumber(int number) {
        if ((number % 2) == 0) {
            System.out.println("True");
        } else if ((number % 2) != 0 ) {
            System.out.println("False");
        }
    }
    public void showNumber() {
        int showNumber = 6;
        switch (showNumber) {
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 7:
                System.out.println("The number is: 7!");
                break;
            case 8:
                System.out.println("The number is: 8!");
                break;
            case 9:
                System.out.println("The number is: 9!");
                break;
            case 10:
                System.out.println("The number is: 10!");
                break;
            default:
                System.out.println("The number is not in the list!");
        }
    }



    public String checkNumber(int number) {
        if ( number > 3 && number != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            return ("The number is equal to 4");
        } else if (number < 3) {
            return ("The number is lower than 3");
        }
        return "None";
    }
    public String checkSnow(int number) {
        if (number > 8 || number == 6){
            return ("The amount of snow this winter was(cm):" + number);
        } else {
            return ("The forecast snow is(cm) " + number);
        }

    }
    public String checkTextAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return (text + number);
        } else {if (!text.equals("FastTrackIT") && number >= 4)
            return (number + text);
        }
        return "None";
    }

    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return ("Got to try some more");
        }
    }

    public int checkLowerNumber(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }

    public int checkHigherNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
 }
