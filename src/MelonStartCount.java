class MelonStartCount{
    private int melonAmount;

    public MelonStartCount(int melonAmount){
        this.melonAmount=melonAmount;
    }
    public int getMelonStartAmount(){
        System.out.println("На данный момент на складе "+melonAmount+" дынь");
        return melonAmount;
    }
}
