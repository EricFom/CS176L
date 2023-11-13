package monmouth.edu;

public class Data {
    public static double average(Measurable[] objects) {
        if (objects.length == 0) {
            return 0;
        }

        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }

        return sum / objects.length;
    }

    public static Measurable max(Measurable[] objects) {
        if (objects.length == 0) {
            return null;
        }
        Measurable maxObj = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > maxObj.getMeasure()) {
                maxObj = obj;
            }
        }

        return maxObj;
    }

    public static Measurable min(Measurable[] objects) {
        if (objects.length == 0) {
            return null;
        }
        Measurable minObj = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() < minObj.getMeasure()) {
                minObj = obj;
            }
        }

        return minObj;
    }

    public static double minFromArray(double[][] arrays) {
     

        double minNumber = arrays[0][0];
        for (double[] array : arrays) {
            for (double number : array) {
                if (number < minNumber) {
                	minNumber = number;
                }
            }
        }

        return minNumber;
    }
}
                
