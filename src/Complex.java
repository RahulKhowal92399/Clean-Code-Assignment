public class Complex{
    static class MyList {

        private int Minimum;

        private int Maximum;
        public int getMinimum(){
            return Minimum;
}
public void setMinimum(int value){
            this.Minimum = value;
        }
        public int getMaximum(){
            return Maximum;
        }
public void setMaximum(int value){
            this.Maximum = value;
        }
    }

static MyList MinimumAndMaximumNo(int arr[], int length) {
        MyList obj1 = new MyList();
        int i;

        if (length == 1) {
            obj1.setMaximum(arr[0]);
            obj1.setMinimum(arr[0]);
            return obj1;
        }

        if (arr[0] > arr[1]) {
            obj1.setMaximum(arr[0]);
            obj1.setMinimum(arr[1]);
        }
        else {
            obj1.setMaximum(arr[1]);
            obj1.setMinimum(arr[0]);
}
        for (i = 2; i < length; i++) {
            if (arr[i] > obj1.getMaximum()) {
                obj1.setMaximum(arr[i]);
    }
            else if (arr[i] < obj1.getMinimum()) {
                obj1.setMinimum(arr[i]);
    }
    }
        return obj1;
    }
    public static void main(String args[]) {
        int distance[] = {2000, 21, 600, 7, 200, 45000};
        int length = 6;
        MyList Obj1 = MinimumAndMaximumNo(distance, length);
        System.out.printf("\n Minimum Value is %d", Obj1.getMinimum());
        System.out.printf("\n Maximum Value is %d", Obj1.getMaximum());
    }
}

