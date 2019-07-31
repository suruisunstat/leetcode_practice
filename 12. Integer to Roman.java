class Solution {
//     public String intToRoman(int num) {
//         if (num >= 1000) return fourDigit(num);
//         else if (num >= 501) return threeDigit501to999(num);
//         else if (num >= 100) return threeDigit100to500(num);
//         else if (num >= 51) return twoDigit51to99(num);
//         else if (num >= 10) return twoDigit10to50(num);
//         else return oneDigit(num);
//     }
        
        
    
//     public String oneDigit(int x){ // 0-9
//         if (x == 9) return "IX";
//         else if (x >= 5) {
//             String snew = "V";
//             while(x-5 >0) {
//                 snew += "I";
//                 x--;    
//             }
//             return snew;
//             //"I".repeat(x-5);
//             //return snew;
//         } else if (x == 4) {
//             return "IV";
//         } else if (x >= 1){
//             String snew = "";
//             while(x > 0) {
//                 snew += "I";
//                 x--;
//             }
//             //return "I".repeat(x);
//             return snew;
//         } else {// x == 0
//             return "";
//         }
//     }
    
//     public String twoDigit10to50(int x) {
//         // x is between 10 to 50
//         if (x == 50) return "L";
//         else if (x >= 40) { // x between 40 and 49
//             return "XL" + oneDigit(x-40);
//         }
//         else { // x between 10 to 39
//             int numC = x/10;
//             int remain = x%10;
//             String snew = "";
//             while(numC > 0) {
//                 snew += "X";
//                 numC--;
//             }
//             //return "X".repeat(numC) + oneDigit(remain);
//             return snew + oneDigit(remain);
//         }
//     }
    
    
//     public String twoDigit51to99(int x) {
//         // x between 51 to 99
//         if (x/10 == 9) { // x is between 90 and 99
//             return "XC" + oneDigit(x%10);
//         } else { // 51 to 89
//             return "L" + twoDigit10to50(x-50);
//         }
//     }
    
//     public String threeDigit100to500(int x) {
//         // x between 100 to 500
//         if (x == 500) return "D";
//         else if (x >= 400) { // 400~499
//             int remain = x - 400; // 0~99
//             if (remain >= 51) return "CD" + twoDigit51to99(remain);
//             else if (remain >= 10) return "CD" + twoDigit10to50(remain);
//             else return "CD" + oneDigit(remain);
//         } else { // 100 ~ 399
//             int numC = x/100;
//             int remain = x%100;
//             // remain is between 1 and 99
//             String snew = "";
//             while(numC > 0) {
//                 snew += "C";
//                 numC--;
//             }
            
//             if (remain >= 51) return  snew + twoDigit51to99(remain); // "C".repeat(numC)
//             else if (remain >= 10) return snew + twoDigit10to50(remain); // "C".repeat(numC)
//             else return snew + oneDigit(remain); //"C".repeat(numC)
//         }
//     }
    
//     public String threeDigit501to999(int x){
//         // x is between 501 to 999
//         if(x/100 == 9) { // x 900~999
//             int remain = x - 900; //0~99
//             if (remain >= 51) return "CM" + twoDigit51to99(remain);
//             else if (remain >= 10) return "CM" + twoDigit10to50(remain);
//             else return "CM" + oneDigit(remain);
//         } else { // x 501~899
//             return "D" + threeDigit100to500(x-500);
//         }
//     }
        
//     public String fourDigit(int x) {
//         int numM = x/1000;
//         int remain = x%1000;
//         String snew = "";
//         while (numM > 0) {
//             snew += "M";
//             numM--;
//         }
//         if (remain >= 501) return  snew + threeDigit501to999(remain); // "M".repeat(numM)
//         else if (remain >= 100) return snew + threeDigit100to500(remain);
//         else if (remain >= 51) return snew + twoDigit51to99(remain);
//         else if (remain >= 10) return snew + twoDigit10to50(remain);
//         else return snew + oneDigit(remain);
//     }
    
    // From one to four: string s equals to: I, X, C, M
    
    // for 1st digit: oneDigit(x,"I","V","X")
    // for 2nd digit: oneDigit(x,"X","L","C")
    // for 3rd digit: oneDigit(x,"C","D","M")
    // for 4th digit: oneDigit(x,"M")
    
    
    
//     public String fourthDigit(int x) {
        
//     }
    
    
    // public String intToRoman(int num){
    //     // O(1)
    //     int[] vals = {1000,500,100,50,10,5,1};
    //     String[] syms = {"M","D","C","L","X","V","I"};
    //     String res = "";
    //     for(int i = 0; i < 7; i += 2) {
    //         int x = num/vals[i];
    //         if (x < 4) {
    //             for (int k = 1; k <= x; k++) res += syms[i];
    //         }
    //         else if (x == 4) {
    //             res += (syms[i] + syms[i-1]);
    //         } else if (x < 9) {
    //             res += syms[i-1];
    //             for (int l = 6; l <= x; l++) res += syms[i];
    //         } else { // x == 9
    //             res += (syms[i] + syms[i-2]);
    //         }
    //         num = num % vals[i];
    //     }
    //     return res;
    // }
    
    
    public String intToRoman(int num) {
        //String res = "";
        String[] s1 = {"","M","MM","MMM"};
        String[] s2 = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] s3 = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] s4 = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        return s1[num/1000] + s2[(num%1000)/100] + s3[(num%100)/10] + s4[num%10];
        
    }
    
    
}
// reference: https://www.cnblogs.com/grandyang/p/4123374.html
