
public class test_rui 
{
	public static void main(String[] args) {

        HW04_4109064223_3 t1 = new HW04_4109064223_3();

        int n = 10;
        String[] str = new String[n];
        boolean[] ans = new boolean[n];
        for(int i=0; i<n; i++) {
            int len = (int)(Math.random()*60)+1;
            int tf;
            if(len%2==1) tf = 0; 
            else tf = (int)(Math.random()*2);
            if(tf == 0) ans[i] = false;
            else ans[i] = true;
            boolean err = len%2 == 0;
            for(int j=0; j<len; j++) {
                if(tf == 1) {
                    if(j == 0) str[i] = "0";
                    else if(j<len/2) str[i] += "0";
                    else str[i] += "1";
                }
                else {
                    String v = String.valueOf((int)(Math.random()*2));
                    if(j == 0) str[i] = v;
                    else str[i] += v;
                    if(err) {
                        if(j<len/2 && v.equals("1")) err = false;
                        else if(j>=len/2 && v.equals("0")) err = false;
                    }
                }
            }
            ans[i] = err;
        }
        boolean test_ans[] = t1.one0k(str);
        for(int i=0; i<n; i++) System.out.println(str[i] + "\n" + "CorrectAns:"+ ans[i]+"\nYourAns:"+ test_ans[i] + "\n------------");
    }
	
}
