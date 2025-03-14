public class new{
    public static void main(String args[]){
        String v[]={"a","e","I","o","u"};
        Scanner input=new Scanner(System.in);
        String answer = input.nextlin();
        int detect=0;
        int i = 0;
        while(i<=4){
            if(answer.equals(v[i])){

            }
            i=i+1;
        }
        if(detect==1){
            System.out.println("vowel");
        }
        else
        {
            System.out.println("not a vowels");
        }
    }
}