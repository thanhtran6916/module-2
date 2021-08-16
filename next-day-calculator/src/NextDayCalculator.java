class NextDayCalculator {
    private int day;
    private int month;
    private int year;

    public NextDayCalculator() {
    }

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean namNhuan() {
        boolean result = false;
        if (year % 4 == 0 && year % 100 != 0) {
            result = true;
        } else if (year % 400 == 0) {
            result = true;
        }
        return result;
    }

    public String nextDay() {
        boolean dayLastMonth1_3_5_7_8_10 = day == 31 && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
        boolean dayLastMonth4_6_9 = day == 30 && month == 4 || month == 6 || month == 9 || month == 11;
        boolean dayLastYear = day == 31 && month == 12;
        boolean ngayCuoiCungTrongThang2CuaNamNhuan = namNhuan() && month == 2 && day == 29;
        boolean ngayCuoiCungTrongThang2CuaNamKhongNhuan = !namNhuan() && month == 2 && day == 28;
        final String sangNgayDauCuaThangMoi = "" + 1 + " " + (month + 1) + " " + year;
        final String sangNgayDauCuaNamMoi = "" + 1 + " " + 1 + " " + (year + 1);
        final String sangNgayTiepTheo = "" + (day + 1) + " " + month + " " + year;

        String result;

        if (dayLastMonth1_3_5_7_8_10) {
            result = sangNgayDauCuaThangMoi;
        } else if (dayLastMonth4_6_9) {
            result = sangNgayDauCuaThangMoi;
        } else if (dayLastYear) {
            result = sangNgayDauCuaNamMoi;
        } else if (ngayCuoiCungTrongThang2CuaNamNhuan) {
            result = sangNgayDauCuaThangMoi;
        } else if (ngayCuoiCungTrongThang2CuaNamKhongNhuan) {
            result = sangNgayDauCuaThangMoi;
        } else {
            result = sangNgayTiepTheo;
        }
        return result;
    }
}
