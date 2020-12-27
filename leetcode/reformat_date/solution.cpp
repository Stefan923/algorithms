class Solution {
private:
    string convertMonth(string str) {
        if (!str.compare("Jan")) {
                return "01";
        } else if (!str.compare("Feb")) {
                return "02";
        } else if (!str.compare("Mar")) {
                return "03";
        } else if (!str.compare("Apr")) {
                return "04";
        } else if (!str.compare("May")) {
                return "05";
        } else if (!str.compare("Jun")) {
                return "06";
        } else if (!str.compare("Jul")) {
                return "07";
        } else if (!str.compare("Aug")) {
                return "08";
        } else if (!str.compare("Sep")) {
                return "09";
        } else if (!str.compare("Oct")) {
                return "10";
        } else if (!str.compare("Nov")) {
                return "11";
        }
        return "12";
    }
    
public:
    string reformatDate(string date) {
        string output;
        
        if (date.length() == 13) {
            output.append(date, 9, 4);
            
            string month;
            month.assign(date, 5, 3);
            output.append("-");
            output.append(convertMonth(month));
            
            output.append("-");
            output.append(date, 0, 2);
            
            cout << output;
        } else {
            output.append(date, 8, 4);
            
            string month;
            month.assign(date, 4, 3);
            output.append("-");
            output.append(convertMonth(month));
            
            output.append("-0");
            output.append(date, 0, 1);
            
            cout << output;
        }
        
        return output;
    }
};
