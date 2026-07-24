public class abstract_method_interface {

    interface sample_interface{
        void sample(int a){

        }

        default void sample2(int b){
            System.out.println(b);
        }


        
    }
}
