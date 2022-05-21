package Pirogova.Lesson6_8.InternetShop;

public enum Sizes {
    XXS(32){
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }

    Sizes() {
    }
}
