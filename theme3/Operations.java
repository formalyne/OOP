public class Operations{

    public static void main(String[] args) {

//     printAritmeticOperations();
//     printLogicOperations();
//     printRelationarOperations();
//     useForAndWhile();


    }
        static void printAritmeticOperations(){
            int i = 5;
            int k = 10;
            int a = 8;
            int z = 13;
            int m = k+a-z/2;

            System.out.println("See what we have for " + m );

        };

        static void printLogicOperations(){
            boolean a =true;
            boolean b = false;

            System.out.println("See what we have for " + (a && b));

        };

        static void printRelationarOperations(){
            int i = 5;
            int k = 10;
            System.out.println("See what we have for " + (i!=k));

        };

        static void useForAndWhile(){
            for (int i=10;i<100;i++){
                System.out.println(i);
            }
            int z = 0;
            while (z<=34){
                System.out.println(z);
                z++;
            }

        };




}
