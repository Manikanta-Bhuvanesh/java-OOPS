class NonFiction extends Book{

    NonFiction(String title) {
        super(title);
        setPrice();
    }
    
    void setPrice(){
        super.p=37.99;
    }
}