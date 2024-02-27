public class blockScope {
    public static void main(String[] args) {
        int a = 90;
        int b = 56;
        {
            //int a = 89; we cannot initialise this again because we have done it once and 
            //they are also in the same function
            a = 85; //we can update value in block this will do
            int c = 98; // but values which we initialise in block will remain in block they 
                        //can't be accessed outside

            System.out.println(a);
        }
        System.out.println(a);
    }
}
