public class Task_4_N57 {

    public static void main(String[]args)
    {
        int amountOfBricks=32;
        int containerCapacity=10;
        int fullContainer;
        int notFullContainer;
        int total;
        notFullContainer=amountOfBricks%containerCapacity;
        System.out.println("The container which is not full is: " + notFullContainer);
        fullContainer=(amountOfBricks/containerCapacity);
        System.out.println("The Full containers are: " + fullContainer);
        total=fullContainer+notFullContainer;
        System.out.println("total(sum of full and not full containers is): " + total);
    }
}
