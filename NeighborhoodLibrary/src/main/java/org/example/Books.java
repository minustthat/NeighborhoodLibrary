package org.example;





public class Books {
    long idNumber;
    String isbnNumber;
    String title;
    boolean isCheckedOut;
    String isCheckedOutTo;
String borrower;
    public Books(long idNumber, String isbnNumber, String title, boolean isCheckedOut, String isCheckedOutTo) {
        this.idNumber = idNumber;
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.isCheckedOutTo = isCheckedOutTo;
    }

    public void checkOut(String borrower){
        isCheckedOut = true;
        this.borrower = borrower;
    }

    public void checkIn(){
        isCheckedOut = false;
        borrower = " ";
    }
    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getIsCheckedOutTo() {
        return isCheckedOutTo;
    }

    public void setIsCheckedOutTo(String isCheckedOutTo) {
        this.isCheckedOutTo = isCheckedOutTo;
    }


}
