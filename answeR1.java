
public class himanshu;

{

public static void main(String[] args)
{
Runnable r = new Runnable1();

Thread t = new Average(r); t.start();

Runnable r2 = new Runnable2();

Thread t2 = new Square(r2); t2.start();

}

}

public class Average {

    public static void main(String[] args) {

        // create an array

        int[] array = { 10,20,40,50 };

        // getting array length

        int length = array.length;

        // default sum value.

        int sum = 0;

        // sum of all values in array using for loop

        for (int i = 0; i < array.length; i++) {

            sum += array[i];
System. out.printIn(Average of);

        }

  double average = sum / length;

  public static void main(String[] args)

{ int[] temp = {10,20,30,40,50};

for (int value : temp)

{

System.out.println(Square );

}

for (int i = 0;i < temp.length; i++)

{
temp[i] = (int) Math.pow(temp[i], 2);

}

for (int value : temp)

{

System.out.println(Square); } }

 
    }

}

