// Ugly solution but passed 
class Solution {
    public String intToRoman(int num) {
        if (num >= 1000) return fourDigit(num);
        else if (num >= 501) return threeDigit501to999(num);
        else if (num >= 100) return threeDigit100to500(num);
        else if (num >= 51) return twoDigit51to99(num);
        else if (num >= 10) return twoDigit10to50(num);
        else return oneDigit(num);
    }
        
        
    
    public String oneDigit(int x){ // 0-9
        if (x == 9) return "IX";
        else if (x >= 5) {
            String snew = "V";
            while(x-5 >0) {
                snew += "I";
                x--;    
            }
            return snew;
            //"I".repeat(x-5);
            //return snew;
        } else if (x == 4) {
            return "IV";
        } else if (x >= 1){
            String snew = "";
            while(x > 0) {
                snew += "I";
                x--;
            }
            //return "I".repeat(x);
            return snew;
        } else {// x == 0
            return "";
        }
    }
    
    public String twoDigit10to50(int x) {
        // x is between 10 to 50
        if (x == 50) return "L";
        else if (x >= 40) { // x between 40 and 49
            return "XL" + oneDigit(x-40);
        }
        else { // x between 10 to 39
            int numC = x/10;
            int remain = x%10;
            String snew = "";
            while(numC > 0) {
                snew += "X";
                numC--;
            }
            //return "X".repeat(numC) + oneDigit(remain);
            return snew + oneDigit(remain);
        }
    }
    
    
    public String twoDigit51to99(int x) {
        // x between 51 to 99
        if (x/10 == 9) { // x is between 90 and 99
            return "XC" + oneDigit(x%10);
        } else { // 51 to 89
            return "L" + twoDigit10to50(x-50);
        }
    }
    
    public String threeDigit100to500(int x) {
        // x between 100 to 500
        if (x == 500) return "D";
        else if (x >= 400) { // 400~499
            int remain = x - 400; // 0~99
            if (remain >= 51) return "CD" + twoDigit51to99(remain);
            else if (remain >= 10) return "CD" + twoDigit10to50(remain);
            else return "CD" + oneDigit(remain);
        } else { // 100 ~ 399
            int numC = x/100;
            int remain = x%100;
            // remain is between 1 and 99
            String snew = "";
            while(numC > 0) {
                snew += "C";
                numC--;
            }
            
            if (remain >= 51) return  snew + twoDigit51to99(remain); // "C".repeat(numC)
            else if (remain >= 10) return snew + twoDigit10to50(remain); // "C".repeat(numC)
            else return snew + oneDigit(remain); //"C".repeat(numC)
        }
    }
    
    public String threeDigit501to999(int x){
        // x is between 501 to 999
        if(x/100 == 9) { // x 900~999
            int remain = x - 900; //0~99
            if (remain >= 51) return "CM" + twoDigit51to99(remain);
            else if (remain >= 10) return "CM" + twoDigit10to50(remain);
            else return "CM" + oneDigit(remain);
        } else { // x 501~899
            return "D" + threeDigit100to500(x-500);
        }
    }
        
    public String fourDigit(int x) {
        int numM = x/1000;
        int remain = x%1000;
        String snew = "";
        while (numM > 0) {
            snew += "M";
            numM--;
        }
        if (remain >= 501) return  snew + threeDigit501to999(remain); // "M".repeat(numM)
        else if (remain >= 100) return snew + threeDigit100to500(remain);
        else if (remain >= 51) return snew + twoDigit51to99(remain);
        else if (remain >= 10) return snew + twoDigit10to50(remain);
        else return snew + oneDigit(remain);
    }
    
}
