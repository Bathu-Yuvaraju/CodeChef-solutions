import java.util.ArrayList;

class BooleanCounter {

    public static int countTrueValues(ArrayList<Boolean> list) {
        int count = 0;
        for (Boolean b : list) {
            if (b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Boolean> booleanList = new ArrayList<>();
        // Autoboxing as we are storing primitive boolean values to a list of Boolean objects
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(false);

        // Call countTrueValues method on booleanList 
        int trueCount = countTrueValues(booleanList);
        System.out.println("Number of true values: " + trueCount);
    }
}