class Fiction extends Book{

    Fiction(String title) {
        super(title);
        setPrice();
    }
    
    void setPrice(){
        super.p=24.99;
    }
}