public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int diff;
        if (!earlier(comparedDate)) {
            diff = getYear() - comparedDate.getYear();
            if (getMonth() < comparedDate.getMonth()) {
                return diff - 1;
            } else if (getMonth() == comparedDate.getMonth()) {
                return getDay() < comparedDate.getDay() ? diff - 1 : diff;
            }
            return diff;
        } else {
            diff = comparedDate.getYear() - getYear();
            if (comparedDate.getMonth() < getMonth()) {
                return diff - 1;
            } else if (comparedDate.getMonth() == getMonth()) {
                return comparedDate.getDay() < getDay() ? diff - 1 : diff;
            }
            return diff;
        }
    }


}
