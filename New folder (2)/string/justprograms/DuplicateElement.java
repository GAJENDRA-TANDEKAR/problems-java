package justprograms;

public class DuplicateElement {

    public static void main(String[] args) {
        int [] a = new int[]{1,22,3,1,4,5,66,7,8,9,1,1,2,3,4,22,66};
        System.out.println(" duplicate element in j position = ");


                for(int i=0;i<a.length;i++){
                    for(int j=i+1 ;j<a.length;j++){
                        if (a[i]==a[j]){
                            System.out.println(+ a[j]);
                        }
                    }

                }

    }
}
